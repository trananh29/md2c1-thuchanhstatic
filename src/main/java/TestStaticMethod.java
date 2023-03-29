public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1=new Student(100,"Anh");
        Student s2=new Student(101,"Thi");
        Student s3= new Student(102,"Hieu");
        s1.display();
        s2.display();
        s3.display();
    }
}
