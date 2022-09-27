package Java;

public class Main {

    public static void main(String[] args) {

       Procces procces= new Procces();
       procces.Sehir();
       procces.subs("ben bir ceviz agacıyım gulhane parkında ");
        System.out.println(procces.Topla(12,213,34));
       procces.ekle();
       procces.guncelle();
       procces.sil();
    }
}
