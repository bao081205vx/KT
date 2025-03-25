import com.example.KiemThu2.TruyXuat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTruyXuat {
    TruyXuat truyXuat = new TruyXuat();
    @Test
    void test1(){
        int[] n = {1,2,3,4,5};
        assertEquals(1,truyXuat.getElementAtIndex(n,0));
    }
    @Test
    void test2(){
        int[] n = {1,2,3,4,5};
        assertEquals(4,truyXuat.getElementAtIndex(n,3));
    }
    @Test
    void test3(){
        int[] n = {1,2,3,4,5};
        assertEquals(5,truyXuat.getElementAtIndex(n,4));
    }
    @Test
    void test4(){
        int[] n = {1,2,3,4,5};
        assertEquals(ArrayIndexOutOfBoundsException.class,truyXuat.getElementAtIndex(n,-1));
    }
    @Test
    void tes5(){
        int[] n = {1,2,3,4,5};
        assertEquals(ArrayIndexOutOfBoundsException.class,truyXuat.getElementAtIndex(n,5));
    }
}
