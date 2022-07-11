import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n1,n2,select,sonuc=0;



        Scanner scanner= new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");

        n1=scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");

        n2=scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");

        select=scanner.nextInt();


        switch (select){
            case 1:
                sonuc=n1+n2;
                System.out.println("Toplama: "+sonuc);
                break;
            case 2:
                sonuc=n1-n2;
                System.out.println("Çıkarma: "+sonuc);
                break;
            case 3:
                sonuc=n1*n2;
                System.out.println("Çarpma: "+sonuc);
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez");
                        break;
                    default:
                        sonuc=n1/n2;
                        System.out.println("Bölme: "+sonuc);
                        break;


                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz!");
        }


    }
}
