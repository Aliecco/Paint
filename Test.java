package paint;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javax.imageio.ImageIO;


/**
 *
 * @author Alisher
 */
public class Paint extends Application {
    public static void main(String[] args) {
        Application.launch(args);
        
        Scanner scn=new Scanner(System.in);
        
        
        String krugs = "circle";
        String prim = "square";
        
        
        try{
            File file = new File("image.png");
            BufferedImage source = ImageIO.read(file);
        
            BufferedImage result = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
            
            
            
            
            System.out.println("цвет фигуры (нужно написать 3 цифры)");
            int red1 = scn.nextInt();
            int green1 = scn.nextInt();
            int blue1 = scn.nextInt();
            Color newColor = new Color(red1, green1, blue1);
            
            String qwerty = scn.nextLine();
            
            boolean revise = true;
            while (revise){
                
                System.out.println("circle or square");
                
                String choise = scn.nextLine();
                
            if(choise.equals(krugs)){
                System.out.println("Центр окружности");
                int [] centr={scn.nextInt(),scn.nextInt()};
                System.out.println("Радиус окружности");
                int rad = scn.nextInt();
                
                
                for (int x = 0; x < source.getWidth(); x++) {
                    for (int y = 0; y < source.getHeight(); y++) {
                        if(Math.pow((x-centr[0]),2)+Math.pow((y-centr[1]),2)<=rad*rad){
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
                
                
                for (int x = 0; x < source.getWidth(); x++) {
                    for (int y = 0; y < source.getHeight(); y++) {
                        if(((peak1[0]<=x && peak2[0]>=x)||(peak1[0]>=x && peak2[0]<=x))&&
                        ((peak1[1]<=y && peak2[1]>=y)||(peak1[1]>=y && peak2[1]<=y))){
                            result.setRGB(x, y, newColor.getRGB());
                        }
                        
                    }
                }
                
            }
            else {
                System.out.println("такого нет");
            
            }
            System.out.println("еще?");
            int asd = scn.nextInt();
            String qwerty2 = scn.nextLine();
            
            if(asd!=1){
                revise = false;
            }
            }
            
            
            File output = new File("image.png");
            ImageIO.write(result, "png", output);
        
        }
        catch(IOException e){
            System.out.println("Файл не найден или не удалось сохранить");
        }
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene = new Scene (group,800,500);
        
        primaryStage.setTitle("Hello world");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
}
