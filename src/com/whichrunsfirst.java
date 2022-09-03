package com;
class b extends whichrunsfirst{
  {
    System.out.println("b initi");

  }
  void a1(){
    System.out.println("b which");
  }
  b(){
    System.out.println("b constructor initi");
  }
  static {
    System.out.println("b static initi");
  }
}
public class whichrunsfirst {
  {
    System.out.println("whichfirst initi");
  }
  static {
    System.out.println("whichfirst static initi");
  }

  void a1(){
    System.out.println("a1 which");
  }

  whichrunsfirst(){
    System.out.println("whichfirst constructor initi");
  }
  public static void main(String x[]){

    whichrunsfirst w = new b();
    w.a1();
  }
}
