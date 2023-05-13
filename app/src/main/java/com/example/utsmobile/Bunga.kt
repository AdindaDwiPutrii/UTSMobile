package com.example.utsmobile

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Bunga(
    val imgBunga: Int,
    val nameBunga: String,
    val descBunga: String
) : Parcelable