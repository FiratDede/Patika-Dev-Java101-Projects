import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double boy,indeks;
        int kilo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");

        boy=scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");

        kilo=scanner.nextInt();

        indeks=kilo/(boy*boy);

        System.out.print("Vücut Kitle İndeksiniz : "+indeks);


    }
}
