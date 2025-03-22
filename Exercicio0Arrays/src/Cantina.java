public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[3];

    void addSalgado(Salgado novoSalgado) {
        boolean added = false; //Verifica se foi possivel adicionar o salgado
        for(int i = 0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                added = true;
                break;
            }
        }
        if(!added){
            System.out.println("Nao foi possivel adicionar salgado.");
        }
    }

    void mostraInfo(){
        System.out.println("Lista de salgados:");
        for(Salgado salgado : salgados){
            System.out.println(salgado);
        }
    }
}
