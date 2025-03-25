import com.example.KiemThu2.TinhThuong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestThuong {
    TinhThuong thuong = new TinhThuong();
    @Test
    void test1(){assertEquals(2,thuong.Thuong(2,1));}
    @Test
    void test2(){assertEquals(0.5,thuong.Thuong(1,2));}
    @Test
    void test3(){assertEquals(1,thuong.Thuong(1,1));}
    @Test
    void test4(){assertEquals(0,thuong.Thuong(0,1));}
    @Test
    void test5(){assertEquals(-1,thuong.Thuong(1,-1));}
    @Test
    void test6(){assertEquals(5,thuong.Thuong(5,1));}
    @Test
    void test7(){assertEquals(6,thuong.Thuong(12,2));}
    @Test
    void test8(){assertEquals(50,thuong.Thuong(100,2));}
    @Test
    void test9(){assertEquals(0.5,thuong.Thuong(10,20));}
    @Test
    void test10(){assertEquals(ArithmeticException.class,thuong.Thuong(1,0));}
}
