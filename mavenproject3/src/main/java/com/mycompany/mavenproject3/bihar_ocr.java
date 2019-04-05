/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import static com.mycompany.mavenproject3.OCR.cropImage;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ASUS
 */
public class bihar_ocr {
     public void jai() throws IOException {
        
        //File imageFile = new File("C:\\Users\\ASUS\\Pictures\\Camera Roll\\WIN_20190404_19_38_33_Pro.jpg");
        File imageFile = new File("C:\\123.jpg");
        BufferedImage bufferedImage = ImageIO.read(imageFile);
        BufferedImage ma=null;
        while(true){
        if(OCR1.me==1)
       ma=cropImage(bufferedImage,314,69,150,25);//regno

        else if(OCR1.me==5)
         ma=cropImage(bufferedImage,304,98,250,23);//name
       else if(OCR1.me==6)
       ma=cropImage(bufferedImage,303,123,250,23);//s/w/d
       else if(OCR1.me==7)
       ma=cropImage(bufferedImage,303,143,250,45);//addr
         else if(OCR1.me==22)
        ma=cropImage(bufferedImage,303,227,60,23);//vehicle class
            else if(OCR1.me==3)
        ma=cropImage(bufferedImage,303,248,200,22);//chasisnumber
            else if(OCR1.me==4)
           ma=cropImage(bufferedImage,303,269,150,23);//engine no
            else if(OCR1.me==2)
          ma=cropImage(bufferedImage,303,291,100,22);//regdate
             else
             {
                 if((OCR1.me++)>23)
                     break;
                 
                 continue;
             }
        break;
        }



        File pathFile = new File("C:\\Users\\ASUS\\Desktop\\newlife.jpg");
        ImageIO.write(ma,"jpg", pathFile);
    }
}
