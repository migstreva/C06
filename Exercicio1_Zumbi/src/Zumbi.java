public class Zumbi {

    String nome;
    String genero;
    boolean careca;
    int forca;
    int vida;

    void correr(){
        System.out.println("Zumbi correndo...");
    }

    void seAlimentar(){
        System.out.println(nome + " esta se alimentando...");
        vida++;
    }

}
