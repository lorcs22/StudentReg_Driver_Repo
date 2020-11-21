/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregdriver;
import org.joda.time.*;
import java.util.ArrayList;
import java.util.*;
import com.mycompany.studentregistration.Student;
import com.mycompany.studentregistration.Course;
import com.mycompany.studentregistration.Module;


/**
 *
 * @author lorca
 */
public class ProjectDriver {
    public static void main(String[] args){
        


        //creating mock student data
        Student s1 = new Student("Lorcan Creedon", 22, "31/03/1998", 16422524);
        Student s2 = new Student("Matty Longstaff", 25, "01/03/1994", 16422224);
        Student s3 = new Student("Dominic Calvert-Lewin", 23, "31/03/1997", 1632521);
        Student s4 = new Student("Sadio Mane", 32, "31/03/1988", 16422555);
        Student s5 = new Student("Bruno Fernandes", 29, "31/03/1991", 1641234);
        
      //creating mock course data
        Course c1 = new Course("BCT", new LocalDate(2020, 7, 8), new LocalDate(2021, 5, 25));
        Course c2 = new Course("CCT", new LocalDate(2020, 7, 8), new LocalDate(2021, 5, 20));

        
        //creating mock module data
        Module m1 = new Module("Software Engineering", "CT417");
        Module m2 = new Module("Machine Learning", "CT555");
        Module m3 = new Module("Statistics 4", "MA410");
        Module m4 = new Module("Professional Skills", "CC509");
        
        //adding modules and students to course
        c1.addModules(m1);
        c1.addModules(m2);
        c2.addModules(m3);
        c2.addModules(m4);
        c1.addStudents(s1);
        c1.addStudents(s2);
        c1.addStudents(s3);
        c2.addStudents(s4);
        c2.addStudents(s5);
        Course[] courses = {c1, c2};

        for(Course c : courses) {
            System.out.println(c);
            //using foreach statement to print out courses corresponding modules and students
            c.getModules().forEach(module -> System.out.println(module));
            c.getStudents().forEach(student -> System.out.println(student));
            System.out.println("\n");
        }        
    }
}
