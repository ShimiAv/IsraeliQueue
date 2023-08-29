package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Thread {


    public static void main(String[] args) throws InterruptedException {
        IsraeliQueue myQueue = new IsraeliQueue(dataGenerator());
        deQueueThread(myQueue);
        Thread.sleep(deQueueTimeRandomizer());
        System.out.println(myQueue);
        enQueueThread(myQueue);
        Thread.sleep(enQueueTimeRandomizer());
        System.out.println(myQueue);



    }

    public static List dataGenerator() {
        List<String> l1 = new ArrayList<>();
        l1.add(0, "KESEM");
        l1.add(1, "ALIK");
        l1.add(2, "EILON");
        List<String> l2 = new ArrayList<>();
        l2.add(1, "EILON");
        l2.add(2, "SHIMI");
        List<String> l3 = new ArrayList<>();
        l3.add(1, "EILON");
        l3.add(2, "SHIMI");
        List<String> l4 = new ArrayList<>();
        l4.add(1, "SHIMI");
        l4.add(2, "ALIK");


        QueueElement queueElement1 = new QueueElement("SHIMI", l1);
        QueueElement queueElement2 = new QueueElement("ALIK", l2);
        QueueElement queueElement3 = new QueueElement("KESEM", l3);
        QueueElement queueElement4 = new QueueElement("EILON", l4);

        List<QueueElement> queueElementList = new ArrayList<>();
        queueElementList.add(queueElement1);
        queueElementList.add(queueElement2);
        queueElementList.add(queueElement3);
        queueElementList.add(queueElement4);

        return queueElementList;

    }

    public static void deQueueThread(IsraeliQueue queue) {
        Thread deQueueThread = new Thread(() -> {
            queue.deQueue();


        });
    }

    public static int deQueueTimeRandomizer() {
        Random random = new Random();
        int result = random.nextInt(5, 10);
        return result + 1;
    }

    public static int enQueueTimeRandomizer() {
        Random random = new Random();
        int result = random.nextInt(10, 12);
        return result + 1;
    }

    public static void enQueueThread(IsraeliQueue queue) {
        Thread deQueueThread = new Thread(() -> {
            List<String> l1 = new ArrayList<>();
            l1.add(0, "KESEM");
            l1.add(1, "ALIK");
            l1.add(2, "EILON");
            QueueElement queueElement1 = new QueueElement("SHIMI", l1);
            queue.enQueue(queueElement1);


        });
    }

}
