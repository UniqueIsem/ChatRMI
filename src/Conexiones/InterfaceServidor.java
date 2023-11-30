
package Conexiones;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServidor extends Remote {
    //Pondremos todos los metodos que queremos que se compartan entre si (Cliente-servidor por RMI):
    void RegistrarCliente(InterfaceCliente cliente, String NombreUsuario) throws RemoteException;
    void mensajesBroadcast(String Mensaje_Grupal) throws RemoteException;//Necesitamos una funcion para enviar mensajes a todos
    void mensajesPrivados(String emisor, String receptor, String Mensaje_Privado) throws RemoteException;//Necesitamos una funcion que envie mensajes PRIVADOS.
    void SalirCliente(InterfaceCliente cliente, String NombreUsuario) throws RemoteException; //Para cuando el cliente neccesite salir del chat.
}
