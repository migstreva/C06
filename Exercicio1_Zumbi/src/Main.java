//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Chris";
        zumbi2.nome = "Laura";

        zumbi1.careca = false; // nao se pode atribuir 1 ou 0
        zumbi2.careca = true;

        zumbi1.vida = 100;
        zumbi2.vida = 200;

        zumbi1.seAlimentar();
        zumbi2.correr();


    }
}