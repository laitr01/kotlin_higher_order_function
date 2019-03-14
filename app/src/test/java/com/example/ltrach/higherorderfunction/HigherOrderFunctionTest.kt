/*
 * Copyright (c) 2019 Yahoo! JAPAN Corporation. All rights reserved.
 */

package com.example.ltrach.higherorderfunction

import com.example.ltrach.higherorderfunction.chapter8higherorderfunction.*
import com.example.ltrach.higherorderfunction.extensions.filter
import com.example.ltrach.higherorderfunction.extensions.joinToString
import org.junit.Assert.assertEquals
import org.junit.Test


class HigherOrderFunctionTest {

    @Test
    fun filter_test(){
        assertEquals("aasasaxaxa".filter { it  in 'a'..'z' }, "aasasaxaxa")
        assertEquals("aasasax1xa".filter { it  in 'a'..'z' }, "aasasaxxa")
    }

    @Test
    fun joinToStringTest(){
        val strArrays = listOf("what", "the", "fuck", "?")
        assertEquals("what the fuck ?", strArrays.joinToString(" "))
    }

    @Test
    fun returnFunctionFromFunction() {
        val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
        assertEquals(calculator.invoke(Order(3)).toFloat(), 12.3f)
    }

    @Test
    fun findPeopleByAgeWithLambdaExpresionTest() {
        val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
        val inliningCollectionOperation = InliningCollectionOperation()

        assertEquals(inliningCollectionOperation.findPeopleByAgeWithLambdaExpresion(29, people), listOf(Person1("Alice", 29)))
        assertEquals(inliningCollectionOperation.findPeopleByAgeWithLambdaExpresion(30, people), listOf<Person1>())
    }

    @Test
    fun findPeopleByAgeWithoutLambdaExpresionTest() {
        val people = listOf(Person1("Alice", 29), Person1("Bob", 31))
        val inliningCollectionOperation = InliningCollectionOperation()

        assertEquals(inliningCollectionOperation.findPeopleByAgeWithoutLambdaExpresion(29, people), listOf(Person1("Alice", 29)))
        assertEquals(inliningCollectionOperation.findPeopleByAgeWithoutLambdaExpresion(30, people), listOf<Person1>())
    }

}