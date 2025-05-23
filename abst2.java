package com.neocuz.mypackage;

class abst2 extends abst1 {
    public static void main(String[] args) {

        abst1 child = new abst2();

        child.grow();
        child.study();
//        child.play();


    }

    public void study(){
        System.out.println("Child is studying");
    }

    public void play(){
        System.out.println("Child is playing");
    }
}