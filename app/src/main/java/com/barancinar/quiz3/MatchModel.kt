package com.barancinar.quiz3

data class MatchModel(
    val id: Long,
    val kod: Int,
    val image: Int,
    val shortName: String,
    val iYSkor: String,
    val msDurum: String,
    val hour: String,
    val evSahibi: String,
    val skor: String,
    val deplasman: String
)
