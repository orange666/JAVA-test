package com.parent;

public class Child extends Parent{
    public static void main(String[] args){
        Parent p = new Parent();
        Child c = new Child();
        c.getParenti();
        c.getParentj();
        Other.showParentj(p);


    }
    public void getParenti(){
        System.out.println(i);
    }
    public void getParentj(){
        System.out.println(super.j);
        System.out.println(j);
        System.out.println(geti());
        System.out.println(super.geti());
    }
}