package com.company;

import java.util.List;

public class QueueElement<T> {
    private T content;
    private List<T> friends;

    public QueueElement(T content, List<T> friends) {
        this.content = content;
        this.friends = friends;
    }

    public List<T> getFriends() {
        return friends;
    }

    public T getContent() {
        return content;
    }


    public boolean isFriend (T data) {
        return this.friends.contains(data);
    }

    public boolean hasFriends () {
        return this.friends != null;
    }

    public T getData () {
        return this.content;
    }

    @Override
    public String toString() {
        return "content= " + content +
                "  friends=" + friends
                ;
    }
}
