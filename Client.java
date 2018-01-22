import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
import java.util.*;

public class Client {

    /**
     * Runs the client as an application.  First it displays a dialog
     * box asking for the IP address or hostname of a host running
     * the date server, then connects to it and displays the date that
     * it serves.
     */
    public static void main(String[] args) throws IOException {
        String serverAddress = JOptionPane.showInputDialog(
            "Enter IP Address of a machine that is\n" +
            "running the date service on port 9090:");
        Socket s = new Socket(serverAddress, 9090);
        Scanner scan = new Scanner(System.in);
        Message message = new Message();
        System.out.println("Type in your name");
        message.setFrom(scan.nextLine());
        System.out.println("Type in recipient's name");
        message.setTo(scan.nextLine());
        System.out.println("Type in title");
        message.setTitle(scan.nextLine());
        System.out.println("Type in content");
        message.setContent(scan.nextLine());
        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        os.writeObject(message);
        scan.close();
        s.close();
        System.exit(0);
    }

}