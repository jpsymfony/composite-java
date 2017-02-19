package question2;

import question1.*;


/**
 * The type Utils expression test.
 */
public class UtilsExpressionTest extends junit.framework.TestCase
{
    // Definissez ici les variables d'instance necessaires a vos engagements;
    // Vous pouvez egalement les saisir automatiquement du presentoir
    // a l'aide du menu contextuel "Presentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du presentoir (les objets sans constructeur, comme int, float, etc.).


    /**
     * Constructeur de la classe-test UtilsExpressionTest
     */
    public UtilsExpressionTest()
    {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Methode appelee avant chaque appel de methode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements

    }

    /**
     * Supprime les engagements
     * <p>
     * Methode appelee apres chaque appel de methode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        //Liberez ici les ressources engagees par setUp()
    }

    /**
     * Il ne vous reste plus qu'a definir une ou plusieurs methodes de test.
     * Ces methodes doivent verifier les resultats attendus a l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient debuter par "test".
     * Vous pouvez ebaucher le corps grâce au menu contextuel "Enregistrer une methode de test".
     *
     * @throws Exception the exception
     */
    public void test_sauvegarde_et_restitution() throws Exception
    {
        String nom = "test_expression.ser";
        Expression expr = new Multiplication(new Constante(3), new Constante(2));
        assertEquals(" 3*2 != 6 ???", 6, expr.interprete().intValue());
        UtilsExpression.sauvegarder(expr, nom);

        expr = null;
        expr = UtilsExpression.restituer(nom);
        assertNotNull("pas de restitution ?", expr);
        assertTrue(" restitution en echec ???", expr.interprete().intValue() == 6);
    }
}
