package br.edu.unisep.transp.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import br.edu.unisep.transp.helper.TransporteOpenHelper
import br.edu.unisep.transp.vo.MotoristaVO
import br.edu.unisep.transp.vo.TransporteVO

class MotoristaDAO (context: Context)  {
    private val helper : TransporteOpenHelper = TransporteOpenHelper(context)

    fun salvar(motorista: MotoristaVO){

        val db = helper.writableDatabase

        val valores = ContentValues()
        valores.put("nome", motorista.nome)
        valores.put("placa", motorista.placa)

        db.insert("motoristas", null, valores)
    }

    fun listar() : Cursor {

        val db = helper.readableDatabase
        var cls = db.rawQuery("select * from motoristas", null)

        return cls
    }
}
