public class Main {
    public static void main(String[] args) {

        // task1

        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке.");
        } else {
            System.out.println("Установите версию для Android по ссылке.");
        }

        // task2

        byte clientOS1 = 0;
        int clientDeviceYear = 2014;
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для iOS по ссылке.");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке.");
        }

        //task3

        int year = 1704;
        if ((year >= 1584) && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Этот " + year + " год является високосным.");
        } else {
            System.out.println("Этот " + year + " год не является високосным.");
        }

        //task 4

        int deliveryDistance = 47;
        if (deliveryDistance < 20) {
            int deliveryDay = 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60){
            int deliveryDay = 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            int deliveryday = 3;
            System.out.println("Потребуется дней: " + deliveryday);
        }else {
            System.out.println("Доставки, на такое расстояние, не осущевляются.");
        }

        //task5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}