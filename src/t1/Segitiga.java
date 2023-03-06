/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

/**
 *
 * @author ASUS
 */
public class Segitiga extends Bangun implements Hitung2d{
    
    public Segitiga(double t,double a,double s){
        this.t=t;
        this.a=a;
        this.s=s;
    }

    @Override
    public double hitungLuas() {
        return a*t/2;
    }
    
    public double getT(){
        return t;
    }
    
    public double getA(){
        return a;
    }

    @Override
    public double hitungKeliling() {
        return s*3;
    }

    @Override
    public double hitungSepega() {
        return hitungLuas()/3;
    }
}
