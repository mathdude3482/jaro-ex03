package exercise03;
//Create a program that prompts for a quote and an author.
// Display the quotation and author as shown in the example output.

import java.util.Scanner;

public class Solution03 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 James Jaro
     */
    public static void main(String[] args){
        /*
        ask for the quote
        take in quote
        ask for who said the quote
        take in individual who said quote
        print out the output
         */
        Scanner quote = new Scanner (System.in);
        Scanner character = new Scanner(System.in);
        System.out.print("What is the quote?");
        char doublequotes = '"';
        String dialogue = doublequotes + quote.nextLine() + doublequotes;
        System.out.print("Who said it?");
        String individual = character.nextLine();
        System.out.println(individual + " says, " + dialogue);


    }
}
