public class EmploymentResult {
    private double totalLaborForce;
    private double employedLaborForce;
    private double unemployedLaborForce;
    private double unemployedPercent;

    public EmploymentResult(String totalLaborForce, String employedLaborForce, String unemployedLaborForce, String unemployedPercent) {
        this.totalLaborForce = Double.parseDouble(totalLaborForce);
        this.employedLaborForce = Double.parseDouble(employedLaborForce);
        this.unemployedLaborForce = Double.parseDouble(unemployedLaborForce);
        this.unemployedPercent = Double.parseDouble(unemployedPercent);
    }

    public double getTotalLaborForce() {
        return totalLaborForce;
    }

    public void setTotalLaborForce(double totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    public double getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(double employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public double getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setUnemployedLaborForce(double unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }

    @Override
    public String toString() {
        return super.toString();
        // NEED TO WRITE ACTUAL TOSTRING!!!
    }
}
