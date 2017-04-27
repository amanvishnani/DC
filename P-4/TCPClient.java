import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by AHMED on 20-04-2017.
 */
public class TCPClient {
    public static void main(String... rgs) {

        DataInputStream dataInputStream;
        DataOutputStream dataOutputStream;
        BufferedReader bufferedReader;
        Socket sock;
        String addr;
        int port;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Server Address:");
        addr = scanner.next();

        System.out.print("Enter port number:");
        port = scanner.nextInt();

        System.out.println("Connecting to server.....");
        try {

            sock = new Socket(addr, port);
            System.out.println("Connected to " + addr);
            dataInputStream = new DataInputStream(sock.getInputStream());
            dataOutputStream = new DataOutputStream(sock.getOutputStream());
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Your Msg : ");
                String inputMsg = bufferedReader.readLine();
                dataOutputStream.writeUTF(inputMsg);
                String getMsg = dataInputStream.readUTF();
                System.out.println("Server Msg : " + getMsg);
            }
        } catch (Exception e) {
            System.out.println("Cannot connect to " + addr + "\n" + e.getMessage());
        }

    }
}
