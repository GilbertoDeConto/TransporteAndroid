package br.edu.unisep.transp.vo

import java.io.Serializable

data class TransporteVO (
        var motorista : MotoristaVO,
        var rua : String = "",
        var bairro : String = "",
        var distancia : Double = 0.00,
        var data : String = "",
        var bandeira : Int = 0,
        var valor : Double = 0.00) : Serializable {
}