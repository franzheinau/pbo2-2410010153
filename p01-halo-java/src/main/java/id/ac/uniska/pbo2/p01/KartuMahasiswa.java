/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01;

/**
 *
 * @author FERDY
 */
public class KartuMahasiswa {
    public static void main(String[] args) {
        String nama, kartu, prodi, alasan;
        long npm;
        int semester;
        
        kartu = "KARTU MAHASISWA PBO 2";
        nama = "Muhammad Rifaldi";
        prodi = "Teknik informatika";
        alasan = "Ingin membuat aplikasi absensi kelas";
        npm = 2410010153L;
        semester = 5;
        
        
        
        System.out.println("============================");
        System.out.println( kartu);
        System.out.println("============================");
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Prodi: " + prodi);
        System.out.println("Semester: " + semester);
        System.out.println("Alasan: " + alasan);
        System.out.println("============================");
    }
}
