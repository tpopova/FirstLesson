package pack3;

/**
 * Created by User_2 on 16.03.2017.
 */
public class Lesson4 {
    public String concat(String str1, String str2){
        return str1.concat(str2);
    }

    public String replaceWorld(String oldStr){
        return oldStr.replace("World"," New World");
    }

    public static void main(String[] args) {
        Lesson4 lesson4 = new Lesson4();
        String oldWorld = lesson4.concat("Hello", "World");
        System.out.println(oldWorld);
        System.out.println("Popofh");
        System.out.println("Popofh");
        System.out.println("Popofh");

        System.out.println(lesson4.replaceWorld(oldWorld));
        }
}
