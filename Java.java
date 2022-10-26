  class Java extends Course{
    private String framework;

      public Java(String courseName, String studentName, int duration, String time, String mName, String framework) {
          super(courseName, studentName, duration, time, mName);
          this.framework=framework;


      }

      public String getFramework() {
          return framework;
      }

      public void setFramework(String framework) {
          this.framework = framework;
      }

      @Override
      public void mentor() {
          System.out.println(getmName()+": Сегодня у нас тест по ООП");

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
          System.out.println("Фреймворк: "+getFramework());
          System.out.println("--------------------------");

      }
  }
