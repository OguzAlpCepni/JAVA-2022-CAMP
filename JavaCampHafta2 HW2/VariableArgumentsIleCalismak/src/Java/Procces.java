package Java;

public class Procces {

    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int topla2(int...sayilar){
        int toplam= 0;
        for(int sayi :sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
