package edu.info.ip.main;

import java.awt.image.BufferedImage;
import java.awt.image.Kernel;

import static edu.info.ip.util.ImageUtil.*;

public class TestConvolve {

    public static void main(String[] args) {
        String inputFileName = "./test_images/lena_color_512.bmp";
        //        BufferedImage inputImg = ImageUtil.loadImage(inputFileName);
        BufferedImage inputImg = loadImage(inputFileName);

        //        ImageUtil.displayImage(inputImg,"Original image");
        displayImage(inputImg,"Original image");

        float[] avg = { 0.11f, 0.11f, 0.11f,
                        0.11f, 0.11f, 0.11f,
                        0.11f, 0.11f, 0.11f};

        float[] sharp = {   0.0f, -1.0f, 0.0f,
                            -1.0f, 5.0f, -1.0f,
                            0.0f, -1.0f, 0.0f};

        float[] edge = {    0.0f, -1.0f, 0.0f,
                            -1.0f, 4.0f, -1.0f,
                            0.0f, -1.0f, 0.0f};


        Kernel avgKernel = new Kernel(3,3 ,avg);

        int kSize = 25;

        float[] avg2 = new float[kSize * kSize];

        for (int i = 0; i < kSize * kSize; i++) {
            avg2[i] = 1.0f / (kSize * kSize);
        }

        BufferedImage avgImg = convolutionSimple(inputImg,new Kernel(kSize,kSize,avg2));
        displayImage(avgImg, "AVG2 Simple");

        avgImg = convolution(inputImg,new Kernel(kSize,kSize,avg2));
        displayImage(avgImg, "AVG2 java api");

//        BufferedImage sharpImg = convolutionSimple(inputImg,new Kernel(3,3,sharp));
//        displayImage(sharpImg, "Sharp");
//
//        BufferedImage edgeImg = convolutionSimple(inputImg,new Kernel(3,3,edge));
//        displayImage(edgeImg, "Edge");
    }

}
