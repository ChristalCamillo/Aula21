package ICarros

class Fiat: Carro("Fiat", 2020, 40000.0, "preto", 4, 3)
{
    override fun iniciarPartida() {
        super.iniciarPartida()
    }

    override fun frear(){
        velocidade -= 6
        println("Freando.... minha velocidade está em $velocidade")
    }

    override fun acelerar(){
        velocidade += 12
        println("Acelerando.... minha velocidade está em $velocidade")
    }
}