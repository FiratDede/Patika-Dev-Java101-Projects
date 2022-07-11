import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int km;
        double perKm= 2.20;
        double total=0.0;
        double startPrice=10.0;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden gir: ");
        km=scanner.nextInt();
        total=startPrice+(km*perKm);

        total=(total<20) ? 20 : total;

        System.out.print("Toplam ücret: "+total);
    }
}
