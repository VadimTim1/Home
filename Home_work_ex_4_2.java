package HomeWork1;

public class Home_work_ex_4_2 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2= 20;
        int num3 = 30;
        int result;

        if (num1 >= num2 && num1 >= num3) {
            if(num2 >= num3){
                result = (num1 + num2) / 2;
            }else{
                result = (num1 + num3) / 2;
            }
        }else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                result = (num2 + num1) / 2;
            } else{
                result = (num2 + num3) / 2;
            }
        }else{
            if (num1 >= num2) {
                result = (num3 + num1) / 2;
            } else{
                result =(num3 + num2) / 2;

                System.out.println("Среднее значение:" + result);
            }
        }
    }
}
