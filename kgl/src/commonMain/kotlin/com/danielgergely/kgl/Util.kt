package com.danielgergely.kgl

public fun FloatArray.vSize(vecSize: Int): Int {
    if (size % vecSize != 0)
        throw IllegalArgumentException("Array size must be a multiple of $vecSize.")
    return size / vecSize
}

public fun IntArray.vSize(vecSize: Int): Int {
    if (size % vecSize != 0)
        throw IllegalArgumentException("Array size must be a multiple of $vecSize.")
    return size / vecSize
}