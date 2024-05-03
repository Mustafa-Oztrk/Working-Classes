import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class School {

    ArraysLessons arrays = new ArraysLessons();

    public static   ArrayList<Students> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public String name, surName, studentNumber, lessonName;
    public int lessonId = 1;
    public double visa, fianll,average;


    public void studentSave() {
        System.out.println("Student Name: ");
        name = scanner.next();

        System.out.println("Student Surname: ");
        surName = scanner.next();

        System.out.println("Student Number: ");
        studentNumber = scanner.next();

        Students newStudent =  new Students(name,surName,studentNumber);
        students.add(newStudent);

        System.out.println("New Student : " + newStudent);
//        System.out.println("success :) Name : " + name + " Surname : " + surName + " Number : " +studentNumber +"\n");

    }

    public void lessonRegister() {
        System.out.println("Student Number : ");
        studentNumber = scanner.next();

        System.out.println("Lesson Name : ");
        lessonName = scanner.next();

        for (Students students1 : students){
            if (students1.getStudentNumber().equals(studentNumber)){
                System.out.println("Student Name : " + students1.getName()+ " Lesson Name : " + lessonName);
                return;
            }else {
                System.out.println("Erorr!");
            }
        }

    }
    public void newLessons() {
      if (lessonId<arrays.lessonsName.length){
          System.out.println("lesson Name: ");
          lessonName =  scanner.next();

          System.out.println("LessonId: " + lessonId);
          lessonId= arrays.lessonsName.length+1;

          arrays.lessonsName = Arrays.copyOf(arrays.lessonsName,lessonId);
          arrays.lessonsName[lessonId-1] = lessonName;

          System.out.println("success :) Lesson Id : " + lessonId + " Lesson Name : " + lessonName+"\n" );
      }
    }

    public void lessonsCount(){
        for (int i =0; i<arrays.lessonsName.length; i++){
            System.out.println("ID : "+ i + " Lessons Name : "+arrays.lessonsName[i]+"\n");
        }
    }


    public  void exam(){
        System.out.println("visa note: ");
        visa =  scanner.nextDouble();

        System.out.println("finall note : ");
        fianll = scanner.nextDouble();

        average =  visa * 0.4 + fianll * 0.6;


        System.out.println("average: " + average +"\n");
    }

}
