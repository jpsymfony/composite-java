package question1;


/**
 * The type Test global.
 */
public class TestGlobal extends junit.framework.TestCase
{
    /**
     * Test une constante.
     */
    public void test_UneConstante()
    {
        Expression expr = new Constante(3);
        assertEquals(3, expr.interprete().intValue());
    }

    /**
     * Test une addition 1.
     */
    public void test_UneAddition1()
    {
        Expression expr = new Addition(new Constante(3), new Constante(2));
        assertEquals(" 3+2 != 5 ???", 5, expr.interprete().intValue());
    }

    /**
     * Test une addition 2.
     */
    public void test_UneAddition2()
    {
        Expression expr = new Addition(new Constante(3), new Addition(new Constante(3), new Constante(6)));
        assertEquals(" 3+9 != 12 ???", 12, expr.interprete().intValue());
    }

    /**
     * Test une addition 3.
     */
    public void test_UneAddition3()
    {
        Expression expr1 = new Constante(5);
        Expression expr2 = new Plus(expr1);
        assertEquals(" 5 != 5 ???", 5, expr2.interprete().intValue());

        Expression expr3 = new Addition(expr1, expr2);
        assertEquals(" 5+5 != 10 ???", 10, expr3.interprete().intValue());
    }

    /**
     * Test une soustraction 1.
     */
    public void test_UneSoustraction1()
    {
        Expression expr = new Soustraction(new Constante(3), new Constante(2));
        assertEquals(" 3-2 != 1 ???", 1, expr.interprete().intValue());
    }

    /**
     * Test une soustraction 2.
     */
    public void test_UneSoustraction2()
    {
        Expression expr1 = new Constante(5);
        Expression expr2 = new Moins(expr1);
        Expression expr3 = new Addition(expr1, expr2);
        assertEquals(" 5-5 != 0 ???", 0, expr3.interprete().intValue());
    }

    /**
     * Test une multiplication 1.
     */
    public void test_UneMultiplication1()
    {
        Expression expr = new Multiplication(new Constante(3), new Constante(2));
        assertEquals(" 3x2 != 6 ???", 6, expr.interprete().intValue());
    }

    /**
     * Test une division 1.
     */
    public void test_UneDivision1()
    {
        Expression expr = new Division(new Constante(3), new Constante(2));
        assertEquals(" 3/2 != 1 ???", 1, expr.interprete().intValue());
    }

    /**
     * Test une division 2.
     */
    public void test_UneDivision2()
    {
        Expression expr1 = new Constante(5);
        Expression expr2 = new Plus(expr1);
        Expression expr = new Division(expr1, new Constante(2));
        assertEquals(" 5/2 != 2 ???", 2, expr.interprete().intValue());
    }

    /**
     * Test une factorielle 1.
     */
    public void test_UneFactorielle1()
    {
        Expression expr = new Factoriel(new Constante(3));
        assertEquals(" fact(3) != 6 ???", 6, expr.interprete().intValue());
    }

    /**
     * Test une factorielle 2.
     */
    public void test_UneFactorielle2()
    {
        Expression expr1 = new Factoriel(new Constante(3));
        Expression expr2 = new Multiplication(expr1, new Constante(2));
        assertEquals(" fact(3)*2 != 12 ???", 12, expr2.interprete().intValue());
    }

    /**
     * Test une factorielle 3.
     */
    public void test_UneFactorielle3()
    {
        Expression expr1 = new Factoriel(new Constante(3));
        Expression expr2 = new Moins(expr1);
        Expression expr3 = new Multiplication(expr2, new Constante(2));
        assertEquals(" fact(-3)*2 != -12 ???", -12, expr3.interprete().intValue());
    }

    /**
     * Test une factorielle 4.
     */
    public void test_UneFactorielle4()
    {
        Expression expr1 = new Factoriel(new Constante(3));
        Expression expr2 = new Factoriel(expr1);
        assertEquals(" fact(fact(3)) != 720 ???", 720, expr2.interprete().intValue());
    }
}
