package com.mycompany.app;

public class A {
  public static interface Bla {
     public int doIt(int a);
  }

  public static void a(Bla bla) {
     System.out.println(bla.doIt(3));
  }

  public static void main(String[] args) throws Exception {
     a(i -> i + 1);
  }

  private static int makeBla(int n, Bla bla) {
    return bla.doIt(n);
  }

  public static int makeMeTwo(int n) {
    return makeBla(n, i -> i + i);
  }
}
