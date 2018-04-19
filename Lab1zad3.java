package com.company;

//class Zad {

class Point{
    int x;
    int y;

    public Point(int a, int b){
        x = a;
        y = b;
    }

    void wsp(){
        System.out.println("wsp.x = " + this.x + " " + "wsp.y = " + this.y);
    }

    void move(int a, int b){ // zmienic z int na void albo return 0
        this.x=this.x+a;
        this.y=this.y+b;
            /*
            return  this.x;
            return  0;
            */
    }

    void flip(){
        this.x=-this.x;
        this.y=-this.y;
    }

}

class Line{
    int x1;
    int y1;
    int x2;
    int y2;

    public Line(int a, int b, int c, int d){
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }

    void wsp(){
        System.out.println("wsp.x1 = " + this.x1 + " " + "wsp.y1 = " + this.y1);
        System.out.println("wsp.x2 = " + this.x2 + " " + "wsp.y2 = " + this.y2);
    }

    void move(int a, int b){
        this.x1=this.x1+a;
        this.x2=this.x2+a;
        this.y1=this.y1+b;
        this.y2=this.y2+b;
    }

    void flip(){
        this.x1=-this.x1;
        this.x2=-this.x2;
        this.y1=-this.y1;
        this.y2=-this.y2;
    }

}

//}


public class Lab1zad3 {

    public static void main(String[] args) {
        //Zad zad = new Zad();
        Point point = new Point(2,2);
        point.wsp();
        Line line = new Line(3,3,4,4);
        line.wsp();
        point.move(5,5);
        System.out.println("point.move:");
        point.wsp();
        line.move(2,2);
        System.out.println("line.move:");
        line.wsp();
        System.out.println("point.flip:");
        point.flip();
        point.wsp();
        System.out.println("line.flip:");
        line.flip();
        line.wsp();
    }
}