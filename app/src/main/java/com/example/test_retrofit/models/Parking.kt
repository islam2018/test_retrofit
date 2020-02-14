package com.example.myparking.models

import android.os.Parcelable
import android.widget.ImageView
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue



data class Parking(
                    val idParking: Int,
                    val nbEtages: Int,
                    val nbPlaces: Int,
                    val nom: String,
                    val adresse: String,
                    val imageUrl: String,
                    val lattitude: Double,
                    val longitude: Double,
                    val ouvert: String,
                   val horaire : Horaire,
                   val etages :  ArrayList<Etage>,
                    val tarifs :  ArrayList<Tarif>,
                   val equipements: ArrayList<Equipement>
                   )
    {



}