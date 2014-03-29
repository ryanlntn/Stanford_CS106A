///*
// * File: DemocracyDefendingKarel.java
// * ----------------------------
// * Democracy defending Karel removes hanging chads from ballots
// * if the center of the rectangle doesn't have a beeper.
// */
//
//import stanford.karel.*;
//
//public class DemocracyDefendingKarel extends SuperKarel {
//
//    public void run() {
//        while(frontIsClear()) {
//            if(beepersPresent()) {
//                move();
//            } else {
//                removeChad();
//                move();
//            }
//        }
//    }
//
//    private void removeChad() {
//        turnLeft();
//        clearBeepersAndAboutFace();
//        clearBeepersAndAboutFace();
//        turnRight();
//    }
//
//    private void clearBeepersAndAboutFace() {
//        move();
//        while(beepersPresent()) {
//            pickBeeper();
//        }
//        turnAround();
//        move();
//    }
//
//}
