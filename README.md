# RecursiveOverF
OCR 

LAYOUTS:

activity_main.xml 
  
  
  contains buttons for capturing image and display image

activity_displayimage.xml
  
  contains imageview to display captured image.
  
JAVA:

Main_Activity.java
  
  captures and saves image through camera.
  
displayimg.java
  
  displays captured images

Tesseract:
  OCR.JAVA
    
    uses ocr to read text from images.
    
  GreyIt.java
  
    Converts images to grey scale.
    
   Dependencies:
      
      group Id : net.sourceforge.tess4j
      artifactId : tess4j
      version : 4.1.0
