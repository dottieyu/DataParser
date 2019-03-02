public class ElectionResult {
    private int votes_dem;
    private int votes_gpp;
    private int total_votes;
    private double per_dem;
    private double per_gop;
    private int diff;
    private double per_point_diff;
    private String state_abbr;
    private String county_name;
    private int combined_fips;
    private String all_data;

    public ElectionResult(String votes_dem, String votes_gpp, String total_votes, String per_dem, String per_gop, String diff, String per_point_diff, String state_abbr, String county_name, String combined_fips, String all_data) {
        this.votes_dem = (int) Double.parseDouble(votes_dem);
        this.votes_gpp = (int) Double.parseDouble(votes_gpp);
        this.total_votes = (int) Double.parseDouble(total_votes);
        this.per_dem = Double.parseDouble(per_dem);
        this.per_gop = Double.parseDouble(per_gop);
        this.diff = Integer.parseInt(diff.substring(1, diff.length()-1));
        this.per_point_diff = Double.parseDouble(per_point_diff.substring(0, diff.length()-2));
        this.state_abbr = state_abbr;
        this.county_name = county_name;
        this.combined_fips = Integer.parseInt(combined_fips);
        this.all_data = all_data;
    }

    public int getVotes_dem() {
        return votes_dem;
    }

    public void setVotes_dem(int votes_dem) {
        this.votes_dem = votes_dem;
    }

    public int getVotes_gpp() {
        return votes_gpp;
    }

    public void setVotes_gpp(int votes_gpp) {
        this.votes_gpp = votes_gpp;
    }

    public int getTotal_votes() {
        return total_votes;
    }

    public void setTotal_votes(int total_votes) {
        this.total_votes = total_votes;
    }

    public double getPer_dem() {
        return per_dem;
    }

    public void setPer_dem(double per_dem) {
        this.per_dem = per_dem;
    }

    public double getPer_gop() {
        return per_gop;
    }

    public void setPer_gop(double per_gop) {
        this.per_gop = per_gop;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public double getPer_point_diff() {
        return per_point_diff;
    }

    public void setPer_point_diff(double per_point_diff) {
        this.per_point_diff = per_point_diff;
    }

    public String getState_abbr() {
        return state_abbr;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public int getCombined_fips() {
        return combined_fips;
    }

    public void setCombined_fips(int combined_fips) {
        this.combined_fips = combined_fips;
    }

    public String getAll_data() {
        return all_data;
    }

    public void setAll_data(String all_data) {
        this.all_data = all_data;
    }

    @Override
    public String toString() {
        return all_data;
    }
}
