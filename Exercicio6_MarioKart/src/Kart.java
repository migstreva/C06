public class Kart {
    String nome;
    Piloto pilot;
    Motor engine;

    void pular(){
        System.out.println(pilot.nome + " pulando...");
    }

    void soltarTurbo(){
        System.out.println(pilot.nome + " soltando turbo...");
    }

    void fazerDrift(){
        System.out.println(pilot.nome + " fazendo drift...");
    }

    public Kart() {
        engine = new Motor();
    }
}
