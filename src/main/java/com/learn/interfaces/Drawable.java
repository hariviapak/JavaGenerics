package com.learn.interfaces;



interface Drawable  {
    void draw();
    default void msg(){System.out.println("default method");}
    static int cube(int x){return x*x*x;}
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}

}

class TestInterfaceStatic  {
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(3));
    }}


class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        d.msg();
    }}


