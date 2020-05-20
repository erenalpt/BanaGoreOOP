package sample;

public class Ucgen extends Sekil{
    public Ucgen(double kenar1, double kenar2) {
        super(kenar1, kenar2);
    }
    double alanHesapla() {
        System.out.println("Bir Üçgenin Alan Hesabı: ");
        return kenar1 * kenar2 / 2;
    }
}
