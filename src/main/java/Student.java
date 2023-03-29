public class Student {
    //variable
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    //constructor
    Student(int r, String n) {
        rollno=r;
        this.name=n;
    }
    static void change(){
        college="CODEGYM";
    }
    //method
    void display(){
        System.out.println(rollno + " " + name + " "+ college);
    }

}
