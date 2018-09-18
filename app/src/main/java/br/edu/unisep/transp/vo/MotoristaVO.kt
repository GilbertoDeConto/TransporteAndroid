package br.edu.unisep.transp.vo

import java.io.Serializable

data class MotoristaVO (
        var id : Int? = null,
        var nome : String = "",
        var placa: Int = 0) : Serializable {
}