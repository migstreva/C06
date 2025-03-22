//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Autor autor = new Autor();
        Livro livro = new Livro();
        Pessoa pessoa = new Pessoa();

        livro.titulo = "Harry Potter and the Philosopher's Stone";
        autor.livro = livro;

        autor.nome = "J.K. Rowling";
        autor.nacionalidade = "Britanica";
        autor.escreverLivro(livro.titulo);
        System.out.println(autor.obterBiografia());
        System.out.println();

        livro.biblioteca.adicionarLivro(livro);

        System.out.println();

        pessoa.nome = "Laura";
        pessoa.idade = 20;
        livro.pessoa = pessoa;

        livro.biblioteca.nome = "The Library";
        livro.biblioteca.endereco = "10 Downing Street";

        livro.emprestar();
        System.out.println();

        livro.devolver();
        System.out.println();

        livro.biblioteca.listarLivro(livro);
    }
}