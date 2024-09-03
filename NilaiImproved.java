import java.util.Scanner;

public class NilaiImproved {
    public static void main(String[] args) {
        int nilai;

        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan nilai Anda!");
        nilai = in.nextInt();

        if (nilai >= 90) {
            System.out.println("--------------------------");
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Kamu mendapat predikat A!!");
            System.out.println("--------------------------");
            if (nilai == 100) {
                System.out.println("SEMPURNA!");
                System.out.println("--------------------------");
            }
        } else if (nilai >= 80) {
            System.out.println("--------------------------");
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Kamu mendapat predikat B!!");
            System.out.println("--------------------------");
            if (nilai >= 89) {
                System.out.println("Sedikit lagi dapat nilai A!");
                System.out.println("--------------------------");
            }
        } else if (nilai >= 75) {
            System.out.println("--------------------------");
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Kamu mendapat predikat C!");
            System.out.println("--------------------------");
        } else if (nilai >= 70) {
            System.out.println("--------------------------");
            System.out.println("Nilai anda " + nilai);
            System.out.println("Kamu mendapat predikat D..");
            System.out.println("--------------------------");
        } else {
            System.out.println("--------------------------");
            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Kamu mendapat predikat E...");
            System.out.println("--------------------------");
            if (nilai <= 70) {
                System.out.println("Kamu tidak lulus... :(");
                System.out.println("--------------------------");
            }
        }        
    }
}