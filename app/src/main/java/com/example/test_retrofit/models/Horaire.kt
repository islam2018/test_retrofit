package com.example.myparking.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


data class Horaire (val idHoraire: Int,
                    val HeureOuverture: String,
                    val HeureFermeture: String)  {

}