package com.sqq.env9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Author: sunqianqian
 * @Description:
 * @CodeReviewer:
 */
public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
       /* String logPaht = "C:\\IDE_workspace\\idea_workspace\\git\\java_demo\\src\\main\\java\\com\\sqq\\collection7\\a.ini";
        Scanner sc = new Scanner(new File(logPaht));
        while (sc.hasNextLine()) {
            System.out.println("write : " + sc.nextLine());
        }*/
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println("you scan :" + scanner.next());
        }
    }
}
