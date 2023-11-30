package Conexiones;

import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.rmi.RemoteException;

public class UIChatRMI extends javax.swing.JFrame {

    ChatServer chatServer;
    ChatClient chatClient;

    //Atributos necesarios:
    String username;

    public UIChatRMI() throws RemoteException {
        this.chatServer = new ChatServer();
        this.chatClient = new ChatClient();
        initComponents();

        btnSendGroupMsg.setEnabled(false);
        btnSendPrivMsg.setEnabled(false);
        txtAreaChat.setEnabled(false);
        txtMsg.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCreateServer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaChat = new javax.swing.JTextArea();
        btnRegisterUser = new javax.swing.JButton();
        btnSendGroupMsg = new javax.swing.JButton();
        btnSendPrivMsg = new javax.swing.JButton();
        txtMsg = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(800, 500));

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_chat_64px.png"))); // NOI18N
        lblTitulo.setText("CHAT RMI");
        pnlFondo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        btnCreateServer.setBackground(new java.awt.Color(51, 51, 51));
        btnCreateServer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreateServer.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateServer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_add_server_32px.png"))); // NOI18N
        btnCreateServer.setText("Create Server");
        btnCreateServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateServerActionPerformed(evt);
            }
        });
        pnlFondo.add(btnCreateServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 200, -1));

        txtAreaChat.setColumns(20);
        txtAreaChat.setRows(5);
        jScrollPane1.setViewportView(txtAreaChat);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 410, 370));

        btnRegisterUser.setBackground(new java.awt.Color(51, 51, 51));
        btnRegisterUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegisterUser.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_add_user_32px.png"))); // NOI18N
        btnRegisterUser.setText("Add User To Chat");
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegisterUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, -1));

        btnSendGroupMsg.setBackground(new java.awt.Color(51, 51, 51));
        btnSendGroupMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_send_32px.png"))); // NOI18N
        btnSendGroupMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendGroupMsgActionPerformed(evt);
            }
        });
        pnlFondo.add(btnSendGroupMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 50, 50));

        btnSendPrivMsg.setBackground(new java.awt.Color(51, 51, 51));
        btnSendPrivMsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSendPrivMsg.setForeground(new java.awt.Color(255, 255, 255));
        btnSendPrivMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_private_chat_32px.png"))); // NOI18N
        btnSendPrivMsg.setText("Send Private Message");
        btnSendPrivMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendPrivMsgActionPerformed(evt);
            }
        });
        pnlFondo.add(btnSendPrivMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 240, 50));
        pnlFondo.add(txtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 410, 50));

        btnExit.setBackground(new java.awt.Color(51, 51, 51));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_exit_32px.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlFondo.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 40, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fondo.jpg"))); // NOI18N
        pnlFondo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateServerActionPerformed
        try {
            String Ip = JOptionPane.showInputDialog(rootPane, "Enter the new server IP...", "Server", JOptionPane.INFORMATION_MESSAGE);
            chatServer.EstablecerConexion(Ip);
            JOptionPane.showMessageDialog(rootPane, "Succesfull server connection...");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnCreateServerActionPerformed

    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
        String Ip = JOptionPane.showInputDialog(rootPane, "Enter server IP", "New User", JOptionPane.INFORMATION_MESSAGE);
        username = JOptionPane.showInputDialog(rootPane, "Select an username: ", "New User", JOptionPane.INFORMATION_MESSAGE);
        chatClient = new ChatClient();
        chatClient.ComenzarCliente(username, txtAreaChat, Ip);
        btnSendGroupMsg.setEnabled(true);
        btnSendPrivMsg.setEnabled(true);
        txtMsg.setEnabled(true);
    }//GEN-LAST:event_btnRegisterUserActionPerformed

    private void btnSendGroupMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendGroupMsgActionPerformed
        if (!txtMsg.getText().isEmpty()) {
            String message = txtMsg.getText();

            try {
                chatClient.enviarMensajeGrupal(message, username);
                cleanArea();
            } catch (RemoteException ex) {
                Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSendGroupMsgActionPerformed

    private void btnSendPrivMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendPrivMsgActionPerformed
        if (!txtMsg.getText().isEmpty()) {

            String Usuario_ReceptorPrivado = JOptionPane.showInputDialog(rootPane, "Enter the username you want to send a private message to", "Client", HEIGHT);
            try {
                chatClient.enviarMensajePrivado(username, Usuario_ReceptorPrivado, txtMsg.getText());
                cleanArea();
            } catch (RemoteException ex) {
                Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Write a message first");
        }
    }//GEN-LAST:event_btnSendPrivMsgActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            chatClient.CerrarCliente(username, txtAreaChat);
            btnSendGroupMsg.setEnabled(false);
            btnSendPrivMsg.setEnabled(false);
            txtAreaChat.setEnabled(false);
            txtMsg.setEnabled(false);
            this.dispose();
        } catch (RemoteException ex) {
            Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void cleanArea() {
        txtMsg.setText("");
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UIChatRMI().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(UIChatRMI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateServer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JButton btnSendGroupMsg;
    private javax.swing.JButton btnSendPrivMsg;
    private javax.swing.JLabel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextArea txtAreaChat;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables
}
