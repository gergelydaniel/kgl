package com.danielgergely.kgl

expect fun glActiveShaderProgram(pipeline: UInt, program: UInt): kotlin.Unit
expect fun glActiveTexture(texture: UInt): kotlin.Unit
expect fun glAttachShader(program: UInt, shader: UInt): kotlin.Unit
expect fun glBeginConditionalRender(id: UInt, mode: UInt): kotlin.Unit
expect fun glBeginQuery(target: UInt, id: UInt): kotlin.Unit
expect fun glBeginQueryIndexed(target: UInt, index: UInt, id: UInt): kotlin.Unit
expect fun glBeginTransformFeedback(primitiveMode: UInt): kotlin.Unit
expect fun glBindAttribLocation(program: UInt, index: UInt, name: kotlin.String): kotlin.Unit
expect fun glBindAttribLocation(program: UInt, index: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glBindBuffer(target: UInt, buffer: UInt): kotlin.Unit
expect fun glBindBufferBase(target: UInt, index: UInt, buffer: UInt): kotlin.Unit
expect fun glBindBufferRange(target: UInt, index: UInt, buffer: UInt, offset: Long, size: Long): kotlin.Unit
expect fun glBindBuffersBase(target: UInt, first: UInt, count: Int, buffers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glBindBuffersRange(target: UInt, first: UInt, count: Int, buffers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, offsets: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.LongVarOf<Long>>?, sizes: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glBindFragDataLocation(program: UInt, color: UInt, name: kotlin.String): kotlin.Unit
expect fun glBindFragDataLocation(program: UInt, color: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glBindFragDataLocationIndexed(program: UInt, colorNumber: UInt, index: UInt, name: kotlin.String): kotlin.Unit
expect fun glBindFragDataLocationIndexed(program: UInt, colorNumber: UInt, index: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glBindFramebuffer(target: UInt, framebuffer: UInt): kotlin.Unit
expect fun glBindImageTexture(unit: UInt, texture: UInt, level: Int, layered: UByte, layer: Int, access: UInt, format: UInt): kotlin.Unit
expect fun glBindImageTexture(unit: UInt, texture: UInt, level: Int, layered: kotlin.Boolean, layer: Int, access: UInt, format: UInt): kotlin.Unit
expect fun glBindImageTextures(first: UInt, count: Int, textures: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glBindProgramPipeline(pipeline: UInt): kotlin.Unit
expect fun glBindRenderbuffer(target: UInt, renderbuffer: UInt): kotlin.Unit
expect fun glBindSampler(unit: UInt, sampler: UInt): kotlin.Unit
expect fun glBindSamplers(first: UInt, count: Int, samplers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glBindTexture(target: UInt, texture: UInt): kotlin.Unit
expect fun glBindTextureUnit(unit: UInt, texture: UInt): kotlin.Unit
expect fun glBindTextures(first: UInt, count: Int, textures: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glBindTransformFeedback(target: UInt, id: UInt): kotlin.Unit
expect fun glBindVertexArray(array: UInt): kotlin.Unit
expect fun glBindVertexBuffer(bindingindex: UInt, buffer: UInt, offset: Long, stride: Int): kotlin.Unit
expect fun glBindVertexBuffers(first: UInt, count: Int, buffers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, offsets: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.LongVarOf<Long>>?, strides: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glBlendColor(red: Float, green: Float, blue: Float, alpha: Float): kotlin.Unit
expect fun glBlendEquation(mode: UInt): kotlin.Unit
expect fun glBlendEquationSeparate(modeRGB: UInt, modeAlpha: UInt): kotlin.Unit
expect fun glBlendEquationSeparatei(buf: UInt, modeRGB: UInt, modeAlpha: UInt): kotlin.Unit
expect fun glBlendEquationi(buf: UInt, mode: UInt): kotlin.Unit
expect fun glBlendFunc(sfactor: UInt, dfactor: UInt): kotlin.Unit
expect fun glBlendFuncSeparate(sfactorRGB: UInt, dfactorRGB: UInt, sfactorAlpha: UInt, dfactorAlpha: UInt): kotlin.Unit

expect fun glBlendFuncSeparatei(buf: UInt, srcRGB: UInt, dstRGB: UInt, srcAlpha: UInt, dstAlpha: UInt): kotlin.Unit
expect fun glBlendFunci(buf: UInt, src: UInt, dst: UInt): kotlin.Unit
expect fun glBlitFramebuffer(srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: UInt, filter: UInt): kotlin.Unit
expect fun glBlitNamedFramebuffer(readFramebuffer: UInt, drawFramebuffer: UInt, srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: UInt, filter: UInt): kotlin.Unit
expect fun glBufferData(target: UInt, size: Long, data: kotlinx.cinterop.CValuesRef<*>?, usage: UInt): kotlin.Unit
expect fun glBufferStorage(target: UInt, size: Long, data: kotlinx.cinterop.CValuesRef<*>?, flags: UInt): kotlin.Unit
expect fun glBufferSubData(target: UInt, offset: Long, size: Long, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCheckFramebufferStatus(target: UInt): UInt
expect fun glCheckNamedFramebufferStatus(framebuffer: UInt, target: UInt): UInt
expect fun glClampColor(target: UInt, clamp: UInt): kotlin.Unit
expect fun glClear(mask: UInt): kotlin.Unit
expect fun glClearBufferData(target: UInt, internalformat: UInt, format: UInt, type: UInt, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glClearBufferSubData(target: UInt, internalformat: UInt, offset: Long, size: Long, format: UInt, type: UInt, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glClearBufferfi(buffer: UInt, drawbuffer: Int, depth: Float, stencil: Int): kotlin.Unit
expect fun glClearBufferfv(buffer: UInt, drawbuffer: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glClearBufferiv(buffer: UInt, drawbuffer: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glClearBufferuiv(buffer: UInt, drawbuffer: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glClearColor(red: Float, green: Float, blue: Float, alpha: Float): kotlin.Unit
expect fun glClearDepth(depth: Double): kotlin.Unit
expect fun glClearDepthf(d: Float): kotlin.Unit
expect fun glClearNamedBufferData(buffer: UInt, internalformat: UInt, format: UInt, type: UInt, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glClearNamedBufferSubData(buffer: UInt, internalformat: UInt, offset: Long, size: Long, format: UInt, type: UInt, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glClearNamedFramebufferfi(framebuffer: UInt, buffer: UInt, drawbuffer: Int, depth: Float, stencil: Int): kotlin.Unit
expect fun glClearNamedFramebufferfv(framebuffer: UInt, buffer: UInt, drawbuffer: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glClearNamedFramebufferiv(framebuffer: UInt, buffer: UInt, drawbuffer: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glClearNamedFramebufferuiv(framebuffer: UInt, buffer: UInt, drawbuffer: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glClearStencil(s: Int): kotlin.Unit
expect fun glClearTexImage(texture: UInt, level: Int, format: UInt, type: UInt, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glClearTexSubImage(texture: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: UInt, type: UInt, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glClientWaitSync(sync: kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?, flags: UInt, timeout: ULong): UInt
expect fun glClipControl(origin: UInt, depth: UInt): kotlin.Unit
expect fun glColorMask(red: UByte, green: UByte, blue: UByte, alpha: UByte): kotlin.Unit
expect fun glColorMask(red: kotlin.Boolean, green: kotlin.Boolean, blue: kotlin.Boolean, alpha: kotlin.Boolean): kotlin.Unit
expect fun glColorMaski(index: UInt, r: UByte, g: UByte, b: UByte, a: UByte): kotlin.Unit
expect fun glColorMaski(index: UInt, r: kotlin.Boolean, g: kotlin.Boolean, b: kotlin.Boolean, a: kotlin.Boolean): kotlin.Unit
expect fun glCompileShader(shader: UInt): kotlin.Unit
expect fun glCompressedTexImage1D(target: UInt, level: Int, internalformat: UInt, width: Int, border: Int, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTexImage2D(target: UInt, level: Int, internalformat: UInt, width: Int, height: Int, border: Int, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTexImage3D(target: UInt, level: Int, internalformat: UInt, width: Int, height: Int, depth: Int, border: Int, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTexSubImage3D(target: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: UInt, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTextureSubImage1D(texture: UInt, level: Int, xoffset: Int, width: Int, format: UInt, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTextureSubImage2D(texture: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCompressedTextureSubImage3D(texture: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: UInt, imageSize: Int, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glCopyBufferSubData(readTarget: UInt, writeTarget: UInt, readOffset: Long, writeOffset: Long, size: Long): kotlin.Unit
expect fun glCopyImageSubData(srcName: UInt, srcTarget: UInt, srcLevel: Int, srcX: Int, srcY: Int, srcZ: Int, dstName: UInt, dstTarget: UInt, dstLevel: Int, dstX: Int, dstY: Int, dstZ: Int, srcWidth: Int, srcHeight: Int, srcDepth: Int): kotlin.Unit
expect fun glCopyNamedBufferSubData(readBuffer: UInt, writeBuffer: UInt, readOffset: Long, writeOffset: Long, size: Long): kotlin.Unit
expect fun glCopyTexImage1D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, border: Int): kotlin.Unit
expect fun glCopyTexImage2D(target: UInt, level: Int, internalformat: UInt, x: Int, y: Int, width: Int, height: Int, border: Int): kotlin.Unit
expect fun glCopyTexSubImage1D(target: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int): kotlin.Unit
expect fun glCopyTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glCopyTexSubImage3D(target: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glCopyTextureSubImage1D(texture: UInt, level: Int, xoffset: Int, x: Int, y: Int, width: Int): kotlin.Unit
expect fun glCopyTextureSubImage2D(texture: UInt, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glCopyTextureSubImage3D(texture: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glCreateBuffer(): UInt
expect fun glCreateBuffers(n: Int, buffers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateFramebuffer(): UInt
expect fun glCreateFramebuffers(n: Int, framebuffers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateProgram(): UInt
expect fun glCreateProgramPipeline(): UInt
expect fun glCreateProgramPipelines(n: Int, pipelines: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateQueries(target: UInt, n: Int, ids: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateQuery(target: UInt): UInt
expect fun glCreateRenderbuffer(): UInt
expect fun glCreateRenderbuffers(n: Int, renderbuffers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateSampler(): UInt
expect fun glCreateSamplers(n: Int, samplers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateShader(type: UInt): UInt
expect fun glCreateShaderProgramv(type: UInt, count: Int, strings: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVarOf<Byte>> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>> */>?): UInt
expect fun glCreateTexture(target: UInt): UInt
expect fun glCreateTextures(target: UInt, n: Int, textures: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateTransformFeedback(): UInt
expect fun glCreateTransformFeedbacks(n: Int, ids: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCreateVertexArray(): UInt
expect fun glCreateVertexArrays(n: Int, arrays: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glCullFace(mode: UInt): kotlin.Unit
expect fun glDebugMessageControl(source: UInt, type: UInt, severity: UInt, count: Int, ids: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, enabled: UByte): kotlin.Unit
expect fun glDebugMessageControl(source: UInt, type: UInt, severity: UInt, count: Int, ids: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, enabled: kotlin.Boolean): kotlin.Unit
expect fun glDebugMessageInsert(source: UInt, type: UInt, id: UInt, severity: UInt, length: Int, buf: kotlin.String): kotlin.Unit
expect fun glDebugMessageInsert(source: UInt, type: UInt, id: UInt, severity: UInt, length: Int, buf: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glDeleteBuffer(buffer: UInt): kotlin.Unit
expect fun glDeleteBuffers(n: Int, buffers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteFramebuffer(framebuffer: UInt): kotlin.Unit
expect fun glDeleteFramebuffers(n: Int, framebuffers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteProgram(program: UInt): kotlin.Unit
expect fun glDeleteProgramPipeline(pipeline: UInt): kotlin.Unit
expect fun glDeleteProgramPipelines(n: Int, pipelines: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteQueries(n: Int, ids: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteQuery(id: UInt): kotlin.Unit
expect fun glDeleteRenderbuffer(renderbuffer: UInt): kotlin.Unit
expect fun glDeleteRenderbuffers(n: Int, renderbuffers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteSampler(sampler: UInt): kotlin.Unit
expect fun glDeleteSamplers(count: Int, samplers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteShader(shader: UInt): kotlin.Unit
expect fun glDeleteSync(sync: kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?): kotlin.Unit
expect fun glDeleteTexture(texture: UInt): kotlin.Unit
expect fun glDeleteTextures(n: Int, textures: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteTransformFeedback(id: UInt): kotlin.Unit
expect fun glDeleteTransformFeedbacks(n: Int, ids: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDeleteVertexArray(array: UInt): kotlin.Unit
expect fun glDeleteVertexArrays(n: Int, arrays: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDepthFunc(func: UInt): kotlin.Unit
expect fun glDepthMask(flag: UByte): kotlin.Unit
expect fun glDepthMask(flag: kotlin.Boolean): kotlin.Unit
expect fun glDepthRange(n: Double, f: Double): kotlin.Unit
expect fun glDepthRangeArrayv(first: UInt, count: Int, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glDepthRangeIndexed(index: UInt, n: Double, f: Double): kotlin.Unit
expect fun glDepthRangef(n: Float, f: Float): kotlin.Unit
expect fun glDetachShader(program: UInt, shader: UInt): kotlin.Unit
expect fun glDisable(cap: UInt): kotlin.Unit
expect fun glDisableVertexArrayAttrib(vaobj: UInt, index: UInt): kotlin.Unit
expect fun glDisableVertexAttribArray(index: UInt): kotlin.Unit
expect fun glDisablei(target: UInt, index: UInt): kotlin.Unit
expect fun glDispatchCompute(num_groups_x: UInt, num_groups_y: UInt, num_groups_z: UInt): kotlin.Unit
expect fun glDispatchComputeIndirect(indirect: Long): kotlin.Unit
expect fun glDrawArrays(mode: UInt, first: Int, count: Int): kotlin.Unit
expect fun glDrawArraysIndirect(mode: UInt, indirect: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glDrawArraysInstanced(mode: UInt, first: Int, count: Int, instancecount: Int): kotlin.Unit
expect fun glDrawArraysInstancedBaseInstance(mode: UInt, first: Int, count: Int, instancecount: Int, baseinstance: UInt): kotlin.Unit
expect fun glDrawBuffer(buf: UInt): kotlin.Unit
expect fun glDrawBuffers(n: Int, bufs: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glDrawElements(mode: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glDrawElementsBaseVertex(mode: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?, basevertex: Int): kotlin.Unit
expect fun glDrawElementsIndirect(mode: UInt, type: UInt, indirect: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glDrawElementsInstanced(mode: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?, instancecount: Int): kotlin.Unit
expect fun glDrawElementsInstancedBaseInstance(mode: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?, instancecount: Int, baseinstance: UInt): kotlin.Unit
expect fun glDrawElementsInstancedBaseVertex(mode: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?, instancecount: Int, basevertex: Int): kotlin.Unit
expect fun glDrawElementsInstancedBaseVertexBaseInstance(mode: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?, instancecount: Int, basevertex: Int, baseinstance: UInt): kotlin.Unit
expect fun glDrawRangeElements(mode: UInt, start: UInt, end: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glDrawRangeElementsBaseVertex(mode: UInt, start: UInt, end: UInt, count: Int, type: UInt, indices: kotlinx.cinterop.CValuesRef<*>?, basevertex: Int): kotlin.Unit
expect fun glDrawTransformFeedback(mode: UInt, id: UInt): kotlin.Unit
expect fun glDrawTransformFeedbackInstanced(mode: UInt, id: UInt, instancecount: Int): kotlin.Unit
expect fun glDrawTransformFeedbackStream(mode: UInt, id: UInt, stream: UInt): kotlin.Unit
expect fun glDrawTransformFeedbackStreamInstanced(mode: UInt, id: UInt, stream: UInt, instancecount: Int): kotlin.Unit
expect fun glEnable(cap: UInt): kotlin.Unit
expect fun glEnableVertexArrayAttrib(vaobj: UInt, index: UInt): kotlin.Unit
expect fun glEnableVertexAttribArray(index: UInt): kotlin.Unit
expect fun glEnablei(target: UInt, index: UInt): kotlin.Unit
expect fun glEndConditionalRender(): kotlin.Unit
expect fun glEndQuery(target: UInt): kotlin.Unit
expect fun glEndQueryIndexed(target: UInt, index: UInt): kotlin.Unit
expect fun glEndTransformFeedback(): kotlin.Unit
expect fun glFenceSync(condition: UInt, flags: UInt): kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?
expect fun glFinish(): kotlin.Unit
expect fun glFlush(): kotlin.Unit
expect fun glFlushMappedBufferRange(target: UInt, offset: Long, length: Long): kotlin.Unit
expect fun glFlushMappedNamedBufferRange(buffer: UInt, offset: Long, length: Long): kotlin.Unit
expect fun glFramebufferParameteri(target: UInt, pname: UInt, param: Int): kotlin.Unit
expect fun glFramebufferRenderbuffer(target: UInt, attachment: UInt, renderbuffertarget: UInt, renderbuffer: UInt): kotlin.Unit
expect fun glFramebufferTexture(target: UInt, attachment: UInt, texture: UInt, level: Int): kotlin.Unit
expect fun glFramebufferTexture1D(target: UInt, attachment: UInt, textarget: UInt, texture: UInt, level: Int): kotlin.Unit
expect fun glFramebufferTexture2D(target: UInt, attachment: UInt, textarget: UInt, texture: UInt, level: Int): kotlin.Unit
expect fun glFramebufferTexture3D(target: UInt, attachment: UInt, textarget: UInt, texture: UInt, level: Int, zoffset: Int): kotlin.Unit
expect fun glFramebufferTextureLayer(target: UInt, attachment: UInt, texture: UInt, level: Int, layer: Int): kotlin.Unit
expect fun glFrontFace(mode: UInt): kotlin.Unit
expect fun glGenBuffer(): UInt
expect fun glGenBuffers(n: Int, buffers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenFramebuffer(): UInt
expect fun glGenFramebuffers(n: Int, framebuffers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenProgramPipeline(): UInt
expect fun glGenProgramPipelines(n: Int, pipelines: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenQueries(n: Int, ids: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenQuery(): UInt
expect fun glGenRenderbuffer(): UInt
expect fun glGenRenderbuffers(n: Int, renderbuffers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenSampler(): UInt
expect fun glGenSamplers(count: Int, samplers: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenTexture(): UInt
expect fun glGenTextures(n: Int, textures: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenTransformFeedback(): UInt
expect fun glGenTransformFeedbacks(n: Int, ids: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenVertexArray(): UInt
expect fun glGenVertexArrays(n: Int, arrays: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGenerateMipmap(target: UInt): kotlin.Unit
expect fun glGenerateTextureMipmap(texture: UInt): kotlin.Unit
expect fun glGetActiveAtomicCounterBufferi(program: UInt, bufferIndex: UInt, pname: UInt): Int
expect fun glGetActiveAtomicCounterBufferiv(program: UInt, bufferIndex: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetActiveAttrib(program: UInt, index: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, size: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, type: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetActiveSubroutineName(program: UInt, shadertype: UInt, index: UInt, bufsize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetActiveSubroutineUniformName(program: UInt, shadertype: UInt, index: UInt, bufsize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetActiveSubroutineUniformi(program: UInt, shadertype: UInt, index: UInt, pname: UInt): Int
expect fun glGetActiveSubroutineUniformiv(program: UInt, shadertype: UInt, index: UInt, pname: UInt, values: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetActiveUniform(program: UInt, index: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, size: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, type: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetActiveUniformBlockName(program: UInt, uniformBlockIndex: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, uniformBlockName: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetActiveUniformBlocki(program: UInt, uniformBlockIndex: UInt, pname: UInt): Int
expect fun glGetActiveUniformBlockiv(program: UInt, uniformBlockIndex: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetActiveUniformName(program: UInt, uniformIndex: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, uniformName: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetActiveUniformsi(program: UInt, uniformCount: Int, uniformIndices: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, pname: UInt): Int
expect fun glGetActiveUniformsiv(program: UInt, uniformCount: Int, uniformIndices: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetAttachedShaders(program: UInt, maxCount: Int, count: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, shaders: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetAttribLocation(program: UInt, name: kotlin.String): Int
expect fun glGetAttribLocation(program: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): Int
expect fun glGetBoolean(pname: UInt): UByte
expect fun glGetBoolean(target: UInt, index: UInt): UByte
expect fun glGetBooleani_v(target: UInt, index: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVarOf<UByte>>?): kotlin.Unit
expect fun glGetBooleanv(pname: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVarOf<UByte>>?): kotlin.Unit
expect fun glGetBufferParameteri(target: UInt, pname: UInt): Int
expect fun glGetBufferParameteri64(target: UInt, pname: UInt): Long
expect fun glGetBufferParameteri64v(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetBufferParameteriv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetBufferPointerv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>>>?): kotlin.Unit
expect fun glGetBufferSubData(target: UInt, offset: Long, size: Long, data: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetCompressedTexImage(target: UInt, level: Int, img: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetCompressedTextureImage(texture: UInt, level: Int, bufSize: Int, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetCompressedTextureSubImage(texture: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, bufSize: Int, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetDebugMessageLog(count: UInt, bufSize: Int, sources: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, types: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, ids: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, severities: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, lengths: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, messageLog: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): UInt
expect fun glGetDouble(pname: UInt): Double
expect fun glGetDouble(target: UInt, index: UInt): Double
expect fun glGetDoublei_v(target: UInt, index: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glGetDoublev(pname: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glGetError(): UInt
expect fun glGetFloat(pname: UInt): Float
expect fun glGetFloat(target: UInt, index: UInt): Float
expect fun glGetFloati_v(target: UInt, index: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetFloatv(pname: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetFragDataIndex(program: UInt, name: kotlin.String): Int
expect fun glGetFragDataIndex(program: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): Int
expect fun glGetFragDataLocation(program: UInt, name: kotlin.String): Int
expect fun glGetFragDataLocation(program: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): Int
expect fun glGetFramebufferAttachmentParameteri(target: UInt, attachment: UInt, pname: UInt): Int
expect fun glGetFramebufferAttachmentParameteriv(target: UInt, attachment: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetFramebufferParameteri(target: UInt, pname: UInt): Int
expect fun glGetFramebufferParameteriv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetGraphicsResetStatus(): UInt
expect fun glGetInteger(pname: UInt): Int
expect fun glGetInteger(target: UInt, index: UInt): Int
expect fun glGetInteger64(pname: UInt): Long
expect fun glGetInteger64(target: UInt, index: UInt): Long
expect fun glGetInteger64i_v(target: UInt, index: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetInteger64v(pname: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetIntegeri_v(target: UInt, index: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetIntegerv(pname: UInt, data: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetInternalformati(target: UInt, internalformat: UInt, pname: UInt, bufSize: Int): Int
expect fun glGetInternalformati64(target: UInt, internalformat: UInt, pname: UInt, bufSize: Int): Long
expect fun glGetInternalformati64v(target: UInt, internalformat: UInt, pname: UInt, bufSize: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetInternalformativ(target: UInt, internalformat: UInt, pname: UInt, bufSize: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetMultisamplef(pname: UInt, index: UInt): Float
expect fun glGetMultisamplefv(pname: UInt, index: UInt, `val`: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetNamedBufferParameteri(buffer: UInt, pname: UInt): Int
expect fun glGetNamedBufferParameteri64(buffer: UInt, pname: UInt): Long
expect fun glGetNamedBufferParameteri64v(buffer: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetNamedBufferParameteriv(buffer: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetNamedBufferPointerv(buffer: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>>>?): kotlin.Unit
expect fun glGetNamedBufferSubData(buffer: UInt, offset: Long, size: Long, data: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetNamedFramebufferAttachmentParameteri(framebuffer: UInt, attachment: UInt, pname: UInt): Int
expect fun glGetNamedFramebufferAttachmentParameteriv(framebuffer: UInt, attachment: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetNamedFramebufferParameteri(framebuffer: UInt, pname: UInt): Int
expect fun glGetNamedFramebufferParameteriv(framebuffer: UInt, pname: UInt, param: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetNamedRenderbufferParameteri(renderbuffer: UInt, pname: UInt): Int
expect fun glGetNamedRenderbufferParameteriv(renderbuffer: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetObjectLabel(identifier: UInt, name: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, label: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetObjectPtrLabel(ptr: kotlinx.cinterop.CValuesRef<*>?, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, label: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetPointerv(pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>>>?): kotlin.Unit
expect fun glGetProgramBinary(program: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, binaryFormat: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, binary: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetProgramInfoLog(program: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, infoLog: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetProgramInfoLog(program: kotlin.UInt): kotlin.String
expect fun glGetProgramInterfacei(program: UInt, programInterface: UInt, pname: UInt): Int
expect fun glGetProgramInterfaceiv(program: UInt, programInterface: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetProgramPipelineInfoLog(pipeline: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, infoLog: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetProgramPipelinei(pipeline: UInt, pname: UInt): Int
expect fun glGetProgramPipelineiv(pipeline: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetProgramResourceIndex(program: UInt, programInterface: UInt, name: kotlin.String): UInt
expect fun glGetProgramResourceIndex(program: UInt, programInterface: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): UInt
expect fun glGetProgramResourceLocation(program: UInt, programInterface: UInt, name: kotlin.String): Int
expect fun glGetProgramResourceLocation(program: UInt, programInterface: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): Int
expect fun glGetProgramResourceLocationIndex(program: UInt, programInterface: UInt, name: kotlin.String): Int
expect fun glGetProgramResourceLocationIndex(program: UInt, programInterface: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): Int
expect fun glGetProgramResourceName(program: UInt, programInterface: UInt, index: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetProgramResourcei(program: UInt, programInterface: UInt, index: UInt, propCount: Int, props: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): Int
expect fun glGetProgramResourceiv(program: UInt, programInterface: UInt, index: UInt, propCount: Int, props: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetProgramStagei(program: UInt, shadertype: UInt, pname: UInt): Int
expect fun glGetProgramStageiv(program: UInt, shadertype: UInt, pname: UInt, values: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetProgrami(program: UInt, pname: UInt): Int
expect fun glGetProgramiv(program: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetQueryBufferObjecti64v(id: UInt, buffer: UInt, pname: UInt, offset: Long): kotlin.Unit
expect fun glGetQueryBufferObjectiv(id: UInt, buffer: UInt, pname: UInt, offset: Long): kotlin.Unit
expect fun glGetQueryBufferObjectui64v(id: UInt, buffer: UInt, pname: UInt, offset: Long): kotlin.Unit
expect fun glGetQueryBufferObjectuiv(id: UInt, buffer: UInt, pname: UInt, offset: Long): kotlin.Unit
expect fun glGetQueryIndexedi(target: UInt, index: UInt, pname: UInt): Int
expect fun glGetQueryIndexediv(target: UInt, index: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetQueryObjecti(id: UInt, pname: UInt): Int
expect fun glGetQueryObjecti64(id: UInt, pname: UInt): Long
expect fun glGetQueryObjecti64v(id: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetQueryObjectiv(id: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetQueryObjectui(id: UInt, pname: UInt): UInt
expect fun glGetQueryObjectui64(id: UInt, pname: UInt): ULong
expect fun glGetQueryObjectui64v(id: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVarOf<ULong>>?): kotlin.Unit
expect fun glGetQueryObjectuiv(id: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetQueryi(target: UInt, pname: UInt): Int
expect fun glGetQueryiv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetRenderbufferParameteri(target: UInt, pname: UInt): Int
expect fun glGetRenderbufferParameteriv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetSamplerParameterIi(sampler: UInt, pname: UInt): Int
expect fun glGetSamplerParameterIiv(sampler: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetSamplerParameterIui(sampler: UInt, pname: UInt): UInt
expect fun glGetSamplerParameterIuiv(sampler: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetSamplerParameterf(sampler: UInt, pname: UInt): Float
expect fun glGetSamplerParameterfv(sampler: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetSamplerParameteri(sampler: UInt, pname: UInt): Int
expect fun glGetSamplerParameteriv(sampler: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetShaderInfoLog(shader: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, infoLog: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetShaderInfoLog(shader: kotlin.UInt): kotlin.String
expect fun glGetShaderPrecisionFormat(shadertype: UInt, precisiontype: UInt, range: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, precision: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetShaderSource(shader: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, source: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetShaderi(shader: UInt, pname: UInt): Int
expect fun glGetShaderiv(shader: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetString(name: UInt): kotlin.String?
expect fun glGetStringi(name: UInt, index: UInt): kotlin.String?
expect fun glGetSubroutineIndex(program: UInt, shadertype: UInt, name: kotlin.String): UInt
expect fun glGetSubroutineIndex(program: UInt, shadertype: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): UInt
expect fun glGetSubroutineUniformLocation(program: UInt, shadertype: UInt, name: kotlin.String): Int
expect fun glGetSubroutineUniformLocation(program: UInt, shadertype: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): Int
expect fun glGetSynci(sync: kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?, pname: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): Int
expect fun glGetSynciv(sync: kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?, pname: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, values: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTexImage(target: UInt, level: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetTexLevelParameterf(target: UInt, level: Int, pname: UInt): Float
expect fun glGetTexLevelParameterfv(target: UInt, level: Int, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetTexLevelParameteri(target: UInt, level: Int, pname: UInt): Int
expect fun glGetTexLevelParameteriv(target: UInt, level: Int, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTexParameterIi(target: UInt, pname: UInt): Int
expect fun glGetTexParameterIiv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTexParameterIui(target: UInt, pname: UInt): UInt
expect fun glGetTexParameterIuiv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetTexParameterf(target: UInt, pname: UInt): Float
expect fun glGetTexParameterfv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetTexParameteri(target: UInt, pname: UInt): Int
expect fun glGetTexParameteriv(target: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTextureImage(texture: UInt, level: Int, format: UInt, type: UInt, bufSize: Int, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetTextureLevelParameterf(texture: UInt, level: Int, pname: UInt): Float
expect fun glGetTextureLevelParameterfv(texture: UInt, level: Int, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetTextureLevelParameteri(texture: UInt, level: Int, pname: UInt): Int
expect fun glGetTextureLevelParameteriv(texture: UInt, level: Int, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTextureParameterIi(texture: UInt, pname: UInt): Int
expect fun glGetTextureParameterIiv(texture: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTextureParameterIui(texture: UInt, pname: UInt): UInt
expect fun glGetTextureParameterIuiv(texture: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetTextureParameterf(texture: UInt, pname: UInt): Float
expect fun glGetTextureParameterfv(texture: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetTextureParameteri(texture: UInt, pname: UInt): Int
expect fun glGetTextureParameteriv(texture: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTextureSubImage(texture: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: UInt, type: UInt, bufSize: Int, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetTransformFeedback(xfb: UInt, pname: UInt, index: UInt): Int
expect fun glGetTransformFeedbackVarying(program: UInt, index: UInt, bufSize: Int, length: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, size: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?, type: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?, name: kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glGetTransformFeedbacki(xfb: UInt, pname: UInt): Int
expect fun glGetTransformFeedbacki64_(xfb: UInt, pname: UInt, index: UInt): Long
expect fun glGetTransformFeedbacki64_v(xfb: UInt, pname: UInt, index: UInt, param: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetTransformFeedbacki_v(xfb: UInt, pname: UInt, index: UInt, param: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetTransformFeedbackiv(xfb: UInt, pname: UInt, param: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetUniformBlockIndex(program: UInt, uniformBlockName: kotlin.String): UInt
expect fun glGetUniformBlockIndex(program: UInt, uniformBlockName: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): UInt
expect fun glGetUniformIndices(program: UInt, uniformCount: Int, uniformNames: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVarOf<Byte>> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>> */>?, uniformIndices: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetUniformLocation(program: UInt, name: kotlin.String): Int
expect fun glGetUniformLocation(program: UInt, name: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): Int
expect fun glGetUniformSubroutineui(shadertype: UInt, location: Int): UInt
expect fun glGetUniformSubroutineuiv(shadertype: UInt, location: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetUniformd(program: UInt, location: Int): Double
expect fun glGetUniformdv(program: UInt, location: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glGetUniformf(program: UInt, location: Int): Float
expect fun glGetUniformfv(program: UInt, location: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetUniformi(program: UInt, location: Int): Int
expect fun glGetUniformiv(program: UInt, location: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetUniformui(program: UInt, location: Int): UInt
expect fun glGetUniformuiv(program: UInt, location: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetVertexArrayIndexed64i(vaobj: UInt, index: UInt, pname: UInt): Long
expect fun glGetVertexArrayIndexed64iv(vaobj: UInt, index: UInt, pname: UInt, param: kotlinx.cinterop.CPointer<kotlinx.cinterop.LongVarOf<Long>>?): kotlin.Unit
expect fun glGetVertexArrayIndexedi(vaobj: UInt, index: UInt, pname: UInt): Int
expect fun glGetVertexArrayIndexediv(vaobj: UInt, index: UInt, pname: UInt, param: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetVertexArrayi(vaobj: UInt, pname: UInt): Int
expect fun glGetVertexArrayiv(vaobj: UInt, pname: UInt, param: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetVertexAttribIi(index: UInt, pname: UInt): Int
expect fun glGetVertexAttribIiv(index: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetVertexAttribIui(index: UInt, pname: UInt): UInt
expect fun glGetVertexAttribIuiv(index: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glGetVertexAttribLd(index: UInt, pname: UInt): Double
expect fun glGetVertexAttribLdv(index: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glGetVertexAttribPointerv(index: UInt, pname: UInt, pointer: kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>>>?): kotlin.Unit
expect fun glGetVertexAttribd(index: UInt, pname: UInt): Double
expect fun glGetVertexAttribdv(index: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glGetVertexAttribf(index: UInt, pname: UInt): Float
expect fun glGetVertexAttribfv(index: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetVertexAttribi(index: UInt, pname: UInt): Int
expect fun glGetVertexAttribiv(index: UInt, pname: UInt, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetnCompressedTexImage(target: UInt, lod: Int, bufSize: Int, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetnTexImage(target: UInt, level: Int, format: UInt, type: UInt, bufSize: Int, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glGetnUniformd(program: UInt, location: Int, bufSize: Int): Double
expect fun glGetnUniformdv(program: UInt, location: Int, bufSize: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glGetnUniformf(program: UInt, location: Int, bufSize: Int): Float
expect fun glGetnUniformfv(program: UInt, location: Int, bufSize: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glGetnUniformi(program: UInt, location: Int, bufSize: Int): Int
expect fun glGetnUniformiv(program: UInt, location: Int, bufSize: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glGetnUniformui(program: UInt, location: Int, bufSize: Int): UInt
expect fun glGetnUniformuiv(program: UInt, location: Int, bufSize: Int, params: kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glHint(target: UInt, mode: UInt): kotlin.Unit
expect fun glInvalidateBufferData(buffer: UInt): kotlin.Unit
expect fun glInvalidateBufferSubData(buffer: UInt, offset: Long, length: Long): kotlin.Unit
expect fun glInvalidateFramebuffer(target: UInt, numAttachments: Int, attachments: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glInvalidateNamedFramebufferData(framebuffer: UInt, numAttachments: Int, attachments: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glInvalidateNamedFramebufferSubData(framebuffer: UInt, numAttachments: Int, attachments: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glInvalidateSubFramebuffer(target: UInt, numAttachments: Int, attachments: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glInvalidateTexImage(texture: UInt, level: Int): kotlin.Unit
expect fun glInvalidateTexSubImage(texture: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int): kotlin.Unit
expect fun glIsBuffer(buffer: UInt): kotlin.Boolean
expect fun glIsEnabled(cap: UInt): kotlin.Boolean
expect fun glIsEnabledi(target: UInt, index: UInt): kotlin.Boolean
expect fun glIsFramebuffer(framebuffer: UInt): kotlin.Boolean
expect fun glIsProgram(program: UInt): kotlin.Boolean
expect fun glIsProgramPipeline(pipeline: UInt): kotlin.Boolean
expect fun glIsQuery(id: UInt): kotlin.Boolean
expect fun glIsRenderbuffer(renderbuffer: UInt): kotlin.Boolean
expect fun glIsSampler(sampler: UInt): kotlin.Boolean
expect fun glIsShader(shader: UInt): kotlin.Boolean
expect fun glIsSync(sync: kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?): kotlin.Boolean
expect fun glIsTexture(texture: UInt): kotlin.Boolean
expect fun glIsTransformFeedback(id: UInt): kotlin.Boolean
expect fun glIsVertexArray(array: UInt): kotlin.Boolean
expect fun glLineWidth(width: Float): kotlin.Unit
expect fun glLinkProgram(program: UInt): kotlin.Unit
expect fun glLogicOp(opcode: UInt): kotlin.Unit
expect fun glMapBuffer(target: UInt, access: UInt): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
expect fun glMapBufferRange(target: UInt, offset: Long, length: Long, access: UInt): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
expect fun glMapNamedBuffer(buffer: UInt, access: UInt): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
expect fun glMapNamedBufferRange(buffer: UInt, offset: Long, length: Long, access: UInt): kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */
expect fun glMemoryBarrier(barriers: UInt): kotlin.Unit
expect fun glMemoryBarrierByRegion(barriers: UInt): kotlin.Unit
expect fun glMinSampleShading(value: Float): kotlin.Unit
expect fun glMultiDrawArrays(mode: UInt, first: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?, count: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?, drawcount: Int): kotlin.Unit
expect fun glMultiDrawArraysIndirect(mode: UInt, indirect: kotlinx.cinterop.CValuesRef<*>?, drawcount: Int, stride: Int): kotlin.Unit
expect fun glMultiDrawArraysIndirectCount(mode: UInt, indirect: kotlinx.cinterop.CValuesRef<*>?, drawcount: Long, maxdrawcount: Int, stride: Int): kotlin.Unit
expect fun glMultiDrawElements(mode: UInt, count: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?, type: UInt, indices: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>>>?, drawcount: Int): kotlin.Unit
expect fun glMultiDrawElementsBaseVertex(mode: UInt, count: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?, type: UInt, indices: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>>>?, drawcount: Int, basevertex: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glMultiDrawElementsIndirect(mode: UInt, type: UInt, indirect: kotlinx.cinterop.CValuesRef<*>?, drawcount: Int, stride: Int): kotlin.Unit
expect fun glMultiDrawElementsIndirectCount(mode: UInt, type: UInt, indirect: kotlinx.cinterop.CValuesRef<*>?, drawcount: Long, maxdrawcount: Int, stride: Int): kotlin.Unit
expect fun glNamedBufferData(buffer: UInt, size: Long, data: kotlinx.cinterop.CValuesRef<*>?, usage: UInt): kotlin.Unit
expect fun glNamedBufferStorage(buffer: UInt, size: Long, data: kotlinx.cinterop.CValuesRef<*>?, flags: UInt): kotlin.Unit
expect fun glNamedBufferSubData(buffer: UInt, offset: Long, size: Long, data: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glNamedFramebufferDrawBuffer(framebuffer: UInt, buf: UInt): kotlin.Unit
expect fun glNamedFramebufferDrawBuffers(framebuffer: UInt, n: Int, bufs: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glNamedFramebufferParameteri(framebuffer: UInt, pname: UInt, param: Int): kotlin.Unit
expect fun glNamedFramebufferReadBuffer(framebuffer: UInt, src: UInt): kotlin.Unit
expect fun glNamedFramebufferRenderbuffer(framebuffer: UInt, attachment: UInt, renderbuffertarget: UInt, renderbuffer: UInt): kotlin.Unit
expect fun glNamedFramebufferTexture(framebuffer: UInt, attachment: UInt, texture: UInt, level: Int): kotlin.Unit
expect fun glNamedFramebufferTextureLayer(framebuffer: UInt, attachment: UInt, texture: UInt, level: Int, layer: Int): kotlin.Unit
expect fun glNamedRenderbufferStorage(renderbuffer: UInt, internalformat: UInt, width: Int, height: Int): kotlin.Unit
expect fun glNamedRenderbufferStorageMultisample(renderbuffer: UInt, samples: Int, internalformat: UInt, width: Int, height: Int): kotlin.Unit
expect fun glObjectLabel(identifier: UInt, name: UInt, length: Int, label: kotlin.String): kotlin.Unit
expect fun glObjectLabel(identifier: UInt, name: UInt, length: Int, label: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glObjectPtrLabel(ptr: kotlinx.cinterop.CValuesRef<*>?, length: Int, label: kotlin.String): kotlin.Unit
expect fun glObjectPtrLabel(ptr: kotlinx.cinterop.CValuesRef<*>?, length: Int, label: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glPatchParameterfv(pname: UInt, values: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glPatchParameteri(pname: UInt, value: Int): kotlin.Unit
expect fun glPauseTransformFeedback(): kotlin.Unit
expect fun glPixelStoref(pname: UInt, param: Float): kotlin.Unit
expect fun glPixelStorei(pname: UInt, param: Int): kotlin.Unit
expect fun glPointParameterf(pname: UInt, param: Float): kotlin.Unit
expect fun glPointParameterfv(pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glPointParameteri(pname: UInt, param: Int): kotlin.Unit
expect fun glPointParameteriv(pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glPointSize(size: Float): kotlin.Unit
expect fun glPolygonMode(face: UInt, mode: UInt): kotlin.Unit
expect fun glPolygonOffset(factor: Float, units: Float): kotlin.Unit
expect fun glPolygonOffsetClamp(factor: Float, units: Float, clamp: Float): kotlin.Unit
expect fun glPopDebugGroup(): kotlin.Unit
expect fun glPrimitiveRestartIndex(index: UInt): kotlin.Unit
expect fun glProgramBinary(program: UInt, binaryFormat: UInt, binary: kotlinx.cinterop.CValuesRef<*>?, length: Int): kotlin.Unit
expect fun glProgramParameteri(program: UInt, pname: UInt, value: Int): kotlin.Unit
expect fun glProgramUniform1d(program: UInt, location: Int, v0: Double): kotlin.Unit
expect fun glProgramUniform1dv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniform1f(program: UInt, location: Int, v0: Float): kotlin.Unit
expect fun glProgramUniform1fv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniform1i(program: UInt, location: Int, v0: Int): kotlin.Unit
expect fun glProgramUniform1iv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glProgramUniform1ui(program: UInt, location: Int, v0: UInt): kotlin.Unit
expect fun glProgramUniform1uiv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glProgramUniform2d(program: UInt, location: Int, v0: Double, v1: Double): kotlin.Unit
expect fun glProgramUniform2dv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniform2f(program: UInt, location: Int, v0: Float, v1: Float): kotlin.Unit
expect fun glProgramUniform2fv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniform2i(program: UInt, location: Int, v0: Int, v1: Int): kotlin.Unit
expect fun glProgramUniform2iv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glProgramUniform2ui(program: UInt, location: Int, v0: UInt, v1: UInt): kotlin.Unit
expect fun glProgramUniform2uiv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glProgramUniform3d(program: UInt, location: Int, v0: Double, v1: Double, v2: Double): kotlin.Unit
expect fun glProgramUniform3dv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniform3f(program: UInt, location: Int, v0: Float, v1: Float, v2: Float): kotlin.Unit
expect fun glProgramUniform3fv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniform3i(program: UInt, location: Int, v0: Int, v1: Int, v2: Int): kotlin.Unit
expect fun glProgramUniform3iv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glProgramUniform3ui(program: UInt, location: Int, v0: UInt, v1: UInt, v2: UInt): kotlin.Unit
expect fun glProgramUniform3uiv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glProgramUniform4d(program: UInt, location: Int, v0: Double, v1: Double, v2: Double, v3: Double): kotlin.Unit
expect fun glProgramUniform4dv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniform4f(program: UInt, location: Int, v0: Float, v1: Float, v2: Float, v3: Float): kotlin.Unit
expect fun glProgramUniform4fv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniform4i(program: UInt, location: Int, v0: Int, v1: Int, v2: Int, v3: Int): kotlin.Unit
expect fun glProgramUniform4iv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glProgramUniform4ui(program: UInt, location: Int, v0: UInt, v1: UInt, v2: UInt, v3: UInt): kotlin.Unit
expect fun glProgramUniform4uiv(program: UInt, location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glProgramUniformMatrix2dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix2dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix2fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix2fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x3dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x3dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x3fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x3fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x4dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x4dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x4fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix2x4fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix3dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix3dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix3fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix3fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x2dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x2dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x2fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x2fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x4dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x4dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x4fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix3x4fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix4dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix4dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix4fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix4fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x2dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x2dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x2fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x2fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x3dv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x3dv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x3fv(program: UInt, location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProgramUniformMatrix4x3fv(program: UInt, location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glProvokingVertex(mode: UInt): kotlin.Unit
expect fun glPushDebugGroup(source: UInt, id: UInt, length: Int, message: kotlin.String): kotlin.Unit
expect fun glPushDebugGroup(source: UInt, id: UInt, length: Int, message: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glQueryCounter(id: UInt, target: UInt): kotlin.Unit
expect fun glReadBuffer(src: UInt): kotlin.Unit
expect fun glReadPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glReadnPixels(x: Int, y: Int, width: Int, height: Int, format: UInt, type: UInt, bufSize: Int, data: kotlinx.cinterop.COpaquePointer? /* = kotlinx.cinterop.CPointer<out kotlinx.cinterop.CPointed>? */): kotlin.Unit
expect fun glReleaseShaderCompiler(): kotlin.Unit
expect fun glRenderbufferStorage(target: UInt, internalformat: UInt, width: Int, height: Int): kotlin.Unit
expect fun glRenderbufferStorageMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int): kotlin.Unit
expect fun glResumeTransformFeedback(): kotlin.Unit
expect fun glSampleCoverage(value: Float, invert: UByte): kotlin.Unit
expect fun glSampleCoverage(value: Float, invert: kotlin.Boolean): kotlin.Unit
expect fun glSampleMaski(maskNumber: UInt, mask: UInt): kotlin.Unit
expect fun glSamplerParameterIiv(sampler: UInt, pname: UInt, param: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glSamplerParameterIuiv(sampler: UInt, pname: UInt, param: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glSamplerParameterf(sampler: UInt, pname: UInt, param: Float): kotlin.Unit
expect fun glSamplerParameterfv(sampler: UInt, pname: UInt, param: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glSamplerParameteri(sampler: UInt, pname: UInt, param: Int): kotlin.Unit
expect fun glSamplerParameteriv(sampler: UInt, pname: UInt, param: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glScissor(x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glScissorArrayv(first: UInt, count: Int, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glScissorIndexed(index: UInt, left: Int, bottom: Int, width: Int, height: Int): kotlin.Unit
expect fun glScissorIndexedv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glShaderBinary(count: Int, shaders: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, binaryformat: UInt, binary: kotlinx.cinterop.CValuesRef<*>?, length: Int): kotlin.Unit
expect fun glShaderSource(shader: UInt, count: Int, string: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVarOf<Byte>> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>> */>?, length: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glShaderSource(shader: kotlin.UInt, string: kotlin.String): kotlin.Unit
expect fun glShaderSource(shader: kotlin.UInt, strings: kotlin.collections.List<kotlin.String>): kotlin.Unit
expect fun glShaderStorageBlockBinding(program: UInt, storageBlockIndex: UInt, storageBlockBinding: UInt): kotlin.Unit
expect fun glSpecializeShader(shader: UInt, pEntryPoint: kotlin.String, numSpecializationConstants: UInt, pConstantIndex: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, pConstantValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glSpecializeShader(shader: UInt, pEntryPoint: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?, numSpecializationConstants: UInt, pConstantIndex: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, pConstantValue: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glStencilFunc(func: UInt, ref: Int, mask: UInt): kotlin.Unit
expect fun glStencilFuncSeparate(face: UInt, func: UInt, ref: Int, mask: UInt): kotlin.Unit
expect fun glStencilMask(mask: UInt): kotlin.Unit
expect fun glStencilMaskSeparate(face: UInt, mask: UInt): kotlin.Unit
expect fun glStencilOp(fail: UInt, zfail: UInt, zpass: UInt): kotlin.Unit
expect fun glStencilOpSeparate(face: UInt, sfail: UInt, dpfail: UInt, dppass: UInt): kotlin.Unit
expect fun glTexBuffer(target: UInt, internalformat: UInt, buffer: UInt): kotlin.Unit
expect fun glTexBufferRange(target: UInt, internalformat: UInt, buffer: UInt, offset: Long, size: Long): kotlin.Unit
expect fun glTexImage1D(target: UInt, level: Int, internalformat: Int, width: Int, border: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTexImage2D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTexImage2DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, fixedsamplelocations: UByte): kotlin.Unit
expect fun glTexImage2DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, fixedsamplelocations: kotlin.Boolean): kotlin.Unit
expect fun glTexImage3D(target: UInt, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTexImage3DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, depth: Int, fixedsamplelocations: UByte): kotlin.Unit
expect fun glTexImage3DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, depth: Int, fixedsamplelocations: kotlin.Boolean): kotlin.Unit
expect fun glTexParameterIiv(target: UInt, pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glTexParameterIuiv(target: UInt, pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glTexParameterf(target: UInt, pname: UInt, param: Float): kotlin.Unit
expect fun glTexParameterfv(target: UInt, pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glTexParameteri(target: UInt, pname: UInt, param: Int): kotlin.Unit
expect fun glTexParameteriv(target: UInt, pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glTexStorage1D(target: UInt, levels: Int, internalformat: UInt, width: Int): kotlin.Unit
expect fun glTexStorage2D(target: UInt, levels: Int, internalformat: UInt, width: Int, height: Int): kotlin.Unit
expect fun glTexStorage2DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, fixedsamplelocations: UByte): kotlin.Unit
expect fun glTexStorage2DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, fixedsamplelocations: kotlin.Boolean): kotlin.Unit
expect fun glTexStorage3D(target: UInt, levels: Int, internalformat: UInt, width: Int, height: Int, depth: Int): kotlin.Unit
expect fun glTexStorage3DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, depth: Int, fixedsamplelocations: UByte): kotlin.Unit
expect fun glTexStorage3DMultisample(target: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, depth: Int, fixedsamplelocations: kotlin.Boolean): kotlin.Unit
expect fun glTexSubImage1D(target: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTexSubImage2D(target: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTexSubImage3D(target: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTextureBarrier(): kotlin.Unit
expect fun glTextureBuffer(texture: UInt, internalformat: UInt, buffer: UInt): kotlin.Unit
expect fun glTextureBufferRange(texture: UInt, internalformat: UInt, buffer: UInt, offset: Long, size: Long): kotlin.Unit
expect fun glTextureParameterIiv(texture: UInt, pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glTextureParameterIuiv(texture: UInt, pname: UInt, params: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glTextureParameterf(texture: UInt, pname: UInt, param: Float): kotlin.Unit
expect fun glTextureParameterfv(texture: UInt, pname: UInt, param: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glTextureParameteri(texture: UInt, pname: UInt, param: Int): kotlin.Unit
expect fun glTextureParameteriv(texture: UInt, pname: UInt, param: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glTextureStorage1D(texture: UInt, levels: Int, internalformat: UInt, width: Int): kotlin.Unit
expect fun glTextureStorage2D(texture: UInt, levels: Int, internalformat: UInt, width: Int, height: Int): kotlin.Unit
expect fun glTextureStorage2DMultisample(texture: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, fixedsamplelocations: UByte): kotlin.Unit
expect fun glTextureStorage2DMultisample(texture: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, fixedsamplelocations: kotlin.Boolean): kotlin.Unit
expect fun glTextureStorage3D(texture: UInt, levels: Int, internalformat: UInt, width: Int, height: Int, depth: Int): kotlin.Unit
expect fun glTextureStorage3DMultisample(texture: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, depth: Int, fixedsamplelocations: UByte): kotlin.Unit
expect fun glTextureStorage3DMultisample(texture: UInt, samples: Int, internalformat: UInt, width: Int, height: Int, depth: Int, fixedsamplelocations: kotlin.Boolean): kotlin.Unit
expect fun glTextureSubImage1D(texture: UInt, level: Int, xoffset: Int, width: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTextureSubImage2D(texture: UInt, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTextureSubImage3D(texture: UInt, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int, format: UInt, type: UInt, pixels: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glTextureView(texture: UInt, target: UInt, origtexture: UInt, internalformat: UInt, minlevel: UInt, numlevels: UInt, minlayer: UInt, numlayers: UInt): kotlin.Unit
expect fun glTransformFeedbackBufferBase(xfb: UInt, index: UInt, buffer: UInt): kotlin.Unit
expect fun glTransformFeedbackBufferRange(xfb: UInt, index: UInt, buffer: UInt, offset: Long, size: Long): kotlin.Unit
expect fun glTransformFeedbackVaryings(program: UInt, count: Int, varyings: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.CPointerVar<kotlinx.cinterop.ByteVarOf<Byte>> /* = kotlinx.cinterop.CPointerVarOf<kotlinx.cinterop.CPointer<kotlinx.cinterop.ByteVarOf<Byte>>> */>?, bufferMode: UInt): kotlin.Unit
expect fun glUniform1d(location: Int, x: Double): kotlin.Unit
expect fun glUniform1dv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniform1f(location: Int, v0: Float): kotlin.Unit
expect fun glUniform1fv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniform1i(location: Int, v0: Int): kotlin.Unit
expect fun glUniform1iv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glUniform1ui(location: Int, v0: UInt): kotlin.Unit
expect fun glUniform1uiv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glUniform2d(location: Int, x: Double, y: Double): kotlin.Unit
expect fun glUniform2dv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniform2f(location: Int, v0: Float, v1: Float): kotlin.Unit
expect fun glUniform2fv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniform2i(location: Int, v0: Int, v1: Int): kotlin.Unit
expect fun glUniform2iv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glUniform2ui(location: Int, v0: UInt, v1: UInt): kotlin.Unit
expect fun glUniform2uiv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glUniform3d(location: Int, x: Double, y: Double, z: Double): kotlin.Unit
expect fun glUniform3dv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniform3f(location: Int, v0: Float, v1: Float, v2: Float): kotlin.Unit
expect fun glUniform3fv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniform3i(location: Int, v0: Int, v1: Int, v2: Int): kotlin.Unit
expect fun glUniform3iv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glUniform3ui(location: Int, v0: UInt, v1: UInt, v2: UInt): kotlin.Unit
expect fun glUniform3uiv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glUniform4d(location: Int, x: Double, y: Double, z: Double, w: Double): kotlin.Unit
expect fun glUniform4dv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniform4f(location: Int, v0: Float, v1: Float, v2: Float, v3: Float): kotlin.Unit
expect fun glUniform4fv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniform4i(location: Int, v0: Int, v1: Int, v2: Int, v3: Int): kotlin.Unit
expect fun glUniform4iv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glUniform4ui(location: Int, v0: UInt, v1: UInt, v2: UInt, v3: UInt): kotlin.Unit
expect fun glUniform4uiv(location: Int, count: Int, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glUniformBlockBinding(program: UInt, uniformBlockIndex: UInt, uniformBlockBinding: UInt): kotlin.Unit
expect fun glUniformMatrix2dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix2dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix2fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix2fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix2x3dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix2x3dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix2x3fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix2x3fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix2x4dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix2x4dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix2x4fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix2x4fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix3dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix3dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix3fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix3fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix3x2dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix3x2dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix3x2fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix3x2fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix3x4dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix3x4dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix3x4fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix3x4fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix4dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix4dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix4fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix4fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix4x2dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix4x2dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix4x2fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix4x2fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix4x3dv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix4x3dv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glUniformMatrix4x3fv(location: Int, count: Int, transpose: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformMatrix4x3fv(location: Int, count: Int, transpose: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glUniformSubroutinesuiv(shadertype: UInt, count: Int, indices: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glUnmapBuffer(target: UInt): kotlin.Boolean
expect fun glUnmapNamedBuffer(buffer: UInt): kotlin.Boolean
expect fun glUseProgram(program: UInt): kotlin.Unit
expect fun glUseProgramStages(pipeline: UInt, stages: UInt, program: UInt): kotlin.Unit
expect fun glValidateProgram(program: UInt): kotlin.Unit
expect fun glValidateProgramPipeline(pipeline: UInt): kotlin.Unit
expect fun glVertexArrayAttribBinding(vaobj: UInt, attribindex: UInt, bindingindex: UInt): kotlin.Unit
expect fun glVertexArrayAttribFormat(vaobj: UInt, attribindex: UInt, size: Int, type: UInt, normalized: UByte, relativeoffset: UInt): kotlin.Unit
expect fun glVertexArrayAttribFormat(vaobj: UInt, attribindex: UInt, size: Int, type: UInt, normalized: kotlin.Boolean, relativeoffset: UInt): kotlin.Unit
expect fun glVertexArrayAttribIFormat(vaobj: UInt, attribindex: UInt, size: Int, type: UInt, relativeoffset: UInt): kotlin.Unit
expect fun glVertexArrayAttribLFormat(vaobj: UInt, attribindex: UInt, size: Int, type: UInt, relativeoffset: UInt): kotlin.Unit
expect fun glVertexArrayBindingDivisor(vaobj: UInt, bindingindex: UInt, divisor: UInt): kotlin.Unit
expect fun glVertexArrayElementBuffer(vaobj: UInt, buffer: UInt): kotlin.Unit
expect fun glVertexArrayVertexBuffer(vaobj: UInt, bindingindex: UInt, buffer: UInt, offset: Long, stride: Int): kotlin.Unit
expect fun glVertexArrayVertexBuffers(vaobj: UInt, first: UInt, count: Int, buffers: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?, offsets: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.LongVarOf<Long>>?, strides: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glVertexAttrib1d(index: UInt, x: Double): kotlin.Unit
expect fun glVertexAttrib1dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttrib1f(index: UInt, x: Float): kotlin.Unit
expect fun glVertexAttrib1fv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glVertexAttrib1s(index: UInt, x: Short): kotlin.Unit
expect fun glVertexAttrib1sv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ShortVarOf<Short>>?): kotlin.Unit
expect fun glVertexAttrib2d(index: UInt, x: Double, y: Double): kotlin.Unit
expect fun glVertexAttrib2dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttrib2f(index: UInt, x: Float, y: Float): kotlin.Unit
expect fun glVertexAttrib2fv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glVertexAttrib2s(index: UInt, x: Short, y: Short): kotlin.Unit
expect fun glVertexAttrib2sv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ShortVarOf<Short>>?): kotlin.Unit
expect fun glVertexAttrib3d(index: UInt, x: Double, y: Double, z: Double): kotlin.Unit
expect fun glVertexAttrib3dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttrib3f(index: UInt, x: Float, y: Float, z: Float): kotlin.Unit
expect fun glVertexAttrib3fv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glVertexAttrib3s(index: UInt, x: Short, y: Short, z: Short): kotlin.Unit
expect fun glVertexAttrib3sv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ShortVarOf<Short>>?): kotlin.Unit
expect fun glVertexAttrib4Nbv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glVertexAttrib4Niv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glVertexAttrib4Nsv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ShortVarOf<Short>>?): kotlin.Unit
expect fun glVertexAttrib4Nub(index: UInt, x: UByte, y: UByte, z: UByte, w: UByte): kotlin.Unit
expect fun glVertexAttrib4Nubv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UByteVarOf<UByte>>?): kotlin.Unit
expect fun glVertexAttrib4Nuiv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttrib4Nusv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UShortVarOf<UShort>>?): kotlin.Unit
expect fun glVertexAttrib4bv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glVertexAttrib4d(index: UInt, x: Double, y: Double, z: Double, w: Double): kotlin.Unit
expect fun glVertexAttrib4dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttrib4f(index: UInt, x: Float, y: Float, z: Float, w: Float): kotlin.Unit
expect fun glVertexAttrib4fv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glVertexAttrib4iv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glVertexAttrib4s(index: UInt, x: Short, y: Short, z: Short, w: Short): kotlin.Unit
expect fun glVertexAttrib4sv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ShortVarOf<Short>>?): kotlin.Unit
expect fun glVertexAttrib4ubv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UByteVarOf<UByte>>?): kotlin.Unit
expect fun glVertexAttrib4uiv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttrib4usv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UShortVarOf<UShort>>?): kotlin.Unit
expect fun glVertexAttribBinding(attribindex: UInt, bindingindex: UInt): kotlin.Unit
expect fun glVertexAttribDivisor(index: UInt, divisor: UInt): kotlin.Unit
expect fun glVertexAttribFormat(attribindex: UInt, size: Int, type: UInt, normalized: UByte, relativeoffset: UInt): kotlin.Unit
expect fun glVertexAttribFormat(attribindex: UInt, size: Int, type: UInt, normalized: kotlin.Boolean, relativeoffset: UInt): kotlin.Unit
expect fun glVertexAttribI1i(index: UInt, x: Int): kotlin.Unit
expect fun glVertexAttribI1iv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glVertexAttribI1ui(index: UInt, x: UInt): kotlin.Unit
expect fun glVertexAttribI1uiv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribI2i(index: UInt, x: Int, y: Int): kotlin.Unit
expect fun glVertexAttribI2iv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glVertexAttribI2ui(index: UInt, x: UInt, y: UInt): kotlin.Unit
expect fun glVertexAttribI2uiv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribI3i(index: UInt, x: Int, y: Int, z: Int): kotlin.Unit
expect fun glVertexAttribI3iv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glVertexAttribI3ui(index: UInt, x: UInt, y: UInt, z: UInt): kotlin.Unit
expect fun glVertexAttribI3uiv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribI4bv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ByteVarOf<Byte>>?): kotlin.Unit
expect fun glVertexAttribI4i(index: UInt, x: Int, y: Int, z: Int, w: Int): kotlin.Unit
expect fun glVertexAttribI4iv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.IntVarOf<Int>>?): kotlin.Unit
expect fun glVertexAttribI4sv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.ShortVarOf<Short>>?): kotlin.Unit
expect fun glVertexAttribI4ubv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UByteVarOf<UByte>>?): kotlin.Unit
expect fun glVertexAttribI4ui(index: UInt, x: UInt, y: UInt, z: UInt, w: UInt): kotlin.Unit
expect fun glVertexAttribI4uiv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribI4usv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UShortVarOf<UShort>>?): kotlin.Unit
expect fun glVertexAttribIFormat(attribindex: UInt, size: Int, type: UInt, relativeoffset: UInt): kotlin.Unit
expect fun glVertexAttribIPointer(index: UInt, size: Int, type: UInt, stride: Int, pointer: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glVertexAttribL1d(index: UInt, x: Double): kotlin.Unit
expect fun glVertexAttribL1dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttribL2d(index: UInt, x: Double, y: Double): kotlin.Unit
expect fun glVertexAttribL2dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttribL3d(index: UInt, x: Double, y: Double, z: Double): kotlin.Unit
expect fun glVertexAttribL3dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttribL4d(index: UInt, x: Double, y: Double, z: Double, w: Double): kotlin.Unit
expect fun glVertexAttribL4dv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.DoubleVarOf<Double>>?): kotlin.Unit
expect fun glVertexAttribLFormat(attribindex: UInt, size: Int, type: UInt, relativeoffset: UInt): kotlin.Unit
expect fun glVertexAttribLPointer(index: UInt, size: Int, type: UInt, stride: Int, pointer: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glVertexAttribP1ui(index: UInt, type: UInt, normalized: UByte, value: UInt): kotlin.Unit
expect fun glVertexAttribP1ui(index: UInt, type: UInt, normalized: kotlin.Boolean, value: UInt): kotlin.Unit
expect fun glVertexAttribP1uiv(index: UInt, type: UInt, normalized: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribP1uiv(index: UInt, type: UInt, normalized: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribP2ui(index: UInt, type: UInt, normalized: UByte, value: UInt): kotlin.Unit
expect fun glVertexAttribP2ui(index: UInt, type: UInt, normalized: kotlin.Boolean, value: UInt): kotlin.Unit
expect fun glVertexAttribP2uiv(index: UInt, type: UInt, normalized: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribP2uiv(index: UInt, type: UInt, normalized: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribP3ui(index: UInt, type: UInt, normalized: UByte, value: UInt): kotlin.Unit
expect fun glVertexAttribP3ui(index: UInt, type: UInt, normalized: kotlin.Boolean, value: UInt): kotlin.Unit
expect fun glVertexAttribP3uiv(index: UInt, type: UInt, normalized: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribP3uiv(index: UInt, type: UInt, normalized: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribP4ui(index: UInt, type: UInt, normalized: UByte, value: UInt): kotlin.Unit
expect fun glVertexAttribP4ui(index: UInt, type: UInt, normalized: kotlin.Boolean, value: UInt): kotlin.Unit
expect fun glVertexAttribP4uiv(index: UInt, type: UInt, normalized: UByte, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribP4uiv(index: UInt, type: UInt, normalized: kotlin.Boolean, value: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.UIntVarOf<UInt>>?): kotlin.Unit
expect fun glVertexAttribPointer(index: UInt, size: Int, type: UInt, normalized: UByte, stride: Int, pointer: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glVertexAttribPointer(index: UInt, size: Int, type: UInt, normalized: kotlin.Boolean, stride: Int, pointer: kotlinx.cinterop.CValuesRef<*>?): kotlin.Unit
expect fun glVertexBindingDivisor(bindingindex: UInt, divisor: UInt): kotlin.Unit
expect fun glViewport(x: Int, y: Int, width: Int, height: Int): kotlin.Unit
expect fun glViewportArrayv(first: UInt, count: Int, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glViewportIndexedf(index: UInt, x: Float, y: Float, w: Float, h: Float): kotlin.Unit
expect fun glViewportIndexedfv(index: UInt, v: kotlinx.cinterop.CValuesRef<kotlinx.cinterop.FloatVarOf<Float>>?): kotlin.Unit
expect fun glWaitSync(sync: kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?, flags: UInt, timeout: ULong): kotlin.Unit
expect fun nglGetString(name: UInt): kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVarOf<UByte>>?
expect fun nglGetStringi(name: UInt, index: UInt): kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVarOf<UByte>>?
expect fun nglIsBuffer(buffer: UInt): UByte
expect fun nglIsEnabled(cap: UInt): UByte
expect fun nglIsEnabledi(target: UInt, index: UInt): UByte
expect fun nglIsFramebuffer(framebuffer: UInt): UByte
expect fun nglIsProgram(program: UInt): UByte
expect fun nglIsProgramPipeline(pipeline: UInt): UByte
expect fun nglIsQuery(id: UInt): UByte
expect fun nglIsRenderbuffer(renderbuffer: UInt): UByte
expect fun nglIsSampler(sampler: UInt): UByte
expect fun nglIsShader(shader: UInt): UByte
expect fun nglIsSync(sync: kotlinx.cinterop.CPointer<cnames.structs.__GLsync>?): UByte
expect fun nglIsTexture(texture: UInt): UByte
expect fun nglIsTransformFeedback(id: UInt): UByte
expect fun nglIsVertexArray(array: UInt): UByte
expect fun nglUnmapBuffer(target: UInt): UByte
expect fun nglUnmapNamedBuffer(buffer: UInt): UByte
