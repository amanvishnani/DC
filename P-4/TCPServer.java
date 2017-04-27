import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by AHMED on 20-04-2017.
 */
public class TCPServer {
    public static void main(String... args) {

        DataInputStream dataInputStream;
        DataOutputStream dataOutputStream;
        BufferedReader bufferedReader;
        Socket sock;
        ServerSocket server;

        System.out.println("Starting server...");
        try {
            server = new ServerSocket(1234);
            System.out.println("Server started successfully.");
            sock = server.accept();
            System.out.println("Waiting for Client....");
            dataOutputStream = new DataOutputStream(sock.getOutputStream());
            dataInputStream = new DataInputStream(sock.getInputStream());
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String getMsg = dataInputStream.readUTF();
                System.out.println("Client Msg : " + getMsg);
                System.out.print("Your Msg : ");
                String inputMsg = bufferedReader.readLine();
                dataOutputStream.writeUTF(inputMsg);
            }
        } catch (Exception e) {
            System.out.println("Unable to start server\n" + e.getMessage());
        }

    }
}
