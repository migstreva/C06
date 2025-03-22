public class Biblioteca {
    String nome;
    String endereco;

    void adicionarLivro(Livro livro){
        System.out.println(livro.titulo + " esta na biblioteca");
    }

    void removerLivro(Livro livro){
        System.out.println(livro.titulo + " nao esta na biblioteca");
    }

    void listarLivro(Livro livro){
        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor.nome);
    }
}
