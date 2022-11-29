/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum1.uts_no3_si05a_3002;

import java.io.BufferedReader;

/**
 *
 * @author ASUS
 * ELSAMAULIDA_21103002
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO3_SI05A_3002 {
    public static void main(String[] args) {
        
        AsistenPraktikum_3002[] ap = new AsistenPraktikum_3002[1];
        StudentStaff_3002[] ss = new StudentStaff_3002[1];
        
        ap[0] = new AsistenPraktikum_3002();
        ss[0] = new StudentStaff_3002();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim_3002 = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama_3002 = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan_3002 =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk_3002 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsisten = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jmlPertemuan = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("===DATA ASISTEN PRAKTIKUM===");
            for(AsistenPraktikum_3002 AP : ap){
                AP.tampilDataAsistenPraktikum();
                System.out.println("");
            }

            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim_3002 = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama_3002 = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan_3002 =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk_3002 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("===DATA STUDENT STAFF===");
            for(StudentStaff_3002 SS : ss){
                SS.tampilDataStudentStaff();
                System.out.println("");
            }
        } 
        catch (Exception ex){ 
            System.out.println(ex);
        }
        
    }
}