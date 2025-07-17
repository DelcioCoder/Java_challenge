import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Vogals {
    public static void main(String[] args) {
        String[] array = { "a", "e", "i", "o", "u" };
        List<String> vogals = new ArrayList<>(Arrays.asList(array));
        List<String> quantityVogals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qualquer palavra:");
        String word = scanner.nextLine();
        for (int s = 0; s < word.length(); s++) {
            if (vogals.contains(String.valueOf(word.chartAt(s)))) {
                quantityVogals.add(String.valueOf(word.chartAt(s)));
            }

        }
        String result = (quantityVogals.toArray().length > 1) ? "vogais" : "vogal";
        System.out.println("A palavra " + word + " tem " + quantityVogals.toArray().length + " " + result);

    }

}
