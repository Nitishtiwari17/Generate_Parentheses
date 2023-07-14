package com.in;

public class Main {
    public static void main(String[] args) {
        int n=3;
        paren(n, n," ");
    }
    public static void paren(int open, int close, String ans){
        if(open==0 && close==0){
            System.out.println(ans);
            return;
        }
        if(open>0){
           paren((open-1),close,ans+"(");
         //   return;
        }
        if(close>0){
            paren(open,close-1,ans+")");
        }
    }
}

