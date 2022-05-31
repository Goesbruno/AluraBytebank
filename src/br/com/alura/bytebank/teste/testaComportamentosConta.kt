import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println()

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)
    println()

    println("sacando conta Alex")
    contaAlex.saca(250.0)
    println("Saldo na conta do Alex: ${contaAlex.saldo}")
    println()

    println("sacando conta Fran")
    contaFran.saca(100.00)
    println("Saldo na conta da Fran: ${contaFran.saldo}")
    println()

    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(valor = 250.0, destino =  contaAlex, senha = 2)
        println("Transferência Sucedida")
    } catch (e: SaldoInsuficienteException){
        println("Falha na transferência")
        println("Saldo Insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("Falha na transferência")
        println("Falha na autentificação")
        e.printStackTrace()
    } catch(e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }



    println("Novo saldo Fran: ${contaFran.saldo}")
    println("Novo saldo Alex: ${contaAlex.saldo}")
}