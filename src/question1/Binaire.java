package question1;

/**
 * The type Binaire.
 */
public abstract class Binaire extends Expression
{
    /**
     * The Op 1.
     */
    protected Expression op1;
    /**
     * The Op 2.
     */
    protected Expression op2;

    /**
     * Instantiates a new Binaire.
     *
     * @param op1 the op 1
     * @param op2 the op 2
     */
    public Binaire(Expression op1, Expression op2)
    {
        this.op1 = op1;
        this.op2 = op2;
    }
}