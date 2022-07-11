import java.util.Scanner;

public class Solution {
    public  static  void main(String[] args){
        int math,pyhsics,chemistry,turkish,history,music;
        double average=0.0;
        Scanner scanner= new Scanner(System.in);

        System.out.print("Matematik dersi notunuzu girin: ");

        math=scanner.nextInt();

        System.out.print("Fizik dersi notunuzu girin: ");

        pyhsics=scanner.nextInt();

        System.out.print("Kimya dersi notunuzu girin: ");

        chemistry=scanner.nextInt();

        System.out.print("Türkçe dersi notunuzu girin: ");

        turkish=scanner.nextInt();

        System.out.print("Tarih dersi notunuzu girin: ");

        history=scanner.nextInt();
        System.out.print("Müzik dersi notunuzu girin: ");

        music=scanner.nextInt();

        average=(math+pyhsics+chemistry+turkish+history+music)/6.0;

        System.out.println("Genel ortalama: "+average);

        String status= (average>=60.0)  ? "Sınıfı geçti" :   "Sınıfta kaldı" ;

        System.out.println(status);
    }
}
