/*
 * File: HelloProgram.java
 * -----------------------
 * This program displays "hello, world" on the screen.
 * It is inspired by the first program in Brian
 * Kernighan and Dennis Ritchie's classic book,
 * The C Programming Language.
 */

import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram {
   public void run() {
      add(new GLabel("I love Java!"), 100, 75);
      add(new GLabel("- Ryan Linton"), 600, 400);
   }
}