class Python extends Course{
    private int studentNumber;

    public Python(String courseName, String studentName, int duration, String time, String mName, int studentNumber) {
        super(courseName, studentName, duration, time, mName);
        this.studentNumber = studentNumber;
    }


    @Override
    public void mentor() {
        System.out.println(getmName()+": Все заплатили за курсы?");

    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
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
        System.out.println("Количество студентов: "+getStudentNumber());
        System.out.println("--------------------------");

    }
}
