
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Comunicador {

    // Envia qualquer objeto (Pessoa, String, etc.)
    // Object -> é generico, posso enviar qualquer coisa
    public static void enviaObjeto(Socket s, Object obj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(s.getOutputStream());
            escritor.flush();
            System.out.println("Enviando objeto: " + obj);
            escritor.writeObject(obj);
            escritor.flush();
            // Não fecha o stream aqui!
        } catch (Exception e) {
            System.out.println("Erro ao enviar objeto: " + e.getMessage());
        }
    }

    // Recebe qualquer objeto (Pessoa, String, etc.)
    public static Object recebeObjeto(Socket s) {
        try {
            ObjectInputStream leitor = new ObjectInputStream(s.getInputStream());
            Object recebido = leitor.readObject();
            System.out.println("Objeto recebido: " + recebido);
            return recebido;
        } catch (Exception e) {
            System.out.println("Erro ao receber objeto: " + e.getMessage());
            return null;
        }
    }
}
