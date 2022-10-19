import java.util.Scanner;
class MainKaryawan {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        karyawan k = new karyawan();

        System.out.print ("ID Karyawan: ");
        k.idk = sc.next();

         System.out.print ("Nama: ");
        k.nama = sc.next();

         System.out.print ("Jabatan: ");
        k.jabatan = sc.next();

k.cetak();


    }
}