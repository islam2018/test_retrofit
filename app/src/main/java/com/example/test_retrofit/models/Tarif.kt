package com.example.myparking.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Tarif (val idTarif: Int,
                    val duree: Double,
                    val prix: Double)  {

}