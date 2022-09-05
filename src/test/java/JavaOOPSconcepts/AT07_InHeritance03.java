package JavaOOPSconcepts;

import org.junit.Test;

public class AT07_InHeritance03 {
    @Test
    public void inhMethod05() {
        AT06_InHeritance02 obj = new AT06_InHeritance02();
        obj.inhMethod01(); //this method will come from parent
        obj.inhMethod02(); //this method will come from parent
        obj.inhMethod03(); //this method will come from child
        obj.inhMethod04(); //this method will come from child
    }
    @Test
    public void inhMethod06() {
//  As we called this method03 from parent, whatever the logic in it will be printed but it wont print logic from child(InHeritance02)- method03
        AT05_InHeritance01 obj = new AT05_InHeritance01();
        obj.inhMethod03();
    }
}
