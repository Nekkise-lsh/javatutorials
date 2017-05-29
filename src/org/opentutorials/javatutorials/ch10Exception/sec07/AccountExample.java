package org.opentutorials.javatutorials.ch10Exception.sec07;

/**
 * Created by Nekisse_lee on 2017. 5. 29..
 */
public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        //예금

        account.deposit(10000);
        System.out.println("예금액: "+ account.getBalance());

        //출금
        
        try {
            account.withdraw(30000);
        }catch (BalanceInsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace();
        }
    }
}
