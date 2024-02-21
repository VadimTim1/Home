package HomeWork1;

import java.util.Scanner;

public class Home_work_ex_6_3 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);


        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        switch(name) {
            case "Вася" :
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;
            case "Анастасия" :
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день,а ты кто?");
                break;
        }
    }
}
