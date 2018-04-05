package FirstLesson;

import java.util.Scanner;

public class Workshop_one {

    public static void main(String[] args) {
        byte a = 15;
        short b = 15000;
        char c = 'c';
        int d = 150000;
        double e = 5.5;
        currency();
        //workWithCircle();

    }

    public static void workWithCircle() {
        double pi = 3.1456;

        System.out.println("Welcome to 'Work with circle application'!");
        System.out.println("Please, insert the radius");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();
        /*if (radius < 0){
//            radius = radius * -1;
            System.out.println("You input wrong number");
        }
        else {
            radius = radius > 0 ? radius : radius * -1;
            System.out.println("Circle length is " + radius * 2 * pi);
            System.out.println("Circle area is " + pi* pi * radius);
    }*/

        radius = radius > 0 ? radius : radius * -1;
        System.out.println("Circle length is " + radius * 2 * pi);
        System.out.println("Circle area is " + pi* pi * radius);
    }

    public static void currency() {
        System.out.println("Select currency: 1 - dollars, 2 - euro, 3 - pounds");
        Scanner in = new Scanner(System.in);
        int currencyType = in.nextInt();
        System.out.println(("Enter sum to transform"));

        double sum = in.nextDouble();

        double resultSum = 0;

        switch (currencyType){
            case 1 :
                resultSum = sum * 26.3;
                break;
            case 2 :
                resultSum = sum * 29.5;
                break;
            case 3 :
                resultSum = sum * 30.3;
                break;
                default:
                    System.out.println("Currency isn't selected");
        }
        System.out.println(resultSum);
    }

}
