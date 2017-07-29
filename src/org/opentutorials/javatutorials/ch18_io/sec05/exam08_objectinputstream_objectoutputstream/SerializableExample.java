package org.opentutorials.javatutorials.ch18_io.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.*;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class SerializableExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Temp/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        ClassA classA = new ClassA();
        classA.field1 = 1;
        classA.field2.filed1 =2;
        classA.field3 = 3;
        classA.field4 = 4;


        oos.writeObject(classA);
        oos.flush(); oos.close(); fos.close();


        FileInputStream fis = new FileInputStream("Temp/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ClassA v = (ClassA) ois.readObject();
        System.out.println("field1: " + v.field1);
        System.out.println("field2.field1: " + v.field2.filed1);
        System.out.println("field3: " + v.field3);
        System.out.println("field4: " + v.field4);


    }
}
