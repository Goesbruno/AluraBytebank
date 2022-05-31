package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(pessoa: Autenticavel, senha: Int){
        if(pessoa.autentica(senha)){
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autentificação")
        }
    }


}