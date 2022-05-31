import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiaseReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)
    val maria = Cliente(nome = "Maira", cpf = "", senha = 2)

    val contaJoao = ContaCorrente(titular = joao, numero = 1002)
    var contaMaria = ContaPoupanca(titular = maria, numero = 1003)


}