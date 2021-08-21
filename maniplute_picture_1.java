/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import cpit380practice.*;
import java.awt.Color;

/**
 *
 * @author moudhialsaadi
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // chose picture 
        String fileName = FileChooser.pickAFile();
        System.out.println("path is" + fileName);

        //    String p = "c://Users/moudhialsaadi/Desktop/aa.jpeg\n" + "";
        // define pic 
        Picture pic = new Picture(fileName);
        pic.show();

        // get width and height
        System.out.println("pic width is " + pic.getWidth());
        System.out.println("pic height is " + pic.getHeight());

        // get pixels 
        Pixel[] pp = pic.getPixels();
        System.out.println("number of pixels " + pp.length);
        System.out.println("values of pixels 300 " + pp[299]);
        System.out.println(" x values of pixels  " + pp[299].getX());
        System.out.println(" y values of pixels  " + pp[299].getY());

        Pixel px = pic.getPixel(100, 100);
        System.out.println(px);
        System.out.println("the red value " + px.getRed());

        // get coler
        Color color = pp[299].getColor();
        System.out.println(color);
        pp[299].setColor(Color.WHITE);

        pic.show();

        pic.repaint();

        // save changes 
        pic.write("pic2.jpg");

        // ******* task 1 **********
//          for (int i = 0; i < pp.length; i++) {
//            pp[i].setColor(Color.red);
//            
//        }
//           pic.repaint();
//           
        // ******** task2 ********
        // icrease the green  componet by 40%
        Pixel pixell = null;
        int green = 0;
        int newColor = 0;

        for (int i = 0; i < pp.length; i++) {

            pp[i].setGreen((int) (pp[i].getGreen() * 0.6));
        }
        pic.repaint();

        //***** task 2 part 2
        int x = 0;

        Pixel[] pixelArray = pic.getPixels();
        Pixel pixel = null;
        int luminance = 0;
        double redValue = 0;
        double greenValue = 0;
        double blueValue = 0;
        for (int i = 0; i < pic.getHeight(); i++) {
            for (int j = 0; j < pic.getWidth()/2; j++) {
                pixel = pp[x];
                
            luminance = (int) (((pixel.getRed()) + (pixel.getGreen()) + (pixel.getBlue())) / 3);
          pixel.setColor(new Color(luminance, luminance, luminance));
        x++;
            }
           if(pp.length == pp.length)
               break;
        }
        
        pic.show();


    }
    
}
