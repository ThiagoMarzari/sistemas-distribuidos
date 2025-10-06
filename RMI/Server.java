
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    String hostUrl = "rmi://localhost/Hoje_eh";

    public Server() {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Hoje_eh objeto_remoto = new Hoje_eh();
            System.out.println("Servidor retornando objeto remoto");
            Naming.bind(hostUrl, objeto_remoto);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
