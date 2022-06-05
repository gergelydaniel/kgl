# Kgl - Kotlin Multiplatform OpenGL abstraction

This is a thin OpenGL wrapper library for Kotlin Multiplatform.

**Note: this library is a work-in-progress, the set of functions is incomplete.** I used it for my multiplatform game [Skyway](https://skyway.danielgergely.com).
Despite it not being ready I can still recommend using it, since it's designed to be as thin a layer as possible, it might be a good start for other projects as well, it's easy to extend and troubleshoot if necessary. 

## Implemented platforms

| Platform                                       | Artifact      |
|------------------------------------------------|---------------|
| Common                                         | `kgl`         |
| Android                                        | `kgl-android` |
| iOS                                            | `kgl-ios`     |
| WebGL                                          | `kgl`         |
| [LWJGL](https://www.lwjgl.org/) (Java desktop) | `kgl-lwjgl`   |
| [JOGL](https://jogamp.org/) (Java desktop)     | `kgl-jogl`    |

## Install

_Latest version is not yet published, publishing from CI/CD will be set up soon™_

```groovy
maven { url '"https://jitpack.io"' }

implementation 'com.github.gergelydaniel.kgl:$artifactName:0.4'
```

## Build
Use `gradlew build` command to build project.

Use `gradlew publish` command to publish to the Maven repository - note: environment variables must be set accordingly.
