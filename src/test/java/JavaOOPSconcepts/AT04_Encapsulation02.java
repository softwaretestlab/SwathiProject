package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {

    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.envMethod01(10,20);
        obj.envMethod01(190,210);

        // here we are using the value from return statement into code
       int a = obj.envMethod02(50,60);
       int z = a*20;
       System.out.println(" value of a is : "+z);

    }
}
