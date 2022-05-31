import br.com.alura.bytebank.modelo.*



fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Bruno",
            cpf = "111.111.111-11",
            senha = 1234,
            endereco = Endereco(
                logradouro = "Rua X"
            )
        ),
        numero = 1000
    )
    println("Titular: ${contaCorrente.titular.nome}")
    println("CPF do titular: ${contaCorrente.titular.cpf}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Beatriz", cpf = "222.222.222-22", senha = 4321),
        numero = 1001
    )
    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Abreu", cpf = "333.333.333-33", senha = 3412),
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta salário: ${contaSalario.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta salário: ${contaSalario.saldo}")
    println()

    contaCorrente.transfere(100.0, contaPoupanca, senha = 2)
    println("Saldo após transferir da conta corrente: ${contaCorrente.saldo}")
    println("Saldo após receber na conta poupança: ${contaPoupanca.saldo}")
    println()


}