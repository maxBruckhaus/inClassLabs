/**
 * Created by MAXIMILLION on 12/13/14.
 */
public class FindError{

    public String makeList(char c, int length) {
        String list = "";
        for (int i = 0; i < length; i++) {
            list += c + " ";
        }
        return list;
    }

    public static void main(String[] args) {
        FindError error = new FindError();
        System.out.println(error.makeList('x', 10));
    }
}
