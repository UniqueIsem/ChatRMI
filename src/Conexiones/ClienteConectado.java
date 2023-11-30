package Conexiones;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ClienteConectado extends UnicastRemoteObject implements InterfaceCliente {

    private final JTextArea txtAreaChat;
    private final String username;

    public ClienteConectado(String NombreUsuario, JTextArea txtAChat) throws RemoteException {
        this.username = NombreUsuario;
        this.txtAreaChat = txtAChat;
    }

    @Override
    public void recibirMensajes(String recivedMessage) throws RemoteException {
        SwingUtilities.invokeLater(() -> {
            if (txtAreaChat != null) {
                txtAreaChat.append(recivedMessage + "\n");
            } else {
                System.out.println("txtAreaChat not set for user: " + username);
                // Puedes mostrar un mensaje de error adicional o realizar alguna acción específica.
            }
        });
    }

    @Override
    public String getNombreUsuario() throws RemoteException {
        return username;
    }
}
