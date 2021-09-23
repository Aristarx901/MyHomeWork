package Lesson2;

public class Lesson2 {

    public static void main(String[] args) {

        System.out.println(number1(11, 15));
        number2(3);
        System.out.println(number3(5));
        number4();
    }

    public static boolean number1(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else return false;
    }


    public static void number2 (int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательое");
        }
    }


    public static boolean number3 (int x){
        if (x < 0) {
            return true;
        }
        return false;
    }

        public static void number4(){

            for (int i = 0; i < 5; i++) {
                System.out.println("hhh");
            }

        }

}
