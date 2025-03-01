public class Zumbi {
    double vida;
    String nome;

    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbialvo, double quantia){
        if(vida >= quantia) {
            vida -= quantia;
            zumbialvo.vida += quantia;
            return true;
        }
        else{
            return false;
        }
    }
}
