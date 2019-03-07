/*
 * Copyright (c) 2019 Yahoo! JAPAN Corporation. All rights reserved.
 */

package com.example.ltrach.higherorderfunction.extensions

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}