public class Main {
    public static void main(String[] args) {

//                 task#1

         var dog = 8.0;
         System.out.println(dog);
         var cat = 3.6;
         System.out.println(cat);
         var paper = 763789;
         System.out.println(paper);

//                  task#2

         var dog1 = dog + 4;
         System.out.println(dog1);
         var cat1 = cat + 4;
         System.out.println(cat1);
         var paper1 = paper + 4;
         System.out.println(paper1);

//                  task#3

         var dog2 = dog1 - 3.5;
         System.out.println(dog2);
         var cat2 = cat1 - 1.6;
         System.out.println(cat2);
         var paper2 = paper1 - 7639;
         System.out.println(paper2);

//                  task#4

         var friend = 19;
         System.out.println(friend);
         var friend1 = friend + 2;
         System.out.println(friend1);
         var friend2 = friend1 / 7;
         System.out.println(friend2);

//                  task#5

         var frog = 3.5;
         System.out.println(frog);
         var frog1 = frog * 10;
         System.out.println(frog1);
         var frog2 = frog1 / 3.5;
         System.out.println(frog2);
         var frog3 = frog2 + 4;
         System.out.println(frog3);

//                   task#6

         var boxer1 = 78.2;
         System.out.println(boxer1 + " kg");
         var boxer2 = 82.7;
         System.out.println(boxer2 + " kg");
         var totalWeight = boxer1 + boxer2;
         System.out.println(totalWeight + " kg");
         var difference = boxer2 - boxer1;
         System.out.println("Разница между двумя боксёрами составляет " + difference + " kg");

//                   task#7

         var separationOfWeightsBoxers = boxer2 % boxer1 ;
         System.out.println(separationOfWeightsBoxers + " kg");

//                   task#8/1

         var allTimesWork = 640;
         System.out.println(allTimesWork + " часов");
         var workTime = 8;
         System.out.println(workTime + " часов");
         var numberOfWorkers = allTimesWork / workTime;
         System.out.println("Всего работников в компании - " + numberOfWorkers + " человек");

//                      task#8/2

         var sumWorkers = numberOfWorkers + 94;
         System.out.println(sumWorkers + " человек");
         var workTime2 = allTimesWork / sumWorkers;
         System.out.println("Если в компании работает " + sumWorkers + " то всего " + workTime2 + " часов работы может быть поделено между работниками.");

    }
}
