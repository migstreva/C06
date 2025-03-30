package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome;
    private String tipoAsteroide; //Pequeno ou grande

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }

    public Asteroide(String nome, String tipoAsteroide){
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir(){
        System.out.println("Asteroide " + this.nome + " destruido!");
    }
}
