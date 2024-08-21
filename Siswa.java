//Object Class
public class Siswa {
    //variabel
    int id;
    String nama;
    double ipk;

    //Constructor Default (yg membangun object)
    public Siswa() {
        id = 0;
        nama = "Kosong";
        ipk = 0.0;
    } 
    //Construstor Parameter
    public Siswa(int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;
    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}