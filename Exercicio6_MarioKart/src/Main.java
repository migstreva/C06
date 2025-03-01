//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Kart k1 = new Kart();

        Piloto p1 = new Piloto();

        k1.nome = "Chevette";
        k1.pilot = p1;
        k1.pilot.nome = "Mario";
        k1.pilot.vilao = false;

        k1.engine.cilindradas = "160";
        k1.engine.velocidadeMaxima = 120;


        Kart k2 = new Kart();
        Piloto p2 = new Piloto();

        k2.nome = "Kadet";
        k2.pilot = p2;
        k2.pilot.nome = "Bowser";
        k2.pilot.vilao = true;

        k2.engine.cilindradas = "140";
        k2.engine.velocidadeMaxima = 110;

        k1.engine.mostraInfo();
        k2.engine.mostraInfo();

        System.out.println();

        k2.pular();
        k2.pilot.soltaSuperPoder();

        k1.fazerDrift();
        k1.soltarTurbo();
        
    }
}