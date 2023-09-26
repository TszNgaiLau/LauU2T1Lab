public class Student {
    private String name;

    private double gpa;

    public Student(String studentName, double studentgpa)   {
        name = studentName;
        gpa = studentgpa;
    }
    public void intro()  {
        System.out.print("My name is " + name + " and my gpa is " + gpa);
    }
}