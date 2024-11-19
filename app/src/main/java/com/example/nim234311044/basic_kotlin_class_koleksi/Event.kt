package com.example.nim234311044.basic_kotlin_class_koleksi

data class Event(
    val title: String,
    val description: String? = null,  // Memberikan nilai default null
    val daypart: Daypart,
    val durationInMinutes: Int
)