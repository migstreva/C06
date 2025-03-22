public class Livro {
    String titulo;
    Autor autor;
    Pessoa pessoa;
    Biblioteca biblioteca;

    public Livro(){
        biblioteca = new Biblioteca();
    }

    String detalhes(){
        return "DETALHES DO LIVRO";
    }

    void emprestar(){
        biblioteca.removerLivro(this);
        pessoa.emprestarLivro(this);
        System.out.println();
        pessoa.listarLivroEmprestado(this);
    }

    void devolver(){
        biblioteca.adicionarLivro(this);
        pessoa.devolverLivro(this);
    }
}
