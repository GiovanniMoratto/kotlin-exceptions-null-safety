package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

/**
 *@Author giovanni.moratto
 */

fun main() {
    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNulo!!
    enderecoNaoNulo.logradouro
}