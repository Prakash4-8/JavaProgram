package com.dsacamp;

import java.util.Scanner;

public class Areaofshapes {
    public static void main(String[] args) {
        System.out.print("""
                Flollow the below option to work with it
                \s
                Enter 1 to find Area of circle\s
                Enter 2 to find Area of Rectangle
                Enter 3 to find Area of Isosceles Triangle\s
                Enter 4 to find Area of Paralellogram
                Enter 5to find Area of Rhombus\s
                Enter 6 to find Area of Equilateral Triangle\s
                Enter 7 to find Perimeter of Circle\s
                Enter 8to find Perimeter of Equilateral Triangle\s
                Enter 9 to find Perimeter of Paralellogram\s
                Enter 10 to find Perimeter of Rectangle
                Enter 11 to find Perimeter of Square\s
                Enter 12 to find Perimeter of Rhombus\s
                Enter 13 to find Volume of Cone\s
                Enter 14to find Volume of Prism\s
                Enter 15 to find Volume of Sphere\s
                Enter 16 to find Volume of Cylinder\s
                Enter 17 to find Volume of Pyramid\s
                Enter 18 to find Curved Surface Area of Cylinder
                Enter 19 to find Total Surface Area of Cube
                """);
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        switch (x) {
            case 1 -> AreaCircle();
            case 2 -> AreaRectangle();
            case 3 -> AreaIsosceles();
            case 4 -> AreaParalellogram();
            case 5 -> AreaRhombus();
            case 6 -> AreaEquiTri();
            case 7 -> Perimeter();
            case 8 -> PeriEquiTring();
            case 9 -> PeriPara();
            case 10 -> PeriRect();
            case 11 -> PeriSqua();
            case 12 -> PeriRhom();
            case 13 -> VolCon();
            case 14 -> VolPris();
            case 15 -> VolSpear();
            case 16 -> VolCylin();
            case 17 -> VolPyra();
            case 18 -> CuSurAreaCylin();
            case 19 -> TotSurAreaCub();
        }


    }

    //area of circle
    static void AreaCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radious of the circle :");
        float x = input.nextFloat();
        System.out.println("Area is :" + (float) (3.14 * x * x));
    }

    //area of rectangle
    static void AreaRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and breath of Ractangle :");
        float y = input.nextFloat();
        float x = input.nextFloat();
        System.out.println("Area of Rectangle is :" + (x * y));
    }

    //area of isosceles tringle
    static void AreaIsosceles() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of Isosceles :");
        float y = input.nextFloat();
        float x = input.nextFloat();
        System.out.println("Area of Isosceles is :" + (x * y) / 2);
    }

    //area of paralellogram
    static void AreaParalellogram() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of Paralellogram :");
        float y = input.nextFloat();
        float x = input.nextFloat();
        System.out.print("Area of Paralellogram" + x * y);

    }

    //area of rhombus
    static void AreaRhombus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of Rhombus :");
        float y = input.nextFloat();
        float x = input.nextFloat();
        System.out.print("Area of Rhpmbus :" + (x * y) / 2);
    }

    //Area Of Equilateral Triangle
    static void AreaEquiTri() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Equilateral Triangal :");
        float x = input.nextFloat();
        System.out.print("Area of the Trinagle :" + (1.732 / 4) * x * x);
    }

    //perimeter of circle
    static void Perimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radious of the Circle :");
        float x = input.nextFloat();
        System.out.print("Perimeter of the cicle is " + 2 * 3.14 * x);
    }

    //Perimeter Of Equilateral Triangle
    static void PeriEquiTring() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of Equilateral Triangal :");
        float x = input.nextFloat();
        System.out.print("Perimeter of tringle is " + 3 * x);
    }

    //Perimeter Of Parallelogram
    static void PeriPara() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two side of Paralellogram :");
        float x = input.nextFloat();
        float y = input.nextFloat();
        System.out.print("Perimeter of paralellogram is " + 2 * (x + y));
    }

    //Perimeter Of Rectangle
    static void PeriRect() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two height and width of Rectangle :");
        float x = input.nextFloat();
        float y = input.nextFloat();
        System.out.print("Perimeter of Rectangle is " + 2 * (x + y));
    }

    //Perimeter Of Square
    static void PeriSqua() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side of square :");
        float x = input.nextFloat();
        System.out.print("Perimeter of square is " + 4 * x);
    }

    //Perimeter Of Rhombus
    static void PeriRhom() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Side of Rhombus :");
        float x = input.nextFloat();
        System.out.print("Perimeter of Rhombus is " + 4 * x);

    }

    //Volume Of Cone Java Program
    static void VolCon() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height and radious of the Cone :");
        float x = input.nextFloat();
        float y = input.nextFloat();
        System.out.print("Volume of the Cone is  " + (3.14 * y * x * y) / 3);

    }

    //Volume Of Prism
    static void VolPris() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base and height of Prism :");
        float x = input.nextFloat();
        float y = input.nextFloat();
        System.out.print("Volume of Prism is " + x * y);
    }

    //Volume Of Cylinder
    static void VolCylin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radious and height of Cylinder :");
        float x = input.nextFloat();
        float y = input.nextFloat();
        System.out.print("Volume of the Cylinder is " + 3.14 * x * x * y);

    }

    //Volume Of Sphere
    static void VolSpear() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radious of the sphere :");
        float y = input.nextFloat();
        System.out.print((4 * 3.14 * y * y * y) / 3);
    }

    //Volume Of Pyramid
    static void VolPyra() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length, weidth and height of the Pyramid :");
        float l = input.nextFloat();
        float w = input.nextFloat();
        float h = input.nextFloat();

        System.out.print("Volume of the Pyramid is " + (l * w * h) / 3);
    }

    //Curved Surface Area Of Cylinder
    static void CuSurAreaCylin() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height and redious of the Cylinder :");
        float r = input.nextFloat();
        float h = input.nextFloat();
        System.out.print("Surface area of Cylinder is " + 2 * 3.14 * r * h);
    }

    //Total Surface Area Of Cube
    static void TotSurAreaCub() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the area of one face :");
        float a = input.nextFloat();
        System.out.print("The curved surface area of cube is " + 6 * a * a);
    }

}
