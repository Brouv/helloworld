public class Main {
    public static void main(String[] args) {

        //        task#1

        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        //        task#2

        int temp = 0;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно одеть шапку.");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов , можно идити без шапки.");
        }

        //        task#3

        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }
}