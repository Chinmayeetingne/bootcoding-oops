package com.bootcoding.java.oops.exercise3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        for(int i=0;i<students.length;i++){
            Student s = new Student();
            s.percentage = 70+i;
            students[i]= s;
        }
        StudentService ss = new StudentService();
        float criteriaOfPer = 60;
        Student[] s = StudentService.findStudentAboveCriteriaOfPer(students, criteriaOfPer);

        for(Student st: s){
            if(st != null){
                System.out.println(st.percentage);
            }
        }
    }
}
