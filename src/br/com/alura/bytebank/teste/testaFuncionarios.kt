import br.com.alura.bytebank.modelo.*

fun testaFuncionarios() {
    val bruno = Analista(
        nome = "Bruno",
        cpf = "123.456.789-10",
        salario = 1000.0
    )
    println("Nome: ${bruno.nome}")
    println("CPF: ${bruno.cpf}")
    println("Salário: R$${bruno.salario}")
    println("Bonificação: R$${bruno.bonificacao}")
    println()

    val beatriz = Gerente(
        nome = "Beatriz",
        cpf = "987.654.321-00",
        salario = 10000.0,
        senha = 1234
    )
    println("Nome: ${beatriz.nome}")
    println("CPF: ${beatriz.cpf}")
    println("Salário: R$${beatriz.salario}")
    println("Bonificação: ${beatriz.bonificacao}")
    println()

    if (beatriz.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        print("Falha na autentificação")
    }

    val carlos = Diretor(nome = "Carlos", cpf = "130.749.648-20", senha = 2510, salario = 50000.0, plr = 200.0)
    println("Nome: ${carlos.nome}")
    println("CPF: ${carlos.cpf}")
    println("Salário: R$${carlos.salario}")
    println("Bonificação: ${carlos.bonificacao}")
    println("PLR: ${carlos.plr}")
    println()

    val regina = Analista(nome = "Regina", cpf = "199.1748.308-18", salario = 20000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(bruno)
    calculadora.registra(beatriz)
    calculadora.registra(carlos)
    calculadora.registra(regina)

    println("Total de bonificação: ${calculadora.total}")
}