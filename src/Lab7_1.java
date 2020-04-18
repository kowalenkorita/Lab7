import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
public class Lab7_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        char[] alphabet = "aeijouу".toCharArray();

        String[] words = text.split(" ");
        Set<String> builder = new HashSet<String>();

        for (String s : words) {
            for (int i=0; i<alphabet.length; i++) {
                if (!(s.charAt(0)!=alphabet[i] && s.length() == count)) {
                    builder.add(s);
                }
            }
        }
        String rezult = builder.toString();
        System.out.println(rezult);
    }
}
