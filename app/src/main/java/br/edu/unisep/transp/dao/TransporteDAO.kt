package br.edu.unisep.transp.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.edu.unisep.transp.helper.TransporteOpenHelper
import br.edu.unisep.transp.vo.TransporteVO
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter

class TransporteDAO (context: Context) {
    private val helper : TransporteOpenHelper = TransporteOpenHelper(context)

    fun salvar(corrida: TransporteVO){

        val db = helper.writableDatabase

        val valores = ContentValues()
        valores.put("motorista", corrida.motorista!!.id)
        valores.put("rua", corrida.rua)
        valores.put("bairro", corrida.bairro)
        valores.put("distancia", corrida.distancia.toDouble())

        val dtf = SimpleDateFormat("dd/MM/yyyy HH:mm")
        val data = dtf.format(corrida.data)

        valores.put("data", corrida.data)
        valores.put("bandeira", corrida.bandeira)
        valores.put("valor", corrida.valor.toDouble())

        db.insert("corridas", null, valores)
    }

    fun listar(obj : Int) : Cursor {

        val db = helper.readableDatabase

            val sql = "select * from corridas a " +
                    "where a.motorista = ?"

            val params = arrayOf(obj.toString())

            var crs = db.rawQuery(sql, params)
            return crs

    }
}