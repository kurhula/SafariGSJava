package examples.hello; // must be first

//import java.lang.System; // imports come next (all of them)
import java.util.List;
//import java.lang.*; // this is UNNECESSARY because java.lang is special :)
//import static System.out; //NOPE, MUST START from ROOT of package structure
import static java.lang.System.out;

// no code "here"

public class HelloWorld { // types come last
  /*
   * all the "real" code must be inside a type declaration :)
   */
  public static void main(String [] args) {
//    java.lang.System.out.println("Hello World!");
//    System.out.println("Hello World!");
    out.println("Hello World!");

//    int x; // not definitely initialized
//    out.println(x); // cannot be read!!!

    // eight "primitive types" boolean byte short char (16 bits unsigned)
    // int float double

    int x = 99;
    int y = 100;
    int z = x + y; // all as expected, probably

    // usually reserve "small" data types for arrays
    // assignement for initialization from INT is permitted if it fits
    short a = 10;
    short b = 20;
    // cast needed: a) all arithmetic produces at least int
    // b) cast "truncates" the data (might lose value)
    short c = (short)(a + b);

    // Java 10 introduced "inferred types"
    var d = 10; // 10 is an int literal
//    var e; // var MUST BE immediately initialized

    String st = "Hello"; // double quotes for strings (single => char)

    // NOPE, strong static type. Variables KNOW what type they must contain
//    d = st;

    // operators
    // primitive vs object types
    // comparison
    // control structures


  }


}

