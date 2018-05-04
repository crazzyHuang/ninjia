package com.alpha.provider.web;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liaosheng on 2018/4/25.
 */
public class Test {
    public static void main(String[] args) {

    }

    public void t() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
