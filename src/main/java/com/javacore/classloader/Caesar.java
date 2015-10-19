package com.javacore.classloader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/30
 * @Description:
 * @CodeReviewer:
 */
public class Caesar {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("USAGE: java Caesar in out key");
            return;
        }
        try {
            FileInputStream in = new FileInputStream(args[0]);
            FileOutputStream out = new FileOutputStream(args[1]);
            int key = Integer.parseInt(args[2]);
            int ch ;
            while ((ch = in.read()) != -1) {
                byte c = (byte) (ch + key);
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
