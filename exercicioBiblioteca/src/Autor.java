public class Autor {
    String nome;
    String nacionalidade;
    Livro livro;
    boolean escreveuLivro = false;

    Livro escreverLivro(String titulo) {
        livro.titulo = titulo;
        livro.autor = this;
        escreveuLivro = true;
        return livro;
    }

    String obterBiografia() {
        if(escreveuLivro) {
            return nome + " e " + nacionalidade + " e escreveu " + livro.titulo;
        }
        else {
            return nome + " e " + nacionalidade + " e nao escreveu nenhum livro";
        }
    }

}
