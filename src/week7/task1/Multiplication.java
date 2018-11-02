package week7.task1;

public class Multiplication extends Expression{
    Expression left;
    Expression right;
    public Multiplication(Expression left, Expression right){
        this.left= left;
        this.right= right;
    }

    public Expression left() {
        return this.left;
    }


    public Expression right() {
        return this.right;
    }

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString()+"*"+right.toString();
    }
}
