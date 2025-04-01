import com.example.KT4.XeOTOService;
import com.example.KT4.Xeoto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import static org.junit.jupiter.api.Assertions.*;

public class TestXeoto {
    XeOTOService xeOTOService;
    @BeforeEach
    public void setup(){
        xeOTOService = new XeOTOService();
    }
    @Test
    public void testAddValid(){
        Xeoto xe = new Xeoto(1,"MayBack",1000,"Khong");
        xeOTOService.add(xe);
        Assert.assertEquals(1,xeOTOService.getListXe().size());
    }
    @Test
    public void testAddValid1(){
        Xeoto xe = new Xeoto(1,"Huyndai",2000,"Khong");
        xeOTOService.add(xe);
        Assert.assertEquals(1,xeOTOService.getListXe().size());
    }
    @Test
    public void testAddValid2(){
        Xeoto xe = new Xeoto(1,"Huyndai",2000,"");
        xeOTOService.add(xe);
        Assert.assertEquals(1,xeOTOService.getListXe().size());
    }
    @Test
    public void testAddValid3() {
        Xeoto xe1 = new Xeoto(1, "Toyota", 50000f, "Mới");
        Xeoto xe2 = new Xeoto(1, "Honda", 60000f, "Cũ");
        xeOTOService.add(xe1);
        xeOTOService.add(xe2);
        assertEquals(IllegalArgumentException.class, xeOTOService.getListXe().size());
    }
    @Test
    public void testAddValid4() {
        Xeoto xe = new Xeoto(2, "Honda", -10000f, "Cũ");
        xeOTOService.add(xe);
        assertEquals(IllegalArgumentException.class, xeOTOService.getListXe().size());
    }
    @Test
    public void testUpdateValid(){
        Xeoto xe = new Xeoto(1,"MayBack",1000,"Khong");
        xeOTOService.add(xe);
        Xeoto xe1 = new Xeoto(1,"Mayback",20000,"Khong");
        xeOTOService.update(xe1,1);
        Assert.assertEquals(20000,xeOTOService.getListXe().get(0).getGia());
    }
    @Test
    public void testUpdateValid2(){
        Xeoto xe = new Xeoto(1,"MayBack",1000,"Khong");
        xeOTOService.add(xe);
        Xeoto xe1 = new Xeoto(1,"Mayback",1,"Khong");
        xeOTOService.update(xe1,1);
        Assert.assertEquals(1,xeOTOService.getListXe().get(0).getGia());
    }
    @Test
    public void testUpdateValid3(){
        Xeoto xe = new Xeoto(1,"MayBack",1000,"Khong");
        xeOTOService.add(xe);
        Xeoto xe1 = new Xeoto(1,"Huyndai",1000,"Khong");
        xeOTOService.update(xe1,1);
        Assert.assertEquals("Huyndai",xeOTOService.getListXe().get(0).getTen());
    }
    @Test
    public void testUpdateValid4(){
        Xeoto xe = new Xeoto(1,"MayBack",1000,"Khong");
        xeOTOService.add(xe);
        Xeoto xe1 = new Xeoto(1,"MayBack",1000,"");
        xeOTOService.update(xe1,1);
        Assert.assertEquals("",xeOTOService.getListXe().get(0).getGhichu());
    }
    @Test
    public void testUpdateValid5(){
        Xeoto xe = new Xeoto(2,"MayBack",1000,"Khong");
        xeOTOService.update(xe,2);
        Assert.assertEquals(IllegalArgumentException.class,xeOTOService.getListXe().size());
    }
    @Test
    public void testUpdateValid6(){
        Xeoto xe = new Xeoto(1,"MayBack",1000,"Khong");
        xeOTOService.add(xe);
        Xeoto xe1 = new Xeoto(2,"MayBack",1000,"");
        xeOTOService.update(xe1,2);
        Assert.assertEquals("",xeOTOService.getListXe().size());
    }
    @Test
    public void testDeleteValid(){
        Xeoto xe = new Xeoto(1, "MayBack" , 1000f , "Khong");
        xeOTOService.add(xe);
        int sizeBefore = xeOTOService.getListXe().size();
        xeOTOService.delete(1);
        int sizeAfter = xeOTOService.getListXe().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);

    }
    @Test
    public void testDeleteValid2() {
        Xeoto xe = new Xeoto(1, "MayBack" , 1000f , "Khong");
        xeOTOService.add(xe);
        int sizeBefore = xeOTOService.getListXe().size();
        xeOTOService.delete(1);
        int sizeAfter = xeOTOService.getListXe().size();
        Assert.assertEquals(sizeBefore , sizeAfter);
    }
    @Test
    public void testDeleteValid3(){
        Xeoto xe = new Xeoto(2, "MayBack" , 1000f , "Khong");
        xeOTOService.add(xe);
        int sizeBefore = xeOTOService.getListXe().size();
        xeOTOService.delete(2);
        int sizeAfter = xeOTOService.getListXe().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);

    }
    @Test
    public void testDeleteValid4(){
        Xeoto xe = new Xeoto(1, "MayBack" , 1000f , "Khong");
        xeOTOService.add(xe);
        int sizeBefore = xeOTOService.getListXe().size();
        xeOTOService.delete(2);
        int sizeAfter = xeOTOService.getListXe().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);

    }

}
