import java.sql.SQLOutput;
import java.util.ArrayList;

public class TemplateTest {
    //pfsf，不同module中的类alt+enter添加依赖
    private static final Person person=new Person();
    //psf  public static final
    //psfi public static final int
     //psfs public static final String
    public static final int var = 1;
    public static final int var1 = 2;



    //psvm或者main
    public static void main(String[] args) {
        int i=0;
        //sout
        System.out.println("Hello");
        //soutp，soutm，soutv，xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("i = " + i);
        System.out.println(i);
        //fori
        String[] strings = {"小红", "小智", "小文"};
        for (int j = 0; j <strings.length ; j++) {
            System.out.println(strings[j]);
        }
        //iter
        for (String string : strings) {
            System.out.println(string);
        }
        //itar
        for (int j = 0; j < strings.length; j++) {
            String string = strings[j];
            System.out.println(string);

        }
        //list.for,list.fori,list.forr
        ArrayList<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jerry");
        list.add("lucy");
        for (String s : list) {
            System.out.println(s);
        }
        for (int i1 = 0; i1 < list.size(); i1++) {
            
        }
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {

        }

        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.null,xxx.nn
        if (list != null) {

        }
        if (list == null) {

        }
    }
    /*public static void main(String[] args) {

    }*/
}
