package javatutorials.ch3.sec04.exam04_logical;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class LogicalOperatorExample {
    public static void main(String[] args){
        int charCode = '5';

        if ((charCode >= 65) && (charCode<= 90)){
            System.out.println("대문자 이군요");

        }

        if ((charCode >= 97) && (charCode<= 122)){
            System.out.println("소문자 이군요");

        }

        if (!(charCode <48 ) && !(charCode>57)){
            System.out.println("0~9 숫자이군");

        }


        int value = 6;
        if ((value%2==0)| (value%3 == 0)){
            System.out.println("2또는 3의 배수이군");
        }

        if ((value%2==0)|| (value%3 == 0)){
            System.out.println("2또는 3의 배수이군");
        }
    }
}
