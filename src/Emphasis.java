/**
 * Created by MAXIMILLION on 12/12/14.
 */
public class Emphasis {

    public void emphasis(String str) {
        char c = str.charAt(0);
        str = str.substring(1);
        emphasis(c, str);
    }

    public void emphasis(char c, String str) {
        int len = str.length();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Emphasis e = new Emphasis();
        e.emphasis("-Hello world!");
        e.emphasis('*', "Hello world!");
    }
}
