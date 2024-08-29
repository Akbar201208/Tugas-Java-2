//Object class
public class Guru {
    private int id;
    private String nama;
    private String mapel;
    private String alamat;


      //Constructor nama sama dengan nama Class
    public Guru() {
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    }

    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
      this.id = id;
      this.nama = nama;
      this.mapel = mapel;
      this.alamat = alamat;
    }

     //Getter-->mendapatkan nilai-->tipe data
     public int getId() {
     return id;
     }
     public String getNama() {
     return nama;
     }
     public double getMapel() {
     return mapel;
     }
     public double getAlamat() {
     return alamat;
     }

     //Setter-->mengubah nilai-->void
     public void setId(int id) {
     this.id = id;
     }
     public void setNama(String nama) {
     this.nama = nama;
     }
     public void setMapel(String mapel) {
     this.mapel = mapel;
     }
     public void setAlamat(String alamat) {
      this.alamat = alamat;
      }

    //method tidak menghasilkan value
    public void print() {
    System.out.println("ID: " +id);
    System.out.println("Nama: " + nama);
    System.out.println("Mata Pelajaran: " + mapel);
    System.out.println("Alamat: " + alamat);
    }

    //method menghasilkan value
    public String print2() {
      return "ID : " + id
      + "\nNama : " + nama
      + "\nMata Pelajaran: " + mapel
      + "\nAlamat: " + alamat;
    }
    
  }

     