package org.opentutorials.javatutorials.ch6Class.verify.exam20_bankapplication;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 29..
 */
public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run =true;

        while (run){
            System.out.println("-----------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();

            if(selectNo==1){
                creatAccount();
            }else if (selectNo==2){
                accountList();
            }else if (selectNo==3){
                diposit();
            }else if (selectNo==4){
                withdraw();
            }else if (selectNo==5){
                     run = false;
            }
        }
        System.out.println("프로그램 종료");

    }

    private static void withdraw() {
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        if (account ==null){
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }



    private static void diposit() {
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        if (account ==null){
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance()+ money);
        System.out.println("결과: 입금이 성공되었습니다.");
    }

    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++){
            if (accountArray[i] != null){
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)){
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }


    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        for (int i = 0; i < accountArray.length; i ++){
         Account account = accountArray[i];
         if (account != null){
             System.out.print(account.getAno());
             System.out.print("     ");
             System.out.print(account.getOwner());
             System.out.print("     ");
             System.out.print(account.getBalance());
             System.out.println();
         }
        }
    }

    private static void creatAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        System.out.print("계좌번호 : ");
        String ano =scanner.next();

        System.out.print("계좌주 : ");
        String owner = scanner.next();

        System.out.print("초기 금액: ");
        int balance = scanner.nextInt();

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i ++){
            if (accountArray[i] == null){
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }

    }

}