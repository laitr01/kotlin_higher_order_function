/*
 * Copyright (c) 2019 Yahoo! JAPAN Corporation. All rights reserved.
 */

package com.example.ltrach.higherorderfunction.extensions

/**
 * separator: String = ", ", prefix: String = "",
 * postfix: String = ""
 * default parameters
 */
fun <T> Collection<T>.joinToString(
    separator: String = ", ", prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}