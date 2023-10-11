package com.danielgergely.kgl

public expect class Shader

public expect class Program

public expect class UniformLocation

public expect class GlBuffer

public expect interface TextureAsset {
    public fun dispose()
}

public expect class TextureResource : TextureAsset

public expect class Texture

public expect class VertexArrayObject

public expect class Framebuffer

public expect class Renderbuffer
