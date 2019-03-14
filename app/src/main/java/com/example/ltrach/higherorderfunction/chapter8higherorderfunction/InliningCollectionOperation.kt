/*
 * Copyright (c) 2019 Yahoo! JAPAN Corporation. All rights reserved.
 */

package com.example.ltrach.higherorderfunction.chapter8higherorderfunction

data class Person1 (val name: String, val age: Int)

class InliningCollectionOperation {
    //private val people = listOf(Person1("Alice", 29), Person1("Bob", 31))

    fun findPeopleByAgeWithLambdaExpresion(age: Int, people: List<Person1>): List<Person1> = people.filter { it.age == age }

    fun findPeopleByAgeWithoutLambdaExpresion(age: Int, people: List<Person1>): List<Person1> {
        val result = mutableListOf<Person1>()
        for (person in people){
          if(person.age ==  age){
              result.add(person)
          }
        }
        return result
    }
}