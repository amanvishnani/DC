import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Math extends Remote {
    double add(double a, double b) throws RemoteException;
    double sub(double a, double b) throws RemoteException;
    double mul(double a, double b) throws RemoteException;
    double div(double a, double b) throws RemoteException;
}