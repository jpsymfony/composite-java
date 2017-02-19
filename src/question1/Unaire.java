package question1;

/**
 * The type Unaire.
 */
public abstract class Unaire extends Expression
{
    /**
     * The Op.
     */
    protected Expression op;

    /**
     * Instantiates a new Unaire.
     *
     * @param op the op
     */
    public Unaire(Expression op)
    {
        this.op = op;
    }
}