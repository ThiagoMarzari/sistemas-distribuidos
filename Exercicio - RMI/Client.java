
import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        String host = "rmi://localhost/Hoje_eh";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome para gerar email e hash: ");
        String nome = scanner.nextLine();
        try {
            IGeraDados d = (IGeraDados) Naming.lookup(host);
            System.out.println("data: " + d.geraEmail(nome));
            System.out.println("hash: " + d.geraHash(nome));
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
