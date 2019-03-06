import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author dottie
 */
public class Main {
    public static void main(String[] args) {
        String str = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        // System.out.println(str);

        ArrayList<ElectionResult> results = Utils.parse2016PresidentialResults(str);
        for (ElectionResult result : results) {
            System.out.println(result.toString());
        }
    }
}
