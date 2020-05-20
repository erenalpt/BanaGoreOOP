package sample;

public class Main {

    public static void main(String[] args) {


        Sekil sekilNesne = new Sekil(10,20);
        System.out.println(sekilNesne.alanHesapla());

        Ucgen ucgenSinifi = new Ucgen(40, 25);
        System.out.println(ucgenSinifi.alanHesapla());

        Dikdortgen dikdortgenSinifi = new Dikdortgen(20, 28);
        System.out.println(dikdortgenSinifi.alanHesapla());
    }
}
