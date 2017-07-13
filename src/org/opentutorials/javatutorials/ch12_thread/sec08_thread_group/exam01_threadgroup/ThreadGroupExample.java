package org.opentutorials.javatutorials.ch12_thread.sec08_thread_group.exam01_threadgroup;

/**
 * Created by Nekisse_lee on 2017. 7. 11..
 */
public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup , "workThreadA");
        WorkThread workThreadB = new WorkThread(myGroup , "workThreadB");

        workThreadA.start();
        workThreadB.start();

        System.out.println("[ main 스레드 그룹의  list() 메소드 출력 내용 ] ");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();

        System.out.println();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}


        System.out.println("[ myGroup 스레드 그룹의  interrupt() 메소드 호출 ] ");
        myGroup.interrupt();

    }
}