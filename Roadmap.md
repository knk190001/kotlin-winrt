# Roadmap 

## Version 1: JNA + Panama (MVP)

- Enable certain JVM types to be passed to WinRT APIs (DateTime)
- Better projection for event based APIs
- ~~Project WinRT properties as Kotlin properties, and hide the underlying getter/setter methods~~
- ~~Stop using obfuscated names to disambiguate certain properties~~
- Stop using JNA unsigned types

## Version 2: Panama

- Migrate off JNA
- Split the runtime helpers into a separate library
- Adopt Kotlin naming conventions for WinRT APIs
- Migrate away from inline functions when possible to improve compile times
- Revamp object lifetime management for both JVM objects with native peers, and WinRT objects with JVM peers
- Revamp the handling of WinRT types that are projected as JVM types such that the JVM type can be either interfaces or classes
- Reduce overall size of generated code
- Make it easier to implement generic WinRT interfaces in Kotlin
- Make the library easier to use with Java

## Other: 

- Create a library that uses Jetpack Compose to create and manipulate WinUI 3 Controls
- Look into creating a kotlin library that reads and writes Ecma 335 metadata
- Look into automating the creation of WinRT libraries from NuGet packages that contain WinMD files
- Rewrite the code generation plugin to enable automatic creation of subprojects 
