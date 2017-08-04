package helloworld.inputoutputstream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class ByteExam1 {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/helloworld/inputoutputstream/ByteExam1.java");
            fos = new FileOutputStream("Temp/byte.txt");


            int readData = -1;
            while ((readData = fis.read()) != -1){
                fos.write(readData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-starTime);

    }
}
