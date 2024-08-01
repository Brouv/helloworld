public class Main {
    public static void main(String[] args) {

        // task #1

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // task #2

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // task #3

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // task #4

        for (int i = 10; i >= -10 ; i = i - 1) {
            System.out.println(i);
        }

        // task #5

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        // task #6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // task #7

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // task #8

        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
           total = total + money;
           System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        // task #9

        int money1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + money1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей. ");
        }

        // task #10

        int a = 0;
        int b = 2;
        for (int i = 1; i <= 10; i++) {
            a = a + b;
            System.out.println("2 * " + i + " = " + a );
        }
    }
}