package week7.task1;

public class Numeral extends Expression{
    private int value;
    public Numeral(int n){
        this.value= n;
    }
    public Numeral(){

    }

    @Override
    public String toString() {
        return "" + this.value;
    }

    @Override
    public int evaluate() {
        return this.value;
    }
}
