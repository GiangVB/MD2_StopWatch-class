package com.codegym;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = new int [100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int)(Math.random()*1000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        a = selectionSort(a);
        stopWatch.end();

        System.out.println("Thời gian thực thi thuật toán sắp xếp 100,000 số: " + stopWatch.getElapsedTime() + " milli giây");
    }

    public static int[] selectionSort(int[] a){
        for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
