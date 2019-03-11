public class ElectionResult {
    private double demVotes;
    private double gopVotes;
    private double totalVotes;

    public ElectionResult(String demVotes, String gopVotes, String totalVotes) {
        this.demVotes = Double.parseDouble(demVotes);
        this.gopVotes = Double.parseDouble(gopVotes);
        this.totalVotes = Double.parseDouble(totalVotes);
    }

    public double getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(double demVotes) {
        this.demVotes = demVotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    @Override
    public String toString() {
        return super.toString();
        // NEED TO WRITE ACTUAL TOSTRING!!!

    }
}
