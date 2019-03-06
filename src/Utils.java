import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.sort;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016PresidentialResults(String s) {
        ArrayList<ElectionResult> results = new ArrayList<>();

        String[] rows = s.split("\n");

        for (int i = 1; i < rows.length; i++) {
            rows[i] = stripUnwantedChars(rows[i]);
            String[] a = rows[i].split(",");

            if (a.length == 10) {
                results.add(new ElectionResult(a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9], a[10]));
            } else {
                System.out.println("Error @ row: " + i);
            }
        }
        return results;
    }

    private static String stripUnwantedChars(String s) {
        String output = "";
        ArrayList<Integer> indexes = findUnwantedIndexes(s);

        for (int i = 0; i < indexes.size() - 1; i++) {
            output += s.substring(indexes.get(i)+1, indexes.get(i+1));
        }
        return output;
    }

    private static ArrayList<Integer> findUnwantedIndexes(String s) {
        ArrayList<Integer> indexes = new ArrayList<>();

        int index = s.indexOf("\'");
        indexes.add(index);
        indexes.add(s.indexOf(",", index));
        indexes.add(s.indexOf("\"", index));

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals("%")) {
                indexes.add(i);
            }
        }

        sort(indexes);
        return indexes;
    }
}
