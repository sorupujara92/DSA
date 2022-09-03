package com.inheritance;

interface a {
  int c1=2;
  void a2();
  default void a1(){
    System.out.println("b");
  }
}

interface b{
  default void  a1(){
    System.out.println("b");
  }
}


public class inheritance implements a,b{

  @Override
  public void a2() {
  }

  @Override
  public void a1() {
    a.super.a1();
  }
}
