package javatutorials.ch18_io.sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class BufferdInputStreamExample {
    public static void main(String[] args) throws Exception {
     long start = 0;
     long end= 0;

        FileInputStream fis1 = new FileInputStream("/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec05/exam03_bufferedinputstream/forest.jpg");
        start= System.currentTimeMillis();
        while (fis1.read() != -1){}
        end= System.currentTimeMillis();

        System.out.println("사용하 않았을 때: " + (end-start)+ "ms");


        fis1.close();


        FileInputStream fis2 = new FileInputStream("/Users/Nekisse_lee/Documents/java_tutorials/src/org/opentutorials/javatutorials/ch18_io/sec05/exam03_bufferedinputstream/forest.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start= System.currentTimeMillis();
        while (bis.read() != -1){}
        end= System.currentTimeMillis();

        System.out.println("사용했을 때: " + (end-start)+ "ms");

        bis.close();
        fis1.close();

    }

}
