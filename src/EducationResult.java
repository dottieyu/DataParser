import java.util.Arrays;

public class EducationResult {
    private double noHS;
    private double onlyHS;
    private double someCollege;
    private double bachelorsOrMore;

    public EducationResult(double noHS, double onlyHS, double someCollege, double bachelorsOrMore) {
        this.noHS = noHS;
        this.onlyHS = onlyHS;
        this.someCollege = someCollege;
        this.bachelorsOrMore = bachelorsOrMore;
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
    }
}
