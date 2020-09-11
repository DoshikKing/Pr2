package com.company;

import java.util.Scanner;

public class VetDog
{

    Dog add()
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String s;
        s = sc1.nextLine();
        int n;
        n = sc2.nextInt();
        Dog Pup = new Dog(s,n);

        return Pup;
    }
}
