package question1;

/**
 * The type Soustraction.
 */
public class Soustraction extends Binaire
{
    /**
     * Instantiates a new Soustraction.
     *
     * @param op1 the op 1
     * @param op2 the op 2
     */
    public Soustraction(Expression op1, Expression op2)
    {
        super(op1, op2);
    }

    public String toString()
    {
        return "(" + op1.toString() + " - " + op2.toString() + ")";
    }

    @Override
    public Integer interprete()
    {
        return op1.interprete() - op2.interprete();
    }
}