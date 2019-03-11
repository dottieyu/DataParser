import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<County> counties = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<County> getCounties() {
        return counties;
    }

    public void setCounties(ArrayList<County> counties) {
        this.counties = counties;
    }
    public void setCounties(County county) {
        this.counties.add(county);
    }

    public State(String name, County counties) {
        this.name = name;
        this.counties.add(counties);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
