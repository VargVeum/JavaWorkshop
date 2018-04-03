package Workshop_one;

import java.util.Scanner;

public class HomeworkFour {

    //Напишите программу, реализующую популярную телевизионную игру “Кто хочет стать миллионером”.

    private static Scanner sc;

    public static void main(String[] args) {
        int answer;
        int a = 5000;
        int b = 10000;
        int c = 15000;
        int d = 20000;
        int sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру “Кто хочет стать ПолиЦИонером? ");
        System.out.println("\n Первый вопрос! Какой полицейский автомобиль пострадал больше всего от действий полицейских и их стиля вождения? " +
                "\n 1 - Ford Crown Victoria, 2 - Toyota Prius, 3 - Chevrolet Tahoe, 4 - Daewoo Lanos");
        answer = sc.nextInt();
        if (answer != 2){
            System.out.println("\n Неправильно *Плачущий котик*. Правильный ответ: 2 - Toyota Prius ");
            return;
        }
        System.out.println("Вы ответили правильно! Сумма выигрыша: " + a);

        System.out.println("\n Второй вопрос! Какой пистолет состоит на вооружении у полицейских ? " +
                "\n 1 - Пистолет Макарова, 2 - Форт 17, 3 - Glock 17, 4 - Они не вооружены и сами зовут на помощь при нападении");
        answer = sc.nextInt();
        if (answer != 2){
            System.out.println("\n Неправильно *Плачущий котик*. Правильный ответ: 2 - Форт 17 ");
            return;
        }
        sum = a + b;
        System.out.println("Вы ответили правильно! Сумма выигрыша: " + sum);

        System.out.println("\n Третий вопрос! Форма какого цвета у полицейских ? " +
                "\n 1 - Синяя, 2 - Красная, 3 - Серая, 4 - Зеленая");
        answer = sc.nextInt();
        if (answer != 1){
            System.out.println("\n Неправильно *Плачущий котик*. Правильный ответ: 1 - Синяя ");
            return;
        }
        sum = a + b + c;
        System.out.println("Вы ответили правильно! Сумма выигрыша: " + sum);

        System.out.println("\n Четвертый вопрос! Какой номер у полиции ? " +
                "\n 1 - 01, 2 - 911, 3 - 117, 4 - 02");
        answer = sc.nextInt();
        if (answer != 4){
            System.out.println("\n Неправильно *Плачущий котик*. Правильный ответ: 4 - 02 ");
            return;
        }
        sum = a + b + c + d;
        System.out.println("Вы ответили правильно! Сумма выигрыша: " + sum);
        System.out.println("Игра завершена! Спасибо за участие!");
    }
}
