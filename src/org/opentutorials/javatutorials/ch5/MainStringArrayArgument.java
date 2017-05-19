package org.opentutorials.javatutorials.ch5;

/**
 * Created by Nekisse_lee on 2017. 5. 19..
 */
public class MainStringArrayArgument {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("프로그램의 사용법");
            System.out.println("Java MainStringArrayArgument num1 num2");
            System.exit(0);

        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
