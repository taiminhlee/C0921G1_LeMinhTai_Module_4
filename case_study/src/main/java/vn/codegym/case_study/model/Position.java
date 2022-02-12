package vn.codegym.case_study.model;

public class Position {
    private int positionId;
    private String positionName;

    public Position(String positionName) {
        this.positionName = positionName;
    }

    public Position(int positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public Position(int position) {
        this.positionId=position;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                '}';
    }
}
