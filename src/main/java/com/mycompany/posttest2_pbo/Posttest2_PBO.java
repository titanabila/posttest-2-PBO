/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest2_pbo;
import com.mycompany.mobil.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author Tita
 */

public class Posttest2_PBO {
    

    public static void main(String[] args) {
        ArrayList<mobil> daftarMobil = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    
        
        while (true) {
            System.out.println("**********************************");
            System.out.println("|        >> MENU ADMIN <<        |");
            System.out.println("**********************************");
            System.out.println("|   1. Tambah Daftar Service     |");
            System.out.println("|   2. Lihat Daftar Service      |");
            System.out.println("|   3. Update Daftar Service     |");
            System.out.println("|   4. Hapus Daftar Service      |");
            System.out.println("|   5. Keluar                    |");
            System.out.println("----------------------------------");
            System.out.print("Pilih 1,2,3,4 atau 5 : ");

            String pilihan = scanner.nextLine();


            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan Nama Service : ");
                    String namaservice = scanner.nextLine();
                    System.out.print("Masukkan Merk Mobil : ");
                    String merkmobil = scanner.nextLine();
                    System.out.print("Masukkan Harga Service : ");
                    double harga = Double.parseDouble(scanner.nextLine());

                    mobil Mobil= new mobil(namaservice, merkmobil, harga);
                    daftarMobil.add(Mobil);
                    System.out.println("Service berhasil ditambahkan!");
                    break;

                case "2":
                    if (daftarMobil.isEmpty()) {
                        System.out.println("Daftar Service Tidak Tersedia");
                    } else {
                        System.out.println("Daftar Service : ");
                        for (mobil p : daftarMobil) {
                            System.out.println(p);
                        }
                    }
                    break;
                    
                    
                case "3":
                    System.out.print("Masukkan Nama Service yang akan diupdate : ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;

                    for (int i = 0; i < daftarMobil.size(); i++) {
                        mobil s = daftarMobil.get(i);
                        if (s.getNamaService().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Masukkan Service Baru : ");
                            String namaBaru = scanner.nextLine();

                            System.out.print("Masukkan Merk Mobil : ");
                            String merkBaru = scanner.nextLine();

                            System.out.print("Masukkan Harga Baru : ");
                            double hargaBaru = Double.parseDouble(scanner.nextLine());

                            mobil mobilBaru = new mobil(namaBaru, merkBaru, hargaBaru);

                            daftarMobil.set(i, mobilBaru);

                            System.out.println("Daftar Service berhasil diupdate!");
                            ditemukanUpdate = true;
                            break;
                        }
                    }

                    if (!ditemukanUpdate) {
                        System.out.println("Service tidak ditemukan.");
                    }
                    break;
                    
                    
                case "4":
                    System.out.print("Masukan nama service yang ingin dihapus "
                            + ": ");
                    String namaServiceHapus = scanner.nextLine();

                    Iterator<mobil> iterator = daftarMobil.iterator();
                    while (iterator.hasNext()) {
                        mobil objekMobil = iterator.next();
                        if (objekMobil.getNamaService().equalsIgnoreCase(namaServiceHapus)) {
                            iterator.remove(); 
                        }
                    }
                    break;   

                    
                case "5":
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice! Silakan pilih kembali.");
            }
        }
    }
}