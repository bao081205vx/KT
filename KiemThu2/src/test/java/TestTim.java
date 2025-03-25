import com.example.KiemThu2.TimPhanTu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTim {
    TimPhanTu timPhanTu = new TimPhanTu();
    @Test
    void test1(){
        int[] n = {2,4,1,6,4};
        assertEquals(1,timPhanTu.PhanTu(n));
    }
    @Test
    void test2(){
        int[] n = {0,1,2};
        assertEquals(0,timPhanTu.PhanTu(n));
    }
    @Test
    void test3(){
        int[] n = {0,2,-1,3};
        assertEquals(-1,timPhanTu.PhanTu(n));
    }
    @Test
    void test4(){
        int[] n = {200,394,203,183};
        assertEquals(183,timPhanTu.PhanTu(n));
    }
    @Test
    void test5(){
        int[] n = {};
        assertEquals(ArithmeticException.class,timPhanTu.PhanTu(n));
    }
}
