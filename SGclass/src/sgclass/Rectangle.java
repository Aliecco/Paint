/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgclass;

/**
 *
 * @author Alisher
 */
public class Rectangle extends Figure {
    private int [] peak1;
    private int [] peak2;
    
    Rectangle (int[] a, int [] b){
        this.peak1=a;
        this.peak2=b;
        
        this.plosh=Math.abs((peak1[0]-peak2[0])*(peak1[1]-peak2[1]));
        this.perim=(Math.abs(peak1[0]-peak2[0])+Math.abs(peak1[1]-peak2[1]))*2;
    }
    
    public double getPerim(){
        return perim;
    }

    public double getPlosh() {
        return plosh;
    }
    
    public void setP1(int[] x){
        this.peak1=x;
    }
    public void setP2(int[] x){
        this.peak2=x;
    }
    public boolean vnutr(int x, int y){
        if(((peak1[0]<=x && peak2[0]>=x)||(peak1[0]>=x && peak2[0]<=x))&&
           ((peak1[1]<=y && peak2[1]>=y)||(peak1[1]>=y && peak2[1]<=y))){
            return true;
        }
        else return false;
    }
    
    
    
}
