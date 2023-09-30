package com.emailAdmin;

import java.util.Scanner;

public class EmailApplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String f_name = s.next();
        System.out.println("Enter Last Name:");
        String l_name = s.next();

        // Creating a new employee (i.e. an object of the Email class)
        Email em1 = new Email(f_name, l_name);

        int choice = -1;
        do {
            System.out.println("\n**********\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
                    + "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Store data in file\n6.Show file\n7.Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1 -> em1.getInfo();
                case 2 -> em1.set_password();
                case 3 -> em1.set_mailCap();
                case 4 -> em1.alternate_email();
                case 5 -> em1.storefile();
                case 6 -> em1.read_file();
                case 7 -> System.out.println("\nTHANKS!!!");
                default -> System.out.println("INVALID CHOICE! ENTER AGAIN!");
            }

        }while(choice!=7);

    }

}