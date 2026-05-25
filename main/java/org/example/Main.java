package org.example;

import java.util.Scanner;

public class Main {
    static void line() {
        System.out.println("-------------------------------------------------");
    }
    static void main(String[] args) {
        new HibernateUtil();
        Scanner sc= new Scanner(System.in);
        BackendForImage backend = new BackendForImage();
        boolean isBackendOn = true;
        while (isBackendOn) {
            System.out.println("1.ImageToDbStore\n2.DbToImageStore\n3.Exit");
            line();
            System.out.print("Choose Option: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("<><><> Image To Database Transfer Process <><><>");
                    line();
                    System.out.print("Enter File Path: ");
                    String path1 = sc.nextLine();
                    backend.transerFileLogic(path1);
                    System.out.println("Done..");
                    break;

                case 2:
                    System.out.println("<><><> Database To Image Transfer Process <><><>");
                    line();
                    System.out.print("Enter File Path: ");
                    String path2 = sc.nextLine();
                    backend.takeFileLogic(path2);
                    System.out.println("Done..");
                    break;

                case 3:
                    line();
                    System.out.println("Thank You..");
                    HibernateUtil.end();
                    isBackendOn = false;
                    break;
            }
        }
    }
}
