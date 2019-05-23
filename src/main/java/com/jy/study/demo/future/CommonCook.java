package com.jy.study.demo.future;

/**
 * @author DengQiang.Wu
 * @create 2019-05-23 15:03
 */
public class CommonCook {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        OnlineShopping thread = new OnlineShopping();
        thread.start();
        thread.join();
    }


    static class OnlineShopping extends Thread {
        private Chuju chuju;

        @Override
        public void run() {
            System.out.println("下单");
            System.out.println("送货");
        }
    }

    class Chuju{}

}

