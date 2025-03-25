import com.example.KiemThu2.TinhTich;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTich {
    TinhTich tinhTich = new TinhTich();
    @Test
    void test1(){
        assertEquals(12,tinhTich.TinhTich(3,4));
    }
    @Test
    void test2(){
        assertEquals(1,tinhTich.TinhTich(1,1));
    }
    @Test
    void test3(){
        assertEquals(-1,tinhTich.TinhTich(-1,1));
    }
    @Test
    void test4(){
        assertEquals(-1,tinhTich.TinhTich(1,-1));
    }
    @Test
    void test5(){
        assertEquals(0,tinhTich.TinhTich(0,1));
    }
    @Test
    void test6(){
        assertEquals(0,tinhTich.TinhTich(1,0));
    }
    @Test
    void test7(){
        assertEquals(3,tinhTich.TinhTich(-1,-3));
    }
    @Test
    void test8(){
        assertEquals(888,tinhTich.TinhTich(222,4));
    }
    @Test
    void test9(){
        assertEquals(ArithmeticException.class,tinhTich.TinhTich(2.5 ,1));
    }
    @Test
    void test10(){
        assertEquals(ArithmeticException.class,tinhTich.TinhTich(2 ,1.5));
    }
}
