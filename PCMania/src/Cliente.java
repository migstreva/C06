public class Cliente {
    String nome;
    long cpf;
    float totalCompra = 0;

    public Cliente(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    float calculaTotalCompra(Computador[] cart){
        for (Computador computador : cart) {
            totalCompra += computador.preco;
        }
        return totalCompra;
    }

}
