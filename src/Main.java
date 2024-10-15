import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            //task #1

        int[] sumCost = {30, 25, 29, 32, 33};
        int sum = 0;
        for (int element : sumCost) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

            //task #2

        int[] cost = {30, 25, 29, 32, 33};
        int minCost = 40;
        for (final int current : cost) {
        if (current < minCost){
                minCost = current;
            }
        }
       System.out.println("Минимальная сумма трат за неделю составила " + minCost + " рублей.");

        int maxCost = -1;
        for (final int current : cost) {
            if (current > maxCost) {
                maxCost = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxCost + " рублей.");

            //task #3

    int[] midCost = {30,43,44,35,37};
    int sumMonth = 0;
    for (int element : midCost){
        sumMonth = sumMonth + element;
    }
        float midSum = sumMonth / 5.0f;
        System.out.println("Средняя сумма трат за месяц составила " + midSum + " рублей");

            //task #4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}