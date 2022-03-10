package uz.ifElseSwitch;

import java.util.Scanner;

public class MinCalc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("+-*/");
            double num1 = in.nextInt();
            String text = in.next();
            double num2 = in.nextInt();
            double natija;
            switch (text) {
                case "+":
                    natija = num1 + num2;
                    System.out.println(num1+" + "+num2+" = "+natija);
                    break;
                case "-":
                    natija = num1 - num2;
                    System.out.println(num1+" - "+num2+" = "+natija);
                    break;
                case "*":
                    natija = num1 * num2;
                    System.out.println(num1+" * "+num2+" = "+natija);
                    break;
                case "/":
                    natija = num1 / num2;
                    System.out.println(num1+" / "+num2+" = "+natija);
                    break;
                default:
                    System.out.println("Error");
            }
            if (num1==0){
                in.close();
                break; // stop process...
            } else {
                continue; // process code ....
            }

        }
    }
}