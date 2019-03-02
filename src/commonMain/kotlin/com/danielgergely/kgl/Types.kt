package com.danielgergely.kgl

expect class Shader

expect class Program

expect class UniformLocation
expect val nullUniformLocation: UniformLocation

expect class GlBuffer
expect val nullGlBuffer: GlBuffer

expect class TextureResource
expect fun TextureResource.dispose()

expect class Texture
expect val nullTexture: Texture