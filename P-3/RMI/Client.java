import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String... args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("localhost");
        Math math = (Math) registry.lookup("Math");

        System.out.println("Addition of 10 and 20 is       : " + math.add(10, 20));
        System.out.println("Subtraction of 10 and 20 is    : " + math.sub(10, 20));
        System.out.println("Multiplication of 10 and 20 is : " + math.mul(10, 20));
        System.out.println("Division of 10 and 20 is       : " + math.div(10, 20));

    }
}