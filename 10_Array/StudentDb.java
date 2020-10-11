import java.util.*;

public class StudentDb {
    public static String[] insurt_entry() {
        Scanner in = new Scanner(System.in);
        String[] student = new String[4];
        System.out.print("Name: ");
        student[0] = in.nextLine();
        System.out.print("Roll no: ");
        student[1] = in.nextLine();
        System.out.print("Class: ");
        student[2] = in.nextLine();
        System.out.print("Marks: ");
        student[3] = in.nextLine();
        in.close();
        return student;
    }

    public static void display_entry(String[] student) {
        System.out.println("Name: " + student[0]);
        System.out.println("Roll No: " + student[1]);
        System.out.println("Class: " + student[2]);
        System.out.println("Marks: " + student[3]);
    }

    public static void main(String args[]) {
        String[] student1 = new String[4];
        student1 = insurt_entry();
        display_entry(student1);

    }
}
