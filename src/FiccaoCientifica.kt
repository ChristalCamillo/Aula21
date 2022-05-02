class FiccaoCientifica: Livro() {
    override fun registrarLivro(isbn: Long) {
        super.registrarLivro(isbn)
    }

    override fun registrarLivro(isbn: Long, nomeLivro: String) {
        super.registrarLivro(isbn, nomeLivro)
    }

    override fun registrarLivro(isbn: Long, nomeLivro: String, generos: String) {
        super.registrarLivro(isbn, nomeLivro, generos)
    }

    override fun registrarLivro(isbn: Long, nomeLivro: String, generos: String, pessoaAutora: String) {
        super.registrarLivro(isbn, nomeLivro, generos, pessoaAutora)
    }
}