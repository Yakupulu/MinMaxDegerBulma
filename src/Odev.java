import java.util.Arrays;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int n;
        boolean isIn = true;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir deger giriniz:");
        n = inp.nextInt();

        int[] list = {10, 2, 4, 40, 26, 60};

        Arrays.sort(list);
        int min = list[0], max = list[0];

        for (int i : list) {
            if (n < list[0]) {
                max = list[0];
                System.out.println("dizide  " + n + "   den kucuk sayi yoktur.");
                System.out.println("Girilen sayidan buyuk en yakin sayi : " + max);
                isIn = false;
                break;
            } else if (n > list[list.length - 1]) {
                System.out.println("dizide  " + n + " den buyuk sayi yoktur.");
                min = list[list.length - 1];
                System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
                isIn = false;
                break;
            } else {
                if (n >= i) {
                    min = i;
                }
                if (n < i) {
                    max = i;
                    break;
                }
                isIn = true;
            }
        }
        if (isIn == true) {
            System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
            System.out.println("Girilen sayidan buyuk en yakin sayi : " + max);
        }
    }
}

