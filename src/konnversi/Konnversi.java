package konnversi;

import java.util.Scanner;

/**
 *
 * @author ardina
 */
public class Konnversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("Pilihan Konversi:\n"
                + "1. Jam -> Menit\n"
                + "2. Detik -> Hari, Jam, Menit, dan Detik");
        System.out.println("\nMasukkan Pilihan : ");
        try (Scanner options = new Scanner(System.in)){
            if (!options.hasNextInt()){
                System.out.println("Itu alfabet, anda salah!");
            } else {
                if (options.nextInt() == 1){
                    System.out.println("Masukkan Jam : ");
                    Scanner hours = new Scanner (System.in);
                    JamKeMenit(hours.nextInt());
                    // HoursToMinutes(hours.nextInt());
                } else {
                    System.out.println("Masukkan Detik : ");
                    try (Scanner seconds = new Scanner(System.in)){
                        DetikKeHari(seconds.nextLong());
                        // secondToDays(seconds.nextLong());
                    }
                }
            }
        }   
    }
      private static void JamKeMenit(long jam){
        long menit = jam * 60;
        System.out.println("Menit : " + menit);
}
      private static void DetikKeHari(long detik){
          //menghitung hari
          int hari = (int) (detik / (60*60*24));
          //menghitung jam
          detik %= (60*60*24);
          int jam = (int) (detik / (60*60));
          //menghitung menit
          detik %= (60*60);
          int menit = (int) (detik / 60);
          //menghitung detik
          detik %= 60;
          
          System.out.println(hari + " hari, " + jam + " jam, " + menit + "menit, " + detik + "detik ");
           }
        }


