import java.util.Scanner;

//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //String-->int--->double
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("ID : ");
        int id = input.nextInt();
        System.out.println("IPK : ");
        double ipk = input.nextDouble();
        input.close();

        Siswa dimas = new Siswa(id, nama, ipk);
        dimas.print();
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa felix = new Siswa(14, "Felix", 70);

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 85.7;
        rasyid.id = 30;
        sabrina.print();
        rasyid.print();
        felix.print();
    }
}
