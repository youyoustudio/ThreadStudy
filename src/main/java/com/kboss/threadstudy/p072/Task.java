package com.kboss.threadstudy.p072;

public class Task {
    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask() {
        System.out.println("begin task");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getData1 = "长时间处理任务后从远程返回的值1 threadName="
                + Thread.currentThread().getName();
        getData2 = "长时间处理任务后从远程返回的值2 threadName="
                + Thread.currentThread().getName();
        System.out.println(getData1);
        System.out.println(getData2);
    }
}
