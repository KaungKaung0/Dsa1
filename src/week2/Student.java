package week2;

import java.util.ArrayList;

public class Student {

    String stu_name;
    String stu_address;
    String stu_phnum;
    String stu_batchno;
    Integer stu_age;

 static  ArrayList<Student>studentslist = new ArrayList<>();
    public  Student(String name, String address, String phnum, String batchno, int age) {
        stu_name = name;
        stu_address =address;
        stu_phnum = phnum;
        stu_batchno = batchno;
        stu_age = age;

    }
    public static void addStudent( Student studentobj){
        studentslist.add(studentobj);
    } 

    public static ArrayList<Student> getStudentsList(){
        return studentslist;
    }
    public String toString(){
        return stu_name + ":" + stu_address + ":" + stu_phnum+ ":" + stu_batchno + ":" + stu_age;
    }
}
