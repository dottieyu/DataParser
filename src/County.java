public class County {
    private String name;
    private int fips;
    private ElectionResult electionResult;
    private EducationResult educationResult;
    private EmploymentResult employmentResult;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public ElectionResult getElectionResult() {
        return electionResult;
    }

    public void setElectionResult(ElectionResult electionResult) {
        this.electionResult = electionResult;
    }

    public EducationResult getEducationResult() {
        return educationResult;
    }

    public void setEducationResult(EducationResult educationResult) {
        this.educationResult = educationResult;
    }

    public EmploymentResult getEmploymentResult() {
        return employmentResult;
    }

    public void setEmploymentResult(EmploymentResult employmentResult) {
        this.employmentResult = employmentResult;
    }

    public County(String name, String fips, ElectionResult electionResult, EducationResult educationResult, EmploymentResult employmentResult) {
        this.name = name;
        this.fips = Integer.parseInt(fips);
        this.electionResult = electionResult;
        this.educationResult = educationResult;
        this.employmentResult = employmentResult;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
