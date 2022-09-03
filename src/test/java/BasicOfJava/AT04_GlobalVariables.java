package BasicOfJava;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables are created in the class level
    int i=10;
    int j=20;
    String name="SoftwareTestLab";

@Test
    public void test05(){
    int l =30;
    int k = l+i+j; //60
    System.out.println("Value of K is : "+k);
    }
    @Test
    public void test06(){
    String work = "ITconsulting";
        System.out.println("Total Value of i and j : "+(i+j)); //30
        System.out.println("Company name and its work : "+name+" "+work);

    }
}
