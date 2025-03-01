public class Zumbi {
    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    void transfereVida(Zumbi zumbialvo, double quantia){
        vida -= quantia;
        zumbialvo.vida += quantia;
    }
}
