package week7.task1;

public class ExpressionTest {
    public static void main(String[] args){
        Expression x1 = new Square(new Numeral(10));
        Expression x2 = new Subtraction(x1, new Numeral(1));
        Expression x3 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression x4 = new Addition(x2, x3);
        Expression x5 = new Square(x4);

        try{
            Expression x = new Division(new Numeral(11), new Numeral(0));
            System.out.println(x.evaluate());
        }catch(ArithmeticException ex){
            System.out.println("Loi chia cho 0");
        }

        System.out.println(x5.toString() + "=" + x5.evaluate());
    }
}
