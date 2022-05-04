package com.basics.interfacePgm;

public class MainClassLooselyCoupled {
    private CollegeDetails collegeDetails;

    public CollegeDetails getCollegeDetails() {
        return collegeDetails;
    }

    public void setCollegeDetails(CollegeDetails collegeDetails) {
        this.collegeDetails = collegeDetails;
    }
    public void assignMethod()
    {
        collegeDetails.getDataInterface();
        collegeDetails.printDataInterface();
    }

    public static void main(String[] args) {
        MainClassLooselyCoupled mclc=new MainClassLooselyCoupled();
        CollegeDetails cd=new StudentInfo();
        mclc.setCollegeDetails(cd);
        mclc.assignMethod();
    }
}
