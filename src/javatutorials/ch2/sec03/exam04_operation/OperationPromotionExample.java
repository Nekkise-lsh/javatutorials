package javatutorials.ch2.sec03.exam04_operation;

/**
 * Created by Nekisse_lee on 2017. 6. 21..
 */
public class OperationPromotionExample {
    public static void main(String[] args){
        byte byteValue1 = 10;
        byte byteValue2 = 20;

    //    byte  byteValue3 = byteValue1 + byteValue2 ;
        int intValue1 = byteValue1 + byteValue2 ;

        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;

        System.out.println(charValue2);

      //  char charValue3 = charValue1+charValue2;
          int intValue2 = charValue1+charValue2;
        System.out.println("유니코드=" + intValue2);
        System.out.println("출력문자 = " + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);

        int intValue5 = 10;
      //  int intValue6 = 10/4.0;
       //int intValue6 = intValue5/4.0;
       double doubleValue = intValue5/4.0;
        System.out.println(doubleValue);



    }
}