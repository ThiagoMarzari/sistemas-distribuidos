
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JFrameCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCliente
     */
    public JFrameCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldApelido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jPanelCamposMensagens = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTextoMensagem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMensagensRecebidas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButtonConectar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFielIp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Apelido:");

        jLabel2.setText("Porta:");

        jTextFieldPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPortaActionPerformed(evt);
            }
        });

        jLabel3.setText("Texto para enviar:");

        jTextFieldTextoMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTextoMensagemKeyPressed(evt);
            }
        });

        jTextAreaMensagensRecebidas.setEditable(false);
        jTextAreaMensagensRecebidas.setColumns(20);
        jTextAreaMensagensRecebidas.setRows(5);
        jTextAreaMensagensRecebidas.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaMensagensRecebidas);

        jLabel4.setText("Chat do cliente");

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCamposMensagensLayout = new javax.swing.GroupLayout(jPanelCamposMensagens);
        jPanelCamposMensagens.setLayout(jPanelCamposMensagensLayout);
        jPanelCamposMensagensLayout.setHorizontalGroup(
            jPanelCamposMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposMensagensLayout.createSequentialGroup()
                .addGroup(jPanelCamposMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposMensagensLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCamposMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                            .addComponent(jTextFieldTextoMensagem)))
                    .addGroup(jPanelCamposMensagensLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonConectar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCamposMensagensLayout.setVerticalGroup(
            jPanelCamposMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposMensagensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposMensagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTextoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        jLabel5.setText("IP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelCamposMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFielIp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPorta, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFielIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCamposMensagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPortaActionPerformed

    }//GEN-LAST:event_jTextFieldPortaActionPerformed

    private void jTextFieldTextoMensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTextoMensagemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.consume(); // Impede que o Enter adicione uma nova linha, se for JTextField ou JTextArea

            String fraseCliente = jTextFieldTextoMensagem.getText().trim();
            String apelido = jTextFieldApelido.getText().trim();

            if (!fraseCliente.isEmpty() && saida != null) {
                try {
                    saida.writeObject(apelido + ": " + fraseCliente);
                    saida.flush();
                    jTextFieldTextoMensagem.setText(""); // Limpa o campo após envio
                } catch (IOException ex) {
                    Logger.getLogger(JFrameServidor.class.getName()).log(Level.SEVERE, "Erro ao enviar mensagem", ex);
                    JOptionPane.showMessageDialog(this, "Erro ao enviar mensagem: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jTextFieldTextoMensagemKeyPressed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        if (jTextFieldApelido.getText().trim().isEmpty() || jTextFieldPorta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campos incompletos para conexão");
            return;
        }

        String apelido = jTextFieldApelido.getText().trim();
        String servidorEndereco = jTextFielIp.getText().trim();
        int portaNumero;

        try {
            portaNumero = Integer.parseInt(jTextFieldPorta.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Porta inválida");
            return;
        }

        try {
            // Conecta ao servidor
            socketCliente = new Socket(servidorEndereco, portaNumero);

            // Cria os streams de entrada e saída
            saida = new ObjectOutputStream(socketCliente.getOutputStream());
            entrada = new ObjectInputStream(socketCliente.getInputStream());

            // Thread para ouvir mensagens do servidor
            new Thread(() -> {
                try {
                    String fraseDoServidor;
                    while ((fraseDoServidor = (String) entrada.readObject()) != null) {
                        System.out.println("Msg do servidor: " + fraseDoServidor);
                        jTextAreaMensagensRecebidas.setText(fraseDoServidor + "\n");
                    }
                } catch (IOException | ClassNotFoundException ex) {
                    System.err.println("Erro ao receber mensagem do servidor: " + ex.getMessage());
                }
            }).start();

            JOptionPane.showMessageDialog(this, "Conectado com sucesso ao servidor!");

        } catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(this, "Servidor desconhecido: " + servidorEndereco);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro de I/O ao conectar no servidor.");
        }
    }//GEN-LAST:event_jButtonConectarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCliente().setVisible(true);
            }
        });
    }

    static ServerSocket socketServidor;
    static Socket socketCliente;
    static ObjectOutputStream saida;
    static ObjectInputStream entrada;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelCamposMensagens;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMensagensRecebidas;
    private javax.swing.JTextField jTextFielIp;
    private javax.swing.JTextField jTextFieldApelido;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextField jTextFieldTextoMensagem;
    // End of variables declaration//GEN-END:variables
}
