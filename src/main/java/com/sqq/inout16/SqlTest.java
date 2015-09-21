package com.sqq.inout16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @Author: sunqianqian
 * @Date: 2015/7/9
 * @Description:
 * @CodeReviewer:
 */
public class SqlTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\CFCA\\xfraud_srcb.sql");
        PrintStream ps = null;
        Scanner scanner = new Scanner(file);
        int i = 0;
        int index = 0;
        String s;
        StringBuffer sb = new StringBuffer();
        while (scanner.hasNext()) {
            s = scanner.next();
            sb.append(s+" ");
            if (s.contains(";")) {
                i++;
            }
            if (i == 10000) {
                FileOutputStream fos = new FileOutputStream("srcb"+index+".sql");
                ps = new PrintStream(fos);
                ps.print(sb.toString());
                sb = new StringBuffer();
                index++;
                i=0;
                System.out.println("new+"+index);
                break;
            }
        }
    }
}
