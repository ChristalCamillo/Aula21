package PetShop

open class Petshop {

    lateinit var nomePet: String
    lateinit var nomeTutor: String
    lateinit var raca: String

    open fun registrarPet(){
        println("Informe o nome do pet: ")
        nomePet = readLine().toString()
        println("Informe seu nome: ")
        nomeTutor = readLine().toString()
        println("Informe a raça do pet: ")
        raca = readLine().toString()

    }

    open fun movimentar() {
    }

    open fun comer() {

    }

    open fun dormir() {

    }
}