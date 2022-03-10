package uz.ifElseSwitch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter Number: ");
            var enterNumber = scanner.nextInt();


            switch (enterNumber) {

                case 1:
                    System.out.println("Add people: " + enterNumber);
                    break;

                case 2:
                    System.out.println("Show people: " + enterNumber);
                    break;

                case 3:
                    System.out.println("Delete people : " + enterNumber);
                    break;

                case 4:
                    System.out.println("Update people Info: " + enterNumber);
                    break;

                case 5:
                    System.out.println("Show price your service: ");
                    break;


                default:
                    System.out.println("Error number : " + enterNumber);


            }

            if (enterNumber==0){
                scanner.close();
                break; // stop process...
            } else {
                continue; // process code ....
            }
        }

    }
}