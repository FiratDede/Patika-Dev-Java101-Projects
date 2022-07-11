import java.util.Scanner;

public class Solution {
    public  static  void  main(String[] args){
        double price,kdvRate,kdvPrice, totalPrice;
        kdvRate=0;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Kdvsiz fiyat: ");

        price=scanner.nextDouble();

        if(price>=0.0 && price<=1000){
            kdvRate=0.18d;

        }
        else if(price>1000){
            kdvRate=0.8d;
        }
        kdvPrice= price*kdvRate;
        totalPrice=price+kdvPrice;

        System.out.println("KDV oranı = "+kdvRate);

        System.out.println("KDV'li Fiyat = "+totalPrice);

        System.out.println("KDV tutarı = "+kdvPrice);
    }


}
