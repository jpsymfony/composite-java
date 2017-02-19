package question1;

/**
 * The type Moins.
 */
public class Moins extends Unaire
{
    /**
     * Instantiates a new Moins.
     *
     * @param op the op
     */
    public Moins(Expression op)
    {
        super(op);
    }

    public String toString()
    {
        return "-" + op.toString();
    }

    @Override
    public Integer interprete()
    {
        return -op.interprete();
    }
}