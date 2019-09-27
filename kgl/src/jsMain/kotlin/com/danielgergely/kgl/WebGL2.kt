package com.danielgergely.kgl

import org.khronos.webgl.WebGLObject
import org.khronos.webgl.WebGLRenderingContext

public external abstract class WebGL2RenderingContext : WebGLRenderingContext {
    fun createVertexArray(): WebGLVertexArrayObject?
    fun bindVertexArray(vertexArray: WebGLVertexArrayObject)
    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject)
}

public external class WebGLVertexArrayObject : WebGLObject {
}