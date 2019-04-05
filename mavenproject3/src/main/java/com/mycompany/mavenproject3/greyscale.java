/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ASUS
 */
public class greyscale {
    
    public void generateGreyScaleImage() throws IOException{
    BufferedImage img = null;
    File file;
    OCR ocr_object = new OCR();
    //read image
    try{
      file = new File("C:\\Users\\ASUS\\Desktop\\newlife.jpg");
      img = ImageIO.read(file);
    }catch(IOException e){
      System.out.println(e);
    }

    //get image width and height
    int width = img.getWidth();
    int height = img.getHeight();

    //convert to grayscale
    for(int y = 0; y < height; y++){
      for(int x = 0; x < width; x++){
        int p = img.getRGB(x,y);

        int a = (p>>24)&0xff;
        int r = (p>>16)&0xff;
        int g = (p>>8)&0xff;
        int b = p&0xff;

        //calculate average
        int avg = (r+g+b)/3;

        //replace RGB value with avg
        p = (a<<24) | (avg<<16) | (avg<<8) | avg;

        img.setRGB(x, y, p);
      }
    }

    //write image
    try{
      file = new File("C:\\Users\\ASUS\\Desktop\\newlife.jpg");
      ImageIO.write(img, "jpg", file);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}

