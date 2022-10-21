import java.text.DecimalFormat;
import java.util.Scanner;

class penggajian {
    String nik,nama,bagian,shift;
    double gaji_karyawanpagi,gaji_karyawanmalam;

    double getgajikaryawanpagi(){
        if (bagian == "admin") {
            gaji_karyawanpagi = 3500000;
        }else if (bagian == "analyst") {
            gaji_karyawanpagi = 3000000;
        }else if (bagian == "gudang") {
            gaji_karyawanpagi = 2500000;
        }else if (bagian == "resepsionis") {
            gaji_karyawanpagi = 2000000;
        }else{ 
            gaji_karyawanpagi = 1500000;
        } 
        return gaji_karyawanpagi;
    }

    double getgajikaryawanmalam(){
        if (bagian == "admin") {
            gaji_karyawanmalam = 4500000;
        }else if (bagian == "analyst") {
            gaji_karyawanmalam = 4000000;
        }else if (bagian == "gudang") {
            gaji_karyawanmalam = 3500000;
        }else if (bagian == "resepsionis") {
            gaji_karyawanmalam = 3000000;
        }else{ 
            gaji_karyawanmalam = 2000000;
        } 
        return gaji_karyawanmalam;
    }
    void gaji(){
        DecimalFormat df = new DecimalFormat ("##0,000");
        
        Object system;
        System.out.println("========== Gaji Karyawan ===========");
        System.out.println("nik                 : "+ this.nik);
        System.out.println("nama                : "+ this.nama);
        System.out.println("bagian              : "+ this.bagian);
        System.out.println("shift               : "+ this.shift);
        System.out.println("Gaji karyawan pagi  : "+ df.format(getgajikaryawanpagi()));
        System.out.println("Gaji karyawan malam : "+ df.format(getgajikaryawanmalam()));
        System.out.println("========== Gaji Karyawan ===========");
    }
}

class mainpenggajian{
    public static void main(String[] args) {
        Object system;
        Scanner sc = new Scanner (System.in);
        penggajian k = new penggajian();

        System.out.println("Nomor karyawan: ");
        k.nik = sc.next();
        System.out.println("Nama: ");
        k.nama = sc.next();
        System.out.println("Bagian: ");
        k.bagian = sc.next();
        System.out.println("Shift: ");
        k.shift = sc.next();

        k.gaji();
    }   
}
