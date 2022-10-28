package edu.info.ip.main;

import edu.info.ip.util.*;

import static edu.info.ip.util.ImageUtil.*;

import java.awt.image.BufferedImage;

public class MainTest {

    public static void main(String[] args) {

//        String inputFileName = "./test_images/lena_color_512.bmp";
        String inputFileName = "./test_images/eight.bmp";
//        BufferedImage inputImg = ImageUtil.loadImage(inputFileName);
        BufferedImage inputImg = loadImage(inputFileName);

//        ImageUtil.displayImage(inputImg,"Original image");
        displayImage(inputImg,"Original image");

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
//        displayImage(grayLevelGenerator(0,50,1,400),"Gray levels");

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
//        ImageUtil.displayImage(ImageUtil.flipV(inputImg),"FlipV");
//        ImageUtil.displayImage(ImageUtil.flipH(inputImg),"FlipH");
//        ImageUtil.displayImage(ImageUtil.flipV(ImageUtil.flipH(inputImg)),"FlipHV");

        // to gray

//        ImageUtil.displayImage(ImageUtil.toGray(inputImg),"To Gray Simple");

//        displayImage(colorToGray(inputImg, GrayTransforms.GRAY_TRANSFORMS_AVG),"GRAY_TRANSFORMS_AVG");
//        displayImage(colorToGray(inputImg, GrayTransforms.GRAY_TRANSFORMS_GREEN),"GRAY_TRANSFORMS_GREEN");
//        displayImage(colorToGray(inputImg, GrayTransforms.GRAY_TRANSFORMS_PAL),"GRAY_TRANSFORMS_PAL");
//        displayImage(colorToGray(inputImg, GrayTransforms.GRAY_TRANSFORMS_SQRT),"GRAY_TRANSFORMS_SQRT");
//        displayImage(colorToGray(inputImg, GrayTransforms.GRAY_TRANSFORMS_USUAL),"GRAY_TRANSFORMS_USUAL");

        // brightness

//        displayImage(brightnessV1(inputImg, 50), "Brightness +50");
//        displayImage(brightnessV2(inputImg, 50), "Brightness +50");
//        displayImage(brightnessV3(inputImg, 50), "Brightness +50");

//        brightnessRGB
//        displayImage(brightnessRGB(inputImg, -50, 20, -40), "Brightness RGB");

        // contrast
//        displayImage(contrast(inputImg, 1.2f), "Contrast");

// brightnessRGB + contrast
//        BufferedImage brightnessImg = brightnessRGB(inputImg, -50, 20, -40);
//        displayImage(brightnessImg, "Brightness");
//
//        BufferedImage contrastImg = contrast(brightnessImg, 1.2f);
//        displayImage(contrastImg, "Contrast");

//        BufferedImage testImg = applySettingsDlg(inputImg, new BrightnessDlg());
//        displayImage(testImg);

//        BufferedImage testImg = applySettingsDlg(inputImg, new BrightnessRGBDlg());
//        displayImage(testImg,"Brightness RGB");

//        BufferedImage testImg = contrastGamma(inputImg, 0.9d);
//        displayImage(contrastGamma(testImg, 1.5d), "Gamma 1.5");


        // inversare efect
//        BufferedImage testImg1 = applySettingsDlg(inputImg, new GammaDlg());
//        BufferedImage testImg2 = applySettingsDlg(testImg1, new GammaDlg());
//        displayImage(testImg2,"Gamma");

//        BufferedImage testImg1 = applySettingsDlg(inputImg, new BrightnessDlg());
//        BufferedImage testImg2 = applySettingsDlg(testImg1, new BrightnessDlg());
//        displayImage(testImg2,"Brightness");

        // threshold
        BufferedImage testImgGray = colorToGray(inputImg,GrayTransforms.GRAY_TRANSFORMS_PAL);
        displayImage(testImgGray, "Gray");
//        BufferedImage testImgThreshold = threshold(testImgGray,128);
        BufferedImage testImgThreshold = applySettingsDlg(testImgGray, new ThresholdDlg());
        displayImage(testImgThreshold, "Binary");

        BufferedImage testImgNegative = (negative(testImgThreshold));
        displayImage(testImgNegative, "Binary Negative");

        displayImage(applyMask(inputImg,testImgNegative));

    }
}
