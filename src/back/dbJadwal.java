/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import java.util.ArrayList;


public class dbJadwal {
    ArrayList<Jadwal> jadwal;
    
    private String[] kelas = {"A",
                              "B", 
                              "C", 
                              "D", 
                              "E", 
                              "F", 
                              "G", 
                              "H"};
    private String[] Senin = {"Metode Numerik", //A
                              "TBA", //B
                              "Basis Data", //C 
                              "Keamanan Sistem", //D 
                              "Jaringan Komputer", //E
                              "PBO", //F
                              "ADBO", //G
                              "Keamanan Sistem"}; //H
    private String[] Selasa = {"TBA", //A
                               "PBO", //B
                               "Keamanan Sistem", //C
                               "Jaringan Komputer", //D
                               "Keamanan Sistem", //E
                               "ADBO", //F
                               "Keamanan Sistem", //G
                               "PBO"};  //H
    private String[] Rabu = {"Jaringan Komputer", //A
                             "Basis Data", //B
                             "PBO", //C
                             "ADBO", //D
                             "Metode Numerik" , //E
                             "Basis Data", //F 
                             "Metode Numerik", //G
                             "TBA"}; //H
    private String[] Kamis = {"PBO", //A
                              "Keamanan Sistem", //B
                              "Metode Numerik", //C
                              "Metode Numerik", //D
                              "Basis Data", //E
                              "Metode Numerik", //F 
                              "TBA", //G
                              "Jaringan Komputer"}; //H
    private String[] Jumat = {"Keamanan Sistem", //A
                              "ADBO", //B
                              "Metode Numerik", //C
                              "TBA", //D 
                              "Basis Data", //E
                              "TBA", //F
                              "PBO", //G
                              "Basis Data"}; //H
    
    public dbJadwal(){
        jadwal = new ArrayList();
        for(int i = 0; i < kelas.length; i++){
            Jadwal jdl = new Jadwal();
            jdl.setKelas(kelas[i]);
            jdl.setSenin(Senin[i]);
            jdl.setSelasa(Selasa[i]);
            jdl.setRabu(Rabu[i]);
            jdl.setKamis(Kamis[i]);
            jdl.setJumat(Jumat[i]);
            jadwal.add(jdl);
        }
    }
    
    public ArrayList<Jadwal> getALL(){
        return jadwal;
    }
}
