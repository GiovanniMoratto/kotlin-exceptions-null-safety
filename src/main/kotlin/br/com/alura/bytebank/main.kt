package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

/**
 *@Author giovanni.moratto
 */

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
    }
}