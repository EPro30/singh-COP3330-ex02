/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exTotalChar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the input string?");
        String str = sc.nextLine();
        int strLen = str.length();
        System.out.println(str + " has " + strLen + " characters.");
    }
}
