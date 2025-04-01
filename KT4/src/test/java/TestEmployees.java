import com.example.KT4.Employees;
import com.example.KT4.EmployeesService;
import com.example.KT4.SinhVienService;
import com.example.KT4.Xeoto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestEmployees {
    EmployeesService employeesService;
    @BeforeEach
    public void setup() {
        employeesService = new EmployeesService();
    }
    @Test
    public void testAddValid(){
        Employees em = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Assert.assertEquals(1,employeesService.getListEmployees().size());
    }
    @Test
    public void testAddValid2(){
        Employees em = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        employeesService.add(em1);
        Assert.assertEquals(2,employeesService.getListEmployees().size());
    }
    @Test
    public void testAddValid3(){
        Employees em = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(2,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em1);
        Assert.assertEquals(2,employeesService.getListEmployees().size());
    }
    @Test
    public void testAddValid4(){
        Employees em = new Employees(2,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Assert.assertEquals(1,employeesService.getListEmployees().size());
    }
    @Test
    public void testAddValid5(){
        Employees em = new Employees(1,"Bao","Nguyen","");
        employeesService.add(em);
        Assert.assertEquals(1,employeesService.getListEmployees().size());
    }@Test
    public void testAddValid6(){
        Employees em = new Employees(1000000,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Assert.assertEquals(1,employeesService.getListEmployees().size());
    }
    @Test
    public void testUpdateValid(){
        Employees em = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(1,"Baooo","Nguyen","ducbaovx@gmail.com");
        employeesService.update(em1,1);
        Assert.assertEquals("Baooo",employeesService.getListEmployees().get(0).getFirstname());
    }
    @Test
    public void testUpdateValid2(){
        Employees em = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(2,"Baooo","Nguyen","ducbaovx@gmail.com");
        employeesService.update(em1,2);
        Assert.assertEquals(IllegalArgumentException.class,employeesService.getListEmployees().size());
    }
    @Test
    public void testUpdateValid3(){
        Employees em = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(2,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.update(em1,1);
        Assert.assertEquals(2,employeesService.getListEmployees().get(0).getId());
    }
    @Test
    public void testUpdateValid4(){
        Employees em = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(1,"Bao","Nguyen","");
        employeesService.update(em1,1);
        Assert.assertEquals("",employeesService.getListEmployees().get(0).getEmail());
    }
    @Test
    public void testUpdateValid5(){
        Employees em = new Employees(1,"Bao","Duc","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(1,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.update(em1,1);
        Assert.assertEquals("Nguyen",employeesService.getListEmployees().get(0).getLastname());
    }
    @Test
    public void testDeleteValid(){
        Employees em = new Employees(1,"Bao","Duc","ducbaovx@gmail.com");
        employeesService.add(em);
        int sizeBefore = employeesService.getListEmployees().size();
        employeesService.delete(1);
        int sizeAfter = employeesService.getListEmployees().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);
    }
    @Test
    public void testDeleteValid2(){
        Employees em = new Employees(1,"Bao","Duc","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(2,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em1);
        int sizeBefore = employeesService.getListEmployees().size();
        employeesService.delete(2);
        int sizeAfter = employeesService.getListEmployees().size();
        Assert.assertEquals(sizeBefore-1,sizeAfter);
    }
    @Test
    public void testDeleteValid3(){
        Employees em = new Employees(1,"Bao","Duc","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(2,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em1);
        int sizeBefore = employeesService.getListEmployees().size();
        employeesService.delete(2);
        int sizeAfter = employeesService.getListEmployees().size();
        Assert.assertEquals(sizeBefore,sizeAfter);
    }
    @Test
    public void testDeleteValid4(){
        Employees em = new Employees(1,"Bao","Duc","ducbaovx@gmail.com");
        employeesService.add(em);
        Employees em1 = new Employees(2,"Bao","Nguyen","ducbaovx@gmail.com");
        employeesService.add(em1);
        int sizeBefore = employeesService.getListEmployees().size();
        employeesService.delete(0);
        int sizeAfter = employeesService.getListEmployees().size();
        Assert.assertEquals(sizeBefore-1,sizeAfter);
    }
}
