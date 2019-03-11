import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.sort;

public class Utils {
    private static ArrayList<State> states = new ArrayList<>();

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

    public static void parse2016PresidentialResults(String s) {
        String[] rows = s.split("\n");

        for (int i = 1; i < rows.length; i++) {
            clean(rows[i]);

            String[] vals = rows[i].split(",");
            if (vals.length == 11) store2016PresidentialResults(vals);
            else System.out.println("Presidential results: error @ " + i + "; vals.length == " + vals.length);
        }
    }

    private static void store2016PresidentialResults(String[] vals) {
        if (!states.contains(vals[8])) { // need to fix this
            states.add(new State(vals[8], new County(vals[9], vals[10], new ElectionResult(vals[2], vals[3], vals[4]), null, null)));
        } else {
            int i = states.indexOf(vals[8]);
            if (!states.get(i).getCounties().contains(vals[9])) {
                states.get(i).setCounties(new County(vals[9], vals[10], new ElectionResult(vals[2], vals[3], vals[4]), null, null));
            }
        }
    }


    public static void parse2016EducationResults(String s) {
        String[] rows = s.split("\n");

        for (int i = 1; i < rows.length; i++) {
            clean(rows[i]);

            String[] vals = rows[i].split(",");
            if (vals.length == 48) store2016EducationResults(vals);
            else System.out.println("Education results: error @ " + i + "; vals.length == " + vals.length);
        }
    }

    private static void store2016EducationResults(String[] vals) {

    }

    public static void parse2016EmploymentResults(String s) {
        String[] rows = s.split("\n");

        for (int i = 1; i < rows.length; i++) {
            clean(rows[i]);

            String[] vals = rows[i].split(",");
            if (vals.length == 52) store2016EmploymentResults(vals);
            else System.out.println("Employment results: error @ " + i + "; vals.length == " + vals.length);
        }
    }

    private static void store2016EmploymentResults(String[] vals) {

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

    public static ArrayList<State> getStates() {
        return states;
    }

    public static void print() {
        System.out.println(states.toString());
    }

    public static void print2016PresidentialResults() {
        for (State state : getStates()) {
            for (County county : state.getCounties()) {
                System.out.println(county.getEducationResult().toString());
            }
        }
    }

    public static void print2016EducationResults() {
        for (State state : getStates()) {
            for (County county : state.getCounties()) {
                System.out.println(county.getEducationResult().toString());
            }
        }
    }

    public static void print2016EmploymentResults() {
        for (State state : getStates()) {
            for (County county : state.getCounties()) {
                System.out.println(county.getEmploymentResult().toString());
            }
        }
    }
}
