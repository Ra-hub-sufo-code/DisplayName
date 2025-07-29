package Revision;

public class Student {
    private String stdName;
    private int stdRollNum;
    private String course;

    public Student(String stdName,int stdRollNum,String course){
        this.course=course;
        this.stdName=stdName;
        this.stdRollNum=stdRollNum;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdRollNum() {
        return stdRollNum;
    }

    public void setStdRollNum(int stdRollNum) {
        this.stdRollNum = stdRollNum;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [ " +
                "Student Name=" + stdName +
                " ,Student RollNum=" + stdRollNum +
                " ,Course='" + course +
                " ]";
    }
}
