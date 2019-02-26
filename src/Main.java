/***
 * Main class for data parsers
 * @author dottie
 */
public class Main {
    public static void main(String[] args) {
        String str = Utils.readFileAsString("data/Education.csv");
        System.out.println(str);
    }
}
