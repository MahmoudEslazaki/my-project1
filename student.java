public class student {
    int age;
    String name;
    double gpa;
    public void displayinfo(){
        System.out.println("name" +name);
        System.out.println("gpa"+gpa);
        System.out.println("age"+age);

    public void study(){
        System.out.println(name+ "is new study ");
    }
    public static void main(String[]args){
        student s1=new student();
        s1.name="mahmoud";
        s1.age=20;
        s1.gpa=3.2;
        student s2=new student();
        s2.name="ahmed";
        s2.age=21;
        s2.gpa=2.5;
        s1.displayinfo();
        s1.study();
        System.out.println();
        s2.displayinfo();
        s2.study();
    }
}