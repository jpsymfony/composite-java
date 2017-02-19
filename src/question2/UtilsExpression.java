package question2;

import question1.*;

import java.io.*;

/**
 * The type Utils expression.
 */
public class UtilsExpression
{
    /**
     * Sauvegarder.
     *
     * @param exp        the exp
     * @param nomfichier the nomfichier
     * @throws Exception the exception
     */
    public static void sauvegarder(Expression exp, String nomfichier) throws Exception
    {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(nomfichier));
            oos.writeObject(exp);
            oos.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.flush();
                } catch (IOException ioe) {
                }
                try {
                    oos.close();
                } catch (IOException ioe) {
                }
            }
        }
    }

    /**
     * Restituer expression.
     *
     * @param nomfichier the nomfichier
     * @return the expression
     * @throws Exception the exception
     */
    public static Expression restituer(String nomfichier) throws Exception
    {
        ObjectInputStream ois = null;
        Expression expression = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(nomfichier));
            expression = (Expression) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ioe) {
                }
            }
        }

        return expression;
    }
}
