package com.company;

public class Shape
{
    int x = 0;
    int y = 0;
    int z = 0;
    String name;
    Shape(int x, int y, int z, String name)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
    String setNewX(int x)
    {
        this.x = x;
        return "Sat X: " + this.x;
    }
    String setNewY(int y)
    {
        this.y = y;
        return "Sat Y: " + this.y;
    }
    String setNewZ(int z)
    {
        this.z = z;
        return "Sat Z: " + this.z;
    }
    String getPosX()
    {
        return  "Pos of X is: " + this.x;
    }
    String getPosY()
    {
        return  "Pos of Y is: " + this.y;
    }
    String getPosZ()
    {
        return  "Pos of Z is: " + this.z;
    }
    String getName()
    {
        return  "Name is: " + this.name;
    }
}
