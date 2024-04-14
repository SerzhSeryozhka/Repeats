import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] noll = readFromFile("input.txt");
        System.out.println("проверка:" + Arrays.toString(noll));
        Map<String, Integer> t = numberOfRepetitions(noll);
        System.out.println(t);
    }

    private static Map<String, Integer> numberOfRepetitions(String[] noll) {
        Map<String, Integer> one = new HashMap<>();
        for (String word : noll) {
            if (!one.containsKey(word)) {
                one.put(word, 1);
            }
            else {
                int x=one.get(word);
                one.put(word, 1+x);
            }
        }
        return one;
    }

    private static String[] readFromFile(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.hasNextLine();
        String str = scanner.nextLine();
        scanner.close();
        String[] newStr = str.split(" ");
        return newStr;
    }

}