package JavaOOPSconcepts;

import org.junit.Test;

public class AT08_Polymorphism_MethodOverLoading01 {


    public void SumOfNum(){
        int i=10;
        int j=20;
        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }

    public void SumOfNum(int i){
        int j=20;
        int M =i+j;
        System.out.println("This is SumOfNum Second Method value : " + M);
    }

    public void SumOfNum(int i,int j){
        int M =i+j;
        System.out.println("This is SumOfNum Third Method value : " + M);
    }

}
