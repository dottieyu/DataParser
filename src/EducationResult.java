import java.util.Arrays;

public class EducationResult {
    private double noHS;
    private double onlyHS;
    private double someCollege;
    private double bachelorsOrMore;

    public EducationResult(String noHS, String onlyHS, String someCollege, String bachelorsOrMore) {
        this.noHS = Double.parseDouble(noHS);
        this.onlyHS = Double.parseDouble(onlyHS);
        this.someCollege = Double.parseDouble(someCollege);
        this.bachelorsOrMore = Double.parseDouble(bachelorsOrMore);
    }

    public double getNoHS() {
        return noHS;
    }

    public void setNoHS(double noHS) {
        this.noHS = noHS;
    }

    public double getOnlyHS() {
        return onlyHS;
    }

    public void setOnlyHS(double onlyHS) {
        this.onlyHS = onlyHS;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public double getBachelorsOrMore() {
        return bachelorsOrMore;
    }

    public void setBachelorsOrMore(double bachelorsOrMore) {
        this.bachelorsOrMore = bachelorsOrMore;
    }

    @Override
    public String toString() {
        return super.toString();
        // NEED TO WRITE ACTUAL TOSTRING!!!
    }
}
