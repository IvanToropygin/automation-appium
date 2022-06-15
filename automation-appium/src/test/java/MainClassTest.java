import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        MainClass mc = new MainClass();
        int actualNum = mc.getLocalNumber();
        int exceptedNum = 14;
        Assertions.assertTrue(actualNum == exceptedNum, "Полученное значение: " + actualNum +
                ", - не равно ожидаемому: " + exceptedNum);
    }

    @Test
    public void testGetClassNumber(){
        MainClass mc = new MainClass();
        int num = mc.getClassNumber();
        Assertions.assertTrue(num > 45, "Полученное число: " + num + ", не больше 45");
    }
}
