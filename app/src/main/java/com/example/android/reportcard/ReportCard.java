package com.example.android.reportcard;

public class ReportCard {

    public final String REPORT_CARD_FOR_STANDARD_X11 = "XII";
    char mGradeEnglish, mGradePhysics, mGradeChemistry, mGradeMathematics, mGradeComputerScience;
    private String attendance, conduct;

    public ReportCard(char mGradeEnglish, char mGradePhysics, char mGradeComputerScience,
                      char mGradeChemistry, char mGradeMathematics) {
        this.mGradeEnglish = mGradeEnglish;
        this.mGradePhysics = mGradePhysics;
        this.mGradeComputerScience = mGradeComputerScience;
        this.mGradeChemistry = mGradeChemistry;
        this.mGradeMathematics = mGradeMathematics;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "REPORT_CARD_FOR_STANDARD_X11='" + REPORT_CARD_FOR_STANDARD_X11 + '\'' +
                ", mGradeEnglish=" + mGradeEnglish +
                ", mGradePhysics=" + mGradePhysics +
                ", mGradeChemistry=" + mGradeChemistry +
                ", mGradeMathematics=" + mGradeMathematics +
                ", mGradeComputerScience=" + mGradeComputerScience +
                ", attendance='" + attendance + '\'' +
                ", conduct='" + conduct + '\'' +
                '}';
    }
}
