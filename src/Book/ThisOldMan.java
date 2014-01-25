/*
 * File: NinetyNineBottles.java
 * --------------------
 * This program generates the lyrics to This Old Man.
 *
 * While we’re on the subject of silly songs, another old standby is
 * “This Old Man,” for which the first verse is
 *
 * This old man, he played 1.
 * He played knick-knack on my thumb.
 * With a knick-knack, paddy-whack, Give your dog a bone.
 * This old man came rolling home.
 *
 * Each subsequent verse is the same, except for the number and the
 * rhyming word at the end of the second line, which gets replaced as follows:
 *
 * 2—shoe 5—hive 3—knee 6—sticks 4—door 7—up to heaven
 * Write a program to display all 10 verses of this song.
 */

import acm.program.*;

public class ThisOldMan extends ConsoleProgram {

    public void run() {
        String word = "";
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1: word = "thumb"; break;
                case 2: word = "shoe"; break;
                case 3: word = "knee"; break;
                case 4: word = "door"; break;
                case 5: word = "hive"; break;
                case 6: word = "sticks"; break;
                case 7: word = "up to heaven"; break;
                case 8: word = "pate"; break;
                case 9: word = "spine"; break;
                case 10: word = "shin"; break;
            }
            println("This old man, he played " + i);
            println("He played knick-knack on my " + word + ".");
            println("With a knick-knack, paddy-whack, Give your dog a bone.");
            println("This old man came rolling home.");
        }
    }

}