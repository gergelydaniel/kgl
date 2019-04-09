(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', 'kotlin'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('kotlin'));
  else {
    if (typeof kotlin === 'undefined') {
      throw new Error("Error loading module 'kgl'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'kgl'.");
    }
    root.kgl = factory(typeof kgl === 'undefined' ? {} : kgl, kotlin);
  }
}(this, function (_, Kotlin) {
  'use strict';
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var GL_ACTIVE_TEXTURE;
  var GL_DEPTH_BUFFER_BIT;
  var GL_STENCIL_BUFFER_BIT;
  var GL_COLOR_BUFFER_BIT;
  var GL_FALSE;
  var GL_TRUE;
  var GL_POINTS;
  var GL_LINES;
  var GL_LINE_LOOP;
  var GL_LINE_STRIP;
  var GL_TRIANGLES;
  var GL_TRIANGLE_STRIP;
  var GL_TRIANGLE_FAN;
  var GL_ZERO;
  var GL_ONE;
  var GL_SRC_COLOR;
  var GL_ONE_MINUS_SRC_COLOR;
  var GL_SRC_ALPHA;
  var GL_ONE_MINUS_SRC_ALPHA;
  var GL_DST_ALPHA;
  var GL_ONE_MINUS_DST_ALPHA;
  var GL_DST_COLOR;
  var GL_ONE_MINUS_DST_COLOR;
  var GL_SRC_ALPHA_SATURATE;
  var GL_FUNC_ADD;
  var GL_BLEND_EQUATION;
  var GL_BLEND_EQUATION_RGB;
  var GL_BLEND_EQUATION_ALPHA;
  var GL_FUNC_SUBTRACT;
  var GL_FUNC_REVERSE_SUBTRACT;
  var GL_BLEND_DST_RGB;
  var GL_BLEND_SRC_RGB;
  var GL_BLEND_DST_ALPHA;
  var GL_BLEND_SRC_ALPHA;
  var GL_CONSTANT_COLOR;
  var GL_ONE_MINUS_CONSTANT_COLOR;
  var GL_CONSTANT_ALPHA;
  var GL_ONE_MINUS_CONSTANT_ALPHA;
  var GL_BLEND_COLOR;
  var GL_ARRAY_BUFFER;
  var GL_ELEMENT_ARRAY_BUFFER;
  var GL_ARRAY_BUFFER_BINDING;
  var GL_ELEMENT_ARRAY_BUFFER_BINDING;
  var GL_STREAM_DRAW;
  var GL_STATIC_DRAW;
  var GL_DYNAMIC_DRAW;
  var GL_BUFFER_SIZE;
  var GL_BUFFER_USAGE;
  var GL_CURRENT_VERTEX_ATTRIB;
  var GL_FRONT;
  var GL_BACK;
  var GL_FRONT_AND_BACK;
  var GL_TEXTURE_2D;
  var GL_CULL_FACE;
  var GL_BLEND;
  var GL_DITHER;
  var GL_STENCIL_TEST;
  var GL_DEPTH_TEST;
  var GL_SCISSOR_TEST;
  var GL_POLYGON_OFFSET_FILL;
  var GL_SAMPLE_ALPHA_TO_COVERAGE;
  var GL_SAMPLE_COVERAGE;
  var GL_NO_ERROR;
  var GL_INVALID_ENUM;
  var GL_INVALID_VALUE;
  var GL_INVALID_OPERATION;
  var GL_OUT_OF_MEMORY;
  var GL_CW;
  var GL_CCW;
  var GL_LINE_WIDTH;
  var GL_ALIASED_POINT_SIZE_RANGE;
  var GL_ALIASED_LINE_WIDTH_RANGE;
  var GL_CULL_FACE_MODE;
  var GL_FRONT_FACE;
  var GL_DEPTH_RANGE;
  var GL_DEPTH_WRITEMASK;
  var GL_DEPTH_CLEAR_VALUE;
  var GL_DEPTH_FUNC;
  var GL_STENCIL_CLEAR_VALUE;
  var GL_STENCIL_FUNC;
  var GL_STENCIL_FAIL;
  var GL_STENCIL_PASS_DEPTH_FAIL;
  var GL_STENCIL_PASS_DEPTH_PASS;
  var GL_STENCIL_REF;
  var GL_STENCIL_VALUE_MASK;
  var GL_STENCIL_WRITEMASK;
  var GL_STENCIL_BACK_FUNC;
  var GL_STENCIL_BACK_FAIL;
  var GL_STENCIL_BACK_PASS_DEPTH_FAIL;
  var GL_STENCIL_BACK_PASS_DEPTH_PASS;
  var GL_STENCIL_BACK_REF;
  var GL_STENCIL_BACK_VALUE_MASK;
  var GL_STENCIL_BACK_WRITEMASK;
  var GL_VIEWPORT;
  var GL_SCISSOR_BOX;
  var GL_COLOR_CLEAR_VALUE;
  var GL_COLOR_WRITEMASK;
  var GL_UNPACK_ALIGNMENT;
  var GL_PACK_ALIGNMENT;
  var GL_MAX_TEXTURE_SIZE;
  var GL_MAX_VIEWPORT_DIMS;
  var GL_SUBPIXEL_BITS;
  var GL_RED_BITS;
  var GL_GREEN_BITS;
  var GL_BLUE_BITS;
  var GL_ALPHA_BITS;
  var GL_DEPTH_BITS;
  var GL_STENCIL_BITS;
  var GL_POLYGON_OFFSET_UNITS;
  var GL_POLYGON_OFFSET_FACTOR;
  var GL_TEXTURE_BINDING_2D;
  var GL_SAMPLE_BUFFERS;
  var GL_SAMPLES;
  var GL_SAMPLE_COVERAGE_VALUE;
  var GL_SAMPLE_COVERAGE_INVERT;
  var GL_NUM_COMPRESSED_TEXTURE_FORMATS;
  var GL_COMPRESSED_TEXTURE_FORMATS;
  var GL_DONT_CARE;
  var GL_FASTEST;
  var GL_NICEST;
  var GL_GENERATE_MIPMAP_HINT;
  var GL_BYTE;
  var GL_UNSIGNED_BYTE;
  var GL_SHORT;
  var GL_UNSIGNED_SHORT;
  var GL_INT;
  var GL_UNSIGNED_INT;
  var GL_FLOAT;
  var GL_FIXED;
  var GL_DEPTH_COMPONENT;
  var GL_ALPHA;
  var GL_RGB;
  var GL_RGBA;
  var GL_LUMINANCE;
  var GL_LUMINANCE_ALPHA;
  var GL_UNSIGNED_SHORT_4_4_4_4;
  var GL_UNSIGNED_SHORT_5_5_5_1;
  var GL_UNSIGNED_SHORT_5_6_5;
  var GL_FRAGMENT_SHADER;
  var GL_VERTEX_SHADER;
  var GL_MAX_VERTEX_ATTRIBS;
  var GL_MAX_VERTEX_UNIFORM_VECTORS;
  var GL_MAX_VARYING_VECTORS;
  var GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS;
  var GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS;
  var GL_MAX_TEXTURE_IMAGE_UNITS;
  var GL_MAX_FRAGMENT_UNIFORM_VECTORS;
  var GL_SHADER_TYPE;
  var GL_DELETE_STATUS;
  var GL_LINK_STATUS;
  var GL_VALIDATE_STATUS;
  var GL_ATTACHED_SHADERS;
  var GL_ACTIVE_UNIFORMS;
  var GL_ACTIVE_UNIFORM_MAX_LENGTH;
  var GL_ACTIVE_ATTRIBUTES;
  var GL_ACTIVE_ATTRIBUTE_MAX_LENGTH;
  var GL_SHADING_LANGUAGE_VERSION;
  var GL_CURRENT_PROGRAM;
  var GL_NEVER;
  var GL_LESS;
  var GL_EQUAL;
  var GL_LEQUAL;
  var GL_GREATER;
  var GL_NOTEQUAL;
  var GL_GEQUAL;
  var GL_ALWAYS;
  var GL_KEEP;
  var GL_REPLACE;
  var GL_INCR;
  var GL_DECR;
  var GL_INVERT;
  var GL_INCR_WRAP;
  var GL_DECR_WRAP;
  var GL_VENDOR;
  var GL_RENDERER;
  var GL_VERSION;
  var GL_EXTENSIONS;
  var GL_NEAREST;
  var GL_LINEAR;
  var GL_NEAREST_MIPMAP_NEAREST;
  var GL_LINEAR_MIPMAP_NEAREST;
  var GL_NEAREST_MIPMAP_LINEAR;
  var GL_LINEAR_MIPMAP_LINEAR;
  var GL_TEXTURE_MAG_FILTER;
  var GL_TEXTURE_MIN_FILTER;
  var GL_TEXTURE_WRAP_S;
  var GL_TEXTURE_WRAP_T;
  var GL_TEXTURE;
  var GL_TEXTURE_CUBE_MAP;
  var GL_TEXTURE_BINDING_CUBE_MAP;
  var GL_TEXTURE_CUBE_MAP_POSITIVE_X;
  var GL_TEXTURE_CUBE_MAP_NEGATIVE_X;
  var GL_TEXTURE_CUBE_MAP_POSITIVE_Y;
  var GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;
  var GL_TEXTURE_CUBE_MAP_POSITIVE_Z;
  var GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;
  var GL_MAX_CUBE_MAP_TEXTURE_SIZE;
  var GL_TEXTURE0;
  var GL_TEXTURE1;
  var GL_TEXTURE2;
  var GL_TEXTURE3;
  var GL_TEXTURE4;
  var GL_TEXTURE5;
  var GL_TEXTURE6;
  var GL_TEXTURE7;
  var GL_TEXTURE8;
  var GL_TEXTURE9;
  var GL_TEXTURE10;
  var GL_TEXTURE11;
  var GL_TEXTURE12;
  var GL_TEXTURE13;
  var GL_TEXTURE14;
  var GL_TEXTURE15;
  var GL_TEXTURE16;
  var GL_TEXTURE17;
  var GL_TEXTURE18;
  var GL_TEXTURE19;
  var GL_TEXTURE20;
  var GL_TEXTURE21;
  var GL_TEXTURE22;
  var GL_TEXTURE23;
  var GL_TEXTURE24;
  var GL_TEXTURE25;
  var GL_TEXTURE26;
  var GL_TEXTURE27;
  var GL_TEXTURE28;
  var GL_TEXTURE29;
  var GL_TEXTURE30;
  var GL_TEXTURE31;
  var GL_REPEAT;
  var GL_CLAMP_TO_EDGE;
  var GL_MIRRORED_REPEAT;
  var GL_FLOAT_VEC2;
  var GL_FLOAT_VEC3;
  var GL_FLOAT_VEC4;
  var GL_INT_VEC2;
  var GL_INT_VEC3;
  var GL_INT_VEC4;
  var GL_BOOL;
  var GL_BOOL_VEC2;
  var GL_BOOL_VEC3;
  var GL_BOOL_VEC4;
  var GL_FLOAT_MAT2;
  var GL_FLOAT_MAT3;
  var GL_FLOAT_MAT4;
  var GL_SAMPLER_2D;
  var GL_SAMPLER_CUBE;
  var GL_VERTEX_ATTRIB_ARRAY_ENABLED;
  var GL_VERTEX_ATTRIB_ARRAY_SIZE;
  var GL_VERTEX_ATTRIB_ARRAY_STRIDE;
  var GL_VERTEX_ATTRIB_ARRAY_TYPE;
  var GL_VERTEX_ATTRIB_ARRAY_NORMALIZED;
  var GL_VERTEX_ATTRIB_ARRAY_POINTER;
  var GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
  var GL_IMPLEMENTATION_COLOR_READ_TYPE;
  var GL_IMPLEMENTATION_COLOR_READ_FORMAT;
  var GL_COMPILE_STATUS;
  var GL_INFO_LOG_LENGTH;
  var GL_SHADER_SOURCE_LENGTH;
  var GL_SHADER_COMPILER;
  var GL_SHADER_BINARY_FORMATS;
  var GL_NUM_SHADER_BINARY_FORMATS;
  var GL_LOW_FLOAT;
  var GL_MEDIUM_FLOAT;
  var GL_HIGH_FLOAT;
  var GL_LOW_INT;
  var GL_MEDIUM_INT;
  var GL_HIGH_INT;
  var GL_FRAMEBUFFER;
  var GL_RENDERBUFFER;
  var GL_RGBA4;
  var GL_RGB5_A1;
  var GL_RGB565;
  var GL_DEPTH_COMPONENT16;
  function Kgl() {
  }
  Kgl.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Kgl',
    interfaces: []
  };
  function Buffer(buffer) {
    this.buffer = buffer;
    this.pos = 0;
  }
  Buffer.prototype.put_mx4ult$ = function (f) {
    this.buffer[this.pos / Float32Array.BYTES_PER_ELEMENT | 0] = f;
    this.pos = this.pos + Float32Array.BYTES_PER_ELEMENT | 0;
  };
  Buffer.prototype.put_q3cr5i$ = function (floatArray) {
    this.put_9752rg$(floatArray, -1);
  };
  Buffer.prototype.put_9752rg$ = function (floatArray, length) {
    var l = length === -1 ? floatArray.length : length;
    var buffer = this.buffer;
    var floatArray_0 = floatArray;
    buffer.set(floatArray_0.subarray(0, l), this.pos);
    this.pos = this.pos + Kotlin.imul(Float32Array.BYTES_PER_ELEMENT, l) | 0;
  };
  Buffer.prototype.position_za3lpa$ = function (pos) {
    this.pos = pos;
  };
  Buffer.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Buffer',
    interfaces: []
  };
  function allocate(sizeInBytes) {
    return new Buffer(new Float32Array(sizeInBytes / Float32Array.BYTES_PER_ELEMENT | 0));
  }
  function TextureResource(image) {
    this.image = image;
  }
  TextureResource.prototype.disposeInner = function () {
  };
  TextureResource.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'TextureResource',
    interfaces: []
  };
  function dispose($receiver) {
    $receiver.disposeInner();
  }
  var package$com = _.com || (_.com = {});
  var package$danielgergely = package$com.danielgergely || (package$com.danielgergely = {});
  var package$kgl = package$danielgergely.kgl || (package$danielgergely.kgl = {});
  Object.defineProperty(package$kgl, 'GL_ACTIVE_TEXTURE', {
    get: function () {
      return GL_ACTIVE_TEXTURE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_BUFFER_BIT', {
    get: function () {
      return GL_DEPTH_BUFFER_BIT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BUFFER_BIT', {
    get: function () {
      return GL_STENCIL_BUFFER_BIT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_COLOR_BUFFER_BIT', {
    get: function () {
      return GL_COLOR_BUFFER_BIT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FALSE', {
    get: function () {
      return GL_FALSE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TRUE', {
    get: function () {
      return GL_TRUE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_POINTS', {
    get: function () {
      return GL_POINTS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINES', {
    get: function () {
      return GL_LINES;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINE_LOOP', {
    get: function () {
      return GL_LINE_LOOP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINE_STRIP', {
    get: function () {
      return GL_LINE_STRIP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TRIANGLES', {
    get: function () {
      return GL_TRIANGLES;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TRIANGLE_STRIP', {
    get: function () {
      return GL_TRIANGLE_STRIP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TRIANGLE_FAN', {
    get: function () {
      return GL_TRIANGLE_FAN;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ZERO', {
    get: function () {
      return GL_ZERO;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ONE', {
    get: function () {
      return GL_ONE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SRC_COLOR', {
    get: function () {
      return GL_SRC_COLOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ONE_MINUS_SRC_COLOR', {
    get: function () {
      return GL_ONE_MINUS_SRC_COLOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SRC_ALPHA', {
    get: function () {
      return GL_SRC_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ONE_MINUS_SRC_ALPHA', {
    get: function () {
      return GL_ONE_MINUS_SRC_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DST_ALPHA', {
    get: function () {
      return GL_DST_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ONE_MINUS_DST_ALPHA', {
    get: function () {
      return GL_ONE_MINUS_DST_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DST_COLOR', {
    get: function () {
      return GL_DST_COLOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ONE_MINUS_DST_COLOR', {
    get: function () {
      return GL_ONE_MINUS_DST_COLOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SRC_ALPHA_SATURATE', {
    get: function () {
      return GL_SRC_ALPHA_SATURATE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FUNC_ADD', {
    get: function () {
      return GL_FUNC_ADD;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_EQUATION', {
    get: function () {
      return GL_BLEND_EQUATION;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_EQUATION_RGB', {
    get: function () {
      return GL_BLEND_EQUATION_RGB;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_EQUATION_ALPHA', {
    get: function () {
      return GL_BLEND_EQUATION_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FUNC_SUBTRACT', {
    get: function () {
      return GL_FUNC_SUBTRACT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FUNC_REVERSE_SUBTRACT', {
    get: function () {
      return GL_FUNC_REVERSE_SUBTRACT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_DST_RGB', {
    get: function () {
      return GL_BLEND_DST_RGB;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_SRC_RGB', {
    get: function () {
      return GL_BLEND_SRC_RGB;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_DST_ALPHA', {
    get: function () {
      return GL_BLEND_DST_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_SRC_ALPHA', {
    get: function () {
      return GL_BLEND_SRC_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CONSTANT_COLOR', {
    get: function () {
      return GL_CONSTANT_COLOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ONE_MINUS_CONSTANT_COLOR', {
    get: function () {
      return GL_ONE_MINUS_CONSTANT_COLOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CONSTANT_ALPHA', {
    get: function () {
      return GL_CONSTANT_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ONE_MINUS_CONSTANT_ALPHA', {
    get: function () {
      return GL_ONE_MINUS_CONSTANT_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND_COLOR', {
    get: function () {
      return GL_BLEND_COLOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ARRAY_BUFFER', {
    get: function () {
      return GL_ARRAY_BUFFER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ELEMENT_ARRAY_BUFFER', {
    get: function () {
      return GL_ELEMENT_ARRAY_BUFFER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ARRAY_BUFFER_BINDING', {
    get: function () {
      return GL_ARRAY_BUFFER_BINDING;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ELEMENT_ARRAY_BUFFER_BINDING', {
    get: function () {
      return GL_ELEMENT_ARRAY_BUFFER_BINDING;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STREAM_DRAW', {
    get: function () {
      return GL_STREAM_DRAW;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STATIC_DRAW', {
    get: function () {
      return GL_STATIC_DRAW;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DYNAMIC_DRAW', {
    get: function () {
      return GL_DYNAMIC_DRAW;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BUFFER_SIZE', {
    get: function () {
      return GL_BUFFER_SIZE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BUFFER_USAGE', {
    get: function () {
      return GL_BUFFER_USAGE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CURRENT_VERTEX_ATTRIB', {
    get: function () {
      return GL_CURRENT_VERTEX_ATTRIB;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FRONT', {
    get: function () {
      return GL_FRONT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BACK', {
    get: function () {
      return GL_BACK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FRONT_AND_BACK', {
    get: function () {
      return GL_FRONT_AND_BACK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_2D', {
    get: function () {
      return GL_TEXTURE_2D;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CULL_FACE', {
    get: function () {
      return GL_CULL_FACE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLEND', {
    get: function () {
      return GL_BLEND;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DITHER', {
    get: function () {
      return GL_DITHER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_TEST', {
    get: function () {
      return GL_STENCIL_TEST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_TEST', {
    get: function () {
      return GL_DEPTH_TEST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SCISSOR_TEST', {
    get: function () {
      return GL_SCISSOR_TEST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_POLYGON_OFFSET_FILL', {
    get: function () {
      return GL_POLYGON_OFFSET_FILL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLE_ALPHA_TO_COVERAGE', {
    get: function () {
      return GL_SAMPLE_ALPHA_TO_COVERAGE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLE_COVERAGE', {
    get: function () {
      return GL_SAMPLE_COVERAGE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NO_ERROR', {
    get: function () {
      return GL_NO_ERROR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INVALID_ENUM', {
    get: function () {
      return GL_INVALID_ENUM;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INVALID_VALUE', {
    get: function () {
      return GL_INVALID_VALUE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INVALID_OPERATION', {
    get: function () {
      return GL_INVALID_OPERATION;
    }
  });
  Object.defineProperty(package$kgl, 'GL_OUT_OF_MEMORY', {
    get: function () {
      return GL_OUT_OF_MEMORY;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CW', {
    get: function () {
      return GL_CW;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CCW', {
    get: function () {
      return GL_CCW;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINE_WIDTH', {
    get: function () {
      return GL_LINE_WIDTH;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ALIASED_POINT_SIZE_RANGE', {
    get: function () {
      return GL_ALIASED_POINT_SIZE_RANGE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ALIASED_LINE_WIDTH_RANGE', {
    get: function () {
      return GL_ALIASED_LINE_WIDTH_RANGE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CULL_FACE_MODE', {
    get: function () {
      return GL_CULL_FACE_MODE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FRONT_FACE', {
    get: function () {
      return GL_FRONT_FACE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_RANGE', {
    get: function () {
      return GL_DEPTH_RANGE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_WRITEMASK', {
    get: function () {
      return GL_DEPTH_WRITEMASK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_CLEAR_VALUE', {
    get: function () {
      return GL_DEPTH_CLEAR_VALUE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_FUNC', {
    get: function () {
      return GL_DEPTH_FUNC;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_CLEAR_VALUE', {
    get: function () {
      return GL_STENCIL_CLEAR_VALUE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_FUNC', {
    get: function () {
      return GL_STENCIL_FUNC;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_FAIL', {
    get: function () {
      return GL_STENCIL_FAIL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_PASS_DEPTH_FAIL', {
    get: function () {
      return GL_STENCIL_PASS_DEPTH_FAIL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_PASS_DEPTH_PASS', {
    get: function () {
      return GL_STENCIL_PASS_DEPTH_PASS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_REF', {
    get: function () {
      return GL_STENCIL_REF;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_VALUE_MASK', {
    get: function () {
      return GL_STENCIL_VALUE_MASK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_WRITEMASK', {
    get: function () {
      return GL_STENCIL_WRITEMASK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BACK_FUNC', {
    get: function () {
      return GL_STENCIL_BACK_FUNC;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BACK_FAIL', {
    get: function () {
      return GL_STENCIL_BACK_FAIL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BACK_PASS_DEPTH_FAIL', {
    get: function () {
      return GL_STENCIL_BACK_PASS_DEPTH_FAIL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BACK_PASS_DEPTH_PASS', {
    get: function () {
      return GL_STENCIL_BACK_PASS_DEPTH_PASS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BACK_REF', {
    get: function () {
      return GL_STENCIL_BACK_REF;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BACK_VALUE_MASK', {
    get: function () {
      return GL_STENCIL_BACK_VALUE_MASK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BACK_WRITEMASK', {
    get: function () {
      return GL_STENCIL_BACK_WRITEMASK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VIEWPORT', {
    get: function () {
      return GL_VIEWPORT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SCISSOR_BOX', {
    get: function () {
      return GL_SCISSOR_BOX;
    }
  });
  Object.defineProperty(package$kgl, 'GL_COLOR_CLEAR_VALUE', {
    get: function () {
      return GL_COLOR_CLEAR_VALUE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_COLOR_WRITEMASK', {
    get: function () {
      return GL_COLOR_WRITEMASK;
    }
  });
  Object.defineProperty(package$kgl, 'GL_UNPACK_ALIGNMENT', {
    get: function () {
      return GL_UNPACK_ALIGNMENT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_PACK_ALIGNMENT', {
    get: function () {
      return GL_PACK_ALIGNMENT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_TEXTURE_SIZE', {
    get: function () {
      return GL_MAX_TEXTURE_SIZE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_VIEWPORT_DIMS', {
    get: function () {
      return GL_MAX_VIEWPORT_DIMS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SUBPIXEL_BITS', {
    get: function () {
      return GL_SUBPIXEL_BITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RED_BITS', {
    get: function () {
      return GL_RED_BITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_GREEN_BITS', {
    get: function () {
      return GL_GREEN_BITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BLUE_BITS', {
    get: function () {
      return GL_BLUE_BITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ALPHA_BITS', {
    get: function () {
      return GL_ALPHA_BITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_BITS', {
    get: function () {
      return GL_DEPTH_BITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_STENCIL_BITS', {
    get: function () {
      return GL_STENCIL_BITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_POLYGON_OFFSET_UNITS', {
    get: function () {
      return GL_POLYGON_OFFSET_UNITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_POLYGON_OFFSET_FACTOR', {
    get: function () {
      return GL_POLYGON_OFFSET_FACTOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_BINDING_2D', {
    get: function () {
      return GL_TEXTURE_BINDING_2D;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLE_BUFFERS', {
    get: function () {
      return GL_SAMPLE_BUFFERS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLES', {
    get: function () {
      return GL_SAMPLES;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLE_COVERAGE_VALUE', {
    get: function () {
      return GL_SAMPLE_COVERAGE_VALUE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLE_COVERAGE_INVERT', {
    get: function () {
      return GL_SAMPLE_COVERAGE_INVERT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NUM_COMPRESSED_TEXTURE_FORMATS', {
    get: function () {
      return GL_NUM_COMPRESSED_TEXTURE_FORMATS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_COMPRESSED_TEXTURE_FORMATS', {
    get: function () {
      return GL_COMPRESSED_TEXTURE_FORMATS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DONT_CARE', {
    get: function () {
      return GL_DONT_CARE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FASTEST', {
    get: function () {
      return GL_FASTEST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NICEST', {
    get: function () {
      return GL_NICEST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_GENERATE_MIPMAP_HINT', {
    get: function () {
      return GL_GENERATE_MIPMAP_HINT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BYTE', {
    get: function () {
      return GL_BYTE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_UNSIGNED_BYTE', {
    get: function () {
      return GL_UNSIGNED_BYTE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SHORT', {
    get: function () {
      return GL_SHORT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_UNSIGNED_SHORT', {
    get: function () {
      return GL_UNSIGNED_SHORT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INT', {
    get: function () {
      return GL_INT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_UNSIGNED_INT', {
    get: function () {
      return GL_UNSIGNED_INT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FLOAT', {
    get: function () {
      return GL_FLOAT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FIXED', {
    get: function () {
      return GL_FIXED;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_COMPONENT', {
    get: function () {
      return GL_DEPTH_COMPONENT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ALPHA', {
    get: function () {
      return GL_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RGB', {
    get: function () {
      return GL_RGB;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RGBA', {
    get: function () {
      return GL_RGBA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LUMINANCE', {
    get: function () {
      return GL_LUMINANCE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LUMINANCE_ALPHA', {
    get: function () {
      return GL_LUMINANCE_ALPHA;
    }
  });
  Object.defineProperty(package$kgl, 'GL_UNSIGNED_SHORT_4_4_4_4', {
    get: function () {
      return GL_UNSIGNED_SHORT_4_4_4_4;
    }
  });
  Object.defineProperty(package$kgl, 'GL_UNSIGNED_SHORT_5_5_5_1', {
    get: function () {
      return GL_UNSIGNED_SHORT_5_5_5_1;
    }
  });
  Object.defineProperty(package$kgl, 'GL_UNSIGNED_SHORT_5_6_5', {
    get: function () {
      return GL_UNSIGNED_SHORT_5_6_5;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FRAGMENT_SHADER', {
    get: function () {
      return GL_FRAGMENT_SHADER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_SHADER', {
    get: function () {
      return GL_VERTEX_SHADER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_VERTEX_ATTRIBS', {
    get: function () {
      return GL_MAX_VERTEX_ATTRIBS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_VERTEX_UNIFORM_VECTORS', {
    get: function () {
      return GL_MAX_VERTEX_UNIFORM_VECTORS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_VARYING_VECTORS', {
    get: function () {
      return GL_MAX_VARYING_VECTORS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS', {
    get: function () {
      return GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS', {
    get: function () {
      return GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_TEXTURE_IMAGE_UNITS', {
    get: function () {
      return GL_MAX_TEXTURE_IMAGE_UNITS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_FRAGMENT_UNIFORM_VECTORS', {
    get: function () {
      return GL_MAX_FRAGMENT_UNIFORM_VECTORS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SHADER_TYPE', {
    get: function () {
      return GL_SHADER_TYPE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DELETE_STATUS', {
    get: function () {
      return GL_DELETE_STATUS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINK_STATUS', {
    get: function () {
      return GL_LINK_STATUS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VALIDATE_STATUS', {
    get: function () {
      return GL_VALIDATE_STATUS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ATTACHED_SHADERS', {
    get: function () {
      return GL_ATTACHED_SHADERS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ACTIVE_UNIFORMS', {
    get: function () {
      return GL_ACTIVE_UNIFORMS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ACTIVE_UNIFORM_MAX_LENGTH', {
    get: function () {
      return GL_ACTIVE_UNIFORM_MAX_LENGTH;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ACTIVE_ATTRIBUTES', {
    get: function () {
      return GL_ACTIVE_ATTRIBUTES;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ACTIVE_ATTRIBUTE_MAX_LENGTH', {
    get: function () {
      return GL_ACTIVE_ATTRIBUTE_MAX_LENGTH;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SHADING_LANGUAGE_VERSION', {
    get: function () {
      return GL_SHADING_LANGUAGE_VERSION;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CURRENT_PROGRAM', {
    get: function () {
      return GL_CURRENT_PROGRAM;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NEVER', {
    get: function () {
      return GL_NEVER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LESS', {
    get: function () {
      return GL_LESS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_EQUAL', {
    get: function () {
      return GL_EQUAL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LEQUAL', {
    get: function () {
      return GL_LEQUAL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_GREATER', {
    get: function () {
      return GL_GREATER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NOTEQUAL', {
    get: function () {
      return GL_NOTEQUAL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_GEQUAL', {
    get: function () {
      return GL_GEQUAL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_ALWAYS', {
    get: function () {
      return GL_ALWAYS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_KEEP', {
    get: function () {
      return GL_KEEP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_REPLACE', {
    get: function () {
      return GL_REPLACE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INCR', {
    get: function () {
      return GL_INCR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DECR', {
    get: function () {
      return GL_DECR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INVERT', {
    get: function () {
      return GL_INVERT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INCR_WRAP', {
    get: function () {
      return GL_INCR_WRAP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DECR_WRAP', {
    get: function () {
      return GL_DECR_WRAP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VENDOR', {
    get: function () {
      return GL_VENDOR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RENDERER', {
    get: function () {
      return GL_RENDERER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERSION', {
    get: function () {
      return GL_VERSION;
    }
  });
  Object.defineProperty(package$kgl, 'GL_EXTENSIONS', {
    get: function () {
      return GL_EXTENSIONS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NEAREST', {
    get: function () {
      return GL_NEAREST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINEAR', {
    get: function () {
      return GL_LINEAR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NEAREST_MIPMAP_NEAREST', {
    get: function () {
      return GL_NEAREST_MIPMAP_NEAREST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINEAR_MIPMAP_NEAREST', {
    get: function () {
      return GL_LINEAR_MIPMAP_NEAREST;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NEAREST_MIPMAP_LINEAR', {
    get: function () {
      return GL_NEAREST_MIPMAP_LINEAR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LINEAR_MIPMAP_LINEAR', {
    get: function () {
      return GL_LINEAR_MIPMAP_LINEAR;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_MAG_FILTER', {
    get: function () {
      return GL_TEXTURE_MAG_FILTER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_MIN_FILTER', {
    get: function () {
      return GL_TEXTURE_MIN_FILTER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_WRAP_S', {
    get: function () {
      return GL_TEXTURE_WRAP_S;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_WRAP_T', {
    get: function () {
      return GL_TEXTURE_WRAP_T;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE', {
    get: function () {
      return GL_TEXTURE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_CUBE_MAP', {
    get: function () {
      return GL_TEXTURE_CUBE_MAP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_BINDING_CUBE_MAP', {
    get: function () {
      return GL_TEXTURE_BINDING_CUBE_MAP;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_CUBE_MAP_POSITIVE_X', {
    get: function () {
      return GL_TEXTURE_CUBE_MAP_POSITIVE_X;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_CUBE_MAP_NEGATIVE_X', {
    get: function () {
      return GL_TEXTURE_CUBE_MAP_NEGATIVE_X;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_CUBE_MAP_POSITIVE_Y', {
    get: function () {
      return GL_TEXTURE_CUBE_MAP_POSITIVE_Y;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_CUBE_MAP_NEGATIVE_Y', {
    get: function () {
      return GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_CUBE_MAP_POSITIVE_Z', {
    get: function () {
      return GL_TEXTURE_CUBE_MAP_POSITIVE_Z;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE_CUBE_MAP_NEGATIVE_Z', {
    get: function () {
      return GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MAX_CUBE_MAP_TEXTURE_SIZE', {
    get: function () {
      return GL_MAX_CUBE_MAP_TEXTURE_SIZE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE0', {
    get: function () {
      return GL_TEXTURE0;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE1', {
    get: function () {
      return GL_TEXTURE1;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE2', {
    get: function () {
      return GL_TEXTURE2;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE3', {
    get: function () {
      return GL_TEXTURE3;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE4', {
    get: function () {
      return GL_TEXTURE4;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE5', {
    get: function () {
      return GL_TEXTURE5;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE6', {
    get: function () {
      return GL_TEXTURE6;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE7', {
    get: function () {
      return GL_TEXTURE7;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE8', {
    get: function () {
      return GL_TEXTURE8;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE9', {
    get: function () {
      return GL_TEXTURE9;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE10', {
    get: function () {
      return GL_TEXTURE10;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE11', {
    get: function () {
      return GL_TEXTURE11;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE12', {
    get: function () {
      return GL_TEXTURE12;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE13', {
    get: function () {
      return GL_TEXTURE13;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE14', {
    get: function () {
      return GL_TEXTURE14;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE15', {
    get: function () {
      return GL_TEXTURE15;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE16', {
    get: function () {
      return GL_TEXTURE16;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE17', {
    get: function () {
      return GL_TEXTURE17;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE18', {
    get: function () {
      return GL_TEXTURE18;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE19', {
    get: function () {
      return GL_TEXTURE19;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE20', {
    get: function () {
      return GL_TEXTURE20;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE21', {
    get: function () {
      return GL_TEXTURE21;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE22', {
    get: function () {
      return GL_TEXTURE22;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE23', {
    get: function () {
      return GL_TEXTURE23;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE24', {
    get: function () {
      return GL_TEXTURE24;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE25', {
    get: function () {
      return GL_TEXTURE25;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE26', {
    get: function () {
      return GL_TEXTURE26;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE27', {
    get: function () {
      return GL_TEXTURE27;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE28', {
    get: function () {
      return GL_TEXTURE28;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE29', {
    get: function () {
      return GL_TEXTURE29;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE30', {
    get: function () {
      return GL_TEXTURE30;
    }
  });
  Object.defineProperty(package$kgl, 'GL_TEXTURE31', {
    get: function () {
      return GL_TEXTURE31;
    }
  });
  Object.defineProperty(package$kgl, 'GL_REPEAT', {
    get: function () {
      return GL_REPEAT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_CLAMP_TO_EDGE', {
    get: function () {
      return GL_CLAMP_TO_EDGE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MIRRORED_REPEAT', {
    get: function () {
      return GL_MIRRORED_REPEAT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FLOAT_VEC2', {
    get: function () {
      return GL_FLOAT_VEC2;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FLOAT_VEC3', {
    get: function () {
      return GL_FLOAT_VEC3;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FLOAT_VEC4', {
    get: function () {
      return GL_FLOAT_VEC4;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INT_VEC2', {
    get: function () {
      return GL_INT_VEC2;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INT_VEC3', {
    get: function () {
      return GL_INT_VEC3;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INT_VEC4', {
    get: function () {
      return GL_INT_VEC4;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BOOL', {
    get: function () {
      return GL_BOOL;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BOOL_VEC2', {
    get: function () {
      return GL_BOOL_VEC2;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BOOL_VEC3', {
    get: function () {
      return GL_BOOL_VEC3;
    }
  });
  Object.defineProperty(package$kgl, 'GL_BOOL_VEC4', {
    get: function () {
      return GL_BOOL_VEC4;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FLOAT_MAT2', {
    get: function () {
      return GL_FLOAT_MAT2;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FLOAT_MAT3', {
    get: function () {
      return GL_FLOAT_MAT3;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FLOAT_MAT4', {
    get: function () {
      return GL_FLOAT_MAT4;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLER_2D', {
    get: function () {
      return GL_SAMPLER_2D;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SAMPLER_CUBE', {
    get: function () {
      return GL_SAMPLER_CUBE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_ATTRIB_ARRAY_ENABLED', {
    get: function () {
      return GL_VERTEX_ATTRIB_ARRAY_ENABLED;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_ATTRIB_ARRAY_SIZE', {
    get: function () {
      return GL_VERTEX_ATTRIB_ARRAY_SIZE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_ATTRIB_ARRAY_STRIDE', {
    get: function () {
      return GL_VERTEX_ATTRIB_ARRAY_STRIDE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_ATTRIB_ARRAY_TYPE', {
    get: function () {
      return GL_VERTEX_ATTRIB_ARRAY_TYPE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_ATTRIB_ARRAY_NORMALIZED', {
    get: function () {
      return GL_VERTEX_ATTRIB_ARRAY_NORMALIZED;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_ATTRIB_ARRAY_POINTER', {
    get: function () {
      return GL_VERTEX_ATTRIB_ARRAY_POINTER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING', {
    get: function () {
      return GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
    }
  });
  Object.defineProperty(package$kgl, 'GL_IMPLEMENTATION_COLOR_READ_TYPE', {
    get: function () {
      return GL_IMPLEMENTATION_COLOR_READ_TYPE;
    }
  });
  Object.defineProperty(package$kgl, 'GL_IMPLEMENTATION_COLOR_READ_FORMAT', {
    get: function () {
      return GL_IMPLEMENTATION_COLOR_READ_FORMAT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_COMPILE_STATUS', {
    get: function () {
      return GL_COMPILE_STATUS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_INFO_LOG_LENGTH', {
    get: function () {
      return GL_INFO_LOG_LENGTH;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SHADER_SOURCE_LENGTH', {
    get: function () {
      return GL_SHADER_SOURCE_LENGTH;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SHADER_COMPILER', {
    get: function () {
      return GL_SHADER_COMPILER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_SHADER_BINARY_FORMATS', {
    get: function () {
      return GL_SHADER_BINARY_FORMATS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_NUM_SHADER_BINARY_FORMATS', {
    get: function () {
      return GL_NUM_SHADER_BINARY_FORMATS;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LOW_FLOAT', {
    get: function () {
      return GL_LOW_FLOAT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MEDIUM_FLOAT', {
    get: function () {
      return GL_MEDIUM_FLOAT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_HIGH_FLOAT', {
    get: function () {
      return GL_HIGH_FLOAT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_LOW_INT', {
    get: function () {
      return GL_LOW_INT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_MEDIUM_INT', {
    get: function () {
      return GL_MEDIUM_INT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_HIGH_INT', {
    get: function () {
      return GL_HIGH_INT;
    }
  });
  Object.defineProperty(package$kgl, 'GL_FRAMEBUFFER', {
    get: function () {
      return GL_FRAMEBUFFER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RENDERBUFFER', {
    get: function () {
      return GL_RENDERBUFFER;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RGBA4', {
    get: function () {
      return GL_RGBA4;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RGB5_A1', {
    get: function () {
      return GL_RGB5_A1;
    }
  });
  Object.defineProperty(package$kgl, 'GL_RGB565', {
    get: function () {
      return GL_RGB565;
    }
  });
  Object.defineProperty(package$kgl, 'GL_DEPTH_COMPONENT16', {
    get: function () {
      return GL_DEPTH_COMPONENT16;
    }
  });
  package$kgl.Kgl = Kgl;
  package$kgl.Buffer = Buffer;
  package$kgl.allocate_za3lpa$ = allocate;
  package$kgl.TextureResource = TextureResource;
  package$kgl.dispose_cd8zb3$ = dispose;
  GL_ACTIVE_TEXTURE = 34016;
  GL_DEPTH_BUFFER_BIT = 256;
  GL_STENCIL_BUFFER_BIT = 1024;
  GL_COLOR_BUFFER_BIT = 16384;
  GL_FALSE = 0;
  GL_TRUE = 1;
  GL_POINTS = 0;
  GL_LINES = 1;
  GL_LINE_LOOP = 2;
  GL_LINE_STRIP = 3;
  GL_TRIANGLES = 4;
  GL_TRIANGLE_STRIP = 5;
  GL_TRIANGLE_FAN = 6;
  GL_ZERO = 0;
  GL_ONE = 1;
  GL_SRC_COLOR = 768;
  GL_ONE_MINUS_SRC_COLOR = 769;
  GL_SRC_ALPHA = 770;
  GL_ONE_MINUS_SRC_ALPHA = 771;
  GL_DST_ALPHA = 772;
  GL_ONE_MINUS_DST_ALPHA = 773;
  GL_DST_COLOR = 774;
  GL_ONE_MINUS_DST_COLOR = 775;
  GL_SRC_ALPHA_SATURATE = 776;
  GL_FUNC_ADD = 32774;
  GL_BLEND_EQUATION = 32777;
  GL_BLEND_EQUATION_RGB = 32777;
  GL_BLEND_EQUATION_ALPHA = 34877;
  GL_FUNC_SUBTRACT = 32778;
  GL_FUNC_REVERSE_SUBTRACT = 32779;
  GL_BLEND_DST_RGB = 32968;
  GL_BLEND_SRC_RGB = 32969;
  GL_BLEND_DST_ALPHA = 32970;
  GL_BLEND_SRC_ALPHA = 32971;
  GL_CONSTANT_COLOR = 32769;
  GL_ONE_MINUS_CONSTANT_COLOR = 32770;
  GL_CONSTANT_ALPHA = 32771;
  GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
  GL_BLEND_COLOR = 32773;
  GL_ARRAY_BUFFER = 34962;
  GL_ELEMENT_ARRAY_BUFFER = 34963;
  GL_ARRAY_BUFFER_BINDING = 34964;
  GL_ELEMENT_ARRAY_BUFFER_BINDING = 34965;
  GL_STREAM_DRAW = 35040;
  GL_STATIC_DRAW = 35044;
  GL_DYNAMIC_DRAW = 35048;
  GL_BUFFER_SIZE = 34660;
  GL_BUFFER_USAGE = 34661;
  GL_CURRENT_VERTEX_ATTRIB = 34342;
  GL_FRONT = 1028;
  GL_BACK = 1029;
  GL_FRONT_AND_BACK = 1032;
  GL_TEXTURE_2D = 3553;
  GL_CULL_FACE = 2884;
  GL_BLEND = 3042;
  GL_DITHER = 3024;
  GL_STENCIL_TEST = 2960;
  GL_DEPTH_TEST = 2929;
  GL_SCISSOR_TEST = 3089;
  GL_POLYGON_OFFSET_FILL = 32823;
  GL_SAMPLE_ALPHA_TO_COVERAGE = 32926;
  GL_SAMPLE_COVERAGE = 32928;
  GL_NO_ERROR = 0;
  GL_INVALID_ENUM = 1280;
  GL_INVALID_VALUE = 1281;
  GL_INVALID_OPERATION = 1282;
  GL_OUT_OF_MEMORY = 1285;
  GL_CW = 2304;
  GL_CCW = 2305;
  GL_LINE_WIDTH = 2849;
  GL_ALIASED_POINT_SIZE_RANGE = 33901;
  GL_ALIASED_LINE_WIDTH_RANGE = 33902;
  GL_CULL_FACE_MODE = 2885;
  GL_FRONT_FACE = 2886;
  GL_DEPTH_RANGE = 2928;
  GL_DEPTH_WRITEMASK = 2930;
  GL_DEPTH_CLEAR_VALUE = 2931;
  GL_DEPTH_FUNC = 2932;
  GL_STENCIL_CLEAR_VALUE = 2961;
  GL_STENCIL_FUNC = 2962;
  GL_STENCIL_FAIL = 2964;
  GL_STENCIL_PASS_DEPTH_FAIL = 2965;
  GL_STENCIL_PASS_DEPTH_PASS = 2966;
  GL_STENCIL_REF = 2967;
  GL_STENCIL_VALUE_MASK = 2963;
  GL_STENCIL_WRITEMASK = 2968;
  GL_STENCIL_BACK_FUNC = 34816;
  GL_STENCIL_BACK_FAIL = 34817;
  GL_STENCIL_BACK_PASS_DEPTH_FAIL = 34818;
  GL_STENCIL_BACK_PASS_DEPTH_PASS = 34819;
  GL_STENCIL_BACK_REF = 36003;
  GL_STENCIL_BACK_VALUE_MASK = 36004;
  GL_STENCIL_BACK_WRITEMASK = 36005;
  GL_VIEWPORT = 2978;
  GL_SCISSOR_BOX = 3088;
  GL_COLOR_CLEAR_VALUE = 3106;
  GL_COLOR_WRITEMASK = 3107;
  GL_UNPACK_ALIGNMENT = 3317;
  GL_PACK_ALIGNMENT = 3333;
  GL_MAX_TEXTURE_SIZE = 3379;
  GL_MAX_VIEWPORT_DIMS = 3386;
  GL_SUBPIXEL_BITS = 3408;
  GL_RED_BITS = 3410;
  GL_GREEN_BITS = 3411;
  GL_BLUE_BITS = 3412;
  GL_ALPHA_BITS = 3413;
  GL_DEPTH_BITS = 3414;
  GL_STENCIL_BITS = 3415;
  GL_POLYGON_OFFSET_UNITS = 10752;
  GL_POLYGON_OFFSET_FACTOR = 32824;
  GL_TEXTURE_BINDING_2D = 32873;
  GL_SAMPLE_BUFFERS = 32936;
  GL_SAMPLES = 32937;
  GL_SAMPLE_COVERAGE_VALUE = 32938;
  GL_SAMPLE_COVERAGE_INVERT = 32939;
  GL_NUM_COMPRESSED_TEXTURE_FORMATS = 34466;
  GL_COMPRESSED_TEXTURE_FORMATS = 34467;
  GL_DONT_CARE = 4352;
  GL_FASTEST = 4353;
  GL_NICEST = 4354;
  GL_GENERATE_MIPMAP_HINT = 33170;
  GL_BYTE = 5120;
  GL_UNSIGNED_BYTE = 5121;
  GL_SHORT = 5122;
  GL_UNSIGNED_SHORT = 5123;
  GL_INT = 5124;
  GL_UNSIGNED_INT = 5125;
  GL_FLOAT = 5126;
  GL_FIXED = 5132;
  GL_DEPTH_COMPONENT = 6402;
  GL_ALPHA = 6406;
  GL_RGB = 6407;
  GL_RGBA = 6408;
  GL_LUMINANCE = 6409;
  GL_LUMINANCE_ALPHA = 6410;
  GL_UNSIGNED_SHORT_4_4_4_4 = 32819;
  GL_UNSIGNED_SHORT_5_5_5_1 = 32820;
  GL_UNSIGNED_SHORT_5_6_5 = 33635;
  GL_FRAGMENT_SHADER = 35632;
  GL_VERTEX_SHADER = 35633;
  GL_MAX_VERTEX_ATTRIBS = 34921;
  GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;
  GL_MAX_VARYING_VECTORS = 36348;
  GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 35661;
  GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 35660;
  GL_MAX_TEXTURE_IMAGE_UNITS = 34930;
  GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;
  GL_SHADER_TYPE = 35663;
  GL_DELETE_STATUS = 35712;
  GL_LINK_STATUS = 35714;
  GL_VALIDATE_STATUS = 35715;
  GL_ATTACHED_SHADERS = 35717;
  GL_ACTIVE_UNIFORMS = 35718;
  GL_ACTIVE_UNIFORM_MAX_LENGTH = 35719;
  GL_ACTIVE_ATTRIBUTES = 35721;
  GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 35722;
  GL_SHADING_LANGUAGE_VERSION = 35724;
  GL_CURRENT_PROGRAM = 35725;
  GL_NEVER = 512;
  GL_LESS = 513;
  GL_EQUAL = 514;
  GL_LEQUAL = 515;
  GL_GREATER = 516;
  GL_NOTEQUAL = 517;
  GL_GEQUAL = 518;
  GL_ALWAYS = 519;
  GL_KEEP = 7680;
  GL_REPLACE = 7681;
  GL_INCR = 7682;
  GL_DECR = 7683;
  GL_INVERT = 5386;
  GL_INCR_WRAP = 34055;
  GL_DECR_WRAP = 34056;
  GL_VENDOR = 7936;
  GL_RENDERER = 7937;
  GL_VERSION = 7938;
  GL_EXTENSIONS = 7939;
  GL_NEAREST = 9728;
  GL_LINEAR = 9729;
  GL_NEAREST_MIPMAP_NEAREST = 9984;
  GL_LINEAR_MIPMAP_NEAREST = 9985;
  GL_NEAREST_MIPMAP_LINEAR = 9986;
  GL_LINEAR_MIPMAP_LINEAR = 9987;
  GL_TEXTURE_MAG_FILTER = 10240;
  GL_TEXTURE_MIN_FILTER = 10241;
  GL_TEXTURE_WRAP_S = 10242;
  GL_TEXTURE_WRAP_T = 10243;
  GL_TEXTURE = 5890;
  GL_TEXTURE_CUBE_MAP = 34067;
  GL_TEXTURE_BINDING_CUBE_MAP = 34068;
  GL_TEXTURE_CUBE_MAP_POSITIVE_X = 34069;
  GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 34070;
  GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 34071;
  GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 34072;
  GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 34073;
  GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 34074;
  GL_MAX_CUBE_MAP_TEXTURE_SIZE = 34076;
  GL_TEXTURE0 = 33984;
  GL_TEXTURE1 = 33985;
  GL_TEXTURE2 = 33986;
  GL_TEXTURE3 = 33987;
  GL_TEXTURE4 = 33988;
  GL_TEXTURE5 = 33989;
  GL_TEXTURE6 = 33990;
  GL_TEXTURE7 = 33991;
  GL_TEXTURE8 = 33992;
  GL_TEXTURE9 = 33993;
  GL_TEXTURE10 = 33994;
  GL_TEXTURE11 = 33995;
  GL_TEXTURE12 = 33996;
  GL_TEXTURE13 = 33997;
  GL_TEXTURE14 = 33998;
  GL_TEXTURE15 = 33999;
  GL_TEXTURE16 = 34000;
  GL_TEXTURE17 = 34001;
  GL_TEXTURE18 = 34002;
  GL_TEXTURE19 = 34003;
  GL_TEXTURE20 = 34004;
  GL_TEXTURE21 = 34005;
  GL_TEXTURE22 = 34006;
  GL_TEXTURE23 = 34007;
  GL_TEXTURE24 = 34008;
  GL_TEXTURE25 = 34009;
  GL_TEXTURE26 = 34010;
  GL_TEXTURE27 = 34011;
  GL_TEXTURE28 = 34012;
  GL_TEXTURE29 = 34013;
  GL_TEXTURE30 = 34014;
  GL_TEXTURE31 = 34015;
  GL_REPEAT = 10497;
  GL_CLAMP_TO_EDGE = 33071;
  GL_MIRRORED_REPEAT = 33648;
  GL_FLOAT_VEC2 = 35664;
  GL_FLOAT_VEC3 = 35665;
  GL_FLOAT_VEC4 = 35666;
  GL_INT_VEC2 = 35667;
  GL_INT_VEC3 = 35668;
  GL_INT_VEC4 = 35669;
  GL_BOOL = 35670;
  GL_BOOL_VEC2 = 35671;
  GL_BOOL_VEC3 = 35672;
  GL_BOOL_VEC4 = 35673;
  GL_FLOAT_MAT2 = 35674;
  GL_FLOAT_MAT3 = 35675;
  GL_FLOAT_MAT4 = 35676;
  GL_SAMPLER_2D = 35678;
  GL_SAMPLER_CUBE = 35680;
  GL_VERTEX_ATTRIB_ARRAY_ENABLED = 34338;
  GL_VERTEX_ATTRIB_ARRAY_SIZE = 34339;
  GL_VERTEX_ATTRIB_ARRAY_STRIDE = 34340;
  GL_VERTEX_ATTRIB_ARRAY_TYPE = 34341;
  GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 34922;
  GL_VERTEX_ATTRIB_ARRAY_POINTER = 34373;
  GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 34975;
  GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;
  GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;
  GL_COMPILE_STATUS = 35713;
  GL_INFO_LOG_LENGTH = 35716;
  GL_SHADER_SOURCE_LENGTH = 35720;
  GL_SHADER_COMPILER = 36346;
  GL_SHADER_BINARY_FORMATS = 36344;
  GL_NUM_SHADER_BINARY_FORMATS = 36345;
  GL_LOW_FLOAT = 36336;
  GL_MEDIUM_FLOAT = 36337;
  GL_HIGH_FLOAT = 36338;
  GL_LOW_INT = 36339;
  GL_MEDIUM_INT = 36340;
  GL_HIGH_INT = 36341;
  GL_FRAMEBUFFER = 36160;
  GL_RENDERBUFFER = 36161;
  GL_RGBA4 = 32854;
  GL_RGB5_A1 = 32855;
  GL_RGB565 = 36194;
  GL_DEPTH_COMPONENT16 = 33189;
  Kotlin.defineModule('kgl', _);
  return _;
}));

//# sourceMappingURL=kgl.js.map
