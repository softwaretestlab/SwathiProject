package LoopsNConditionalStatments;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn(){
        int ticket =74;
        do{
            System.out.println("Current ticket numebr : "+ticket);
            ticket++;
        }while(ticket<80);
    }
}
