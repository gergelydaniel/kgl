package com.danielgergely.kgl

import org.khronos.webgl.WebGLObject
import org.khronos.webgl.WebGLRenderingContext

public abstract external class WebGL2RenderingContext : WebGLRenderingContext {
    public fun createVertexArray(): WebGLVertexArrayObject?
    public fun bindVertexArray(vertexArray: WebGLVertexArrayObject)
    public fun deleteVertexArray(vertexArray: WebGLVertexArrayObject)
}

public external class WebGLVertexArrayObject : WebGLObject
