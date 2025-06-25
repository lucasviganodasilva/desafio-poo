package domain;

public class Course extends Content{

    private int courseLoad;

    @Override
    public double xpCalc() {
        return xpDefault * courseLoad;
    }


    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }


}
