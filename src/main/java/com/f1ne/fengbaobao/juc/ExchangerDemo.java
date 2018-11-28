package com.f1ne.fengbaobao.juc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * @program: com.f1ne.fengbaobao.juc
 * @description:
 * @author: qiyunfei
 * @create: 2018-2018-08 16:04
 **/
public class ExchangerDemo {
    static class Producer implements Runnable {
        private List<String> buffer;
        private Exchanger<List<String>> exchanger;

        Producer(List<String> buffer, Exchanger<List<String>> exchanger) {
            this.buffer = buffer;
            this.exchanger = exchanger;

        }

        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                System.out.println("生产者第" + i + "次提供");
                for (int j = 1; j <= 3; j++) {
                    System.out.println("生产者装入" + i + "---" + j);
                    buffer.add("buffer:" + i + "---" + j);
                }
                System.out.println("生产者装满了。等待与消费者交换。。。。。。。。");
                try {
                    exchanger.exchange(buffer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    static class Cosumer implements Runnable {
        private List<String> buffer;
        private Exchanger<List<String>> exchanger;

        Cosumer(List<String> buffer, Exchanger<List<String>> exchanger) {
            this.buffer = buffer;
            this.exchanger = exchanger;

        }

        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    buffer = exchanger.exchange(buffer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("消费者第" + i + "次提取");
                for (int j = 1; j <= 3; j++) {
                    System.out.println("消费者入:" + buffer.get(0));
                    buffer.remove(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<String> buffer1 = new ArrayList<>();
        List<String> buffer2 = new ArrayList<>();
        Exchanger<List<String>> exchanger = new Exchanger();
        Thread producerThread = new Thread(new Producer(buffer1, exchanger));
        Thread consumerThread = new Thread(new Cosumer(buffer2, exchanger));
        consumerThread.start();
        producerThread.start();
    }

}
