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


import java.awt.Dimension;
import com.github.sarxos.webcam.Webcam;
import static com.mycompany.mavenproject3.OCR.cropImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import java.io.PrintStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class OCR1 {
    public static int me=0;
    public void MyScan() throws TesseractException, IOException, SQLException {
		
		boolean kar =false;
		// OCR -----------------
                //webcam w=new webcam();
                //w.setVisible(true);
                OCR o=new OCR();
                bihar_ocr br=new bihar_ocr();
                String[] info = new String[26];
                me=1;
                o.jai();
                
                Tesseract tess = new Tesseract();
		tess.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
		String imgPath = "C:\\Users\\ASUS\\Desktop\\newlife.jpg";
		
		String text;
                
               
	
		text = tess.doOCR(new File(imgPath));
                
                if(text.contains("KA"))
                {
                    me=1;
                    for(int i=0;i<23;i++){
                   kar =true;
                o.jai();
                me++;
               /* greyscale g=new greyscale();
               try{
                g.generateGreyScaleImage();}
                catch(IOException e)
                {
                    
                }*/
                
               
	
		text = tess.doOCR(new File(imgPath));
                System.out.println(text);
                
                info[i] = text;
             
                }}
                else
                {   me=1;
                    for(int i=0;i<23;i++)
                        {
                            if(me==1){
                                br.jai();
                                me++;
                            }
                            System.out.println(me);
                            greyscale g=new greyscale();
                            try{
                            g.generateGreyScaleImage();}
                            catch(IOException e)
                                {
                    
                                }
                            
                            text = tess.doOCR(new File(imgPath));
                            br.jai();
                            System.out.println(text);
                            me++;
                            info[i] = text;
                            if(me>=23)
                                break;
                        }
                        }    
                    
		
		
                
                
                    
            String temp;   
            if(kar){
                    
             String[] s=new String[24];
            if(Pattern.matches("[K][A][0-9][0-9][A-Z][A-Z][0-9]{4}", info[0]))
            {s[0]=info[0];
         
            }
             if(!Pattern.matches("[A-Z]{1,32}",info[4]))

            {s[4]=info[4];
         
            }
            if(!Pattern.matches("[A-Z]*",info[5]))
                s[5]=info[5];
            if(!Pattern.matches("[0-9]{1}",info[14]))
                s[14]=info[14];
             if(!Pattern.matches("[0-9]+",info[15]))
                 s[15]=info[15];
             if(!Pattern.matches("[0-9]{1}||{2}",info[16]))
                 s[16]=info[16];
             if(!Pattern.matches("[0-9]{1}||{2}",info[17]))
                 s[17]=info[17];
            if(!Pattern.matches("[0-9]{4}",info[18]))
                s[18]=info[18];
                    

            String insertInto = "\n<tr>\n\t";
            
            for(int i=0;i<24;i++)
                insertInto += "<td>"+s[i]+"</td>\n";
        
        File html0 = new File("RC_Cards_Incorrect.html");
        String fullfile0;
        
                    try (BufferedReader reader0 = new BufferedReader(new FileReader(html0))) {
                        fullfile0 = "";
                        while((temp=reader0.readLine())!=null )
                            fullfile0 +=temp;
                    }
        BufferedWriter writer0 = new BufferedWriter(new FileWriter(html0));
            
           // System.out.println(i + "size of string : "+fullfile0.length());
        String[] sp0 = fullfile0.split("</table>");
        //System.out.println("Splitt : "+ sp[0] + " --------   "+sp[1]);
        writer0.write(sp0[0]+insertInto);
        writer0.newLine();
        writer0.write("</table>"+sp0[1]);
        writer0.close();
             }
            
                 
                
                
            int i;
            String sql = "\n\t\t\t<tr>\n";
            for(i=0;i<23;i++){
                sql +="<td>"+ info[i]+"</td>  ";
            }
            sql +="\n\t\t\t</tr>";
            
             File html = new File("RC_Cards.html");
        BufferedReader reader = new BufferedReader(new FileReader(html));
        String fullfile="";
        while((temp=reader.readLine())!=null )
            fullfile +=temp;
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(html));
            
            System.out.println(i + "size of string : "+fullfile.length());
        String[] sp = fullfile.split("</table>");
        //System.out.println("Splitt : "+ sp[0] + " --------   "+sp[1]);
        writer.write(sp[0]+sql);
        writer.newLine();
        writer.write("</table>"+sp[1]);
        writer.close();
        
//pushToDB(info);
	}
    }
        
