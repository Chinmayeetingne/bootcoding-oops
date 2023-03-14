package com.bootcoding.java.oops.exercise1;

public class StudentApp {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Student s = new Student();
            s.roll_no = i;
            s.name = "Name" + i;
            s.address = "Nagpur";
            s.percentage = 87+i;
            s.print(s);
            GradeSystem gs = new GradeSystem();
            char grade = gs.findGrade(s);
            System.out.println(grade);
        }
    }
}
