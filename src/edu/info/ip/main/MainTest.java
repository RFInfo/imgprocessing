package edu.info.ip.main;

import edu.info.ip.util.ImageUtil;

import java.awt.image.BufferedImage;

public class MainTest {

    public static void main(String[] args) {

        String inputFileName = "./test_images/lena_color_512.bmp";
        BufferedImage inputImg = ImageUtil.loadImage(inputFileName);

        ImageUtil.displayImage(inputImg,"Original image");

//        ImageUtil.saveImage(inputImg,"out_image.jpg","jpg");

//        BufferedImage randomPixels = ImageUtil.generateRandomPixels(800, 600);
//        ImageUtil.displayImage(randomPixels, "Random Color Pixels");

        // descompunere in componente RGB
//        ImageUtil.displayImage(ImageUtil.extractBand(inputImg, 'R'), "Red");
//        ImageUtil.displayImage(ImageUtil.extractBand(inputImg, 'G'), "Green");
//        ImageUtil.displayImage(ImageUtil.extractBand(inputImg, 'B'), "Blue");
//
//        ImageUtil.displayImage(ImageUtil.extractBand2(inputImg, 0), "Red");
//        ImageUtil.displayImage(ImageUtil.extractBand2(inputImg, 1), "Green");
//        ImageUtil.displayImage(ImageUtil.extractBand2(inputImg, 2), "Blue");

        // generare de nivele de gri
//        ImageUtil.displayImage(ImageUtil.grayLevelGenerator(0,50,5,400),"Gray levels");

        // pixelate
//        BufferedImage pixelImg = ImageUtil.pixelate(inputImg,64);
//        BufferedImage rImg = ImageUtil.extractBand2(pixelImg,0);
//        BufferedImage gImg = ImageUtil.extractBand2(pixelImg,1);
//        BufferedImage bImg = ImageUtil.extractBand2(pixelImg,2);
//
//        ImageUtil.displayImage(pixelImg,"Pixelate");
//        ImageUtil.displayImage(rImg,"Pixelate - R");
//        ImageUtil.displayImage(gImg,"Pixelate - G");
//        ImageUtil.displayImage(bImg,"Pixelate - B");

        // flip
        ImageUtil.displayImage(ImageUtil.flipV(inputImg),"FlipV");
        ImageUtil.displayImage(ImageUtil.flipH(inputImg),"FlipH");
        ImageUtil.displayImage(ImageUtil.flipV(ImageUtil.flipH(inputImg)),"FlipHV");
    }
}
