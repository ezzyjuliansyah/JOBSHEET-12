package Pertemuan14;
import java.util.Scanner;
public class NilaiMahasiswa09 {
    public static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);
            for (int i=0; i<nilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1)+": ");
            nilai[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void tampilArray(int[] nilai) {
        System.out.print("\nDaftar Nilai Mahasiswa: ");
        for (int i=0; i<nilai.length; i++) {
        System.out.println("Mahasiswa ke- " + (i+1)+": " + (nilai[i]));
        }
    }
    public static int hitTot(int[] nilai ) {
        int total = 0;
        for (int n:nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int [] NilaiMahasiswa = new int[N];

        isianArray(NilaiMahasiswa);
        tampilArray(NilaiMahasiswa);

        int totalNilai = hitTot(NilaiMahasiswa);
        System.out.println("Total seluruh nilai mahasiswa= " + totalNilai);
    }
}
