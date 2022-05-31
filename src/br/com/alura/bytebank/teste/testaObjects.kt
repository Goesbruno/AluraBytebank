package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    val luisa = object : Autenticavel {   // criando um cliente livre de classes a partir da object expression
        val nome: String = "Luisa"
        val cpf: String = "555.555.555-55"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(luisa, 1000)

    println("Nome do cliente: ${luisa.nome}")

    val bartolomeu = Cliente(nome = "Bartolomeu", cpf = "444.444.444-44", senha = 12345)
    val contapoupanca = ContaPoupanca(titular = bartolomeu, numero = 1004)
    val josiano = Cliente(nome = "Josiano", cpf = "", senha = 0)
    val contaCorrente = ContaCorrente(titular = josiano, numero = 1005)


    println("Total de contas: ${Conta.total}")
}