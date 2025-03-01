//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Zumbi zumbi1 = new Zumbi();
        zumbi1.nome = "John";
        zumbi1.vida = 100;

        Zumbi zumbi2 = new Zumbi();
        zumbi2.nome = "Jane";
        zumbi2.vida = 100;

        zumbi1.transfereVida(zumbi2, 55);
        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());
        System.out.println();

        zumbi1 = zumbi2;

        zumbi1.transfereVida(zumbi2, 100);

        System.out.println(zumbi1.mostraVida());
        System.out.println(zumbi2.mostraVida());
    }
}