
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GeraDados extends UnicastRemoteObject implements IGeraDados {

    public GeraDados() throws RemoteException {
        super();
    }

    public String geraEmail(String nome) throws RemoteException {
        return nome.toLowerCase().replaceAll(" ", ".") + "@ufn.edu.br";

    }

    @Override
    public String geraHash(String nome) throws RemoteException {
        if (nome.equals("")) {
            return "Não foi possível gerar o hash.";
        }
        return String.valueOf(nome.hashCode());
    }

}
