package question1;

/**
 * The type Division.
 */
public class Division extends Binaire
{
    /**
     * Instantiates a new Division.
     *
     * @param op1 the op 1
     * @param op2 the op 2
     */
    public Division(Expression op1, Expression op2)
    {
        super(op1, op2);
    }

    public String toString()
    {
        return "(" + op1.toString() + " / " + op2.toString() + ")";
    }

    @Override
    public Integer interprete()
    {
        return op1.interprete() / op2.interprete();
    }
}