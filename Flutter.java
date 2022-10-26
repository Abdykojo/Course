class Flutter extends Course{
    private String oc;

    public Flutter(String courseName, String studentName, int duration, String time, String mName, String oc) {
        super(courseName, studentName, duration, time, mName);
        this.oc = oc;
    }


    @Override
    public void mentor() {
        System.out.println(getmName()+": На сегодня урок закончен.");

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
        System.out.println("Операционная система: "+getOc());
        System.out.println("--------------------------");

    }

    public String getOc() {
        return oc;
    }

    public void setOc(String oc) {
        this.oc = oc;
    }
}
