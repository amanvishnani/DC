import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Math {

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public static void main(String... args) throws Exception {
        Server server = new Server();
        Math mathStub = (Math) UnicastRemoteObject.exportObject(server, 0);

        Registry registry = LocateRegistry.getRegistry();
        registry.bind("Math", mathStub);
        System.out.println("Server is ready to listen...");
    }

}