import java.util.Scanner;

public class TesGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Nama: ");
        String nama = in.nextLine();
        System.out.println("Mapel: ");
        String mapel = in.nextLine();
        System.out.println("Alamat: ");
        String alamat = in.nextLine();
        System.out.println("ID: ");
        int id = in.nextInt();
        in.nextLine(); 


        System.out.println("---------------------------");
        System.out.println("DAFTAR DATA GURU SMK TELKOM");
        System.out.println("---------------------------");

        Guru pasha = new Guru();
        pasha.setId(1);
        pasha.setNama("Pashatania Fitri Indah Lestari");
        pasha.setMapel("Produktif RPL");
        pasha.setAlamat("Malang");
        pasha.print();

        Guru diaur = new Guru();
        diaur.setId(2);
        diaur.setNama("Diaur Rahman");
        diaur.setMapel("Penjaskes & IPAS");
        diaur.setAlamat("Malang");
        diaur.print();

        Guru feni = new Guru();
        feni.setId(3);
        feni.setNama("Feniliya Mayrini");
        feni.setMapel("Matematika");
        feni.setAlamat("Malang");
        feni.print();

        Guru aulia = new Guru();
        aulia.setId(4);
        aulia.setNama("Aulia Mas'adah");
        aulia.setMapel("Produktif RPL");
        aulia.setAlamat("Malang");
        aulia.print();

        Guru agus = new Guru();
        agus.setId(5);
        agus.setNama("Bagus Arifin");
        agus.setMapel("Informatika");
        agus.setAlamat("Bogor");
        agus.print();

        in.close();
    }
}
