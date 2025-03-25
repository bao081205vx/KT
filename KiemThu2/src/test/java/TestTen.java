import com.example.KiemThu2.TruyXuatDoiTuong;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTen {
    @Test
    void test1(){
        TruyXuatDoiTuong truyXuatDoiTuong = new TruyXuatDoiTuong("ten");
        assertEquals("ten",truyXuatDoiTuong.ten());
    }
    @Test
    void test2(){
        TruyXuatDoiTuong truyXuatDoiTuong = new TruyXuatDoiTuong(null);
        assertEquals(NullPointerException.class,truyXuatDoiTuong.ten());
    }
}
