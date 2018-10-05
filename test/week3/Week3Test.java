package week3;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Test;

public class Week3Test {
    @Test
    // TODO: Viết 5 testcase cho phương thức max()
    public void test() {
        int x1;
        x1 = Week3.max(3, 4);
        Assert.assertEquals(4, x1);
    }
    @Test
    public void test01() {
        int x1;
        x1 = Week3.max(5, 2);
        Assert.assertEquals(5, x1);
    }
    @Test
    public void test02() {
        int x1;
        x1 = Week3.max(-3, 4);
        Assert.assertEquals(4, x1);
    }
    @Test
    public void test03() {
        int x1;
        x1 = Week3.max(3, -4);
        Assert.assertEquals(3, x1);
    }
    @Test
    public void test04() {
        int x1;
        x1 = Week3.max(5, 4);
        Assert.assertEquals(5, x1);
    }





    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void test1(){
        int[] a1= {1, 2, 4, 3};
        Assert.assertEquals(1, Week3.minOfArray(a1));

    }
    @Test
    public void test11(){
        int[] a2= {-1, 0, 5, 4, 2, 3, 1};
        Assert.assertEquals(-1, Week3.minOfArray(a2));
    }
    @Test
    public void test12(){
        int[] a2= {10, 4, 2, 3, 1};
        Assert.assertEquals(10, Week3.minOfArray(a2));
    }
    @Test
    public void test13(){
        int[] a3= {12, 10, 1, -18, 200};
        Assert.assertEquals(1, Week3.minOfArray(a3));
    }
    @Test
    public void test14(){
        int[] a2= {19, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assert.assertEquals(1, Week3.minOfArray(a2));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test

    public void test2(){
        String x= "Thiếu cân";
        Assert.assertEquals(x, Week3.calculateBMI(41.0, 1.60));
    }
    @Test
    public void test21(){
        String x= "Thiếu cân";
        Assert.assertEquals(x, Week3.calculateBMI(43.0, 1.60));
    }
    @Test
    public void test22(){
        String x= "Thiếu cân";
        Assert.assertEquals(x, Week3.calculateBMI(41.0, 1.50));
    }
    @Test
    public void test23(){
        String x= "Bình thường";
        Assert.assertEquals(x, Week3.calculateBMI(43.0, 1.50));
    }
    @Test
    public void test24(){
        String x= "Bình thường";
        Assert.assertEquals(x, Week3.calculateBMI(50.0, 1.50));
    }

}
