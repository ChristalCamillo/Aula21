package PetShop

fun main() {
    println("------Cachorro-----")
    val cachorro = Cachorro()
    cachorro.registrarPet()
    cachorro.movimentar()
    cachorro.comer()
    cachorro.dormir()
    println("------Gato-----")
    val gato = Gato()
    gato.registrarPet()
    gato.movimentar()
    gato.comer()
    gato.dormir()
    println("------Peixe-----")
    val peixe = Peixe()
    peixe.registrarPet()
    peixe.movimentar()
    peixe.comer()
    peixe.dormir()
}