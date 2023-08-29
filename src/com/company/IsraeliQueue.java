package com.company;

import java.util.List;

public class IsraeliQueue<T> extends Thread{
    private List<QueueElement<T>> queue;
    private int size = this.queue.size();

    public IsraeliQueue(List<QueueElement<T>> data){
        this.queue = data;
    }

    public  void enQueue (QueueElement<T> toAdd){
        if (!toAdd.hasFriends()) {
            this.queue.add(toAdd);
        } else {
            for (int i = 0; i < this.queue.size(); i++) {
                QueueElement<T> current = this.queue.get(i);
                if (current.isFriend(toAdd.getData())) {
                    this.queue.add(i + 1, toAdd);
                    break;
                }
            }
        }
    }

    public void deQueue() {
        this.queue.remove(0);

    }

    public Object peek() {
        if (isNull()) {
            return null;
        } else return this.queue.get(0);

    }

    public boolean isNull() {
        boolean result = false;
        if (this.queue.get(0) == null) {
            result = true;
        }
        return result;


    }


    @Override
    public String toString() {
        return
                "queue = " + queue +
                " size=" + size ;

    }
}
