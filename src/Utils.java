import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

        for (String row : rows) {
            String[] a = row.split(",");

            results.add(new ElectionResult(a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8] , a[9], a[10], row));
        }

        results.remove(0);
        return results;
    }
}
