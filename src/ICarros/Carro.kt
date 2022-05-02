package ICarros

public open class Carro(
    var marca: String,
    var ano: Long,
    var valor: Double,
    var cor: String,
    var portas: Int,
    var velocidade: Int
) {
    open fun iniciarPartida(){
        println("Iniciando o motor… minha velocidade está em $velocidade")
    }

    open fun frear(){
        velocidade -= 5
        println("Freando.... minha velocidade está em $velocidade")
    }

    open fun acelerar(){
        velocidade += 10
        println("Acelerando.... minha velocidade está em $velocidade")
    }
}