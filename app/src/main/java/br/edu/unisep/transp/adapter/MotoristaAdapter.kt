package br.edu.unisep.transp.adapter

import android.content.Context
import android.database.Cursor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CursorAdapter
import br.edu.unisep.transp.R

class MotoristaAdapter (context: Context, cursor: Cursor?) : CursorAdapter(context, cursor, 0) {
    private val inflater = LayoutInflater.from(context)

    override fun newView(context: Context?, cursor: Cursor?, group: ViewGroup?): View {
        return inflater.inflate(R.layout.item_motorista, null)
    }

    override fun bindView(item: View?, context: Context?, cursor: Cursor?) {

        val nome = cursor?.getString(cursor?.getColumnIndex("nome"))
        val placa = cursor?.getString(cursor?.getColumnIndex("placa"))


    }
}