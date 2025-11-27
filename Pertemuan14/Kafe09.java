package Pertemuan14;
import java.util.Scanner;
public class Kafe09 {
    public static int hitungTotalHarga09(int pilihanMenu, int banyakItem,String kodePromo){
    int[] hargaItems = {15000,20000,22000,12000,10000,18000};
    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

    System.out.println("Total harga sebelum diskon: Rp " + hargaTotal);
    if (kodePromo.equalsIgnoreCase("DISKON50")) {
        int diskon = hargaTotal * 50 / 100;
        hargaTotal = hargaTotal - diskon;
        System.out.println("Kode promo valid: Anda mendapat diskon 50%");
        System.out.println("Besar diskon: Rp " + diskon);
    } 
    else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        int diskon = hargaTotal * 30 / 100;
        hargaTotal = hargaTotal - diskon;
        System.out.println("Kode promo valid: Anda mendapat diskon 30%");
        System.out.println("Besar diskon: Rp " + diskon);
    } 
    else {
        System.out.println("Kode promo invalid. Tidak ada diskon.");
    }
    return hargaTotal;
}
     public static void Menu(String namaPelanggan,boolean isMember,String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan);

        if (isMember) {
            System.out.println("Anda adalah member,dapatkan diskon 10% setiap pembelian");
        }

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
        System.out.println("Kode promo valid: Anda mendapatkan diskon 50%");
    } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
        System.out.println("Kode promo valid: Anda mendapatkan diskon 30%");
    } else {
        System.out.println("Kode promo invalid");
    }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15.000");
        System.out.println("2. Cappucino    - Rp 20.000");
        System.out.println("3. Latte        - Rp 22.000");
        System.out.println("4. Teh Tarik    - Rp 10.000");
        System.out.println("5. Roti Bakar   - Rp 12.000");
        System.out.println("6. Mie Goreng   - Rp 18.000");
        System.out.println("7. Nasi Goreng  - Rp 20.000");
        System.out.println("================================");
        System.out.println("Silakan pilih menu yang Anda inginkan."); 
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Menu("Andi",true,"DISKON50");
         Menu("faqih" , false,"x");
        
         System.out.print("\nMasukkan nomor yang ingin anda pesan: ");
         int pilihanMenu = sc.nextInt();
         System.out.print("Masukkan jumlah item yang ingin dipesan: ");
         int banyakItem = sc.nextInt();
         sc.nextLine();
         System.out.print("Masukkan kode promo: ");
         String kodePromo = sc.nextLine();
        
         int totalHarga = hitungTotalHarga09(pilihanMenu, banyakItem,kodePromo);
        
         System.out.println("Total harga akhir: Rp." + totalHarga);
        
    //     Scanner input = new Scanner(System.in);
    //     int totalKeseluruhan = 0;
        
    //     System.out.print("Berapa jenis menu yang ingin dipesan? ");
    //     int jumlahJenis = input.nextInt();
    //     Menu("Budi" , true,"DISKON30");

    // for (int i = 0; i < jumlahJenis; i++) {
    //     System.out.print("Masukkan nomor menu ke-" + (i+1) + ": ");
    //     int pilihanMenu = input.nextInt();
    //     System.out.print("Masukkan jumlah item untuk menu ke-" + (i+1) + ": ");
    //     int jumlahPesanan = input.nextInt();

    //     totalKeseluruhan += hitungTotalHarga09(pilihanMenu, jumlahPesanan, "DISKON30");
    // }

    // System.out.println("Total keseluruhan pesanan: Rp." + totalKeseluruhan);
    }
}
