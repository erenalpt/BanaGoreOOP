package sample;

public class Dikdortgen extends Sekil{
    Dikdortgen(double k1, double k2){
        super(k1, k2);
    }
    double alanHesapla(){
        System.out.println("Dikdortgen Alan Hesabı : ");
        return kenar1 * kenar2;
    }
}