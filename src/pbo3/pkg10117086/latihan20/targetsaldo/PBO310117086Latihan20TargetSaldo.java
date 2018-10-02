/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan20.targetsaldo;

/**
 *
 * @author Lenovo NAMA : RD Muhammad Djulfikar BU KELAS : IF3 NIM : 10117086
 * DESKRIPSI PROGRAM : waktu menabung untuk mendapatkan saldo target
 */
public class PBO310117086Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double target = 6000000;
        int i = 1;

        do {
            saldoAwal = (saldoAwal * bunga) + saldoAwal;
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + saldoAwal);
            i++;
        } while (saldoAwal <= target);

    }

}
