package com.example.minuevaapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.Locale

class Eventos {
    var nombreEvento="";
    var lugarEvento="";
    @RequiresApi(Build.VERSION_CODES.O)
    var fechaEvento= LocalDate.of(2024,4,5);
    var id=Int;

    // constructores

    constructor(nombreEvento: Int, lugarEvento: String, fechaEvento: String, id: LocalDate)
    @RequiresApi(Build.VERSION_CODES.O)
    constructor(
        nombreEvento: String,
        lugarEvento: String,
        fechaEvento: LocalDate?,
        id: Int.Companion
    ) {
        this.nombreEvento = nombreEvento
        this.lugarEvento = lugarEvento
        this.fechaEvento = fechaEvento
        this.id = id
    }

    //to string
    @RequiresApi(Build.VERSION_CODES.O)
    override fun toString(): String {
        return "Eventos(nombreEvento='$nombreEvento'," +
                " lugarEvento='$lugarEvento', fechaEvento=$fechaEvento)"
    }
    //variable estatica para mantener el contador del id
    private var contadorId=0
    
    //genera un nuevo id
    private fun generarId():Int{
        return contadorId++
    }

    @RequiresApi(Build.VERSION_CODES.O)
    //funcion para agregar evento
    fun anadirEvento (nombreEvento: String, lugarEvento: String, fechaEvento: LocalDate): Eventos {
        var nuevoId =generarId()
        return Eventos(nuevoId,nombreEvento,lugarEvento,fechaEvento)
    }

   /* //funcion para eliminar evento
    fun eliminarEvento(idAEliminar: Int, miEvento:Array<Eventos>):Array<Eventos>{
        return miEvento.filter { it.id != idAEliminar }.toTypedArray()
    }*/




    /*  fun modificarEvento(id: String){
          argumentosEventos = recuperarEvento (id)
          modificoArgumentos
          insertoArgumentosNovos <- Coidado con non insertar un novo
      }*/

}