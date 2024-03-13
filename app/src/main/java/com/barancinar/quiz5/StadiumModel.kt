package com.barancinar.quiz5

data class StadiumModel(
    val id: Long,
    val image: Int,
    val stadiumName: String,
    val stadiumCapacity: String,
    val stadiumLocation: String,
    var likeIcon: Int
)
