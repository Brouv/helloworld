import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task #1

        int[] abr = new int[3];
        abr[0] = 1;
        abr[1] = 2;
        abr[2] = 3;

        double[] bvc = {1.57, 7.654, 9.986};

        int[] bor = {1, 3, 4, 16, 17, 20};

        //task #2

        System.out.println(Arrays.toString(abr));

        System.out.println(Arrays.toString(bvc));

        System.out.println(Arrays.toString(bor));

        //task #3

        for (int a = abr.length - 1; a >= 0; a--) {
            if (a != 0) {
                System.out.print(abr[a] + ", ");
            } else {
                System.out.print(abr[a]);
            }
        }
        System.out.println();

        for (int b = bvc.length - 1; b >= 0; b--) {
            if (b != 0) {
                System.out.print(bvc[b] + ", ");
            } else {
                System.out.print(bvc[b]);
            }
        }
        System.out.println();

        for (int c = bor.length - 1; c >= 0; c--) {
            if (c != 0) {
                System.out.print(bor[c] + ", ");
            } else {
                System.out.println(bor[c]);
            }
        }

                        //task #4

        for (int i = 0; i < abr.length; i++){
            if (abr[i] % 2 !=0) {
                abr[i]++;
            }
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(abr[i]);
        }
    }
}