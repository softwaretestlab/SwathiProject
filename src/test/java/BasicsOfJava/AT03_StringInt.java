package BasicsOfJava;

import org.junit.Test;

public class AT03_StringInt {

    @Test
    public void test03() {
        //declare local variables
        int i=10;
        int j=20;
        int k =i+j;
        System.out.println("Value of K is : "+k);
        System.out.println("Total Value is : "+(i+j));
    }

    @Test
    public void test04() {
        //declare local variables
        String test01="Software";
        String test02="TestLab";
        String test03=test01+test02;
        System.out.println("Value of test03 is : "+test03);
           }

}
