/*
 * File: StIves.java
 * ----------------------
 * This program calculates the total number of
 * kits, cats, sacks, and wives in the famous
 * nursery rhyme:
 *
 *      As I was going to St. Ives,
 *      I met a man with seven wives,
 *      Each wife had seven sacks,
 *      Each sack had seven cats,
 *      Each cat had seven kits:
 *      Kits, cats, sacks, and wives,
 *      How many were going to St. Ives?
 *
 */

import acm.program.*;

public class StIves extends ConsoleProgram {

    public void run() {
        println("This program calculates the total number of kits, cats, sacks, and wives met on the way to St. Ives.");
        int man = 1;
        int wives = man * 7;
        int sacks = wives * 7;
        int cats = sacks * 7;
        int kits = cats * 7;
        int total = man + wives + sacks + cats + kits;
        println(man + " man " + wives + " wives " + sacks + " sacks " + cats + " cats " + kits + " kits = " + total);
    }

}