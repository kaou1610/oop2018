package week7.task2;

import java.io.*;
import java.lang.reflect.Array;

public class Task2 {
    public void s() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }
    public void array() throws ArrayIndexOutOfBoundsException{
        int a[]={1, 2, 3, 4};
        System.out.println(a[5]);
    }
    public void Arithmetic() throws ArithmeticException{
        int a=10/0;
        System.out.println(a);
    }
    public void Class() throws ClassCastException{
        Object x = new Integer (0);
        System.out.println ((String) x);
    }
    public void IO() throws IOException{
        File f= new File("C:\\hsrvt.txt");
        FileReader fr= new FileReader(f);
        BufferedReader br= new BufferedReader(fr);

    }
    public void Filenotfound() throws FileNotFoundException {
        File f= new File("C:\\hsrvt.txt");
        FileReader fr= new FileReader(f);
        BufferedReader br= new BufferedReader(fr);
    }
    public static void main(String[] args){
        Task2 test= new Task2();
        try {
            test.s();
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        try {
            test.Arithmetic();
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        try {
            test.array();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        try {
            test.Class();
        }
        catch (ClassCastException e){
            System.out.println("ClassCastException");
        }
        try {
            test.IO();
        }
        catch (IOException e){
            System.out.println("IOException");
        }
        try {
            test.Filenotfound();
        }
        catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }
    }
}
