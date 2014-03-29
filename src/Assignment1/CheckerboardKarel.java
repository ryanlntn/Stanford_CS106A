///*
// * File: CheckerboardKarel.java
// * ----------------------------
// * When you finish writing it, the CheckerboardKarel class should draw
// * a checkerboard using beepers, as described in Assignment 1.  You
// * should make sure that your program works for all of the sample
// * worlds supplied in the starter folder.
// */
//
//import stanford.karel.*;
//
//public class CheckerboardKarel extends SuperKarel {
//
//    public void run() {
//        if (frontIsClear()) {
//            /*
//             * Checker rows back and forth from the bottom up.
//             */
//            while (frontIsClear()) {
//                checkerRow();
//                moveUpAndOffset();
//            }
//        } else {
//            /*
//             * Account for edge case where world is only 1 corner wide.
//             */
//            turnLeft();
//            while (frontIsClear()) {
//                checkerRow();
//                moveUpAndOffset();
//            }
//        }
//    }
//
//    /*
//     * Starting at one end of a row (or offset by one) place beepers on
//     * every other corner until reaching the other end of the row.
//     */
//    private void checkerRow() {
//        putBeeper();
//        while (frontIsClear()) {
//            move();
//            if (frontIsClear()) {
//                move();
//                putBeeper();
//            }
//        }
//    }
//
//    /*
//     * If a beeper is present at the end of the current row move up row
//     * and offset by one. Otherwise just move up one row.
//     */
//    private void moveUpAndOffset() {
//        if (beepersPresent()) {
//            moveUpRow();
//            if (frontIsClear()) {
//                move();
//            }
//        } else {
//            moveUpRow();
//        }
//    }
//
//    /*
//     * Pre-condition: Front is blocked facing east or west (i.e. reach the end of the row)
//     * Post-condition: Karel will be one corner north facing the opposite direction.
//     */
//    private void moveUpRow() {
//        if (facingWest() && rightIsClear()) {
//            turnRight();
//            move();
//            turnRight();
//        } else {
//            if (facingEast() && leftIsClear()) {
//                turnLeft();
//                move();
//                turnLeft();
//            }
//        }
//    }
//}
