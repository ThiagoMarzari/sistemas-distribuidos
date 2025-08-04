
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;


/***
 * Classe responsável por movimentar componenents botoes para cima, baixo, esquerda
 * direita
 * @author Thiago Marzari
 */
public class Movimenta {
    public static void cima(JButton botao) {
        if (botao.getY() > 1)
        botao.setBounds(botao.getX(), botao.getY() - 10, botao.getWidth(),
                botao.getHeight());
    }
    
    public static void baixo(JButton botao, JFrame frame) {
        int limite = frame.getContentPane().getHeight()- botao.getHeight() - 8;
        if (botao.getY() < limite) {
            botao.setBounds(botao.getX(), botao.getY() + 10, botao.getWidth(),
                botao.getHeight());    
        }
        
    }
    
    public static void esquerda(JButton botao) {
          if (botao.getX() > 1)
        botao.setBounds(botao.getX() - 10, botao.getY(), botao.getWidth(),
                botao.getHeight());
    }
    
    public static void direita(JButton botao, JFrame frame) {
        int limite = frame.getContentPane().getWidth()- botao.getHeight();
         if (botao.getX() < limite - 14) {
            botao.setBounds(botao.getX() + 10, botao.getY(), botao.getWidth(),
                botao.getHeight());    
        }
    }
    
    public static void sorteiaPosicao(JButton botao, JFrame frame) {
        Random gerador = new Random();
        int limiteInferior = frame.getContentPane().getHeight()- botao.getHeight() - 8;
        int limiteDireita = frame.getContentPane().getWidth()- botao.getHeight();
        int y = gerador.nextInt(10, limiteInferior);
        int x = gerador.nextInt(10, limiteDireita);
        
        botao.setBounds(x, y, botao.getWidth(), botao.getHeight());
    }
}
