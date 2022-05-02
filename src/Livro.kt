open class Livro {
    open fun registrarLivro(isbn: Long) {
        println("O livro foi registrado com o ISBN = $isbn")
    }

    open fun registrarLivro(isbn: Long, nomeLivro: String) {
        println("O livro foi registrado com o ISBN: $isbn e nome: $nomeLivro ")

    }

    open fun registrarLivro(isbn: Long, nomeLivro: String, generos: String) {
        println("O livro foi registrado com o ISBN: $isbn e nome: $nomeLivro e gênero: $generos ")
    }

    open fun registrarLivro(isbn: Long, nomeLivro: String, generos: String, pessoaAutora: String) {
        println("O livro foi registrado com todos os atributos")
    }
}