import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author dottie
 */
public class Main {
    public static void main(String[] args) {
        String str1 = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        String str2 = Utils.readFileAsString("data/Education.csv");
        String str3 = Utils.readFileAsString("data/Unemployment.csv");

        Utils.parse2016PresidentialResults(str1);
        Utils.parse2016EducationResults(str2);
        Utils.parse2016EmploymentResults(str3);

        Utils.print();
    }
}
