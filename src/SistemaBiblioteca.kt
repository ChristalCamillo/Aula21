

fun main() {

    println("Escolha o gênero do livro que deseja registrar: (R) Romance, (I) Infantil e (F) Ficção Científica")
    val opcao: String = readLine().toString()
    if(opcao == "F") {
        println("Informe o isbn: ")
        var isbn = readLine()?.toLong()
        if (isbn != null) {
            FiccaoCientifica().registrarLivro(isbn)
        }
    }
    if(opcao == "I") {
        println("Informe o isbn: ")
        var isbn = readLine()?.toLong()
        println("Informe o nome do livro")
        var nomeLivro = readLine()
        if (nomeLivro != null) {
            if (isbn != null) {
                Infantil().registrarLivro(isbn, nomeLivro)
            }
        }
    }
    if(opcao == "R") {
        println("Informe o isbn: ")
        var isbn = readLine()?.toLong()
        println("Informe o nome do livro")
        var nomeLivro = readLine()
        println("Informe o autor:")
        var generos = opcao
        if (isbn != null) {
            if (nomeLivro != null) {
                Romance().registrarLivro(isbn, nomeLivro, opcao)
            }
        }
    }
    else{
        println("Opção inválida")
    }

    val pippiMeialonga = Infantil()
    pippiMeialonga.registrarLivro(9788310080899, "Pippi Meialonga", "Infantil", "Astrid Lidgren" )

}