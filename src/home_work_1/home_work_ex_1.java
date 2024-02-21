package home_work_1;

public class home_work_ex_1 {
    public static void main(String[] args) {
        int q = 12; // двоичное число 1100
        int w = 10; // двоичное число 1010
        int a = q & w;
        int b = q | w;

        System.out.println(Integer.toBinaryString(q)); // перевод числа 12 в двоичное число
        System.out.println(Integer.toBinaryString(w)); // перевод числа 10 в двоичное число
        System.out.println(a); //проведение операции И
        System.out.println(b);//проведение операции ИЛИ


    }
}
