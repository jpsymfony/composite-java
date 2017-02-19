package question1;

/**
 * The type Plus.
 */
public class Plus extends Unaire
{
    /**
     * Instantiates a new Plus.
     *
     * @param op the op
     */
    public Plus(Expression op)
    {
        super(op);
    }

    public String toString()
    {
        return "+" + op.toString();
    }

    @Override
    public Integer interprete()
    {
        return +op.interprete();
    }
}
