package question1;

/**
 * The type Factoriel.
 */
public class Factoriel extends Unaire
{
    /**
     * Instantiates a new Factoriel.
     *
     * @param op the op
     */
    public Factoriel(Expression op)
    {
        super(op);
    }

    public String toString()
    {
        return op.toString() + "!";
    }

    private static Integer fact(int n)
    {
        if (n == 0) {
            return 1;
        } else {
            return n * (fact(n - 1));
        }
    }

    @Override
    public Integer interprete()
    {
        return fact(op.interprete());
    }
}
