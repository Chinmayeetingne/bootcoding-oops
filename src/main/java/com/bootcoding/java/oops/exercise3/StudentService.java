package com.bootcoding.java.oops.exercise3;

public class StudentService {
     public static Student[] findStudentAboveCriteriaOfPer(Student[] students, float criteriaOfPer) {
          int count = 0;
          Student[] s = new Student[10];
          for (int i = 0; i < students.length; i++) {
               if (students[i].percentage > criteriaOfPer)
                    s[count++] = students[i];
               }

               return s;
          }
     }

