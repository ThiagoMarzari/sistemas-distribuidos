
import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            IHoje_eh d = (IHoje_eh) Naming.lookup("rmi://localhost/Hoje_eh");
            System.out.println("Data e hora vinda do servidor: ");
            System.out.println("data: " + d.pegaDataHora().data);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
