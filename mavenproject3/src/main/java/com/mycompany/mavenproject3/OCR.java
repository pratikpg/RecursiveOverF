/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author ASUS
 */
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;
public class OCR {
    
    
    public static BufferedImage cropImage(BufferedImage bufferedImage, int x, int y, int width, int height){
    BufferedImage croppedImage = bufferedImage.getSubimage(x, y, width, height);
    return croppedImage;
    }
    
    public void jai() throws IOException {
        
        //File imageFile = new File("C:\\Users\\ASUS\\Pictures\\Camera Roll\\WIN_20190404_19_38_33_Pro.jpg");
        
        File imageFile = new File("c:\\123.jpg");
        BufferedImage bufferedImage = ImageIO.read(imageFile);
        //BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\mavenproject3\\hey.txt"));
        //String s=reader.readLine();
        //String[] coords = s.split(" ");
        //int x1,y1,x2,y2;
        //x1 = Integer.parseInt(coords[0]);
        //y1 = Integer.parseInt(coords[1]);
        //x2 = Integer.parseInt(coords[2]);
        //y2 = Integer.parseInt(coords[3]);
        
        //bufferedImage=cropImage(bufferedImage,x1,y1,x2-x1,y2-y1);
        // File pathFile = new File("C:\\Users\\ASUS\\Desktop\\newlife.jpg");
      //  ImageIO.write(bufferedImage,"jpg", pathFile);
        
        
      BufferedImage ma=null;
        if(OCR1.me==1)
       ma=cropImage(bufferedImage,276,0,200,40);

       if(OCR1.me==2)
         ma=cropImage(bufferedImage,129,40,200,19);
        if(OCR1.me==3)
       ma=cropImage(bufferedImage,129,55,200,20);
       if(OCR1.me==4)
       ma=cropImage(bufferedImage,131,77,200,20);
          if(OCR1.me==5)
        ma=cropImage(bufferedImage,129,110,200,20);
             if(OCR1.me==6)
        ma=cropImage(bufferedImage,129,125,200,20);
             if(OCR1.me==7)
           ma=cropImage(bufferedImage,129,140,320,80);
             if(OCR1.me==8)
          ma=cropImage(bufferedImage,129,227,100,20);
              if(OCR1.me==9)
         ma=cropImage(bufferedImage,129,246,100,20);
              if(OCR1.me==10)
         ma=cropImage(bufferedImage,129,264,100,20);
                if(OCR1.me==11)   
      ma=cropImage(bufferedImage,129,282,100,20);
            if(OCR1.me==12)
         ma=cropImage(bufferedImage,129,300,100,20);
                if(OCR1.me==13)
         ma=cropImage(bufferedImage,129,318,100,20);
            if(OCR1.me==14)
          ma=cropImage(bufferedImage,129,336,100,20);
            if(OCR1.me==15)
             ma=cropImage(bufferedImage,369,249,20,18);
                if(OCR1.me==16)
             ma=cropImage(bufferedImage,365,266,50,20);
           if(OCR1.me==17)
          ma=cropImage(bufferedImage,365,284,50,20);
        if(OCR1.me==18)
             ma=cropImage(bufferedImage,365,302,50,20);
        if(OCR1.me==19)
            ma=cropImage(bufferedImage,365,320,50,20);
        if(OCR1.me==20)
          ma=cropImage(bufferedImage,460,43,100,20);
                if(OCR1.me==21)
              ma=cropImage(bufferedImage,460,63,100,20);
        if(OCR1.me==22)
                 ma=cropImage(bufferedImage,460,79,100,20);
            if(OCR1.me==23)
               ma=cropImage(bufferedImage,460,96,100,20);
        
        



        File pathFile = new File("C:\\Users\\ASUS\\Desktop\\newlife.jpg");
        ImageIO.write(ma,"jpg", pathFile);
    }
    }
		
		
	

