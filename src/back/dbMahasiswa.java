/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author rayri
 */
public class dbMahasiswa {
    ArrayList<Mahasiswa> listmahasiswa;
    private static String[] Nama = {
        "Kazuma", "Alucard", "Zilong", "Timothy", "Gura", "Astolfo", "Tetangga", "Stalin", "Hitler", "Lupa", //angkatan 19
        "Ray", "Sidqih", "Heri", "Fiqri","Abdul","Yusuf","Mustaqim","Firdaus","Alghazali", //angkatan 20
        "Firman", "Udin", "Disno", "Mia", "Nana", "Joko", "Kenny", "Doby", "Gundala" //angkatan 21
    };
    private static String[] Npm = {
        "1910631170111", "1910631170156", "1910631170876", "1910631170909", "1910631170576", "1910631170758", "1910631170442", "1910631170871", "1910631250055", "1910631250099", //angkatan 19
        "2010631170027", "2010631170094", "2010631170160", "2010631170096", "2010631170200", "2010631170221", "2010631250232", "2010631250233", "2010631250235", //angkatan 20
        "2110631170069", "2110631170420", "2110631170777", "2110631170666", "2110631170456", "2110631170678", "2110631250999", "2110631250212", "2110631250911" //angkatan 21
    };
    private String[] Prodi = {
        "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Sistem Informasi", "Sistem Informasi", //angkatan 19, Teknik Kelas A-H, Sistem Kelas A-B
        "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Sistem Informasi", "Sistem Informasi", "Sistem Informasi", //angkatan 20, Teknik Kelas A-F, Sistem Kelas A-C
        "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Teknik Informatika", "Sistem Informasi", "Sistem Informasi", "Sistem Informasi" //angkatan 21, Teknik Kelas A-F, Sistem Kelas A-C
    };
    private String[] Alamat = {
        "Isekai", "Land Of Dawn", "LAnd Of Dawn", "Anime", "Atlantis", "Anime", "Samping Rumah Kenny", "Russia", "German", "Lupa", //angkatan 19
        "Bekasi", "Bogor", "Tegal", "Karawang","Bandung","Cirebon","Jakarta","tangerang","Depok", //angkatan 20
        "Surabaya", "Banten", "Bogor", "isekai", "Konoha", "Deket", "Samping Rumah Tetangga", "Jakarta", "Lampung" //angkatan 21
    };
    private String[] Status = {
        "Aktif", "Aktif", "Aktif", "Aktif", "Aktif", "Aktif", "Aktif", "Tidak Aktif", "Tidak Aktif", "Mungkin Aktif", //angkatan 19
        "Aktif", "Aktif", "Aktif", "Proses DO", "Aktif", "Aktif", "Tidak Aktif", "Aktif", "DO", //angkatan 20
        "Aktif", "Aktif", "Aktif", "Aktif", "Aktif", "Aktif", "Aktif", "Aktif", "Aktif" //angkatan 21
    };
    private String[] Angkatan = {
        "2019", "2019", "2019", "2019", "2019", "2019", "2019", "2019", "2019", "2019", //angkatan 19
        "2020", "2020", "2020", "2020", "2020", "2020", "2020", "2020", "2020", //angkatan 20
        "2021", "2021", "2021", "2021", "2021", "2021", "2021", "2021", "2021" //angkatan 21
    };
    private String[] Kelas = {
        "A", "B", "C", "D", "E", "F", "G", "H", "A", "B", //angkatan 19
        "A", "B", "C", "D", "E", "F", "A", "B", "C", //angkatan 20
        "A", "B", "C", "D", "E", "F", "A", "B", "C" //angkatan 21
    };
    private String[] Ttl = {
        "Tokyo, 23 Agustus 2001", "Banda Aceh, 18 April 2001", "Tasikmalaya, 30 Maret 2001", "Sabang 21 Mei 2001", "Medan, 19 Desember 2000", "Sukabumi, 14 Januari 2001", "Magelang, 12 September 2001", "Pekalongan, 23 Oktober 2001", "Surakarta, 17 September 2001", "Kediri, 30 Maret 2001", //angkatan 19
        "Bekasi, 13 April 2002", "Bogor, 18 Februari 2002", "Tegal, 31 Juli 2002", "Karawang, 25 Juni 2002","Bandung 27 Maret 2002","Cirebon, 20 Juni 2002","Jakarta, 21 Desember 2001","Tangerang, 26 Januari 2002","Depok, 29 Juni 2002", //angkatan 20
        "Surabaya, 31 Desember 2002", "Banten, 14 Agustus 2003", "Bogor, 19 September 2003", "Semarang, 27 April 2003", "Pontianak, 28 Maret 2003", "Brebes, 11 Januari 2003", "Batam, 26 November 2003", "Manado, 12 April 2003", "Padang, 14 Agustus 2003" //angkatan 21
    };
    
    public dbMahasiswa(){
        listmahasiswa = new ArrayList();
        for(int i = 0; i < Nama.length; i++){
            Mahasiswa mhs = new Mahasiswa();
            mhs.setNama(Nama[i]);
            mhs.setNpm(Npm[i]);
            mhs.setProdi(Prodi[i]);
            mhs.setAlamat(Alamat[i]);
            mhs.setStatus(Status[i]);
            mhs.setAngkatan(Angkatan[i]);
            mhs.setKelas(Kelas[i]);
            mhs.setTtl(Ttl[i]);
            listmahasiswa.add(mhs);
        }
    }
    
    public ArrayList<Mahasiswa> getALL(){
        return listmahasiswa;
    }
}
