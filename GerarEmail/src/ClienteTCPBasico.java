
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;

public class ClienteTCPBasico {

    public static void main(String[] args) {
        try {
            String porta = JOptionPane.showInputDialog(null, "Digite a porta");
            String nome = JOptionPane.showInputDialog(null, "Nome completo");

            //Estalece conexao com o servidor
            Socket cliente = new Socket("localhost", Integer.parseInt(porta));
            // Envia o nome como String
            Comunicador.enviaObjeto(cliente, nome);

            //receber o objeto criado
            Pessoa p = (Pessoa) Comunicador.recebeObjeto(cliente);
            if (p == null) {
                JOptionPane.showMessageDialog(null, "Seu nome já está na lista com um email gerado");
            } else {
                JOptionPane.showMessageDialog(null, "Pessoa criada e recebida: " + p);
            }
            cliente.close();
            System.out.println("Conexão encerrada");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
