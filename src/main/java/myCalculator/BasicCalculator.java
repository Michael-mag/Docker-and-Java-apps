package myCalculator;

import java.util.Scanner;

public class BasicCalculator {
    public BasicCalculator(){
        System.out.println(" WELCOME...HAVE FUN! \n");
    }

    public static int addNumbers(int n1, int n2){
        return n1 + n2;
    }

    public static double addNumbers(double n1, double n2){
        return n1 + n2;
    }

    public static double divideNumbers (double top, double bottom){
        try {
            return top / bottom;
        }catch(ArithmeticException e){
            if (bottom == 0){
                System.out.println("Invalid Operation, division by 0 is not possible.");
            }
        }
        return 0;
    }

    public static void main(String[] args){
        String exit = "exit";
        System.out.println("What do you want to do? ");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next();

        while(!operator.equals(exit)){
            System.out.println("first num: ");
            var num1 = scanner.nextDouble();
            System.out.println("second num: ");
            var num2 = scanner.nextDouble();
            if (operator.equals("add")){
                System.out.println(num1 + " + " + num2 + " = " + addNumbers(num1, num2));
            }else if (operator.equals("div")){
                System.out.println(num1 + " / " + num2 + " = " + divideNumbers(num1, num2));
            }else{
                System.out.println("Operation not Implemented ...");
                break;
            }

            System.out.println("What next? ");
            operator = scanner.next();
        }

    }
}
