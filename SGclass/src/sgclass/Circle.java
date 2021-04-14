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
public class Circle extends Figure {
    private int[] Centr= new int[2];
    private int rad;
    
    Circle(int[] a,  int r){
        this.Centr [0] = a[0];
        this.Centr [1] = a[1];
        this.rad = r;
        this.perim=rad*Math.PI*2;
        this.plosh=rad*rad*Math.PI;
    }
    
    public double getPerim(){
        this.perim=rad*Math.PI*2;
        return perim;
    }
    
    public double getPlosh() {
        this.plosh=rad*rad*Math.PI;
        return plosh;
    }
    
    public void setCentr(int[] x){
        this.Centr=x;
    }
    public void setRad(int x){
        this.rad=x;
    }
    
    public boolean vnutr(int x, int y){
        if(Math.pow((x-Centr[0]),2)+Math.pow((y-Centr[1]),2)<=rad*rad){
            
            return true;
        }
        else { return false;}
    }
    
}
