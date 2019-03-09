import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
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

            if (a.length == 11) {
                results.add(new ElectionResult(a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9], a[10]));
            } else {
                System.out.println("Error @ row: " + i + "; a.length = " + a.length);
            }
        }
        return results;
    }

    private static String stripUnwantedChars(String s) {
        ArrayList<Integer> indexes = findUnwantedIndexes(s);

        if (indexes == null) return s;

        String output = s.substring(0, indexes.get(0));

        for (int i = 0; i < indexes.size() - 1; i++) {
            output += s.substring(indexes.get(i)+1, indexes.get(i+1));
        }
        output+=s.substring(indexes.get(indexes.size()-1) + 1);
        return output;
    }
    private static String stripUnwantedChars(String s, ArrayList<Integer> indexes) {
        String output = s.substring(0, indexes.get(0));

        for (int i = 0; i < indexes.size() - 1; i++) {
            output += s.substring(indexes.get(i)+1, indexes.get(i+1));
        }
        output+=s.substring(indexes.get(indexes.size()-1) + 1);
        return output;
    }

    // only used in election result ok
    private static ArrayList<Integer> findUnwantedIndexes(String s) {
        ArrayList<Integer> indexes = new ArrayList<>();

        int index = s.indexOf("\"");
        if (index > 0) {
            indexes.add(index);
            indexes.add(s.indexOf("\"", index+1));
            for (int i = indexes.get(0); i < indexes.get(1); i++) {
                if (s.substring(i, i+1).equals(",")) {
                    indexes.add(i);
                }
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals("%")) {
                indexes.add(i);
            }
        }

        sort(indexes);
        return indexes;
    }

    public static ArrayList<EducationResult> parse2016EducationResults(String s) {
        ArrayList<EducationResult> results = new ArrayList<>();

        String[] rows = s.split("\n");

        for (int i = 6; i < rows.length; i++) {
            rows[i] = fixNumsInQuotations(rows[i]);
            rows[i] = fixDuplicateCommas(rows[i]);

            String[] a = rows[i].split(",") ;

            if (a.length == 47) {
                String pt1 = a[0];
                String pt2 = a[1];
                String pt3 = a[2];
                String[] pt4 = new String[4];
                System.arraycopy(a, 3, pt4, 0, pt4.length);
                String[] pt5 = new String[40];
                System.arraycopy(a, 7, pt5, 0, pt5.length);

                results.add(new EducationResult(pt1, pt2, pt3, pt4, pt5));
            } else {
                System.out.println("Error @ row: " + i + "; a.length = " + a.length);
            }
        }
        return results;
    }

    private static String fixDuplicateCommas(String s) {
        ArrayList<Integer> unwantedIndexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i+1).equals(",") && s.substring(i-1, i).equals(",")) {
                unwantedIndexes.add(i);
            }
        }
        stripUnwantedChars(s, unwantedIndexes);
        return s;
    }

    private static String fixNumsInQuotations(String s) {
        ArrayList<Integer> unwantedIndexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int start = s.indexOf("\"", i);
            int end = s.indexOf("\"", start);

            unwantedIndexes.add(start);

            for (int j = start; j < end; j++) {
                if (s.substring(j, j+1).equals(",")) {
                    unwantedIndexes.add(j);
                }
            }

            unwantedIndexes.add(end);
            i = end;
        }
        sort(unwantedIndexes);
        stripUnwantedChars(s, unwantedIndexes);
        return s;
    }
}
