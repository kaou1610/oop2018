package week7.task1;

public class Division extends Expression{
    Expression left;
    Expression right;
    public Division(Expression left, Expression right){
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
        /*try{
            int x= this.left.evaluate()/this.right.evaluate();
            return x;
        }
        catch (ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
        return 0;*/
        return left.evaluate()/right.evaluate();
    }

    @Override
    public String toString() {
        try{
            int x= this.left.evaluate()/this.right.evaluate();
            return "Gia tri cua bieu thuc: "+ x;
        }
        catch (ArithmeticException e){
            return  "Loi chia cho 0";
        }

        //return "("+left.toString()+"/"+right.toString()+")";
    }
}
