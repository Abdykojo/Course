public class Main {
    public static void main(String[] args) throws InterruptedException {
        Java java=new Java("Java Bootcamp","Sardar",3,"Morning","Iskander","Spring");
        Python python=new Python("Python","Nursultan",7,"Evening","Akyl",15);
        JavaScript javaScript=new JavaScript("JavaSkript","Saikal",7,"Evening","Murat","Photoshop");
        Flutter flutter=new Flutter("Flutter","Altynai",3,"Morning","Asyla","Mac");
        java.mentor();
        java.vyvod();
        python.mentor();
        python.vyvod();
        javaScript.mentor();
        javaScript.vyvod();
        flutter.mentor();
        flutter.vyvod();

    }

}