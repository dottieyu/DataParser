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

    // To do: Parsing: Split by "\n"; clean(s); split by "," and store in object (should i make a store method?? idk yet)
    // To do: remove: loop thru data, build arraylist of unwantedIndexes, then run deleteIndexes(s, unwantedIndexes)

    public static ArrayList<ElectionResult> parse2016PresidentialResults(String s) {
        return null;
    }


    public static ArrayList<EducationResult> parse2016EducationResults(String s) {
        return null;
    }

    public static ArrayList<EmploymentResult> parse2016EmploymentResults(String s) {
        return null;
    }

    private static void clean(String s) {
        // 1st: remove commas within quotations
        // 2nd: strip (using strip method) all characters not a thru z, digits, and commas
        // 3rd: strip all repeat commas
    }

    private static void removeQuotations(String s) {

    }

    private static void removeUnwantedChars(String s) {

    }

    private static void removeDuplicateCommas(String s) {

    }

    private static void deleteIndexes(String s, ArrayList<Integer> unwantedIndexes) {
        String output = s.substring(0, unwantedIndexes.get(0));

        for (int i = 0; i < unwantedIndexes.size() - 1; i++) {
            output += s.substring(unwantedIndexes.get(i)+1, unwantedIndexes.get(i+1));
        }
        output+=s.substring(unwantedIndexes.get(unwantedIndexes.size()-1) + 1);
    }
}
