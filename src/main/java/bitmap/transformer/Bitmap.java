package bitmap.transformer;

//three transforms
//color invert
//Vertically  Mirror
//Horizontally Mirror


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Bitmap {
    private  BufferedImage image;
    private Object outputFilePath;

    public Bitmap(String inputFilePath, String outputFilePath, String transName) throws IOException {
        Path InputImage= Paths.get(inputFilePath);
        this.outputFilePath= Paths.get(outputFilePath);
        this.image= ImageIO.read(InputImage.toFile());

    }

        //color invert
        public void colorInvert() {
                for (int i = 0; i < image.getWidth(); i++) {
                    for(int j=0; j<image.getHeight();j++) {
                        int imageColor= image.getRGB(i,j);
                        Color input =new Color(imageColor,true);
                        Color output =new Color(255-input.getRed(),
                        255-input.getGreen(),
                         255-input.getBlue());
                        image.setRGB(i, j,output.getRGB());

                    }
                }





                }



    }
