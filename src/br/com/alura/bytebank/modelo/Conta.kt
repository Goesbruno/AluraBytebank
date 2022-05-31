package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException


abstract class Conta(
    val titular: Cliente, val numero: Int
) : Autenticavel {
    var saldo = 0.0    //saldo privado para que apenas a Class possa alterar
        protected set

    companion object {  //Companion object para implementar um contador que apenas a classe Conta pode alterar
        var total = 0
            private set
    }

    init {                      // O init funciona sempre que a classe é chamada/iniciada
        println("Criando conta")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        saldo += valor
    }

    abstract fun saca(valor: Double)

    open fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, saldo atual: $saldo")
        } else if (!autentica((senha))) {
            throw FalhaAutenticacaoException()
        }
            saldo -= valor
            destino.deposita(valor)

    }
}




