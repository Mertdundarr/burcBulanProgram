import java.util.Scanner;

public class burcBulmaProgrami {
    public static void main(String[] args) {
        int month, day;
        boolean isError = false;
        String burc="";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Giriniz : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün Giriniz :");
        day = input.nextInt();

        if (month==1){
            if (day>0 &&day<31){
                burc = (day<22) ? "Oğlak" : "Kova";
            }else {
                isError=true;
            }
        }
        if (month==2){
            if (day>0 &&day<28){
                burc = (day<20) ? "Kova" : "Balık";
            }else {
                isError=true;
            }
        }
        if (month==3){
            if (day>0 &&day<31){
                burc = (day<22) ? "Balık" : "Koç";
            }else {
                isError=true;
            }
        }
        if (month==4){
            if (day>0 &&day<30){
                burc = (day<21) ? "Koç" : "Boğa";
            }else {
                isError=true;
            }
        }
        if (month==5){
            if (day>0 &&day<31){
                burc = (day<22) ? "Boğa" : "İkizler";
            }else {
                isError=true;
            }
        }
        if (month==6){
            if (day>0 &&day<30){
                burc = (day<23) ? "İkziler" : "Yengeç";
            }else {
                isError=true;
            }
        }
        if (month==7){
            if (day>0 &&day<31){
                burc = (day<23) ? "Yengeç" : "Aslan";
            }else {
                isError=true;
            }
        }
        if (month==8){
            if (day>0 &&day<31){
                burc = (day<23) ? "Aslan" : "Başak";
            }else {
                isError=true;
            }
        }
        if (month==9){
            if (day>0 &&day<30){
                burc = (day<23) ? "Başak" : "Terazi";
            }else {
                isError=true;
            }
        }
        if (month==10){
            if (day>0 &&day<31){
                burc = (day<23) ? "Terazi" : "Akrep";
            }else {
                isError=true;
            }
        }
        if (month==11){
            if (day>0 &&day<30){
                burc = (day<22) ? "Akrep" : "Yay";
            }else {
                isError=true;
            }
        }
        if (month==12){
            if (day>0 &&day<31){
                burc = (day<22) ? "Yay" : "Oğlak";
            }else {
                isError=true;
            }
        }
        if(isError){
            System.out.println("Hatalı giriş yaptınız tekrar deneyiniz!");
        }else{
            System.out.println("Burcunuz: "+burc);
        }




    }
}
