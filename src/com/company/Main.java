package com.company;

public class Main {

    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        int y =  new java.util.Scanner(System.in).nextInt();
        double r = 10 + Math.random()*10;
	   System.out.println("<svg height=\"400\" width=\"1000\">\n  <circle cx=\""+x+"\" cy=\""+y+"\" r=\""+r+"\" />\n</svg>");
    }
}