package org.opentutorials.javatutorials.ch4.sec02.exam01_if;

/**
 * Created by Nekisse_lee on 2017. 6. 23..
 */
public class IfExample {
    public static void main(String[] args) {
        int score = 85;
        if (score > 90){
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다");
        }

        if (score < 90){
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다");
        }
    }
}
