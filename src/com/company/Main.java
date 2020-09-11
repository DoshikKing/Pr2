package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shp = new Shape(5, 7, 2, "Cube");
        System.out.println(shp.getName());
        System.out.println(shp.getPosX());
        System.out.println(shp.getPosZ());
        Dog[] arr = new Dog[2];

        for (int i = 0; i < arr.length; i++)
        {
            VetDog vet = new VetDog();
            arr[i] = vet.add();
            System.out.println(arr[i].toStringDog());
            arr[i].intoHumanAge();
        }


    }
}
