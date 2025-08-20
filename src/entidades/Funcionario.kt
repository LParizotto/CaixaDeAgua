package entidades

import enumeradores.Setor
import enumeradores.Sexo

class Funcionario(
    nome: String,
    sobrenome: String,
    cpf: Long,
    sexo: Sexo,
    val setor: Setor

    ): Pessoa(
    nome = nome,
    sobrenome = sobrenome,
    cpf = cpf,
    sexo = sexo
    ){

    //Comportamento do Profissional
        fun instalarCaixaDAgua(clt : Funcionario){
            if(clt.setor.equals(Setor.MONTAGEM)){
                println("Profissional habilitado")
            }else{
                println("Profissional desqualificado")
            }

        }

}