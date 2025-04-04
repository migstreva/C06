import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Michael", 1237894560);
        Computador[] computadores = new Computador[3];
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();
        MemoriaUSB musb1;
        MemoriaUSB musb2;
        MemoriaUSB musb3;
        Computador[] cart = new Computador[2]; // Carrinho de compras
        boolean checkout = false;
        Scanner sc = new Scanner(System.in);

        musb1 = new MemoriaUSB("Pen-drive", 16);
        musb2 = new MemoriaUSB("Pen-drive", 32);
        musb3 = new MemoriaUSB("HD Externo", 1000);

        computador1.marca = "Apple";
        computador1.preco = 2011;
        computador1.addHardware("Pentium Core i3", 2200);
        computador1.addHardware("Memoria RAM", 8);
        computador1.addHardware("HD", 500);
        computador1.sistema.nome = "Linux Ubuntu";
        computador1.sistema.tipo = 32;
        computador1.addMemoriaUSB(musb1);
        computador1.codigoPromocao = 1;

        computador2.marca = "Samsung";
        computador2.preco = 2011+1234;
        computador2.addHardware("Pentium Core i5", 3370);
        computador2.addHardware("Memoria RAM", 16);
        computador2.addHardware("HD", 1000);
        computador2.sistema.nome = "Windows 8";
        computador2.sistema.tipo = 64;
        computador2.addMemoriaUSB(musb2);
        computador2.codigoPromocao = 2;

        computador3.marca = "Dell";
        computador3.preco = 2011+5678;
        computador3.addHardware("Pentium Core i7", 4500);
        computador3.addHardware("Memoria RAM", 32);
        computador3.addHardware("HD", 2000);
        computador3.sistema.nome = "Windows 10";
        computador3.sistema.tipo = 64;
        computador3.addMemoriaUSB(musb3);
        computador3.codigoPromocao = 3;

        computadores[0] = computador1;
        computadores[1] = computador2;
        computadores[2] = computador3;

        System.out.println("--------------Bem vindo a PC Mania!---------------");
        System.out.println();
        System.out.println("Confira nossas promocoes:");
        System.out.println();
        for(int i = 0; i < computadores.length; i++) {
            if(computadores[i] != null){
                computadores[i].mostraPCConfigs();
            }
            System.out.println();
        }

        System.out.println("Digite abaixo o numero de " +
                " cada promocao desejada (digite 0 para fazer o checkout):");
        while(!checkout)
        {
            int op = sc.nextInt();
            if (op == 0){
                checkout = true;
            }
            else{
                for (Computador computador : computadores) {
                    if (computador != null) {
                        if (computador.codigoPromocao == op) {
                            for (int j = 0; j < cart.length; j++) {
                                if (cart[j] == null) {
                                    cart[j] = computador;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Total da compra: " + cliente.calculaTotalCompra(cart));
        sc.close();
    }
}