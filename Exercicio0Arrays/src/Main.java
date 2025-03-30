//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        salgado1.nome = "Coxinha";
        Salgado salgado2 = new Salgado();
        salgado2.nome = "Kibe";
        Salgado salgado3 = new Salgado();
        salgado3.nome = "Risoli";
        Salgado salgado4 = new Salgado();
        salgado4.nome = "Empadinha de camarao";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.addSalgado(salgado4);
        cantina.mostraInfo();
    }
}