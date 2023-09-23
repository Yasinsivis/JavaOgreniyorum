package JavaIki;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvOranı;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Tutarı Giriniz:");
        tutar=input.nextDouble();

        if(tutar>=0 || tutar<1000 ){
           kdvOranı=0.18;
        }
        else{
            kdvOranı=0.8;
        }

        double kdvTutarı=tutar*kdvOranı;
        double kdvliTutar=tutar+kdvTutarı;
        System.out.println("Kdv'siz Tutar:"+tutar);
        System.out.println("Kdv'li Tutar:"+kdvliTutar);
        System.out.println("Kdv Oranı:"+kdvOranı);
        System.out.println("Kdv Tutarı:"+kdvTutarı);

    }
}
