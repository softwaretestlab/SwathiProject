package LoopsNConditionalStatments;

import org.junit.Test;

public class AT05_ElseIf {
    @Test
    public void ElseIfLoopLearn(){
        String browser ="FIREFOXr";
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Test cases will be executed on chrome");
        }
        else if(browser.equalsIgnoreCase("IE")){
            System.out.println("Test cases will be executed on IE");
        }
        else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Test cases will be executed on FIREFOX");
        }
        else{
            System.out.println("Browser is not in the list");
        }
    }
}
