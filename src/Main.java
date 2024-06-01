public class Main {
    public static void main(String[] args) {

//                task#1

         int a = 2_000_000;
         System.out.println("Значение переменной a с типом int равно " + a);
         byte b = 100;
         System.out.println("Значение переменной b с типом byte равно " + b);
         short c = 30_000;
         System.out.println("Значение переменной c с типом short равно " + c);
         long d = 9_000_000L;
         System.out.println("Значение переменной d с типом long равно " + d);
         float e = 1.01f;
         System.out.println("Значение переменной e с типом float равно " + e);
         double f = 2.66d;
         System.out.println("Значение переменной f с типом double равно " + f);

//                  task#2

         float a1 = 27.12f;
         System.out.println(a1);
         long b2 = 987_678_965_549L;
         System.out.println(b2);
         double c2 = 2.786;
         System.out.println(c2);
         short d2 = 569;
         System.out.println(d2);
         short e2 = -159;
         System.out.println(e2);
         short f2 = 27897;
         System.out.println(f2);
         byte g2 = 67;
         System.out.println(g2);

//                 task#3
         byte t1 = 23;
         System.out.println("Ludmila Pavlovna have " + t1 + " pupils");
         byte t2 = 27;
         System.out.println("Anna Sergeevna have " + t2 + " pupils");
         byte t3 = 30;
         System.out.println("Ekaterina Andreevna have " + t3 + " pupils");
         short sheetsOfPaper = 480;
         System.out.println("They buy " + sheetsOfPaper + " sheets of paper");
         int sumPupils = t1 + t2 + t3;
         System.out.println("They have a total of " + sumPupils + " pupils");
         int paperForPupil = sheetsOfPaper / sumPupils;
         System.out.println("На каждого ученика рассчитано " + paperForPupil + " листов бумаги");

//                  task#4

         byte bottels = 16;
         byte timesForProduction = 2;
         System.out.println("За " + timesForProduction + " минуты машина произвела " + bottels + " штук бутылок");
         byte timesForProduction1 = 1;
         int bottelsForOneMin = bottels / timesForProduction;
         System.out.println("За " + timesForProduction1 + " минуту машина произвела " + bottelsForOneMin + " штук бутылок");
         byte timesForProduction3 = 20;
         int bottelsProduction20 = bottelsForOneMin * timesForProduction3;
         System.out.println("За " + timesForProduction3 + " минут машина произвела " + bottelsProduction20 + " штук бутылок");
         byte timesForProduction4 = 24;
         int bottelsProduction1D = bottelsForOneMin * timesForProduction4 * 60;
         System.out.println("За " + timesForProduction4 + " часа машина произвела " + bottelsProduction1D + " штук бутылок");
         byte threeDays = 3;
         int bottelsProduction3D = bottelsProduction1D * threeDays;
         System.out.println("За " + threeDays + " дня машина произвела " + bottelsProduction3D + " штук бутылок");
         int bottelsProduction31D = bottelsProduction1D * 31;
         System.out.println("За " + timesForProduction1 + " месяц машина произвела " + bottelsProduction31D + " штук бутылок");

    }
}
