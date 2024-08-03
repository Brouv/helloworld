public class Main {
    public static void main(String[] args) {

        // task #1

        int money = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + money;
            i++;
        }
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");

        // task #2

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a);
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b);
        }
        System.out.println();

        // task #3

        int countryPopulation = 12_000_000;
        int birthRate = countryPopulation / 1000 * 17;
        int deathRate = countryPopulation / 1000 * 8;
        int c = 0;
        while (c < 10) {
            c++;
            countryPopulation = countryPopulation + birthRate - deathRate;
            System.out.println("Год " + c + " численность населения составляет " + countryPopulation + ".");
        }

        // task #4

        int contribution = 15000;
        int d = 0;
        while (contribution < 12_000_000) {
            int percent = contribution / 100 * 7;
            contribution = contribution + percent;
            d++;
            System.out.println("Месяц " + d + ", сумма по вкладу = " + contribution + " рублей.");
        }

        // task #5

        int contribution1 = 15000;
        int d1 = 0;
        while (contribution1 < 12_000_000) {
            int percent1 = contribution1 / 100 * 7;
            contribution1 = contribution1 + percent1;
            d1++;
            if (d1 % 6 == 0) {
                System.out.println("Месяц " + d1 + ", сумма по вкладу = " + contribution1 + " рублей.");
            }
        }

        // task #6

        int contribution2 = 15000;
        int d2 = 0;
        while (d2 < 108) {
            int percent2 = contribution2 / 100 * 7;
            contribution2 = contribution2 + percent2;
            d2++;
            if (d2 % 6 == 0){
            System.out.println("Месяц " + d2 + ", сумма по вкладу = " + contribution2 + " рублей.");
            }
        }

            // task #7

        int friday = 5;
        for (int currentFriday = friday; currentFriday < 31; currentFriday +=7){
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчёт.");
        }

            // task #8
        int year = 2024;
        int startYear = year - 200;
        int stopYear = year + 100;
        for (int e = startYear; e < stopYear; ++e){
           if (e % 79 == 0){
            System.out.println(e);
            }
        }
    }
}