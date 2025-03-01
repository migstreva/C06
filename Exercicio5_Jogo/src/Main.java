//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Personagem p1 = new Personagem();
        Arma gun1 = new Arma();
        p1.nome = "Joao";
        p1.pontos = 1000;
        gun1.nome = "AK47";
        gun1.poder = 100;
        gun1.descricao = "Perfeita pro combate";
        gun1.resistencia = 20;

        Personagem p2 = new Personagem();
        Arma gun2 = new Arma();
        p2.nome = "Jane";
        p2.pontos = 1000;
        gun2.nome = "M4A1";
        gun2.poder = 70;
        gun2.descricao = "Foda";
        gun2.resistencia = 30;

        p1.usarArma();
        p2.tomarDano(gun1);

        System.out.println("Resistencia da " + gun1.nome + ": " + gun1.resistencia);
        System.out.println("Pontos do(a) " + p2.nome + ": " + p2.pontos);

    }
}