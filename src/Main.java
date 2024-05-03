import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        while (true) {
            System.out.println("select transaction number \n 1. student registration \n 2.Lesson registration \n 3. add lesson \n 4. average calculation \n 5. Lessons Name Count \n 6. Exit");
            System.out.print("your choice : ");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    school.studentSave();
                    break;
                case 2:
                    school.lessonRegister();
                    break;
                case 3:
                    school.newLessons();
                    break;
                case 4:
                    school.exam();
                    break;
                case 5:
                    school.lessonsCount();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("You made an invalid choice :)");
            }
        }
    }
}