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

//                   task#5

         byte havePots = 120;
         System.out.println(havePots);
         byte exepensesOneClassW = 2;
         System.out.println(exepensesOneClassW);
         byte exepensesOneClassBr = 4;
         System.out.println(exepensesOneClassBr);
         int exepensesOneClass = exepensesOneClassW + exepensesOneClassBr;
         System.out.println("Всего на 1 класс уходит " + exepensesOneClass + " банок");
         int haveClass = havePots / exepensesOneClass;
         int needPotsW = exepensesOneClassW * haveClass;
         int needPotsBr = exepensesOneClassBr * haveClass;
         System.out.println("В школе, где " + haveClass + " классов, нужно " + needPotsW + " банок белой краски и " + needPotsBr + " банок коричневой краски.");

//                  task#6

         byte banana = 5;
         System.out.println("Всего " + banana + " бананов в коктейль");
         int weightBanana = banana * 80;
         System.out.println("Всего вес бананов в коктейле " + weightBanana + " гр.");
         short milk = 200;
         System.out.println("Налить " + milk + " мл.");
         int weightMilk = milk / 100 * 105;
         System.out.println("Масса молока в коктейле равна " + weightMilk + " гр.");
         byte iceCream = 2;
         System.out.println("Добавить " + iceCream + " мороженного в коктейль");
         int weightIceCream = iceCream * 100;
         System.out.println("Масса мороженного в коктейле, составит " + weightIceCream + " гр.");
         byte egg = 4;
         int weightEgg = egg * 70;
         System.out.println("Так же добавьте " + egg + " яйца. Суммарная масса которых в коктейле равна " + weightEgg + " гр.");
         int allWeightGr = weightBanana + weightMilk + weightIceCream + weightEgg;
         float allWeightKg = (float)allWeightGr / 1000;
         System.out.println("Масса такого спортзавтрака в граммах равна " + allWeightGr);
         System.out.println("Масса в килограммах равна " + allWeightKg);

//                   task#7

         byte needDawnKg = 7;
         System.out.println("Нужно сбросить " + needDawnKg + " кг.");
         short needDawnGrMin = 250;
         System.out.println("Минимум " + needDawnGrMin + " гр. в день");
         short needDawnGrMax = 500;
         System.out.println("Максимум " + needDawnGrMax + " гр. в день");
         short oneKg = 1000;
         System.out.println("1 кг = " + oneKg + " гр.");
         int kgInGr = needDawnKg * oneKg;
         System.out.println("Всего нужно сбросить в граммах - " + kgInGr);
         int daysMin = kgInGr / needDawnGrMin;
         System.out.println("Кол-во дней, при минимальном сбросе веса, получится - " + daysMin);
         int daysMax = kgInGr / needDawnGrMax;
         System.out.println("Кол-во дней, при максимальном сбросе веса, получается - " + daysMax);
         int mediumDays = (daysMax + daysMin) / 2;
         System.out.println("Среднее кол-во дней, чтобы добиться результата похудения - " + mediumDays);

//                      task#8

         int masha = 67760;
         System.out.println("Старая з/п Маши " + masha + " руб.");
         int denis = 83690;
         System.out.println("Старая з/п Дениса " + denis + " руб.");
         int kristina = 76230;
         System.out.println("Старая з/п Кристины " + kristina + " руб.");
         byte monthInYear = 12;
         int maneyOldM = masha * monthInYear;
         System.out.println("Маша за прошлый год получала " + maneyOldM + " руб.");
         int maneyOldD = denis * monthInYear;
         System.out.println("Денис за прошлый год получил " + maneyOldD + " руб.");
         int maneyOldK = kristina * monthInYear;
         System.out.println("Кристина за прошлый год получила " + maneyOldK + " руб.");
         int procent10M = masha / 100 * 10;
         System.out.println("10 процентов от зарплаты Маши - " + procent10M);
         int procent10D = denis / 100 * 10;
         System.out.println("10 процентов от зарплаты Дениса - " + procent10D);
         int procent10K = kristina / 100 * 10;
         System.out.println("10 процентов от зарплаты Кристины - " + procent10K);
         int mashaNewYear = masha + procent10M;
         System.out.println("Новая з/п с надбавкой у Маши " + mashaNewYear);
         int denisNewYear = denis + procent10D;
         System.out.println("Новая з/п с надбавкой у Дениса " + denisNewYear);
         int kristinaNewYear = kristina + procent10K;
         System.out.println("Новая з/п с надбавкой у Кристины " + kristinaNewYear);
         int maneyNewM = mashaNewYear * monthInYear;
         System.out.println("В этом году, Маша получит " + maneyNewM);
         int maneyNewD = denisNewYear * monthInYear;
         System.out.println("В этом году, Денис получит " + maneyNewD);
         int maneyNewK = kristinaNewYear * monthInYear;
         System.out.println("В этом году, Кристина получит " + maneyNewK);
         int diffManeyInYearsM = maneyNewM - maneyOldM;
         int diffManeyInYearsD = maneyNewD - maneyOldD;
         int diffManeyInYearsK = maneyNewK - maneyOldK;
         System.out.println("Маша теперь получает " + mashaNewYear + " рублей. Годовой доход вырос на " + diffManeyInYearsM + " руб.");
         System.out.println("Денис теперь получает " + denisNewYear + " рублей. Годовой доход вырос на " + diffManeyInYearsD + " руб.");
         System.out.println("Кристина теперь получает " + kristinaNewYear + " рублей. Годовой доход вырос на " + diffManeyInYearsK + " руб.");
    }
}
