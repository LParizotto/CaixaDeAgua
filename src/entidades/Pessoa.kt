package entidades

import enumeradores.Sexo

open class Pessoa(
    val nome: String,
    val sobrenome: String,
    val cpf: Long,
    val sexo: Sexo

) {
}