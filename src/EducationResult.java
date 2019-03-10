import java.util.Arrays;

public class EducationResult {
    private String fips;
    private String state;
    private String area;

    private String[][] codes;
    private String[][] educationLevelData;

    public EducationResult(String fips, String state, String area, String[] codes, String[] educationLevelData) {
        this.fips = fips;
        this.state = state;
        this.area = area;

        // row = year; col = data label
        this.codes = new String[2][2];
        this.educationLevelData = new String[5][8];

        if (codes.length != 4) System.out.println(this.fips + " error: codes.length == " + codes.length);
        else fill(this.codes, codes);

        if (educationLevelData.length != 40) System.out.println(this.fips + " error: educationLevelData.length == " + educationLevelData.length);
        else fill(this.educationLevelData, educationLevelData);
    }

    private void fill(String[][] arr2D, String[] arr1D) {
        for (int r = 0; r < arr2D.length; r++) {
            for (int c = 0; c < arr2D[0].length; c++) {
                arr2D[r][c] = arr1D[r*c + c];
            }
        }
    }

    public String getFips() {
        return fips;
    }

    public void setFips(String fips) {
        this.fips = fips;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String[][] getCodes() {
        return codes;
    }

    public void setCodes(String[][] codes) {
        this.codes = codes;
    }

    public String getCodes(int r, int c) {
        return codes[r][c];
    }

    public void setCodes(int r, int c, String code) {
        this.codes[r][c] = code;
    }

    public String[][] getEducationLevelData() {
        return educationLevelData;
    }

    public void setEducationLevelData(String[][] educationLevelData) {
        this.educationLevelData = educationLevelData;
    }

    public String getEducationalLevelData(int r, int c) {
        return educationLevelData[r][c];
    }

    public void setEducationLevelData(int r, int c, String data) {
        this.educationLevelData[r][c] = data;
    }

    public String toString() {
        return fips + ", " + state + ", " + area + ", " + Arrays.toString(codes) + ", " + Arrays.toString(educationLevelData);
    }

    /* note :
    EducationalLevelData: rows: 1970, 1980, 1990, 2000, 2002-2006
    EducationalLeveleDataL cols: lessThanHSDiploma, onlyHSDiploma, someCollege, fourYearsCollege, percentLessThanHSDiploma, percentOnlyHSDiploma, percentSomeCollege, percentFourYearsCollegeHigher
     */

}
