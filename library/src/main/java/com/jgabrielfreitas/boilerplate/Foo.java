package com.jgabrielfreitas.boilerplate;

/**
 * Created by JGabrielFreitas on 03/04/17.
 */

public class Foo {

  private String title;
  private String subTitle;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  @Override public String toString() {
    return "Foo " + "title='" + title + '\'' + "\nsubTitle='" + subTitle;
  }
}
