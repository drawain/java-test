package com.javatest.helpers;

public class Random {
    
    public Long generateLongBetween(Long leftLimit, Long rightLimit) {
        return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    }

}
