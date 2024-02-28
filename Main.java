/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author SMK TELKOM 001
 */
public class Main {
    public static void main(String[] args) {
  
        Member member;
        member = new Member() {};
        Karyawan karyawan = new Karyawan();
        Barang barang = new Barang();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();

        // Proses transaksi
        transaksi.prosesTransaksi(member, transaksi, barang);

        // Menampilkan laporan
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
    }
}
