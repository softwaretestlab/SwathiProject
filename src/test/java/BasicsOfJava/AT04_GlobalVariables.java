package BasicsOfJava;

import org.junit.Test;

public class AT04_GlobalVariables {

    //global variables
    int i = 10;
    int j = 20;
    String abc = "testlab";

    @Test
    public void test05() {
        //local variables
        int l =30;
        int k = l+i+j;
        String CompanyName= "Software"+abc;
        System.out.println("Value of k is : "+k);
        System.out.println("Company Name is : "+CompanyName);

    }
    @Test
    public void test06() {

        System.out.println("abc value is : "+abc);
        System.out.println("total value is : "+(i+j));

    }

}
