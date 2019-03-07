/*
 * Copyright (c) 2019 Yahoo! JAPAN Corporation. All rights reserved.
 */

package com.example.ltrach.higherorderfunction

import android.gesture.Prediction
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->

        }

        add(1,2) { x, y ->
            x + y
        }

        add(3,4, functionTypeNull)

        //add(5,6, functionReturnNull)

        //functionReturnNull?.invoke(3,4)
        //functionTypeNull(3,4)
    }

    fun add(numOne: Int, numTwo: Int, prediction: (Int, Int) -> Int?){
        prediction.invoke(numOne, numTwo)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    var functionTypeNull: (Int, Int) -> Int? = { _, _ ->  null } //a function type with a nullable return type

    var functionReturnNull: ((Int, Int) -> Int)? =  null  //not a nullable variable of a function type
}
