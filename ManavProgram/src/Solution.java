import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        double armutPrice=2.14 , elmaPrice=3.67, domatesPrice=1.11, muzPrice=0.95, patlicanPrice=5.00 ;

        double total;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        armutKg=scanner.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg=scanner.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg=scanner.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg=scanner.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg=scanner.nextInt();

        total=(armutKg*armutPrice)+(elmaKg*elmaPrice)+ (domatesKg*domatesPrice )+(muzKg*muzPrice)+ (patlicanPrice*patlicanKg);

        System.out.print("Toplam Tutar : "+total+" TL");


    }
}
