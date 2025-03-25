import com.example.KiemThu2.TrungBinhCong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTrungBinhCong {
    TrungBinhCong tbc = new TrungBinhCong();

    @Test
    void test1() {
        int[] n = {2, 2, 2};
        assertEquals(2, tbc.TBCong(n));
    }
    @Test
    void test2(){
        int[] n = {10};
        assertEquals(10,tbc.TBCong(n));
    }
    @Test
    void test3(){
        int[] n = {2,3,4,5};
        assertEquals(3.5,tbc.TBCong(n));
    }
    @Test
    void test4(){
        int[] n = {-1,-4,-5,-6};
        assertEquals(-4,tbc.TBCong(n));
    }
    @Test
    void test5(){
        int[] n = {1,1};
        assertEquals(1,tbc.TBCong(n));
    }
    @Test
    void test6(){
        int[] n = {0};
        assertEquals(0,tbc.TBCong(n));
    }
    @Test
    void test7(){
        int[] n = {10000,20000};
        assertEquals(15000,tbc.TBCong(n));
    }
    @Test
    void test8(){
        int[] n = {-1,1};
        assertEquals(0,tbc.TBCong(n));
    }
    @Test
    void test9(){
        int[] n = {2,2000};
        assertEquals(1001,tbc.TBCong(n));
    }
    @Test
    void test10(){
        int[] n ={};
        assertEquals(ArithmeticException.class,tbc.TBCong(n));
    }
}
