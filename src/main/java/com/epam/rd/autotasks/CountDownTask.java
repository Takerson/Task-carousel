package com.epam.rd.autotasks;

public class CountDownTask implements Task{
    private int value;

    public CountDownTask(int value) {
        this.value = Math.max(value, 0);
    }

    public int getValue() {
        return value;
    }

    @Override
    public void execute() {
        if (value > 0) {
            value--;
        } else {
            value = 0;
        }
    }

    @Override
    public boolean isFinished() {
        return value == 0;
    }
}

//public class CountDownTask implements Task{
//
//    public CountDownTask(int value) {
//        throw new UnsupportedOperationException();
//    }
//
//    public int getValue() {
//        throw new UnsupportedOperationException();
//    }
//
//
//    @Override
//    public void execute() {
//        throw new UnsupportedOperationException();
//    }
//
//    @Override
//    public boolean isFinished() {
//        throw new UnsupportedOperationException();
//    }
//}
