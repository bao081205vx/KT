import com.example.KT4.SinhVien;
import com.example.KT4.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSinhVien {
    SinhVienService sinhVienService;
    @BeforeEach
    public void setup() {
        sinhVienService = new SinhVienService();
    }
    @Test
    public void testADDSV(){
        SinhVien sv = new SinhVien(1,"Bao","A20","K19","java");
        sinhVienService.add(sv);
        assertEquals(1,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV1(){
        SinhVien sv = new SinhVien(2,"Bao","A20","K19","java");
        sinhVienService.add(sv);
        assertEquals(1,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV2(){
        SinhVien sv = new SinhVien(2,"Bao","A20","K19","java");
        SinhVien sv1 = new SinhVien(2,"Bao","A20","K19","java");
        sinhVienService.add(sv);
        sinhVienService.add(sv1);
        assertEquals(IllegalArgumentException.class,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV3(){
        SinhVien sv = new SinhVien(2,"Bao","A202","K19","java");
        sinhVienService.add(sv);
        assertEquals(1,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV4(){
        SinhVien sv = new SinhVien(2,"Bao","A203","K19","java");
        sinhVienService.add(sv);
        assertEquals(1,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV5(){
        SinhVien sv = new SinhVien(2,"Bao1","A20","K19","java");
        SinhVien sv1 = new SinhVien(1,"Bao1","A20","K19","java");
        sinhVienService.add(sv);
        sinhVienService.add(sv1);
        assertEquals(2,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV6(){
        SinhVien sv = new SinhVien(10,"Bao","A20","K19","java");
        sinhVienService.add(sv);
        assertEquals(1,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV7(){
        SinhVien sv = new SinhVien(2000,"Bao","A20","K19","java");
        sinhVienService.add(sv);
        assertEquals(1,sinhVienService.getListSV().size());
    }
    @Test
    public void testADDSV8(){
        SinhVien sv = new SinhVien(0,"Bao","A20","K19","java");
        sinhVienService.add(sv);
        assertEquals(1,sinhVienService.getListSV().size());
    }
    @Test
    public void testSearchByMaSVValid() {
        SinhVien sv1 = new SinhVien(1, "Bao ", "A200", "K19", "Java");
        sinhVienService.add(sv1);

        SinhVien sv2 = new SinhVien(2, "Duc", "D200", "K19", "Web");
        sinhVienService.add(sv2);
        List<SinhVien> result = sinhVienService.searchByMaSV(1);
        assertEquals(1, result.size());
    }
    @Test
    public void testSearchByMaSVValid2() {
        SinhVien sv1 = new SinhVien(1, "Bao ", "A200", "K19", "Java");
        sinhVienService.add(sv1);
        List<SinhVien> result = sinhVienService.searchByMaSV(2);
        assertEquals(1, result.size());
    }
    @Test
    public void testSearchByMaSVValid3() {
        SinhVien sv1 = new SinhVien(1, "Bao ", "A200", "K19", "Java");
        sinhVienService.add(sv1);

        SinhVien sv2 = new SinhVien(2, "Duc", "D200", "K19", "Web");
        sinhVienService.add(sv2);
        List<SinhVien> result = sinhVienService.searchByMaSV(1);
        assertEquals(1, result.size());
    }
    @Test
    public void testSearchByMaSVValid4() {
        SinhVien sv1 = new SinhVien(1, "Bao ", "A200", "K19", "Java");
        sinhVienService.add(sv1);

        SinhVien sv2 = new SinhVien(2, "Duc", "D200", "K19", "Web");
        sinhVienService.add(sv2);
        List<SinhVien> result = sinhVienService.searchByMaSV(1);
        assertEquals(1, result.size());
    }
    @Test
    public void testSearchByMaSVValid5() {
        SinhVien sv1 = new SinhVien(10000, "Bao ", "A200", "K19", "Java");
        sinhVienService.add(sv1);

        SinhVien sv2 = new SinhVien(200000, "Duc", "D200", "K19", "Web");
        sinhVienService.add(sv2);
        List<SinhVien> result = sinhVienService.searchByMaSV(200000);
        assertEquals(1, result.size());
    }@Test
    public void testSearchByMaSVValid6() {
        SinhVien sv1 = new SinhVien(1, "Bao ", "A200", "K19", "Java");
        sinhVienService.add(sv1);

        SinhVien sv2 = new SinhVien(2, "Duc", "D200", "K19", "Web");
        sinhVienService.add(sv2);
        List<SinhVien> result = sinhVienService.searchByMaSV(2);
        assertEquals(1, result.size());
    }
    @Test
    public void testSearchByMaSVValid7() {
        SinhVien sv1 = new SinhVien(1, "Bao ", "A200", "K19", "Java");
        sinhVienService.add(sv1);

        SinhVien sv2 = new SinhVien(120, "Duc", "D200", "K19", "Web");
        sinhVienService.add(sv2);
        List<SinhVien> result = sinhVienService.searchByMaSV(120);
        assertEquals(1, result.size());
    }


}
