/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asispbo;

import java.util.Scanner;

/**
 *
 * @author DitaP
 */
public class BilanganKompleks {

    static int riil, imajiner;
    
    public static void main(String[] args) {
        Scanner dita = new Scanner(System.in);
        String a = dita.nextLine();
        String b = dita.nextLine(); 
        char[]arraya = a.toCharArray();
        char[]arrayb = b.toCharArray();
        int aa = arraya.length;
        int bb = arrayb.length;
        if(aa == 4 && bb == 4){
            Angka(a,0,1,1,3);
            int r1, i1;
                r1 = riil;
                i1 = imajiner;
            Angka(b,0,1,1,3);
            int r2, i2;
                r2 = riil;
                i2 = imajiner;
            hasil(i1,i2,r1,r2);
        }else if (aa == 2 && bb == 4){
            Angka(a,0,0,0,1);
            int r1,i1;
                r1 = 0;
                i1 = imajiner;
            Angka(b,0,1,1,3);
            int r2,i2;
                r2 = riil;
                i2 = imajiner;
            hasil(i1,i2,r1,r2);
        } 
    }
    
    //Sebuah Method untuk mengubah String ke int
    public static int Huruf(String huruff){
        int akhir = Integer.parseInt(huruff);
        return akhir;
    }
    
    //Sebuah Method untuk saat kondisi riil = 0
    public static void Angka(String Baru, int r1, int r2, int i1, int i2){
        if (r1 == 0 && r2 == 0){
            riil = Huruf("0");
        }else{
            String ril = Baru.substring(r1,r2);
            riil = Huruf(ril);
        }
            String im = Baru.substring(i1,i2);
            imajiner = Huruf(im);
    }
    
    //Sebuah Method untuk mencetak hasil dari perhitungan bilangan kompleks
    public static void hasil (int i1, int i2, int r1, int r2 ){
        int JawabanRiil,JawabanImajiner;
            JawabanRiil     = (r1*r2)-(i1*i2);
            JawabanImajiner = (r1*i2)+(r2*i1);
        System.out.println("Hasilnya adalah "+JawabanRiil+ "+"+JawabanImajiner+"i");
    }
}
