package LoopsNConditionalStatments;

import org.junit.Test;

public class AT06_SwitchStatement {
    @Test
    public void SwitchStatmentLearn() {
        switch (3){
            case 1:
                System.out.println("1st one selected");
                break;
            case 2:
                System.out.println("2nd one selected");
                break;
            case 3:
                System.out.println("3rd one selected");
                break;
            default:
                System.out.println("none selected");
        }
    }
}
