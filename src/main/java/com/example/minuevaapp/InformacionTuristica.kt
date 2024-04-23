package com.example.minuevaapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class InformacionTuristica : Eventos() {
    var lugarInformacion=""


    @RequiresApi(Build.VERSION_CODES.O)
    constructor(
        nombreEvento: String,
        lugarEvento: String,
        fechaEvento: LocalDate?,
        id: Int.Companion
    ) : super(nombreEvento, lugarEvento, fechaEvento, id)

    override fun toString(): String {
        return "InformacionTuristica(lugarInformacion='$lugarInformacion')"
    }


}