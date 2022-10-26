public abstract class Course {
    private String courseName;
    private String studentName;
    private int duration;
    private String time;
    private String mName;

    public Course(String courseName, String studentName, int duration, String time, String mName) {
        this.courseName = courseName;
        this.studentName = studentName;
        this.duration = duration;
        this.time = time;
        this.mName = mName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public abstract void mentor();


    public  abstract void vyvod() throws InterruptedException;
}
