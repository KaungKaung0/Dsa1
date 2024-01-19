package week2;

public class StudentDemo {

    public static void main(String[] args) {
        Student stu1 = new Student("KKK", "Yangon", "0923245114", "90", 22);
        Student stu2 = new Student("Ye Ye", "Yangon", "0923245114", "90", 22);
        Student stu3 = new Student("Kyaw Kyaw", "Yangon", "0923245114", "90", 22);
        Student stu4 = new Student("Maung Maung", "Yangon", "0923245114", "90", 22);

        Student.addStudent(stu1);
        Student.addStudent(stu2);
        Student.addStudent(stu3);
        Student.addStudent(stu4);

        for (Student studentobj : Student.getStudentsList()) { 
            System.out.println(studentobj);
        }

    }
}
