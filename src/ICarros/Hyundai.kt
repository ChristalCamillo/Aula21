package ICarros

class Hyundai: Carro("Hyundai", 2020, 200000.9, "rosa", 2, 5)
{
    override fun iniciarPartida() {
        super.iniciarPartida()
    }

    override fun frear(){
        velocidade -= 2
        println("Freando.... minha velocidade está em $velocidade")
    }

    override fun acelerar(){
        velocidade += 15
        println("Acelerando.... minha velocidade está em $velocidade")
    }
}