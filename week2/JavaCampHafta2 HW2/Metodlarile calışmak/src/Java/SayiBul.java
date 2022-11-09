package Java;

public class SayiBul {


    public void sayiBulmaca(){
    int [] sayilar = new int[]{1,2,3,4,5,6,7,8,9};
    int aranacak = 6;
    boolean varMi=false;

        for(int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if(varMi){
            message("sayi mevcuttur ",aranacak);
        }
        else message("sayi mevcut degildir ", aranacak);
    }
    public void message(String mesaj,int number){
        System.out.println(mesaj + number);
    }

}
