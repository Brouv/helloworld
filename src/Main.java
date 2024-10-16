import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            //task #1

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника " + fullName);

            //task #2

        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName1);

            //task #3

        String fullName2 = " Иванов Семён Семёнович";
        String fullNameTrue = fullName2.replace("ё","е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullNameTrue);




    }
}