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

        //           task#4

        int age1 = 7;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("если возраст человека равен " + age1 + ", то ему нужно ходить в детскицй сад.");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("если возраст человека равен " + age1 + ", то ему нужно ходить в школу.");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("если возраст человека равен " + age1 + ", то ему нужно ходить в университет.");
        }
        if (age1 > 24) {
            System.out.println("если возраст человека равен " + age1 + ", то ему нужно ходить на работу.");
        }

        //             task#5

        int age2 = 2;
        if (age2 <= 5) {
            System.out.println("Если возраст ребёнка равен " + age2 + ", то ему нельзя кататься на аттракционе.");
        }
        if (age2 > 5 && age2 <= 14) {
            System.out.println("Если возраст ребёнка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age2 > 14) {
            System.out.println("Если возраст ребёнка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        //             task#6

        int capacity = 102;
        int seats = 60;
        int standingPlaces = capacity - seats;
        int people = 90;
        int remainsSeats = seats - people;
        //System.out.println(remainsSeats);
        if (people == 0) {
            System.out.println("Если, в вагон заходят " + people + " людей, вагон свободен. Сидячих мест = " + seats + ", а стоячих = " + standingPlaces + ".");
        }
        if (people < seats) {
            System.out.println("Если, в вагон заходят " + people + " людей, в этот момент сидячих мест будет " + remainsSeats + " а стоячих останется " + standingPlaces + ".");
        }
        if (remainsSeats <= 0) {
            int remainsStandingPlaces = standingPlaces + remainsSeats;
            if (remainsStandingPlaces >= 0) {
                int remainsSeats1 = remainsSeats * (-1);
                //System.out.println(remainsStandingPlaces);
                //System.out.println( remainsSeats1);
                int remainsSeats2 = remainsSeats + remainsSeats1;
                //System.out.println(remainsSeats2);
                System.out.println("Если, в вагон заходят " + people + " людей, в этот момент сидячих мест будет " + remainsSeats2 + " а стоячих останется " + remainsStandingPlaces + ".");
            }else {
                System.out.println("Если, в вагон заходять больше " + capacity + " человек, кому-то придётся остаться на остановке.");
            }
        }
    }
}