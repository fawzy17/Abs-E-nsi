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
public class dbRegisteredAccount {
    ArrayList<Account> RegisteredAccount;
    private int i = -1;
    
    public dbRegisteredAccount(){
        RegisteredAccount = new ArrayList();
    }
    
    public void InputRegistered(String Nama, String Npm, String Password, String Kelas, String Prodi, String Angkatan, dbAbsensi Absen){
        Account acc = new Account(Nama, Npm, Password, Kelas, Prodi, Angkatan, Absen);
        RegisteredAccount.add(acc);
        i++;
    }
    
    public int getI(){
        return i;
    }
    
    public ArrayList<Account> getALL(){
        return RegisteredAccount;
    }
}
