import com.github.knk190001.kotlinwinrt.metadata.Metadata
import com.github.knk190001.winrtbinding.generator.generateProjection
import com.squareup.kotlinpoet.FileSpec
import io.heartpattern.gcg.api.Generator
import io.heartpattern.gcg.api.kotlin.KotlinCodeGenerator



@Generator
class WinRTGenerator: KotlinCodeGenerator {
    override fun generateKotlin(): Collection<FileSpec> {
        val json = Metadata.winrtMetadata
        return generateProjection(json, emptyList())
    }
}