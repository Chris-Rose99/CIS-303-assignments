/*
*Christopher Rose
*CIS 303
*Assignment 4b
*/
import java.util.*;
import java.util.ArrayList;
import java.io.*;

class ackermann<E> implements Stack<E> {

private static final int defaultSize = 100000;
private int maxSize; // Maximum size of stack
private int top; // Index for top Object
private E [] listArray; // Array holding stack
// Constructors
ackermann() { this(defaultSize); }
@SuppressWarnings("unchecked") // Generic array allocation
ackermann(int size) {
maxSize = size;
top = 0;
listArray = (E[])new Object[size]; // Create listArray
}
public void clear() // Reinitialize stack
{ top = 0; }
public void push(E it) { // Push "it" onto stack
assert top != maxSize : "Stack is full";
listArray[top++] = it;
}
public E pop() { // Pop top element
assert top != 0 : "Stack is empty";
return listArray[--top];
}
public E topValue() { // Return top element
assert top != 0 : "Stack is empty";
return listArray[top-1];
}
public int length() { return top; } // Return length
}