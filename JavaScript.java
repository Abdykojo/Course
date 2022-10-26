public class JavaScript extends Course{
    private String app;

    public JavaScript(String courseName, String studentName, int duration, String time, String mName, String app) {
        super(courseName, studentName, duration, time, mName);
        this.app = app;
    }


    @Override
    public void mentor() {
        System.out.println(getmName()+": Все заходим в zoom для онлайн урока.");
    }

    @Override
    public void vyvod() throws InterruptedException {
        System.out.println("Название курсов: " + getCourseName());
        Thread.sleep(1500l);
        System.out.println("Имя студента: " + getStudentName());
        Thread.sleep(1500l);
        System.out.println("Длительность курсов: " + getDuration()+" месяца");
        Thread.sleep(1500l);
        System.out.println("Время учебы: " + getTime());
        Thread.sleep(1500l);
        System.out.println("Имя ментора: " + getmName());
        Thread.sleep(1500l);
        System.out.println("Приложение: "+getApp());
        System.out.println("--------------------------");

    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }
}
