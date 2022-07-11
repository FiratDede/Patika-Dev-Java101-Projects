import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int a,b;
        double c;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Birinci kenarı girin: ");
        a=scanner.nextInt();

        System.out.print("İkinci kenarı girin: ");
        b=scanner.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs: "+c);

        double cevre= a+b+c;

        double u = cevre/2.0;

        double area= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Çevre: "+cevre);

        System.out.println("Area: "+area);

    }
}
