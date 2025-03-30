package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro; //Normal e explosivo

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        if(ast.getTipoAsteroide().equals("Grande")){
            if(this.tipoTiro.equals("Explosivo")){
                ast.destruir();
            }
            else{
                System.out.println("Esta nave nao pode destruir este tipo de asteroide!");
            }
        }
        else{
            ast.destruir();
        }
    }
}
