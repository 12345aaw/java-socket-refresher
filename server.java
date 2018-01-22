import java.io.*;
import java.net.*;
import java.util.Date;

public class server {
    
    /**
     * Runs the server.
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket listener = new ServerSocket(9090);
        try {
            while (true) {
                Socket socket = listener.accept();
                try {
                    //ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream is = new ObjectInputStream(socket.getInputStream());

                    Message m = (Message) is.readObject();
                    System.out.println(m.toString());

                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }

}