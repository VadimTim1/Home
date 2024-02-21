package home_work_1;

public class home_work_ex_4_4 {
    public static void main(String[] args) {

        int bytes = 2048;
        int kilobytes;

        if (bytes < 0) {
            System.out.println("Некорректное значение байт");
        }else if (bytes < 1024){
            System.out.println("Размер файла меньше килобайта");
        } else if (bytes % 1024 == 0) {
            kilobytes = bytes / 1024;
            System.out.println(bytes + "байт равно" + kilobytes + " килобайтам");
        } else {
            kilobytes = bytes / 1024 + 1;
            System.out.println(bytes + "байт равно" + kilobytes + "килобайтам");
        }
    }
}
