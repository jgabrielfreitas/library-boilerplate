package com.jgabrielfreitas.boilerplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JGabrielFreitas on 03/04/17.
 */

public class Boilerplate {

  public static List<Foo> getFooList() {
    return fooList;
  }

  public static void setFooList(List<Foo> fooList) {
    Boilerplate.fooList = fooList;
  }

  private static List<Foo> fooList = new ArrayList<>();

  public static String returnHelloWorld() {
    return "Hello World - boilerplate library";
  }

}
