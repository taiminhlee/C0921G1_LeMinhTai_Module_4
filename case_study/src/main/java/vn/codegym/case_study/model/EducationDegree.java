package vn.codegym.case_study.model;

public class EducationDegree {
    private int educationDegreeId;
    private String educationDegreeName;

    public EducationDegree(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public EducationDegree(int educationDegreeId, String educationDegreeName) {
        this.educationDegreeId = educationDegreeId;
        this.educationDegreeName = educationDegreeName;
    }

    public EducationDegree(int educationDegree) {
        this.educationDegreeId=educationDegree;
    }

    public int getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(int educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    @Override
    public String toString() {
        return "EducationDegree{" +
                "educationDegreeId=" + educationDegreeId +
                ", educationDegreeName='" + educationDegreeName + '\'' +
                '}';
    }
}
