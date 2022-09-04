package LoopsNConditionalStatments;

import org.junit.Test;

public class AT04_IfElse {
    @Test
    public void IfElseLoopLearn() {
        String browser = "CHRdOME";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Test cases will be executed on chrome");
        }
        else{
            System.out.println("Test cases will not execute on chrome");
        }
    }
}
