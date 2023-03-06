/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class T1 {

    /**
     * @param args the command line arguments
     */static int ulang;
    public static void main(String[] args) {
        do{
        try{   
            
            
        System.out.println("\033[H\033[2J");
        System.out.println("Pilih Menu : ");
        System.out.println("1. Hitung Segitiga \n2. Luas Permukaan Limas \n3. Volume Limas");
        Scanner input=new Scanner(System.in);
        int pil = input.nextInt();
        
        
        switch(pil){
            case 1: 
                System.out.print("Masukkan Alas : ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double t = input.nextDouble();
                System.out.print("Masukkan Sisi : ");
                double s = input.nextDouble();
                
                Segitiga segitiga = new Segitiga(t,a,s);
                System.out.println("Luas Segitiga adalah : "+segitiga.hitungLuas());
                System.out.println("Luas 1/3 Segitiga adalah"+segitiga.hitungSepega());
                System.out.println("Keliling Segitiga adalah :"+segitiga.hitungKeliling());
                
            break;
            
            case 2: 
                System.out.print("Masukkan Alas : ");
                a = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                t = input.nextDouble();
                
                double tl=0;
                s=0;
                Limas luas = new Limas(t,a,s,tl);
                System.out.println("Luas Permukaan Limas adalah : "+luas.hitungLP());
            break;
            
            case 3: 
                System.out.print("Masukkan Alas : ");
                a = input.nextDouble();
                System.out.print("Masukkan tinggi :");
                t = input.nextDouble();
                System.out.print("Masukkan tinggi limas : ");
                tl = input.nextDouble();
                
                s=0;
                Limas volume = new Limas(t,a,s,tl);
                System.out.println("Volume Limas adalah : "+volume.hitungVolume());
                System.out.println("1/7 Volume Limas adalah : "+volume.sepejuVolume());
            break;
        }
        System.out.println("Anda ingin Ulang?(ketik 1 Untuk ya)");
        ulang = input.nextInt();
        }catch(Exception e){
            System.out.println(e);}}
        while (ulang==1);
    }
    
}
