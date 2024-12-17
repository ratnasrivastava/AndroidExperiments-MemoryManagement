package com.ratna.memorymanagementexperiment

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        calculateMemory("on create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculateMemory("after setting content view")
        Thread {
            Thread.sleep(5000)
            calculateMemory("after 10 seconds ${Thread.currentThread().name}")
        }.start()
    }

    fun execute(view: View) {
        val list = mutableListOf<Int>()
        for (i in 1..100000) {
            list.add(i)
            println(list[i-1])
        }
        calculateMemory("after adding ${list.size} elements")

    }
}