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
public class Mahasiswa {
    private String Nama;
    private String Npm;
    private String Prodi;
    private String Kelas;
    private String Alamat;
    private String Status;
    private String Angkatan;
    private String Ttl;

    public String getTtl() {
        return Ttl;
    }

    public void setTtl(String Ttl) {
        this.Ttl = Ttl;
    }

    public String getAngkatan() {
        return Angkatan;
    }

    public void setAngkatan(String Angkatan) {
        this.Angkatan = Angkatan;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNpm() {
        return Npm;
    }

    public void setNpm(String Npm) {
        this.Npm = Npm;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
