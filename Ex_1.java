package Home_Tasks.HT_14;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//        необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        try {
            System.out.println(getFloat());
        } catch (InputMismatchException ex) {
            System.out.println("Число введено неверно.");
            try {
                System.out.println(getFloat());
            } catch (InputMismatchException e) {}
            System.out.println("Число порторно введено неверно. Программа закрывается." +
                    " Запустите программу повторно и попробуйте еще раз.");
        }
    }

        public static float getFloat() {
        System.out.println("Введите дробное число (типа float)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
}
