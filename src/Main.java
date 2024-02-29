import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adminUsername = "admin";
        String adminPassword = "123"; // Ganti dengan password admin yang sesuai
        String nim;
        int option;

        System.out.println("Library System");
        System.out.println("1. Login as student");
        System.out.println("2. Login as admin");
        System.out.println("3. Exit");

        while (true) {
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline setelah input angka

            switch (option) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    nim = scanner.nextLine();
                    if (nim.length() == 15) {
                        System.out.println("Student login successful!");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    if (username.equals(adminUsername)) {
                        System.out.print("Enter your password: ");
                        String password = scanner.nextLine();
                        if (password.equals(adminPassword)) {
                            System.out.println("Admin login successful!");
                        } else {
                            System.out.println("Incorrect password.");
                        }
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the library system.");
                    return; // Keluar dari program
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}