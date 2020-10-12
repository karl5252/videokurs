package com.company;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ScreenCapture {

    public static void main(String[] args) throws Exception {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Robot rt = new Robot();
        BufferedImage img = rt.createScreenCapture(new Rectangle((int) screen
                .getWidth(), (int) screen.getHeight()));
        ImageIO.write(img, "jpeg", new File("C:/tmp/" + System.currentTimeMillis()
                + ".jpeg"));
        System.out.println(System.currentTimeMillis()
                + ".jpeg");
    }


}
