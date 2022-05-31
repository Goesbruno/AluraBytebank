import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutentificacao() {
    val gerente = Gerente(
        nome = "José",
        cpf = "666.666.666-66",
        salario = 1000.0,
        senha = 1000
    )
    val diretor = Diretor(
        nome = "Tonho",
        cpf = "555.555.555-55",
        salario = 10000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Jorel",
        cpf = "777.777.777-77",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(cliente, 1234)



}