/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

/**
 *
 * @author rayri
 */
public class Account {
    private String Nama, Npm, Password, Kelas, Prodi, Angkatan;
    private dbAbsensi Absen;
    public Account(String Nama, String Npm, String Password, String Kelas, String Prodi, String Angkatan, dbAbsensi Absen){
        this.Nama = Nama;
        this.Npm = Npm;
        this.Password = Password;
        this.Kelas = Kelas;
        this.Prodi = Prodi;
        this.Angkatan = Angkatan;
        this.Absen = Absen;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setNpm(String Npm) {
        this.Npm = Npm;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public void setAngkatan(String Angkatan) {
        this.Angkatan = Angkatan;
    }

    public String getKelas() {
        return Kelas;
    }

    public String getProdi() {
        return Prodi;
    }

    public String getAngkatan() {
        return Angkatan;
    }

    public dbAbsensi getAbsen() {
        return Absen;
    }
    
    public void setAbsen(dbAbsensi Absen) {
        this.Absen = Absen;
    }
    
    public String getNama() {
        return Nama;
    }

    public String getNpm() {
        return Npm;
    }

    public String getPassword() {
        return Password;
    }
}
