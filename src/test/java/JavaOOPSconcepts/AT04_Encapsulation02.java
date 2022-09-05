package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {

    @Test
    public void envMethod03(){

        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.envMethod01(10,20);
        obj.envMethod01(20,20);
        //usage of return value
       int m=  obj.envMethod02(50,60);
       int x = m+20;
        System.out.println("x value is " + x);

    }
}
