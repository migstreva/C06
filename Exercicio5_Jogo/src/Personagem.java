public class Personagem {
    String nome;
    int pontos;
    Arma gun;

    void usarArma() {
        gun.resistencia -= 2;
    }

    void tomarDano(Arma gun_inimigo){
        pontos -= 5 * gun_inimigo.poder;
    }
}
