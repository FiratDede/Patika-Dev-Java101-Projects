import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int r,angle;
        double pi=3.14;
        double area;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");

        r=scanner.nextInt();

        System.out.print("Açıyı giriniz: ");

        angle=scanner.nextInt();

        area=pi*r*r*angle/360;


        System.out.println("Alan= "+area);


    }
}
