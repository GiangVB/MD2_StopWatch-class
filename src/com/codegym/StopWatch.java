package com.codegym;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch(){
        startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }
    public void end() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime(){
        int miliSecond = ((endTime.getHour()-startTime.getHour())*3600000 + (endTime.getMinute()-startTime.getMinute())*60000 + (endTime.getSecond()-startTime.getSecond())*1000);
        return miliSecond;
    }
}
