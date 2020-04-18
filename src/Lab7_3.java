import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//
public class Lab7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        String[] strings = new String[n+1];
        for (int i = 0; i<n+1; i++) {
            strings[i] = scanner.nextLine();
        }
        String[] sentenceResult = new String[strings.length];

        for (int i = 0; i < strings.length; i++){
            sentenceResult[i] = strings[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
        }

//        for (int i = 0; i < strings.length; i++) {
//            String[] array = strings[i].split(" ");
//            for (int j = 0; j < array.length; i++) {
//                String firstWord = array[0];
//                String lastWord = array[array.length - 1];
//                array[0] = lastWord;
//                array[array.length - 1] = firstWord;
//            }
////            System.out.println(array);
//        }
        for (String s : sentenceResult) {
            System.out.println(s);
        }
    }
}
