public class student {
    private String name;
    private int age;
    private double gpa;

    public student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void displayinfo() {
        System.out.println("Name" + name);
        System.out.println("Age" + age);
        System.out.println("Gpa" + gpa);
    }

    public void study() {
        System.out.println(name + "is study now .");
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public static void main(String[]args){
        student s1 =new student("mahmoud",25,3.5);
        student s2 =new student("mohamed",20,3.2);
        s1.displayinfo();
        s1.study();
        System.out.println();
        s2.displayinfo();
        s2.study();
    }
}