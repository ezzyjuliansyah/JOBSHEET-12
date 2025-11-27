package Pertemuan14;
import java.util.Scanner;
public class Kubus09 {
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }
    public static int HitungLuasPermukaan(int sisi) {
        return 6*sisi*sisi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus (cm): ");
        int sisi = sc.nextInt();

        int volume = hitungVolume(sisi);
        int Luaspermukaan = HitungLuasPermukaan(sisi);

        System.out.println("Kubus dengan panjang sisi " +sisi+("cm"));
        System.out.println("Volume Kubus = " + volume);
        System.out.println("LuasPermukaanKubus = " + Luaspermukaan);
    }
}
