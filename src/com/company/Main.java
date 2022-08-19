package com.company;

public class Main {

    public static void main(String[] args) {
        //1
        int c=10;
        while(c<=37)
        {
            System.out.println(c);
            c=c+3;
        }

        //2
        int d=998;
        while(d>=900)
        {
            System.out.println(d);
            d=d-2;
        }

        //3
        int e=1;
        while(e<=20)
        {
            if(e%2>0)
                System.out.println(1);
            else
                System.out.println(-1);
            e=e+1;
        }

        //4
        int f=1;
        while(f<=60)
        {
            if(f%3==0)
                System.out.println(9);
            else
                System.out.println(7);
            f++;
    }
}
