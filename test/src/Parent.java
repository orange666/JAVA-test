package com.parent;

class Parent{
    private int i=1;
    protected int j=2;
    protected int geti(){
        return i;
    }
    public void getj(){
        System.out.println(j);
    }
}