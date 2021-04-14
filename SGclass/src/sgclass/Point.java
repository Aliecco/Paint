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
public class Point {
    
    Point (int x0, int x1, int y0, int y1){
        int deltax=Math.abs(x0-x1);
        int deltay=Math.abs(y0-y1);
        double error =0;
        double deltaerr=(deltay+1);
        int y=y0;
        int diry=y1-y0;
        if (diry>0) diry=1;
        if (diry<0) diry=-1;
        
        for (int x=x0;x<x1;x++){
            
            error=error+deltaerr;
            if (error >=(deltax+1)){
                y=y+diry;
                error=error-(deltax+1);
            }
            
        }
        
    }
    
}
