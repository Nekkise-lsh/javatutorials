package org.opentutorials.javatutorials.ch11.sec15_format.exam01_fomat;

import java.text.MessageFormat;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class MessageFormatExample {
    public static void main(String[] args) {
        String id = "java";
        String name = "신용권";
        String tel = "010-123-5678";

        String text = "회원 ID: {0} \n회원 이름: {1} \n회원 전화: {2}";
        String result1 = MessageFormat.format(text, id, name, tel);
        System.out.println(result1);
        System.out.println();

        String sql = "insert into member values( {0}, {1}, {2}  )";
        Object[] argument = {"java", "신용권", "010-123-5678"};
        String result2 = MessageFormat.format(sql,argument);
        System.out.println(result2);


    }
}
