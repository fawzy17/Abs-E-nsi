/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

/**
 *
 * @author ACER
 */
public class Absensi {
    public String npm = "";
    public String mahasiswa;
    public String matkul;
    public String kelas;
    public String keterangan;
    public String jam;
    public String hari;
    public String tanggal;

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setMahasiswa(String mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    

    public String getNpm() {
        return npm;
    }

    public String getMahasiswa() {
        return mahasiswa;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getKelas() {
        return kelas;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getJam() {
        return jam;
    }

    public String getHari() {
        return hari;
    }

    public String getTanggal() {
        return tanggal;
    }
}
