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
public class Limas extends Segitiga implements Hitung3d{
    private double tl;
    public Limas(double t,double a, double s,double tl){
        super(t,a,s);
        this.tl=tl;
    }
    
    @Override
    public double hitungLP() {
        return 4*super.getA()*super.getT()/2;
    }

    @Override
    public double hitungVolume() {
       return super.getA()*super.getT()*tl/6;
    }

    @Override
    public double sepejuVolume() {
        return hitungVolume()/7;
    }
    
}
