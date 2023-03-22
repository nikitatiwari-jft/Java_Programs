package com.example.helloworld;
class Quadrilateral {
    int length, breadth;
    Quadrilateral() {
    }
    Quadrilateral(int l, int b) {
        length = l;
        breadth = b;
    }
    void display() {
        System.out.println("length is " + length);
        System.out.println("breadth is " + breadth);
    }
}

class Rectangle extends Quadrilateral {
    Rectangle(int l, int b) {
        super(l, b);
    }
    void Area() {
        double area;
        area = length * breadth;
        System.out.println("Area of rectangle is : " + area);
    }
    void Perimeter() {
        double perimeter;
        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle is : " + perimeter);
    }
}

class Cube extends Quadrilateral {
    double height;

    Cube(int h) {
        height = h;
    }

    void volume() {
        System.out.println("volume of Cube is " + height * height * height);
    }

    void display() {
        System.out.println("height of cube is " + height);
    }
}

public class QuadTest {
    public static void main(String args[]) {
        Rectangle Robj1 = new Rectangle(12, 14);
        Rectangle Robj2 = new Rectangle(20, 40);
        Cube Cobj1 = new Cube(6);
        Cube Cobj2 = new Cube(7);
        System.out.println("the area and paremeter of first rectangle");

        Robj1.Area();
        Robj1.Perimeter();
        Robj1.display();


        System.out.println("Area and paremeter of second rectangle ");
        Robj2.Area();
        Robj2.Perimeter();
        Robj2.display();

        System.out.println("Volume of first cube ");

        Cobj1.volume();
        Cobj1.display();
        System.out.println("Volume ofSecond cube ");

        Cobj2.volume();
        Cobj2.display();



    }
}
