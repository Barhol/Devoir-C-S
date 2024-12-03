package cs;



import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
        	  Socket clientSocket = serverSocket.accept();
          

      
            System.out.println(" Le client est  connecté.");

           
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

          
            output.println("Veuillez saisir votre email :");
            String email = input.readLine();

           
            output.println("Veuillez saisir votre mot de passe :");
            String password = input.readLine();

            
            output.println("Bon, " + email + ". Vous êtes connecté !");
            System.out.println("Le client connecté avec l'email : " + email);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}