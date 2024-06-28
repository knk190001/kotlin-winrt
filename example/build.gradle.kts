import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import de.undercouch.gradle.tasks.download.Download
import groovy.util.Node
import groovy.util.NodeList
import groovy.xml.XmlParser
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("de.undercouch.download") version "5.5.0"
    application
}

group = "com.github.knk190001"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":winrt"))
    implementation(project(":win-app-sdk"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "19"
        freeCompilerArgs = listOf("-Xjvm-default=all-compatibility")
    }
}

tasks.withType<Copy>().named("processResources") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<ShadowJar> {
    isZip64 = true
    archiveFileName.set("TestWinRT.jar")
}

application {
    mainClass.set("MainKt")
    applicationDefaultJvmArgs += "--enable-native-access=ALL-UNNAMED"
    tasks.run.get().workingDir = projectDir.resolve("wd")
}

sourceSets.main.configure {
    this.resources.srcDir("src/main/packageResources")
}

val shadowJarTask: ShadowJar = tasks.withType<ShadowJar>().named("shadowJar").get()

val appxDir = buildDir.resolve("appx")
val packageDir = appxDir.resolve("package")
packageDir.mkdirs()

val copyShadowJar by tasks.registering (Copy::class) {
    appxGroup()
    dependsOn(shadowJarTask)
    from(shadowJarTask.archiveFile.get().asFile.path)
    destinationDir = packageDir
}

val downloadJRE by tasks.registering(Download::class) {
    appxGroup()
    src("https://github.com/adoptium/temurin19-binaries/releases/download/jdk-19.0.2%2B7/OpenJDK19U-jre_x64_windows_hotspot_19.0.2_7.zip")
    dest(appxDir)
    overwrite(false)
}

val unzipJRE by tasks.registering(Copy::class) {
    appxGroup()
    dependsOn(downloadJRE)
    val jre = provider {
        fileTree(downloadJRE.get().dest).matching {
            include("*.zip")
        }.singleFile
    }
    from(zipTree(jre))
    into(packageDir)
    eachFile {
        path = path.substring(path.indexOf('/')).drop(1)
    }
}

val copyPackageResources by tasks.registering(Copy::class) {
    appxGroup()
    from("src/main/packageResources")
    into(packageDir)
}


val makeAppx by tasks.registering(Exec::class) {
    appxGroup()
    workingDir = appxDir
    commandLine = listOf("makeappx", "pack","/d", ".\\package", "/p" ,"./${project.name}.appx", "/o")
}

val signAppx by tasks.registering(Exec::class) {
    appxGroup()
    workingDir = appxDir
    val certLocation = System.getenv("DEV_CERT_PATH")
    val certPwd = System.getenv("DEV_CERT_PWD")

    if (certLocation == null) {
        throw GradleException("Please set `DEV_CERT_PATH` environment variable")
    }
    if (certPwd == null) {
        throw GradleException("Please set `DEV_CERT_PWD` environment variable")
    }
    commandLine = listOf("signtool", "sign", "/a", "/v", "/fd", "SHA256", "/f", certLocation, "/p", certPwd, ".\\${project.name}.appx")
}

val packageIdentity: String
    get() {
        return kotlin.runCatching {
            val identityNode = (XmlParser().parse("src/main/packageResources/AppxManifest.xml")
                .get("Identity") as NodeList).firstOrNull() as Node?
            identityNode?.attribute("Name")?.toString()?.takeIf { it.isNotBlank() }
        }.getOrNull() ?: "UnitaryXaml"
    }

val removeExistingPackage by tasks.registering(Exec::class) {
    appxGroup()
    commandLine = listOf("powershell", "-Command", "& {Get-AppxPackage \"${packageIdentity}\"| Remove-AppxPackage}")
}

val installPackage by tasks.registering(Exec::class){
    appxGroup()
    workingDir = appxDir
    commandLine = listOf("powershell", "-Command", "& {Add-AppxPackage .\\${project.name}.appx}")
}

val runPackaged by tasks.registering(Exec::class) {
    appxGroup()

    commandLine = listOf(
        "Powershell.exe",
        "-Command",
        "& {param(\$pname) Get-AppxPackage -Name \"\$pname\" | % { &start -FilePath \$(\$(\"\"\"Shell:AppsFolder\\\\\"\"\") + \$_.PackageFamilyName + \"\"\"!\"\"\" + \$((Get-AppxPackageManifest \$_.PackageFullName).Package.Applications.Application.id)) }}",
        "\"$packageIdentity\""
    )
}

val runPackagedDebug by tasks.registering(Exec::class) {
    appxGroup()
    commandLine = listOf(
        "Powershell.exe",
        "-Command",
        "& {param(\$pname) Get-AppxPackage -Name \"\$pname\" | % { &start -FilePath \$(\$(\"\"\"Shell:AppsFolder\\\\\"\"\") + \$_.PackageFamilyName + \"\"\"!\"\"\" + \$((Get-AppxPackageManifest \$_.PackageFullName).Package.Applications.Application.id)) -ArgumentList \"--debug\" }}",
        "\"$packageIdentity\""
    )
}


val preparePackage by tasks.registering {
    appxGroup()
    dependsOnOrdered(
        downloadJRE,
        unzipJRE,
        copyShadowJar,
        copyPackageResources
    )
}

val buildPackage by tasks.registering {
    appxGroup()
    dependsOnOrdered(
        preparePackage,
        makeAppx,
        signAppx
    )
}


val buildAndInstall by tasks.registering {
    appxGroup()
    dependsOnOrdered(
        buildPackage,
        removeExistingPackage,
        installPackage,
    )
}

val registerPackagedAppFromPath by tasks.registering(Exec::class) {
    appxGroup()
    workingDir = packageDir
    commandLine = listOf(
        "powershell",
        "-Command",
        "& {Add-AppxPackage -Path AppxManifest.xml -Register}"
    )
}

val buildAndRun by tasks.registering {
    appxGroup()
    dependsOnOrdered(
        preparePackage,
        registerPackagedAppFromPath,
        runPackaged
    )
}

val buildAndRunDebug by tasks.registering {
    appxGroup()
    dependsOnOrdered(
        preparePackage,
        registerPackagedAppFromPath,
        runPackagedDebug
    )
}

fun Task.dependsOnOrdered(vararg tasks: TaskProvider<*>) {
    tasks.dropLast(1).forEachIndexed { i, it ->
        tasks[i+1].get().mustRunAfter(it)
    }
    dependsOn(tasks)
}

fun Task.appxGroup() {
    group = "appx"
}


