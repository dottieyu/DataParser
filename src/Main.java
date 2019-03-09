import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author dottie
 */
public class Main {
    public static void main(String[] args) {
        String str = Utils.readFileAsString("data/Education.csv");
        // System.out.println(str);

//        ArrayList<ElectionResult> results = Utils.parse2016PresidentialResults(str);
//        for (ElectionResult result : results) {
//            System.out.println(result.toString());
//        }

        ArrayList<EducationResult> results = Utils.parse2016EducationResults(str);
        for (EducationResult result : results) {
            System.out.println(result.toString());
        }
    }
}
