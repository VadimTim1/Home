package HomeWork1;

import java.util.Scanner;

public class Home_work_ex_6_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");

        }
    }
}
