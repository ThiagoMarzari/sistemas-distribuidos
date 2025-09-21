
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ServidorTCPInterface extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ServidorTCPInterface.class.getName());

    private ArrayList<Pessoa> listaClientes;
    private DefaultTableModel tableModel;

    public ServidorTCPInterface() {
        listaClientes = new ArrayList<>();
        initComponents();
        
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
    }

    private void abrirConexao() {
        int porta = Integer.parseInt(jTextFieldPorta.getText());
        new Thread(() -> iniciarServidor(porta)).start();
    }

    private void iniciarServidor(int porta) {
        try {
            ServerSocket servidor = new ServerSocket(porta);
            System.out.println("Servidor ouvindo a porta: " + porta);

            while (true) {
                Socket cliente = servidor.accept();  // Bloqueia até que um cliente se conecte
                String enderecoIP = cliente.getInetAddress().getHostAddress();
                int portaCliente = cliente.getPort();
                System.out.println("Cliente conectado no IP: " + enderecoIP);
                System.out.println("Cliente conectado via porta: " + portaCliente);

                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                String nomePessoa = (String) entrada.readObject();

                // Gera o e-mail a partir do nome
                String[] vetorNome = nomePessoa.split(" ");
                String email = vetorNome[0] + "." + vetorNome[vetorNome.length - 1] + "@ufn.edu.br";
                nomePessoa = nomePessoa.toUpperCase();
                email = email.toLowerCase();

                Pessoa p = new Pessoa(nomePessoa, email);
                boolean encontrado = listaClientes.contains(p);

                if (!encontrado) {
                    listaClientes.add(p);
                    System.out.println("Novo cliente adicionado: " + p);
                    atualizarTabela(p);
                }

                // Envia o objeto de volta para o cliente
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                if (!encontrado) {
                    saida.writeObject(p);  // Envia a pessoa criada se não estiver na lista
                } else {
                    saida.writeObject(null);  // Envia null se já estiver na lista
                }

                saida.close();
                cliente.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro no servidor: " + e.getMessage());
        }
    }

    private void atualizarTabela(Pessoa pessoa) {
        tableModel.addRow(new Object[]{pessoa.getNome(), pessoa.getEmail()});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jButtonAbrirConexao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Porta:");

        jButtonAbrirConexao.setText("Abrir conexão");
        jButtonAbrirConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirConexaoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAbrirConexao))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrirConexao))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbrirConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirConexaoActionPerformed
        abrirConexao();
    }//GEN-LAST:event_jButtonAbrirConexaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ServidorTCPInterface().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirConexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldPorta;
    // End of variables declaration//GEN-END:variables
}
