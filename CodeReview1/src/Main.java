package com.company;

public class Main {
    //task 1
    public static void main(String[] args) {

        // task 2
        int with = 2;
        int height = 5;
        int area = with * height;

        System.out.println("The area is: " + area);

        // task 3
        int width1 = 20;
        int height1 = 30;

        int width2 = 40;
        int height2 = 50;

        System.out.println("The area of rectangle1 is: " + calculateRectArea(width1, height1));
        System.out.println("The area of rectangle2 is: " + calculateRectArea(width2, height2));

        // task 4
        int squareWidth = 4;
        int squareWidth1 = 2;

        System.out.println("The area of square1 is: " +calculateSquareArea(squareWidth)+ " and the perimeter is: " +calculateSquarePerimeter(squareWidth));
        System.out.println("The area of square2 is: " +calculateSquareArea(squareWidth1)+ " and the perimeter is: " +calculateSquarePerimeter(squareWidth1)) ;

        // task 5
        int width3 = 15;
        int height3 = 18;

        System.out.println("The area of rectangle3 is: " + calculateRectArea(width3, height3));
        System.out.println("The area of square3 is: " +calculateSquareArea(width3)+ " and the perimeter is: " +calculateSquarePerimeter(width3));

        int width4 = 17;
        int height4 = 19;

        System.out.println("The area of rectangle4 is: " + calculateRectArea(width4, height4));
        System.out.println("The area of square4 is: " +calculateSquareArea(width4)+ " and the perimeter is: " +calculateSquarePerimeter(width4));

        int width5 = 18;
        int height5 = 21;

        System.out.println("The area of rectangle5 is: " + calculateRectArea(width5, height5));
        System.out.println("The area of square5 is: " +calculateSquareArea(width5)+ " and the perimeter is: " +calculateSquarePerimeter(width5));

        int width6 = 22;
        int height6 = 29;

        System.out.println("The area of rectangle6 is: " + calculateRectArea(width6, height6));
        System.out.println("The area of square6 is: " +calculateSquareArea(width6)+ " and the perimeter is: " +calculateSquarePerimeter(width6));

        int[] widthArray = new int[]{1, 2, 3, 4, 5};
        int[] heightArray = new int[]{6, 7, 8, 9, 10};

        for(int i =0; i < widthArray.length; i++){
            System.out.println("The area of the rectangle with width "+ widthArray[i] + " and height " +heightArray[i]+ " is: "+calculateRectArea(widthArray[i], heightArray[i]));
        }
    }
    // task 3
    public static int calculateRectArea(int width, int height) {

        int area = width * height;
        return area;
    }
    //task 4
    public static int calculateSquareArea(int squareWidth) {
        int squareArea = squareWidth * squareWidth;
        return squareArea;

    }
    // task 4
    public  static int calculateSquarePerimeter(int squareWidth){
        int squarePerimeter = squareWidth * 4;
        return squarePerimeter;
    }


}


