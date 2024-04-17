package com.contact.contactManager;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Name contactManager = new Name();
    Scanner scanner = new Scanner(System.in);
    while(true){
         
        System.out.println("1.) Add Contact Name");
        System.out.println("2.) Display All Contact");
        // System.out.println("4.) Delete All Contact");
        // System.out.println("5.) Exit");
        System.out.println("Enter your choice :");
        int choice = scanner.nextInt();
        scanner.nextLine();


        switch (choice) {
            case 1:
                System.out.print("Enter contact name: ");
                String name = scanner.nextLine();
                 
                contactManager.insertLast(name);
                break;
            case 2:
                contactManager.display();
                break;
            // case 3:
            //     System.out.print("Enter contact name to search: ");
            //     String searchName = scanner.nextLine();
            //     contactManager.searchContact(searchName);
            //     break;
            // case 4:
            //     System.out.print("Enter contact name to delete: ");
            //     String deleteName = scanner.nextLine();
            //     contactManager.deleteContact(deleteName);
            //     break;
            // case 5:
            //     System.out.println("Exiting...");
            //     System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    // name.insertLast("Vivek");
    // name.insertLast("Arina");
    // name.insertLast("Aditya");
    // name.insertLast("Krishna");
    // name.insertLast("Prerna");
    // name.delete(1);
    // name.find("Arina");
    
    // name.display();
     


}
}
