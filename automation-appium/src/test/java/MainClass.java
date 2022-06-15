public class MainClass {
    private int class_number = 20;
    private String class_string = "Hello, world";
    public int getLocalNumber(){
        return 14;
    }
    public int getClassNumber(){
        return this.class_number;
    }

    public String getClassString(){
        return this.class_string;
    }

    public boolean isContainsWords(String word_1, String word_2){
        if (this.class_string.contains(word_1) || this.class_string.contains(word_2)) {
            return true;
        }
        return false;
    }
}
