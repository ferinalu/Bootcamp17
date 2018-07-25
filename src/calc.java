/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIN 10
 */
public class calc {

    /**
     * Fungsi ini digunakan untuk Perkalian
     *
     * @param a integer
     * @param b integer
     * @return
     */
    public int Perkalian(int a, int b) {
        int hasil = 0;

        if (a > 0 && b > 0) {
            for (int i = 0; i < b; i++) {
                hasil = hasil + a;
            }
        } else if (a < 0 && b > 0) {
            int temp = 0;
            for (int i = 0; i < b; i++) {
                hasil = temp + a;
                temp = hasil;
            }
        } else if (a < 0 && b < 0) {
            int temp = -1;
            int bil1 = b * -1;
            int bil2 = b * -1;
            for (int i = 0; i < bil2; i++) {
                hasil = hasil + bil1;
            }
        }
        return hasil;
    }

    /**
     * Fungsi yang digunakan untu mencari Faktorial
     *
     * @param n integer
     * @return
     */
    public int Faktorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {

            return (n * Faktorial(n - 1));
        } else {
            return 0;
        }
    }

    /**
     * Fungsi yang digunakan untuk mencari Permutasi
     *
     * @param n integer
     * @param r integer
     * @return
     */
    public int Permutasi(int n, int r) {
        int Permutasi;
        if (n < 0) {
            Permutasi = 0;
        } else {

            Permutasi = Faktorial(n) / Faktorial(n - r);
        }
        return Permutasi;
    }

    /**
     * Fungsi ini digunakan untuk mencari bilangan Kombinasi
     *
     * @param n integer
     * @param r integer
     * @return
     */
    public int Kombinasi(int n, int r) {
        int Kombinasi;
        if (n < 0) {
            Kombinasi = 0;
        } else {
            Kombinasi = (Faktorial(n) / Faktorial(r) * (Faktorial(n - r)));
        }
        return Kombinasi;
    }

    /**
     * Fungsi untuk mencari Bilangan Berpangkat
     *
     * @param nilai integer
     * @param pangkat integer
     * @return
     */
    public double Pangkat(int nilai, int pangkat) {
        int i;
        double Hasil = 1;
        double param = pangkat;
        if (pangkat < 0) {
            param = pangkat * -1;
        }
        for (i = 0; i < param; i++) {
            Hasil = Perkalian((int) Hasil, nilai);
        }
        if (pangkat < 0) {
            pangkat *= -1;
            Hasil = -1 / Hasil;
        }
        return Hasil;
    }
}
