package org.opentutorials.javatutorials.ch10Exception.sec05;

/**
 * Created by Nekisse_lee on 2017. 5. 29..
 */
public class TryWithResourceExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")){
            fis.read();
            throw new Exception();
        }catch(Exception e){
            System.out.println("예외 처리 코드가 실행되었습니다");
        }
    }
}