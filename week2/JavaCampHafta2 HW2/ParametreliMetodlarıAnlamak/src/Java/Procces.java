package Java;

public class Procces {
    public void ekle(){
        System.out.println("eklendi");
    }
    public void sil(){
        System.out.println("silindi");
    }
    public void guncelle(){
        System.out.println("guncellendi");
    }
    public void subs(String sentance){
        String newMessage;
        newMessage= sentance.substring(0,2);
        System.out.println(newMessage);

    }
    public int Topla(int sayi1,int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }
    public String Sehir(){
        return "ankara";
    }
}
