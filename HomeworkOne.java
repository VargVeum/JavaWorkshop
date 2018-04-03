package Workshop_one;

import java.util.Scanner;

public class HomeworkOne {
    public static void main(String args[])
    {
        int num;
        System.out.println("Введите число:");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if ( num % 2 == 0 )
            System.out.println("Введенное число является четным");
        else
            System.out.println("Введенное число является нечетным");
    }


}
