package question1;

/**
 * The type Constante.
 */
public class Constante extends Expression
{
    private Integer i;

    /**
     * Instantiates a new Constante.
     *
     * @param i the
     */
    public Constante(Integer i)
    {
        this.i = i;
    }

    /**
     * Valeur int.
     *
     * @return the int
     */
    public int valeur()
    {
        return i;
    }

    public String toString()
    {
        return Integer.toString(i);
    }

    @Override
    public Integer interprete()
    {
        return valeur();
    }
}
