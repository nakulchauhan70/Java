package com.demo.general;

import java.util.Scanner;

public class Day16_ExceptionsStringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }catch(Exception e){
            System.out.println("Bad String");
        }
        
        in.close();
    }
}

