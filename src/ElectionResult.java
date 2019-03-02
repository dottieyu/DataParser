public class ElectionResult {
    private String votes_dem;
    private String votes_gpp;
    private String total_votes;
    private String per_dem;
    private String per_gop;
    private String diff;
    private String per_point_diff;
    private String state_abbr;
    private String county_name;
    private String combined_files;
    private String all_data;

    public ElectionResult(String votes_dem, String votes_gpp, String total_votes, String per_dem, String per_gop, String diff, String per_point_diff, String state_abbr, String county_name, String combined_files, String all_data) {
        this.votes_dem = votes_dem;
        this.votes_gpp = votes_gpp;
        this.total_votes = total_votes;
        this.per_dem = per_dem;
        this.per_gop = per_gop;
        this.diff = diff;
        this.per_point_diff = per_point_diff;
        this.state_abbr = state_abbr;
        this.county_name = county_name;
        this.combined_files = combined_files;
        this.all_data = all_data;
    }

    public String getVotes_dem() {
        return votes_dem;
    }

    public void setVotes_dem(String votes_dem) {
        this.votes_dem = votes_dem;
    }

    public String getVotes_gpp() {
        return votes_gpp;
    }

    public void setVotes_gpp(String votes_gpp) {
        this.votes_gpp = votes_gpp;
    }

    public String getTotal_votes() {
        return total_votes;
    }

    public void setTotal_votes(String total_votes) {
        this.total_votes = total_votes;
    }

    public String getPer_dem() {
        return per_dem;
    }

    public void setPer_dem(String per_dem) {
        this.per_dem = per_dem;
    }

    public String getPer_gop() {
        return per_gop;
    }

    public void setPer_gop(String per_gop) {
        this.per_gop = per_gop;
    }

    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public String getPer_point_diff() {
        return per_point_diff;
    }

    public void setPer_point_diff(String per_point_diff) {
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

    public String getCombined_files() {
        return combined_files;
    }

    public void setCombined_files(String combined_files) {
        this.combined_files = combined_files;
    }

    @Override
    public String toString() {
        return all_data;
    }
}
