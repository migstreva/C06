public class Pessoa {
    String nome;
    int idade;

    void emprestarLivro(Livro livro){
        System.out.println("Livro emprestado para " + nome);
    }

    void devolverLivro(Livro livro){
        System.out.println(nome + " devolveu o livro");
    }

    void listarLivroEmprestado(Livro livro){
        System.out.println("LIVRO EMPRESTADO");
        System.out.println(livro.titulo);
        System.out.println("Autor: " + livro.autor.nome);
    }
}
