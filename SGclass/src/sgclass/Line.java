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
public class Line {
    
    private int [] peak1;
    private int [] peak2;
    int a, b;
    
    Line (int[] x1, int [] x2){
        this.peak1=x1;
        this.peak2=x2;
        if(peak1[0]==peak2[0]){
            
        }
        
    }
    
    public boolean vnutr(int x, int y){
        if((((peak1[0]<=x && peak2[0]>=x)||(peak1[0]>=x && peak2[0]<=x))&&
                ((peak1[1]<=y && peak2[1]>=y)||(peak1[1]>=y && peak2[1]<=y)))&&(x==y)){
            return true;
        }
        else return false;
    }
}
