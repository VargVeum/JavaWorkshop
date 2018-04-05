package FirstLesson;

import java.util.Scanner;

public class HomeworkThree {

    public static void main(String[] args) {

        System.out.println("Выберите метрическую систему: 1 - сантиметры в дюймы, 2 - дюймы в сантиметры");
        Scanner in = new Scanner(System.in);
        int currencyType = in.nextInt();
        System.out.println(("Введите число для конвертирования"));

        double sum = in.nextDouble();

        double resultSum = 0;

        switch (currencyType){
            case 1 :
                resultSum = sum / 2.54;
                break;
            case 2 :
                resultSum = sum * 2.54;
                break;
            default:
                System.out.println("Число не указано");
        }
        System.out.println(Math.round(resultSum));
    }
}
