package br.edu.unisep.transp.adapter

import android.content.Context
import android.database.Cursor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CursorAdapter
import br.edu.unisep.transp.R

class TransporteAdapter (context: Context, cursor: Cursor?) : CursorAdapter(context, cursor, 0) {
    private val inflater = LayoutInflater.from(context)

    override fun newView(context: Context?, cursor: Cursor?, group: ViewGroup?): View {
        return inflater.inflate(R.layout.item_corrida, null)
    }

    override fun bindView(item: View?, context: Context?, cursor: Cursor?) {

        val motorista = cursor?.getString(cursor?.getColumnIndex("motorista"))
        val rua = cursor?.getString(cursor?.getColumnIndex("rua"))
        val bairro = cursor?.getString(cursor?.getColumnIndex("bairro"))
        val distancia = cursor?.getInt(cursor?.getColumnIndex("distancia"))
        val data = cursor?.getInt(cursor?.getColumnIndex("data"))
        val bandeira = cursor?.getInt(cursor?.getColumnIndex("bandeira"))
        val valor = cursor?.getInt(cursor?.getColumnIndex("valor"))



    }
}