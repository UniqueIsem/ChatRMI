package Conexiones;

import javax.swing.JTextArea;
import java.rmi.Naming;
import java.rmi.RemoteException;

//Creamos una funcion publica para cuando se inicialice el cliente, se le asignen los datos que creo con anterioridad!
public class ChatClient {
    
    InterfaceServidor conexionServidor;

    public void ComenzarCliente(String NombreUsuario, JTextArea txtAreaChat, String direccion_IP) {
        try {
           // direccion_IP = "localhost";
            String direccion_URL = "//" + direccion_IP + ":6969/InterfazServidor";
            conexionServidor = (InterfaceServidor) Naming.lookup(direccion_URL);

            ClienteConectado interfaceCliente = new ClienteConectado(NombreUsuario, txtAreaChat);
            conexionServidor.RegistrarCliente(interfaceCliente, NombreUsuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviarMensajeGrupal(String mensaje_Grupal, String NombreUsuario) throws RemoteException {
        if (conexionServidor != null) {
            conexionServidor.mensajesBroadcast(NombreUsuario + ": " + mensaje_Grupal);
        } else {
            // Manejo de la situación en la que conexionServidor es nulo
        }
    }

    public void enviarMensajePrivado(String NombreUsuario, String NombreUsuarioPrivado, String MensajePrivado) throws RemoteException {
        if (conexionServidor != null) {
            conexionServidor.mensajesPrivados(NombreUsuario, NombreUsuarioPrivado, MensajePrivado);
        } else {
            // Manejo de la situación en la que conexionServidor es nulo
        }
    }
    
    public void CerrarCliente(String NombreUsuario, JTextArea txtAreaChat) throws RemoteException {
        ClienteConectado interfaceCliente = new ClienteConectado(NombreUsuario, txtAreaChat);
        conexionServidor.SalirCliente(interfaceCliente, NombreUsuario);
    }

}
