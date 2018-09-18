package br.edu.unisep.transp.helper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class TransporteOpenHelper (context: Context) : SQLiteOpenHelper(context, "taxi", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {

        val sql = "create table motoristas (" +
                "   _id integer primary key, " +
                "   nome text, " +
                "   placa text) +" +

                "create table corridas (" +
                "   _id integer primary key, " +
                "   motorista integer, " +
                "   rua text, " +
                "   bairro text, " +
                "   distancia real, " +
                "   data text, " +
                "   bandeira integer)"



                db!!.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
}