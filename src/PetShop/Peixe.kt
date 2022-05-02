package PetShop

class Peixe: Petshop() {

    override fun registrarPet() {
        super.registrarPet()
    }

    override fun movimentar(){
        super.movimentar()
        println("Nadando")
    }
    override fun comer(){
        super.comer()
        println("Comendo ração molhada")
    }
    override fun dormir(){
        super.dormir()
        println("Dormindo de olho aberto")
    }
}