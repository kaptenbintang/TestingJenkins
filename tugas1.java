import java.util.Scanner;
/**
 *
 *
 */
public class tugas1 {
    
    public static void main(String[] args){
        String nama,huruf,lulus = null;
        int nim;
        double uas,uts,akhir;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama: ");
        nama = input.nextLine();
        
        System.out.print("Masukan NIM: ");
        nim = input.nextInt();
        
        System.out.print("Masukan UAS: ");
        uas = input.nextDouble();
        
        System.out.print("Masukan UTS: ");
        uts = input.nextDouble();
        
        akhir = (0.4 * uts) + (0.6 * uas);
        
        if(akhir >= 80){
            huruf = "A";
            lulus = "lulus";
        }
        else if(akhir >= 70 && akhir < 80){
            huruf = "B";
            lulus = "lulus";
        }
        else if(akhir >=60 && akhir < 70){
            huruf = "C";
            lulus = "lulus";
        }
        else if(akhir >= 40 && akhir < 60){
            huruf = "D";
        }
        else{
            huruf = "E";
        }
        
        System.out.print("Nama = " + nama + "\nNIM = " + nim + "\nNilai UTS = " + uts + "\nNilai Akhir = " + akhir + "\nNilai Huruf = " +
                huruf + "\nMaka Mahasiswa dengan nama " + nama + " dinyatakan " + lulus);
    }
    
}