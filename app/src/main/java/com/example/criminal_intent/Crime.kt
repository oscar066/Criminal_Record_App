package com.example.criminal_intent

import java.util.Date
import java.util.UUID

data class Crime (
    val id: UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
)