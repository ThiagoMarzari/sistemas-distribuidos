import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Comunicador {

    public static Pessoa recebeObjeto(Socket s) {
        try {
            //Cria um objeto de fluxo de dados de entrada, para poder receber um objeto do tipo Pessoa de um socket s
            ObjectInputStream leitor = new ObjectInputStream(s.getInputStream());
            Pessoa p = (Pessoa) leitor.readObject();
            return p;
        } catch (Exception e) {
            return null;
        }
    }

    public static void enviaObjeto(Socket s, String nome) {
        try {
            //Cria um objeto de fluxo de dados de de saída, para poder enviar dados pelo socket s
            ObjectOutputStream escritor = new ObjectOutputStream(s.getOutputStream());
            System.out.println("Enviarei " + nome);
            escritor.writeObject(nome);
        } catch (Exception e) {
        }
    }
}
