package question1;

/**
 * The type Multiplication.
 */
public class Multiplication extends Binaire
{
    /**
     * Instantiates a new Multiplication.
     *
     * @param op1 the op 1
     * @param op2 the op 2
     */
    public Multiplication(Expression op1, Expression op2)
    {
        super(op1, op2);
    }

    public String toString()
    {
        return "(" + op1.toString() + " * " + op2.toString() + ")";
    }

    @Override
    public Integer interprete()
    {
        return op1.interprete() * op2.interprete();
    }
}