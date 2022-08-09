package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean isCompleted = false;
    private boolean isExecuted = false;

    @Override
    public void execute() {
        if (isCompleted) isExecuted = true;
    }

    @Override
    public boolean isFinished() {
        return isExecuted;
    }

    public void complete() {
        isCompleted = true;
    }
}

//public class CompleteByRequestTask implements Task {
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
//
//    public void complete() {
//        throw new UnsupportedOperationException();
//    }
//}
