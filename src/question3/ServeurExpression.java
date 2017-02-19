package question3;

import question1.Expression;

import java.net.Socket;
import java.net.ServerSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * The type Serveur expression.
 */
/*
 * Attention : pour un bon fonctionnement, la question2 a ete completee, soumise, sans echec
 *
 */
public class ServeurExpression
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception
    {
        ServerSocket serveur = new ServerSocket(5000);
        while (true) {
            Socket socket = serveur.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Expression expr = (Expression) ois.readObject();
            System.out.println(expr);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(expr.interprete());

            socket.close();
        }
    }

}
