
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DitaP
 */
public class BilanganKompleks {
    public static void main(String[] args) {
        System.out.println("Input :");
        Scanner dita = new Scanner(System.in);
        String bil1 = dita.nextLine();
        String bil2 = dita.nextLine();
        System.out.println("Output :");
        String real1, real2, im1, im2;
        
        if (bil1.length()==4){
            String[] bagian1 = bil1.split("\\+");
            String[] bagian2 = bil2.split("\\+");
            
            //bilangan real dan imajiner pertama
            real1 =  bagian1[0];
            String imajiner1 = bagian1[1];
            im1 = bagian1[1].substring(0,1);
            
            //bilangan real dan imajiner kedua
            real2 = bagian2[0];
            String imajiner2 = bagian2[1];
            im2 = bagian2[1].substring(0,1);
            
            //Mengubah tipe data dari String menjadi int
            int r1 = Integer.parseInt(real1);
            int r2 = Integer.parseInt(real2);
            int i1 = Integer.parseInt(im1);
            int i2 = Integer.parseInt(im2);
            hasil(r1,r2,i1,i2);
        }
        else if(bil1.length()==2){
            String[] bagian2 = bil2.split("\\-");
            //saat bilangan real yang pertama = 0
            real1 = "0";
            im1 = bil1.substring(0,1);
            real2 = bagian2[0];
            String imajiner2 = bagian2[1];
            im2 = bagian2[1].substring(0,1);
            
            //Mengubah tipe data dari String menjadi int
            int r1 = Integer.parseInt(real1);
            int r2 = Integer.parseInt(real2);
            int i1 = Integer.parseInt(im1);
            int i2 = Integer.parseInt(im2);
            hasil(r1,r2,i1,(i2*(-1)));
        }
    }
    
    //Sebuah method untuk mendapatkan hasil perhitungan bilangan kompleks
    public static void hasil(int r1, int r2, int i1, int i2){
    System.out.println(((r1*r2)-(i1*i2))+" + "
            +((r1*i2)+(r2*i1))+"i");
    }
}
