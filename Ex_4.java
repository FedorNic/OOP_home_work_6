package Home_Tasks.HT_14;

import java.util.InputMismatchException;
import java.util.Scanner;

//2. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Ex_4 {
    public static void main(String[] args) {
        System.out.println(getString());
    }

    public static String getString() {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.isEmpty())
            throw new RuntimeException("Вы ввели пустую строку. Пустые строки вводить нельзя!");
        return string;
    }
}