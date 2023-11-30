package Conexiones;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class ChatServer extends UnicastRemoteObject implements InterfaceServidor {

    private Map<String, InterfaceCliente> clients;

    public ChatServer() throws RemoteException {
        clients = new HashMap<>();
    }

    @Override
    public void RegistrarCliente(InterfaceCliente client, String username) throws RemoteException {
        // Manejar el caso donde dos clientes tienen el mismo nombre de usuario
        if (!clients.containsKey(username)) {
            clients.put(username, client);
            mensajesBroadcast(username + " has entered the chat." + "\n");
        } else {
            // Manejar el caso de nombre de usuario duplicado
            client.recibirMensajes("Username already exists. Choose anotherone please.");
        }
    }

    @Override
    public void mensajesBroadcast(String groupMsg) throws RemoteException {
        //Tenemos que hacer una funcion para que TODOS los clientes reciban ese mensaje en consola!
        for (InterfaceCliente cliente : clients.values()) {
            cliente.recibirMensajes(groupMsg);
        }
    }

    @Override
    public void mensajesPrivados(String emisor, String receptor, String privateMsg) throws RemoteException {
        InterfaceCliente cliente = clients.get(receptor);

        if (cliente != null) {
            // Validar si el emisor existe en la lista de clientes
            if (clients.containsKey(emisor)) {
                cliente.recibirMensajes("<" + emisor + ">" + " send you a private message: " + privateMsg);
            } else {
                cliente.recibirMensajes("Private message attempt from an invalid user.");
            }
        }
    }

    @Override
    public void SalirCliente(InterfaceCliente cliente, String NombreUsuario) throws RemoteException {
        if (clients.containsKey(NombreUsuario)) {
            clients.remove(NombreUsuario, cliente);
            mensajesBroadcast(NombreUsuario + " left the chat." + "\n");
        }
    }

    public void EstablecerConexion(String ip) {
        try {
            InterfaceServidor interfaceServidor = new ChatServer();
            LocateRegistry.createRegistry(6969);
            java.rmi.Naming.rebind("//" + ip + ":6969/InterfazServidor", interfaceServidor);
            System.out.println("Server " + ip + " working");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
