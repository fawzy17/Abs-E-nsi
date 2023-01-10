/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import java.util.ArrayList;

/**
 *
 * @author rayri
 */
public class dbAbsensi {
    ArrayList<Absensi> Absen;
    private int i = -1;
    
    public dbAbsensi(){
        Absen = new ArrayList();
    }
    
    public void InputAbsen(){
        Absensi abs = new Absensi();
        Absen.add(abs);
        i++;
    }
    
    public int getI(){
        return i;
    }
    
    public ArrayList<Absensi> getALL(){
        return Absen;
    }
}
