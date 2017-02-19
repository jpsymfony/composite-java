package question3;

import question1.Addition;
import question1.Constante;

import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The type Client expression.
 */
public class ClientExpression
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception
    {
        // ouverture d'une connexion TCP
        Socket socket = new Socket("localhost", 5000);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        // envoi vers le serveur, d'une expression
        oos.writeObject(new Addition(new Constante(3), new Constante(2)));

        // lecture du resultat retourne
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        System.out.println("le serveur retourne : " + ois.readObject());

        socket.close();
    }
}
