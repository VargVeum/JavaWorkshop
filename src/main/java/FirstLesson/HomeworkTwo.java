package FirstLesson;

import java.util.Scanner;

public class HomeworkTwo {
    private static Scanner sc;

    /*Допустим, число 55. Должно определять, что здесь две цифры - 5 и 5, и выводить сумму этих чисел
     5 + 5 = 10

     Дано натурально число а (a<100).
     Напишите программу, выводящую на экран количество цифр в этом числе и сумму этих цифр.*/

    public static void main(String[] args) {


                int number, count = 0, summary = 0;
                int digit;
                sc = new Scanner(System.in);

                System.out.println("\n Введите число для анализа: ");
                number = sc.nextInt();

                    while(number > 0) {
                        digit = number % 10;
                        number = number / 10;
                        count = count + 1;

                        summary = summary + digit;
                    }
                System.out.format("\n Количество цифр в числе = %d", count);
                System.out.format("\n Их сумма = %d", summary);
            }
        }






