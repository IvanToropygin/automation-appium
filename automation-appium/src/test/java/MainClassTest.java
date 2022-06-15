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
    @Test
    public void testGetClassString(){
        MainClass mc = new MainClass();
        String word1 = "hello";
        String word2 = "Hello";
        Assertions.assertTrue(mc.isContainsWords(word1, word2), " Полученная строка не содержит слов: " + word1
                + " или " + word2 + ".");
    }
}
