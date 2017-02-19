package question1;

/**
 * The type Addition.
 */
public class Addition extends Binaire
{
    /**
     * Instantiates a new Addition.
     *
     * @param op1 the op 1
     * @param op2 the op 2
     */
    public Addition(Expression op1, Expression op2)
    {
        super(op1, op2);
    }

    public String toString()
    {
        return "(" + op1.toString() + " + " + op2.toString() + ")";
    }

    @Override
    public Integer interprete()
    {
        return op1.interprete() + op2.interprete();
    }
}