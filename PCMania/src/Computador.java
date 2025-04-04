public class Computador {
    String marca;
    float preco;
    MemoriaUSB musb;
    int codigoPromocao;

    HardwareBasico[] hardwares;
    SistemaOperacional sistema;

    public Computador(){
        hardwares = new HardwareBasico[3];
        sistema = new SistemaOperacional();
    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }

    void addHardware(String nome, float capacidade){
        HardwareBasico hardware = new HardwareBasico();
        hardware.nome = nome;
        hardware.capacidade = capacidade;
        for(int i = 0; i < hardwares.length; i++){
            if(hardwares[i] == null){
                this.hardwares[i] = hardware;
                break;
            }
        }
    }

    void mostraPCConfigs(){
        System.out.println("PROMOCAO " + codigoPromocao);
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        for (int i = 0; i < hardwares.length; i++) {
            System.out.print(hardwares[i].nome);
            if(i == 0){
                System.out.println(" " + hardwares[i].capacidade + " Mhz");
            }
            else{
                System.out.println(" " + hardwares[i].capacidade + " Gb");
            }
        }
        System.out.println("Sistema Operacional " + sistema.nome + " " + sistema.tipo + " bits");
        System.out.println("Acompanha " + musb.nome + " de " + musb.capacidade + " Gb");
    }

}
