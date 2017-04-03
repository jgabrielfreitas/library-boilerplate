package com.jgabrielfreitas.boilerplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JGabrielFreitas on 03/04/17.
 */

public class Boilerplate {

  public List<Foo> getFooList() {
    return fooList;
  }

  public void setFooList(List<Foo> fooList) {
    this.fooList = fooList;
  }

  private List<Foo> fooList = new ArrayList<>();

  public static String returnHelloWorld() {
    return "Hello World - boilerplate library";
  }

}
