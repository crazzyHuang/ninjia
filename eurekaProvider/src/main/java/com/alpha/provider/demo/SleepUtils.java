package com.alpha.provider.demo;

import java.util.concurrent.TimeUnit;

/**
 * Created by liaosheng on 2018/4/12.
 */
public class SleepUtils {
    public static final void second(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}