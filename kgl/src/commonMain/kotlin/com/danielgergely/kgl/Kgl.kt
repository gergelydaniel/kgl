package com.danielgergely.kgl

public interface Kgl {
    public fun createShader(type: Int): Shader?
    public fun shaderSource(shaderId: Shader, source: String)
    public fun compileShader(shaderId: Shader)
    public fun deleteShader(shaderId: Shader)

    public fun getShaderParameter(shader: Shader, pname: Int): Int

    public fun getProgramInfoLog(program: Program): String?
    public fun getShaderInfoLog(shaderId: Shader): String?

    public fun createProgram(): Program?
    public fun attachShader(programId: Program, shaderId: Shader)
    public fun linkProgram(programId: Program)
    public fun useProgram(programId: Program)
    public fun detachShader(programId: Program, shaderId: Shader)
    public fun deleteProgram(programId: Program)

    public fun getProgramParameter(program: Program, pname: Int): Int

    public fun getUniformLocation(programId: Program, name: String): UniformLocation?
    public fun getAttribLocation(programId: Program, name: String): Int
    public fun bindAttribLocation(programId: Program, index: Int, name: String)

    public fun enable(cap: Int)
    public fun disable(cap: Int)

    public fun enableVertexAttribArray(location: Int)
    public fun disableVertexAttribArray(location: Int)

    public fun createBuffer(): GlBuffer
    public fun createBuffers(count: Int): Array<GlBuffer>
    public fun bindBuffer(target: Int, bufferId: GlBuffer?)
    public fun bufferData(target: Int, sourceData: Buffer, size: Int, usage: Int)
    public fun deleteBuffer(buffer: GlBuffer)

    public fun vertexAttribPointer(location: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int)

    public fun uniform1f(location: UniformLocation, f: Float)
    public fun uniform1fv(location: UniformLocation, value: FloatArray)
    public fun uniform1i(location: UniformLocation, i: Int)
    public fun uniform1iv(location: UniformLocation, value: IntArray)

    public fun uniform2f(location: UniformLocation, x: Float, y: Float)
    public fun uniform2fv(location: UniformLocation, value: FloatArray)
    public fun uniform2i(location: UniformLocation, x: Int, y: Int)
    public fun uniform2iv(location: UniformLocation, value: IntArray)

    public fun uniform3f(location: UniformLocation, x: Float, y: Float, z: Float)
    public fun uniform3fv(location: UniformLocation, value: FloatArray)
    public fun uniform3i(location: UniformLocation, x: Int, y: Int, z: Int)
    public fun uniform3iv(location: UniformLocation, value: IntArray)

    public fun uniform4f(location: UniformLocation, x: Float, y: Float, z: Float, w: Float)
    public fun uniform4fv(location: UniformLocation, value: FloatArray)
    public fun uniform4i(location: UniformLocation, x: Int, y: Int, z: Int, w: Int)
    public fun uniform4iv(location: UniformLocation, value: IntArray)

    public fun uniformMatrix3fv(location: UniformLocation, transpose: Boolean, value: FloatArray)
    public fun uniformMatrix4fv(location: UniformLocation, transpose: Boolean, value: FloatArray)

    public fun blendFunc(sFactor: Int, dFactor: Int)

    public fun cullFace(mode: Int)

    public fun viewport(x: Int, y: Int, width: Int, height: Int)
    public fun clearColor(r: Float, g: Float, b: Float, a: Float)
    public fun clear(mask: Int)

    public fun createTexture(): Texture
    public fun createTextures(n: Int): Array<Texture>
    public fun deleteTexture(texture: Texture)
    public fun texImage2D(target: Int, level: Int, internalFormat: Int, border: Int, resource: TextureResource)
    public fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        width: Int,
        height: Int,
        border: Int,
        format: Int,
        type: Int,
        buffer: Buffer
    )

    public fun activeTexture(texture: Int)
    public fun bindTexture(target: Int, texture: Texture?)
    public fun generateMipmap(target: Int)
    public fun texParameteri(target: Int, pname: Int, value: Int)

    public fun createVertexArray(): VertexArrayObject
    public fun bindVertexArray(vertexArrayObject: VertexArrayObject?)
    public fun deleteVertexArray(vertexArrayObject: VertexArrayObject)

    public fun drawArrays(mode: Int, first: Int, count: Int)
    public fun drawElements(mode: Int, count: Int, type: Int)

    public fun getError(): Int
    public fun finish()

    public fun bindFramebuffer(target: Int, framebuffer: Framebuffer?)
    public fun createFramebuffer(): Framebuffer
    public fun deleteFramebuffer(framebuffer: Framebuffer)
    public fun checkFramebufferStatus(target: Int): Int
    public fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: Texture, level: Int)
    public fun isFramebuffer(framebuffer: Framebuffer): Boolean

    public fun bindRenderbuffer(target: Int, renderbuffer: Renderbuffer?)
    public fun createRenderbuffer(): Renderbuffer
    public fun deleteRenderbuffer(renderbuffer: Renderbuffer)
    public fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer
    )

    public fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean
    public fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int)

    public fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, buffer: Buffer)


    public companion object {
        public const val GL_ACTIVE_TEXTURE: Int = 0x84E0
        public const val GL_DEPTH_BUFFER_BIT: Int = 0x00000100
        public const val GL_STENCIL_BUFFER_BIT: Int = 0x00000400
        public const val GL_COLOR_BUFFER_BIT: Int = 0x00004000
        public const val GL_FALSE: Int = 0
        public const val GL_TRUE: Int = 1
        public const val GL_POINTS: Int = 0x0000
        public const val GL_LINES: Int = 0x0001
        public const val GL_LINE_LOOP: Int = 0x0002
        public const val GL_LINE_STRIP: Int = 0x0003
        public const val GL_TRIANGLES: Int = 0x0004
        public const val GL_TRIANGLE_STRIP: Int = 0x0005
        public const val GL_TRIANGLE_FAN: Int = 0x0006
        public const val GL_ZERO: Int = 0
        public const val GL_ONE: Int = 1
        public const val GL_SRC_COLOR: Int = 0x0300
        public const val GL_ONE_MINUS_SRC_COLOR: Int = 0x0301
        public const val GL_SRC_ALPHA: Int = 0x0302
        public const val GL_ONE_MINUS_SRC_ALPHA: Int = 0x0303
        public const val GL_DST_ALPHA: Int = 0x0304
        public const val GL_ONE_MINUS_DST_ALPHA: Int = 0x0305
        public const val GL_DST_COLOR: Int = 0x0306
        public const val GL_ONE_MINUS_DST_COLOR: Int = 0x0307
        public const val GL_SRC_ALPHA_SATURATE: Int = 0x0308
        public const val GL_FUNC_ADD: Int = 0x8006
        public const val GL_BLEND_EQUATION: Int = 0x8009
        public const val GL_BLEND_EQUATION_RGB: Int = 0x8009
        public const val GL_BLEND_EQUATION_ALPHA: Int = 0x883D
        public const val GL_FUNC_SUBTRACT: Int = 0x800A
        public const val GL_FUNC_REVERSE_SUBTRACT: Int = 0x800B
        public const val GL_BLEND_DST_RGB: Int = 0x80C8
        public const val GL_BLEND_SRC_RGB: Int = 0x80C9
        public const val GL_BLEND_DST_ALPHA: Int = 0x80CA
        public const val GL_BLEND_SRC_ALPHA: Int = 0x80CB
        public const val GL_CONSTANT_COLOR: Int = 0x8001
        public const val GL_ONE_MINUS_CONSTANT_COLOR: Int = 0x8002
        public const val GL_CONSTANT_ALPHA: Int = 0x8003
        public const val GL_ONE_MINUS_CONSTANT_ALPHA: Int = 0x8004
        public const val GL_BLEND_COLOR: Int = 0x8005
        public const val GL_ARRAY_BUFFER: Int = 0x8892
        public const val GL_ELEMENT_ARRAY_BUFFER: Int = 0x8893
        public const val GL_ARRAY_BUFFER_BINDING: Int = 0x8894
        public const val GL_ELEMENT_ARRAY_BUFFER_BINDING: Int = 0x8895
        public const val GL_STREAM_DRAW: Int = 0x88E0
        public const val GL_STATIC_DRAW: Int = 0x88E4
        public const val GL_DYNAMIC_DRAW: Int = 0x88E8
        public const val GL_BUFFER_SIZE: Int = 0x8764
        public const val GL_BUFFER_USAGE: Int = 0x8765
        public const val GL_CURRENT_VERTEX_ATTRIB: Int = 0x8626
        public const val GL_FRONT: Int = 0x0404
        public const val GL_BACK: Int = 0x0405
        public const val GL_FRONT_AND_BACK: Int = 0x0408
        public const val GL_TEXTURE_2D: Int = 0x0DE1
        public const val GL_CULL_FACE: Int = 0x0B44
        public const val GL_BLEND: Int = 0x0BE2
        public const val GL_DITHER: Int = 0x0BD0
        public const val GL_STENCIL_TEST: Int = 0x0B90
        public const val GL_DEPTH_TEST: Int = 0x0B71
        public const val GL_SCISSOR_TEST: Int = 0x0C11
        public const val GL_POLYGON_OFFSET_FILL: Int = 0x8037
        public const val GL_SAMPLE_ALPHA_TO_COVERAGE: Int = 0x809E
        public const val GL_SAMPLE_COVERAGE: Int = 0x80A0
        public const val GL_NO_ERROR: Int = 0
        public const val GL_INVALID_ENUM: Int = 0x0500
        public const val GL_INVALID_VALUE: Int = 0x0501
        public const val GL_INVALID_OPERATION: Int = 0x0502
        public const val GL_OUT_OF_MEMORY: Int = 0x0505
        public const val GL_INVALID_FRAMEBUFFER_OPERATION: Int = 0x506
        public const val GL_CW: Int = 0x0900
        public const val GL_CCW: Int = 0x0901
        public const val GL_LINE_WIDTH: Int = 0x0B21
        public const val GL_ALIASED_POINT_SIZE_RANGE: Int = 0x846D
        public const val GL_ALIASED_LINE_WIDTH_RANGE: Int = 0x846E
        public const val GL_CULL_FACE_MODE: Int = 0x0B45
        public const val GL_FRONT_FACE: Int = 0x0B46
        public const val GL_DEPTH_RANGE: Int = 0x0B70
        public const val GL_DEPTH_WRITEMASK: Int = 0x0B72
        public const val GL_DEPTH_CLEAR_VALUE: Int = 0x0B73
        public const val GL_DEPTH_FUNC: Int = 0x0B74
        public const val GL_STENCIL_CLEAR_VALUE: Int = 0x0B91
        public const val GL_STENCIL_FUNC: Int = 0x0B92
        public const val GL_STENCIL_FAIL: Int = 0x0B94
        public const val GL_STENCIL_PASS_DEPTH_FAIL: Int = 0x0B95
        public const val GL_STENCIL_PASS_DEPTH_PASS: Int = 0x0B96
        public const val GL_STENCIL_REF: Int = 0x0B97
        public const val GL_STENCIL_VALUE_MASK: Int = 0x0B93
        public const val GL_STENCIL_WRITEMASK: Int = 0x0B98
        public const val GL_STENCIL_BACK_FUNC: Int = 0x8800
        public const val GL_STENCIL_BACK_FAIL: Int = 0x8801
        public const val GL_STENCIL_BACK_PASS_DEPTH_FAIL: Int = 0x8802
        public const val GL_STENCIL_BACK_PASS_DEPTH_PASS: Int = 0x8803
        public const val GL_STENCIL_BACK_REF: Int = 0x8CA3
        public const val GL_STENCIL_BACK_VALUE_MASK: Int = 0x8CA4
        public const val GL_STENCIL_BACK_WRITEMASK: Int = 0x8CA5
        public const val GL_VIEWPORT: Int = 0x0BA2
        public const val GL_SCISSOR_BOX: Int = 0x0C10
        public const val GL_COLOR_CLEAR_VALUE: Int = 0x0C22
        public const val GL_COLOR_WRITEMASK: Int = 0x0C23
        public const val GL_UNPACK_ALIGNMENT: Int = 0x0CF5
        public const val GL_PACK_ALIGNMENT: Int = 0x0D05
        public const val GL_MAX_TEXTURE_SIZE: Int = 0x0D33
        public const val GL_MAX_VIEWPORT_DIMS: Int = 0x0D3A
        public const val GL_SUBPIXEL_BITS: Int = 0x0D50
        public const val GL_RED_BITS: Int = 0x0D52
        public const val GL_GREEN_BITS: Int = 0x0D53
        public const val GL_BLUE_BITS: Int = 0x0D54
        public const val GL_ALPHA_BITS: Int = 0x0D55
        public const val GL_DEPTH_BITS: Int = 0x0D56
        public const val GL_STENCIL_BITS: Int = 0x0D57
        public const val GL_POLYGON_OFFSET_UNITS: Int = 0x2A00
        public const val GL_POLYGON_OFFSET_FACTOR: Int = 0x8038
        public const val GL_TEXTURE_BINDING_2D: Int = 0x8069
        public const val GL_SAMPLE_BUFFERS: Int = 0x80A8
        public const val GL_SAMPLES: Int = 0x80A9
        public const val GL_SAMPLE_COVERAGE_VALUE: Int = 0x80AA
        public const val GL_SAMPLE_COVERAGE_INVERT: Int = 0x80AB
        public const val GL_NUM_COMPRESSED_TEXTURE_FORMATS: Int = 0x86A2
        public const val GL_COMPRESSED_TEXTURE_FORMATS: Int = 0x86A3
        public const val GL_DONT_CARE: Int = 0x1100
        public const val GL_FASTEST: Int = 0x1101
        public const val GL_NICEST: Int = 0x1102
        public const val GL_GENERATE_MIPMAP_HINT: Int = 0x8192
        public const val GL_BYTE: Int = 0x1400
        public const val GL_UNSIGNED_BYTE: Int = 0x1401
        public const val GL_SHORT: Int = 0x1402
        public const val GL_UNSIGNED_SHORT: Int = 0x1403
        public const val GL_INT: Int = 0x1404
        public const val GL_UNSIGNED_INT: Int = 0x1405
        public const val GL_FLOAT: Int = 0x1406
        public const val GL_FIXED: Int = 0x140C
        public const val GL_STENCIL_INDEX: Int = 0x1901
        public const val GL_DEPTH_COMPONENT: Int = 0x1902
        public const val GL_RED: Int = 0x1903
        public const val GL_GREEN: Int = 0x1904
        public const val GL_BLUE: Int = 0x1905
        public const val GL_ALPHA: Int = 0x1906
        public const val GL_RGB: Int = 0x1907
        public const val GL_RGBA: Int = 0x1908
        public const val GL_LUMINANCE: Int = 0x1909
        public const val GL_LUMINANCE_ALPHA: Int = 0x190A
        public const val GL_UNSIGNED_SHORT_4_4_4_4: Int = 0x8033
        public const val GL_UNSIGNED_SHORT_5_5_5_1: Int = 0x8034
        public const val GL_UNSIGNED_SHORT_5_6_5: Int = 0x8363
        public const val GL_FRAGMENT_SHADER: Int = 0x8B30
        public const val GL_VERTEX_SHADER: Int = 0x8B31
        public const val GL_MAX_VERTEX_ATTRIBS: Int = 0x8869
        public const val GL_MAX_VERTEX_UNIFORM_VECTORS: Int = 0x8DFB
        public const val GL_MAX_VARYING_VECTORS: Int = 0x8DFC
        public const val GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = 0x8B4D
        public const val GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = 0x8B4C
        public const val GL_MAX_TEXTURE_IMAGE_UNITS: Int = 0x8872
        public const val GL_MAX_FRAGMENT_UNIFORM_VECTORS: Int = 0x8DFD
        public const val GL_SHADER_TYPE: Int = 0x8B4F
        public const val GL_DELETE_STATUS: Int = 0x8B80
        public const val GL_LINK_STATUS: Int = 0x8B82
        public const val GL_VALIDATE_STATUS: Int = 0x8B83
        public const val GL_ATTACHED_SHADERS: Int = 0x8B85
        public const val GL_ACTIVE_UNIFORMS: Int = 0x8B86
        public const val GL_ACTIVE_UNIFORM_MAX_LENGTH: Int = 0x8B87
        public const val GL_ACTIVE_ATTRIBUTES: Int = 0x8B89
        public const val GL_ACTIVE_ATTRIBUTE_MAX_LENGTH: Int = 0x8B8A
        public const val GL_SHADING_LANGUAGE_VERSION: Int = 0x8B8C
        public const val GL_CURRENT_PROGRAM: Int = 0x8B8D
        public const val GL_NEVER: Int = 0x0200
        public const val GL_LESS: Int = 0x0201
        public const val GL_EQUAL: Int = 0x0202
        public const val GL_LEQUAL: Int = 0x0203
        public const val GL_GREATER: Int = 0x0204
        public const val GL_NOTEQUAL: Int = 0x0205
        public const val GL_GEQUAL: Int = 0x0206
        public const val GL_ALWAYS: Int = 0x0207
        public const val GL_KEEP: Int = 0x1E00
        public const val GL_REPLACE: Int = 0x1E01
        public const val GL_INCR: Int = 0x1E02
        public const val GL_DECR: Int = 0x1E03
        public const val GL_INVERT: Int = 0x150A
        public const val GL_INCR_WRAP: Int = 0x8507
        public const val GL_DECR_WRAP: Int = 0x8508
        public const val GL_VENDOR: Int = 0x1F00
        public const val GL_RENDERER: Int = 0x1F01
        public const val GL_VERSION: Int = 0x1F02
        public const val GL_EXTENSIONS: Int = 0x1F03
        public const val GL_NEAREST: Int = 0x2600
        public const val GL_LINEAR: Int = 0x2601
        public const val GL_NEAREST_MIPMAP_NEAREST: Int = 0x2700
        public const val GL_LINEAR_MIPMAP_NEAREST: Int = 0x2701
        public const val GL_NEAREST_MIPMAP_LINEAR: Int = 0x2702
        public const val GL_LINEAR_MIPMAP_LINEAR: Int = 0x2703
        public const val GL_TEXTURE_MAG_FILTER: Int = 0x2800
        public const val GL_TEXTURE_MIN_FILTER: Int = 0x2801
        public const val GL_TEXTURE_WRAP_S: Int = 0x2802
        public const val GL_TEXTURE_WRAP_T: Int = 0x2803
        public const val GL_TEXTURE: Int = 0x1702
        public const val GL_TEXTURE_CUBE_MAP: Int = 0x8513
        public const val GL_TEXTURE_BINDING_CUBE_MAP: Int = 0x8514
        public const val GL_TEXTURE_CUBE_MAP_POSITIVE_X: Int = 0x8515
        public const val GL_TEXTURE_CUBE_MAP_NEGATIVE_X: Int = 0x8516
        public const val GL_TEXTURE_CUBE_MAP_POSITIVE_Y: Int = 0x8517
        public const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = 0x8518
        public const val GL_TEXTURE_CUBE_MAP_POSITIVE_Z: Int = 0x8519
        public const val GL_TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = 0x851A
        public const val GL_MAX_CUBE_MAP_TEXTURE_SIZE: Int = 0x851C
        public const val GL_TEXTURE0: Int = 0x84C0
        public const val GL_TEXTURE1: Int = 0x84C1
        public const val GL_TEXTURE2: Int = 0x84C2
        public const val GL_TEXTURE3: Int = 0x84C3
        public const val GL_TEXTURE4: Int = 0x84C4
        public const val GL_TEXTURE5: Int = 0x84C5
        public const val GL_TEXTURE6: Int = 0x84C6
        public const val GL_TEXTURE7: Int = 0x84C7
        public const val GL_TEXTURE8: Int = 0x84C8
        public const val GL_TEXTURE9: Int = 0x84C9
        public const val GL_TEXTURE10: Int = 0x84CA
        public const val GL_TEXTURE11: Int = 0x84CB
        public const val GL_TEXTURE12: Int = 0x84CC
        public const val GL_TEXTURE13: Int = 0x84CD
        public const val GL_TEXTURE14: Int = 0x84CE
        public const val GL_TEXTURE15: Int = 0x84CF
        public const val GL_TEXTURE16: Int = 0x84D0
        public const val GL_TEXTURE17: Int = 0x84D1
        public const val GL_TEXTURE18: Int = 0x84D2
        public const val GL_TEXTURE19: Int = 0x84D3
        public const val GL_TEXTURE20: Int = 0x84D4
        public const val GL_TEXTURE21: Int = 0x84D5
        public const val GL_TEXTURE22: Int = 0x84D6
        public const val GL_TEXTURE23: Int = 0x84D7
        public const val GL_TEXTURE24: Int = 0x84D8
        public const val GL_TEXTURE25: Int = 0x84D9
        public const val GL_TEXTURE26: Int = 0x84DA
        public const val GL_TEXTURE27: Int = 0x84DB
        public const val GL_TEXTURE28: Int = 0x84DC
        public const val GL_TEXTURE29: Int = 0x84DD
        public const val GL_TEXTURE30: Int = 0x84DE
        public const val GL_TEXTURE31: Int = 0x84DF
        public const val GL_REPEAT: Int = 0x2901
        public const val GL_CLAMP_TO_EDGE: Int = 0x812F
        public const val GL_MIRRORED_REPEAT: Int = 0x8370
        public const val GL_FLOAT_VEC2: Int = 0x8B50
        public const val GL_FLOAT_VEC3: Int = 0x8B51
        public const val GL_FLOAT_VEC4: Int = 0x8B52
        public const val GL_INT_VEC2: Int = 0x8B53
        public const val GL_INT_VEC3: Int = 0x8B54
        public const val GL_INT_VEC4: Int = 0x8B55
        public const val GL_BOOL: Int = 0x8B56
        public const val GL_BOOL_VEC2: Int = 0x8B57
        public const val GL_BOOL_VEC3: Int = 0x8B58
        public const val GL_BOOL_VEC4: Int = 0x8B59
        public const val GL_FLOAT_MAT2: Int = 0x8B5A
        public const val GL_FLOAT_MAT3: Int = 0x8B5B
        public const val GL_FLOAT_MAT4: Int = 0x8B5C
        public const val GL_SAMPLER_2D: Int = 0x8B5E
        public const val GL_SAMPLER_CUBE: Int = 0x8B60
        public const val GL_VERTEX_ATTRIB_ARRAY_ENABLED: Int = 0x8622
        public const val GL_VERTEX_ATTRIB_ARRAY_SIZE: Int = 0x8623
        public const val GL_VERTEX_ATTRIB_ARRAY_STRIDE: Int = 0x8624
        public const val GL_VERTEX_ATTRIB_ARRAY_TYPE: Int = 0x8625
        public const val GL_VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = 0x886A
        public const val GL_VERTEX_ATTRIB_ARRAY_POINTER: Int = 0x8645
        public const val GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = 0x889F
        public const val GL_IMPLEMENTATION_COLOR_READ_TYPE: Int = 0x8B9A
        public const val GL_IMPLEMENTATION_COLOR_READ_FORMAT: Int = 0x8B9B
        public const val GL_COMPILE_STATUS: Int = 0x8B81
        public const val GL_INFO_LOG_LENGTH: Int = 0x8B84
        public const val GL_SHADER_SOURCE_LENGTH: Int = 0x8B88
        public const val GL_SHADER_COMPILER: Int = 0x8DFA
        public const val GL_SHADER_BINARY_FORMATS: Int = 0x8DF8
        public const val GL_NUM_SHADER_BINARY_FORMATS: Int = 0x8DF9
        public const val GL_LOW_FLOAT: Int = 0x8DF0
        public const val GL_MEDIUM_FLOAT: Int = 0x8DF1
        public const val GL_HIGH_FLOAT: Int = 0x8DF2
        public const val GL_LOW_INT: Int = 0x8DF3
        public const val GL_MEDIUM_INT: Int = 0x8DF4
        public const val GL_HIGH_INT: Int = 0x8DF5
        public const val GL_FRAMEBUFFER: Int = 0x8D40
        public const val GL_RENDERBUFFER: Int = 0x8D41
        public const val GL_RGBA4: Int = 0x8056
        public const val GL_RGB5_A1: Int = 0x8057
        public const val GL_RGB565: Int = 0x8D62
        public const val GL_DEPTH_COMPONENT16: Int = 0x81A5
        public const val GL_FRAMEBUFFER_COMPLETE: Int = 0x8CD5
        public const val GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = 0x8CD6
        public const val GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = 0x8CD7
        public const val GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER: Int = 0x8CDB
        public const val GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER: Int = 0x8CDC
        public const val GL_FRAMEBUFFER_UNSUPPORTED: Int = 0x8CDD
        public const val GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int = 0x8D56
        public const val GL_FRAMEBUFFER_UNDEFINED: Int = 0x8219
        public const val GL_COLOR_ATTACHMENT0: Int = 0x8CE0
        public const val GL_COLOR_ATTACHMENT1: Int = 0x8CE1
        public const val GL_COLOR_ATTACHMENT2: Int = 0x8CE2
        public const val GL_COLOR_ATTACHMENT3: Int = 0x8CE3
        public const val GL_COLOR_ATTACHMENT4: Int = 0x8CE4
        public const val GL_COLOR_ATTACHMENT5: Int = 0x8CE5
        public const val GL_COLOR_ATTACHMENT6: Int = 0x8CE6
        public const val GL_COLOR_ATTACHMENT7: Int = 0x8CE7
        public const val GL_COLOR_ATTACHMENT8: Int = 0x8CE8
        public const val GL_COLOR_ATTACHMENT9: Int = 0x8CE9
        public const val GL_COLOR_ATTACHMENT10: Int = 0x8CEA
        public const val GL_COLOR_ATTACHMENT11: Int = 0x8CEB
        public const val GL_COLOR_ATTACHMENT12: Int = 0x8CEC
        public const val GL_COLOR_ATTACHMENT13: Int = 0x8CED
        public const val GL_COLOR_ATTACHMENT14: Int = 0x8CEE
        public const val GL_COLOR_ATTACHMENT15: Int = 0x8CEF
        public const val GL_COLOR_ATTACHMENT16: Int = 0x8CF0
        public const val GL_COLOR_ATTACHMENT17: Int = 0x8CF1
        public const val GL_COLOR_ATTACHMENT18: Int = 0x8CF2
        public const val GL_COLOR_ATTACHMENT19: Int = 0x8CF3
        public const val GL_COLOR_ATTACHMENT20: Int = 0x8CF4
        public const val GL_COLOR_ATTACHMENT21: Int = 0x8CF5
        public const val GL_COLOR_ATTACHMENT22: Int = 0x8CF6
        public const val GL_COLOR_ATTACHMENT23: Int = 0x8CF7
        public const val GL_COLOR_ATTACHMENT24: Int = 0x8CF8
        public const val GL_COLOR_ATTACHMENT25: Int = 0x8CF9
        public const val GL_COLOR_ATTACHMENT26: Int = 0x8CFA
        public const val GL_COLOR_ATTACHMENT27: Int = 0x8CFB
        public const val GL_COLOR_ATTACHMENT28: Int = 0x8CFC
        public const val GL_COLOR_ATTACHMENT29: Int = 0x8CFD
        public const val GL_COLOR_ATTACHMENT30: Int = 0x8CFE
        public const val GL_COLOR_ATTACHMENT31: Int = 0x8CFF
        public const val GL_DEPTH_ATTACHMENT: Int = 0x8D00
        public const val GL_STENCIL_ATTACHMENT: Int = 0x8D20
        public const val GL_DEPTH_STENCIL_ATTACHMENT: Int = 0x821A
        public const val GL_R8: Int = 0x8229
        public const val GL_R16: Int = 0x822A
        public const val GL_RG8: Int = 0x822B
        public const val GL_RG16: Int = 0x822C
        public const val GL_R16F: Int = 0x822D
        public const val GL_R32F: Int = 0x822E
        public const val GL_RG16F: Int = 0x822F
        public const val GL_RG32F: Int = 0x8230
        public const val GL_R8I: Int = 0x8231
        public const val GL_R8UI: Int = 0x8232
        public const val GL_R16I: Int = 0x8233
        public const val GL_R16UI: Int = 0x8234
        public const val GL_R32I: Int = 0x8235
        public const val GL_R32UI: Int = 0x8236
        public const val GL_RG8I: Int = 0x8237
        public const val GL_RG8UI: Int = 0x8238
        public const val GL_RG16I: Int = 0x8239
        public const val GL_RG16UI: Int = 0x823A
        public const val GL_RG32I: Int = 0x823B
        public const val GL_RG32UI: Int = 0x823C
        public const val GL_RG: Int = 0x8227
        public const val GL_COMPRESSED_RED: Int = 0x8225
        public const val GL_COMPRESSED_RG: Int = 0x8226
    }

}
