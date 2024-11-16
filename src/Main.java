import javax.swing.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void calculateLeapYear(int year){
        if ((year >= 1584) && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Этот " + year + " год является високосным.");
        } else {
            System.out.println("Этот " + year + " год не является високосным.");
        }
    }

    public static void task1() {
        int year = 2021;
        calculateLeapYear(year);
    }


    public static void oS(int clientOS){
        int currentYear = 2016;
        // int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS == 0 && currentYear >= 2015) {
            System.out.println("Установите версию для iOS по ссылке.");
        } else if (clientOS == 1 && currentYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке.");
        }
    }

    public static void  task2() {
        int clientOS = 0;
        oS(clientOS);
    }


    public static void calculateDistanceAndTime (int deliveryDistance){
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        if (deliveryDistance > 20) {
            deliveryDay++;
            System.out.println("Потребуется дней: " + deliveryDay);
        }  if (deliveryDistance >= 60 && deliveryDistance <= 100){
            deliveryDay ++;
            System.out.println("Потребуется дней: " + deliveryDay);
        }else if(deliveryDistance > 100){
            System.out.println("Доставки, на такое расстояние, не осущевляются.");
        }return;
    }


    public static void task3(){
        int deliveryDistance = 15;
        calculateDistanceAndTime(deliveryDistance);
    }
}