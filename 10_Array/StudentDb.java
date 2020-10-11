// Inplement ArrayList
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
        student[3] = in.next();
        in.close();
        return student;
    }

    public static void display_entry(String[] student) {
        System.out.println(
                "Name: " + student[0] + " Roll No: " + student[1] + " Class: " + student[2] + " Marks: " + student[3]);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char ch;
        List<String[]> studentList = new ArrayList<String[]>();
        //Insert
        while (true) {
            studentList.add(insurt_entry());
            System.out.println("Do you wants to enter another student (Y/N): ");
            ch = in.next().toCharArray()[0];
            if (ch != 'y' && ch != 'Y')  {
                break;
            }
            System.out.println("You entered " + ch);
        }
        
        //Displaydisplay_entry
        for (int i = 0; i < studentList.size(); i++) {
            display_entry(studentList.get(i));
        }
        
    }
}
