package org.opentutorials.javatutorials.ch8.sec05.exam01_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러갑니다.");
    }
}
