import entidades.Funcionario
import entidades.Servico
import enumeradores.Setor
import enumeradores.Sexo
import enumeradores.TipoServico

fun main() {
    val instalacao : Servico = Servico(
        TipoServico.INSTALACAO, preco = "800.50".toBigDecimal(),
        funcionario = Funcionario(
            nome = "Luis",
            sobrenome = "Parizotto",
            cpf = 123456789,
            sexo = Sexo.MASCULINO,
            setor = Setor.FINANCEIRO
        )
    )

}