import com.example.KT4.BaiHat;
import com.example.KT4.BaiHatService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestBaiHat {
    BaiHatService baiHatService;
    @BeforeEach
    public void setup(){
        baiHatService = new BaiHatService();
    }
    @Test
    public void testADDValid(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        Assert.assertEquals(1,baiHatService.getAll().size());
    }
    @Test
    public void testADDValid2(){
        BaiHat bh = new BaiHat("100000","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        Assert.assertEquals(1,baiHatService.getAll().size());
    }
    @Test
    public void testADDValid3(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        BaiHat bh1 = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh1);
        Assert.assertEquals(1,baiHatService.getAll().size());
    }
    @Test
    public void testADDValid4(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",-250);
        baiHatService.add(bh);
        Assert.assertEquals(IllegalArgumentException.class,baiHatService.getAll().size());
    }
    @Test
    public void testADDValid5(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",0);
        baiHatService.add(bh);
        Assert.assertEquals(1,baiHatService.getAll().size());
    }
    @Test
    public void testDelete(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        int sizeBefore = baiHatService.getAll().size();
        baiHatService.delete("001");
        int sizeAfter = baiHatService.getAll().size();
        Assert.assertEquals(sizeBefore -1,sizeAfter);
    }
    @Test
    public void testDelete2(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        int sizeBefore = baiHatService.getAll().size();
        baiHatService.delete("002");
        int sizeAfter = baiHatService.getAll().size();
        Assert.assertEquals(sizeBefore -1,sizeAfter);
    }
    @Test
    public void testDelete3(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        BaiHat bh1 = new BaiHat("002","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh1);
        int sizeBefore = baiHatService.getAll().size();
        baiHatService.delete("002");
        int sizeAfter = baiHatService.getAll().size();
        Assert.assertEquals(sizeBefore -1,sizeAfter);
    }
    @Test
    public void testDelete4(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        BaiHat bh1 = new BaiHat("002","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh1);
        int sizeBefore = baiHatService.getAll().size();
        baiHatService.delete("002");
        baiHatService.delete("001");
        int sizeAfter = baiHatService.getAll().size();
        Assert.assertEquals(sizeBefore -2,sizeAfter);
    }
    @Test
    public void testDelete5(){
        BaiHat bh = new BaiHat("001","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh);
        BaiHat bh1 = new BaiHat("002","Noi nay co anh","Son Tung MTP",250);
        baiHatService.add(bh1);
        int sizeBefore = baiHatService.getAll().size();
        baiHatService.delete("002");
        baiHatService.delete("001");
        int sizeAfter = baiHatService.getAll().size();
        Assert.assertEquals(sizeBefore -1,sizeAfter);
    }
}
