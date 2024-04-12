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
        Map<String, Integer> two = new HashMap<>();
        for (int i = 0; i < noll.length; i++) {
            String word = noll[i];
            if (two.containsKey(word)) {
                int count = i + two.get(word);
            }
    }
        return two;
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