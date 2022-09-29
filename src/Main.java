import java.util.Scanner;

/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("******** Hos Geldiniz ********" +
                "Fiyat Listeleri: \n" +
                "Armut : 2,14 TL\n" +
                "Elma : 3,67 TL\n" +
                "Domates : 1,11 TL\n" +
                "Muz: 0,95 TL\n" +
                "Patlıcan : 5,00 TL");


        float armut, elma, domates, muz, patlican,toplam;

      Scanner yazici = new Scanner(System.in);
        System.out.println("Kilogram cinsinden armut degerini giriniz: ");
        armut=yazici.nextFloat();
        System.out.println("Kilogram cinsinden elma degerini giriniz: ");
        elma=yazici.nextFloat();
        System.out.println("Kilogram cinsinden domates degerini giriniz: ");
        domates=yazici.nextFloat();
        System.out.println("Kilogram cinsinden muz degerini giriniz: ");
        muz=yazici.nextFloat();
        System.out.println("Kilogram cinsinden patlican degerini giriniz: ");
        patlican=yazici.nextFloat();

        toplam=(float) (armut*2/.14+elma*3.67+domates*1.11+muz*0.95+patlican*5.00);
        System.out.println("Odenecek toplam tutar: "+toplam);




    }
}
