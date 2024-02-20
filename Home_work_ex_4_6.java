package HomeWork1;

public class Home_work_ex_4_6 {
    public static void main(String[] args) {

        int year = 2024;

        if ((year & 400) == 0) {
            System.out.println(year + " - високосный год");
        } else if ((year & 100) == 0) {
            System.out.println(year + " - !високосный год");
        } else if (year % 4 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - !високосный год");
        }
    }
}
