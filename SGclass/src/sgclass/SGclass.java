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

import java.util.Scanner;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class SGclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        
        System.out.println("circle or square");
        String choise = scn.nextLine();
        String krugs = "circle";
        String prim = "square";
        
        System.out.println(choise);
        try{
            File file = new File("image.png");
            BufferedImage source = ImageIO.read(file);
        
            BufferedImage result = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
            
            System.out.println("цвет фигуры (нужно написать 3 цифры)");
            Color newColor = new Color(scn.nextInt(),scn.nextInt(),scn.nextInt());
            Color white = new Color(255, 255, 255);
            
            //стирать рисунок
            
            for (int x = 0; x < source.getWidth(); x++) {
                for (int y = 0; y < source.getHeight(); y++) {
                    result.setRGB(x, y, white.getRGB());
                    
                }
            }
            
            
            if(choise.equals(krugs)){
                System.out.println("Центр окружности");
                int [] centr={scn.nextInt(),scn.nextInt()};
                System.out.println("Радиус окружности");
                int rad = scn.nextInt();
                
                Circle krug=new Circle(centr,rad);
                System.out.println("Длина окружности: "+krug.getPerim());
                System.out.println("Площадь окружности: "+krug.getPlosh());
        
                System.out.println("Координаты точки");
                if(krug.vnutr(scn.nextInt(), scn.nextInt())==true){
                System.out.println("точка входит в окружность");}
                else System.out.println("точка не входит в окружность");
            
            
            
                for (int x = 0; x < source.getWidth(); x++) {
                    for (int y = 0; y < source.getHeight(); y++) {
                        if(krug.vnutr(x,y)==true){
                            result.setRGB(x, y, newColor.getRGB());
                        }
                    }
                }
            
            }
            else if(choise.equals(prim)){
                System.out.println("Первая вершина");
                int [] peak1={scn.nextInt(),scn.nextInt()};
                System.out.println("Вторая вершина");
                int [] peak2={scn.nextInt(),scn.nextInt()};
        
                Rectangle square = new Rectangle(peak1,peak2);
            
            
            
                System.out.println("Периметр прямоугольника: "+square.getPerim());
                System.out.println("Площадь прямоугольника: "+square.getPlosh());
        
                System.out.println("Координаты точки");
                if(square.vnutr(scn.nextInt(), scn.nextInt())==true)
                {System.out.println("точка входит в прямоугольник");}
                else{System.out.println("точка не входит в прямоугольник");}
            
            
                for (int x = 0; x < source.getWidth(); x++) {
                    for (int y = 0; y < source.getHeight(); y++) {
                        if(square.vnutr(x,y)==true){
                            result.setRGB(x, y, newColor.getRGB());
                        }
                    }
                }
                
            }
            else {
                System.out.println("такого нет");
                int x0=scn.nextInt();
                int y0=scn.nextInt();
                int x1=scn.nextInt();
                int y1=scn.nextInt();
                
                /*
                int deltax=Math.abs(x0-x1);
                int deltay=Math.abs(y0-y1);
                double error =0;
                double deltaerr=(deltay+1);
                int y=y0;
                int diry=y1-y0;
                if (diry>0) diry=1;
                if (diry<0) diry=-1;
            
                for (int x=x0;x<x1;x++){
                    result.setRGB(x, y, newColor.getRGB());
                    error=error+deltaerr;
                    if (error >=(deltax+1)){
                        y=y+diry;
                        error=error-(deltax+1);
                    }
            
                }
                */
                
                for (int x = 0; x < source.getWidth(); x++) {
                    for (int y = 0; y < source.getHeight(); y++) {
                        if((x1-x0)*(y-y0)==(y1-y0)*(x-x0)){
                            result.setRGB(x, y, newColor.getRGB());
                        }
                        else result.setRGB(x, y, white.getRGB());
                    }
                }
            }
            
            
            
            File output = new File("image.png");
            ImageIO.write(result, "png", output);
        
        }
        catch(IOException e){
            System.out.println("Файл не найден или не удалось сохранить");
        }
        
        
        
        /*
        for(int i=0; i<my; i++){
            for(int j=0; j<mx; j++){
                if(krug.vnutr(i,j)){
                    krug.getColor();
                    rgbval = new Color(,,,);
                    img.setRGB(j, i, rgbval.getRGB());
                } else{
                    //цвет белый
                }
            }
        }
        
        File file = new File("путь до файла");
        BufferedImage image = ImageIO.read(file);
        */
        

        
    }
    public static void DrawLine (int x0, int x1, int y0, int y1){
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
