/**
 *  Calculate the Ackermann function A(M, N) using a straightforward
 *  recursive program.
 *
 * Compilation:  javac Ackermann.java
 *  Execution:    java Ackermann M N
 *
 *  % java Ackermann 3 8
 *  2045
 *
 *  % java Ackermann 3 9
 *  StackOverflowError
 *
 * Updated 06 March 2020 by  L. Grabowski
 * Downloaded from:
 *    https://introcs.cs.princeton.edu/java/53universality/Ackermann.java
 *
 * @author L. Grabowski
 * @email grabowlm@potsdam.edu
 * @course CIS 303 Algorithm Analysis and Design
 * Assignment 4b
*/
import java.util.*;
import java.io.*;

public class AckermannClient {
    
    public static void main(String[] args) {
	long start = System.currentTimeMillis();
        long M = Long.parseLong(args[0]);
        long N = Long.parseLong(args[1]);
        System.out.println(ackermann(M, N));
	long stop = System.currentTimeMillis();
        long time = stop-start;
        System.out.println("runtime:" + time);
    }
    
	// Recursive function given to us
    public static long ackermann(long m, long n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

	// non-recursive function using a stack
    public static long ackermann(long m, long n) {
	// Stack to hold m values
	Stack<Long> s = new ackermann<Long>();
	// Puts the first value into the stack
	s.push(m);
	// Takes each value off the stack to check it
	while(s.length() > 0) {
		m=s.pop();
		if(m==0) {
			n++;
		} else if (n==0) {
			s.push(--m);
			n++;
		} else {
			s.push(--m);
			s.push(++m);
			n--;
		}
	}
	return n;
      }
}
