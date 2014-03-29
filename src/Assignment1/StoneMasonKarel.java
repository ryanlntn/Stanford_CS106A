///*
// * File: StoneMasonKarel.java
// * --------------------------
// * The StoneMasonKarel subclass repairs quad columns starting
// * with the 0th column and continuing every 4 streets.
// */
//
//import stanford.karel.*;
//
//public class StoneMasonKarel extends SuperKarel {
//
//	public void run() {
//        repairColumn();
//        while (frontIsClear()) {
//            for (int i = 0; i < 4; i++) {
//                move();
//            }
//            repairColumn();
//        }
//    }
//
//    /*
//     * Starting at the base of the column facing east move upwards
//     * checking for beepers each step of the way until the ceiling
//     * is reached. Return to base of column.
//     */
//    private void repairColumn() {
//        turnLeft();
//        while (frontIsClear()) {
//            putBeeperIfMissing();
//            move();
//        }
//        putBeeperIfMissing();
//        returnToBase();
//    }
//
//    /*
//     * If beeper is missing putBeeper. Does nothing otherwise.
//     */
//    private void putBeeperIfMissing() {
//        if (noBeepersPresent()) {
//            putBeeper();
//        }
//    }
//
//    /*
//     * Return to base of column from ceiling and face east.
//     */
//    private void returnToBase() {
//        turnAround();
//        while (frontIsClear()) {
//            move();
//        }
//        turnLeft();
//    }
//}
//
//
