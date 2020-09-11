package com.company;

public class Main {

    public static void main(String[] args) {
        Dog[] arr = new Dog[10];

        for (int i = 0; i < arr.length; i++)
        {
            VetDog vet = new VetDog();
            arr[i] = vet.add();
        }

    }
}
