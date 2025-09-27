import java.util.Scanner;
public class DisplayNameAndRollNumber {
    public static void main(String[] args) {
        int initialSize = 2;
        int[] ids = new int[initialSize];
        String[] names = new String[initialSize];
        int studentCount = 0; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Memory is allocated for only " + initialSize + " Students in Array");
        while (studentCount < ids.length) {
            System.out.println("Enter ID");
            ids[studentCount] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Name");
            names[studentCount] = scanner.nextLine();
            
            studentCount++; 
        }
        System.out.println("Student List");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(ids[i] + " " + names[i]);
        }

        System.out.println("Do u want to Extend the list??? y / n");
        char choice = scanner.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            System.out.println("Enter ID");
            int newId = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Enter Name");
            String newName = scanner.nextLine();

            System.out.println("Attempting to add to index " + studentCount + "...");
            ids[studentCount] = newId;
            names[studentCount] = newName;
        }

        System.out.println("\nProgram finished.");
        scanner.close();
    }
}