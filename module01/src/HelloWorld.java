import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {
    private int character_one;
    private String ab;

    public int getCharacter_one() {
        return character_one;
    }

    public void setCharacter_one(int character_one) {
        this.character_one = character_one;
    }

    public static void main(String[] args) {
        //region Description
        temp();
        //endregion
        System.out.println("呵呵");
        temp();
        try {
            FileInputStream fileInputStream = new FileInputStream("D:/abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void temp() {
        System.out.println("呵呵");
        System.out.println("呵呵");
        System.out.println("呵呵");
    }

    public String fun1(){
        this.ab = "123";
        String ab= this.ab;
        System.out.println("嘻嘻");
        return ab;
    }
}
