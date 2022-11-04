package edu.info.ip.main;

import static edu.info.ip.util.ImageUtil.*;
import java.awt.image.BufferedImage;

public class TestHistogram {

    public static void main(String[] args) {
        String inputFileName = "./test_images/lena_color_512.bmp";
        BufferedImage inputImg = loadImage(inputFileName);
        displayImage(inputImg,"Original image");

        // histo RGB
        displayImage(histogramImage(inputImg,0,256, 150), "RED");
        displayImage(histogramImage(inputImg,1,256, 150), "GREEN");
        displayImage(histogramImage(inputImg,2,256, 150), "BLUE");

        // luminosity histo
        BufferedImage grayImage = colorToGray(inputImg, GrayTransforms.GRAY_TRANSFORMS_PAL);
        displayImage(grayImage, "Luminosity Image");

        displayImage(histogramImage(grayImage,0,256, 150), "LUMINOSITY");

        BufferedImage contrastStretchImg = contrastStretch(grayImage);
        displayImage(grayImage, "Contrast Stretch Image");

        displayImage(histogramImage(contrastStretchImg,0,256, 150), "LUMINOSITY");
    }
}