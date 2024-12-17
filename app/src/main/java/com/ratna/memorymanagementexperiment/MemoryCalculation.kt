package com.ratna.memorymanagementexperiment

/**
 * Created by Ratna Srivastava on 17-12-2024.
 */

fun calculateMemory(source: String) {
    val maxMemoryInMb = Runtime.getRuntime().maxMemory()/1024/1024
    val totalMemoryInMb = Runtime.getRuntime().totalMemory()/1024/1024
    val freeMemoryInMb = Runtime.getRuntime().freeMemory()/1024/1024
    val usedMemoryInMb = totalMemoryInMb - freeMemoryInMb
    println("********************************************************")
    println("source: $source")
    println("Max Memory: $maxMemoryInMb MB")
    println("Total Memory: $totalMemoryInMb MB")
    println("Free Memory: $freeMemoryInMb MB")
    println("Used Memory: $usedMemoryInMb MB")
    println("********************************************************")
}