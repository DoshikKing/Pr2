package com.company;

import java.util.Scanner;

public class VetDog
{

    Dog add()
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Dog Pup = new Dog(sc1.toString(),sc2.nextInt());

        return Pup;
    }
}
