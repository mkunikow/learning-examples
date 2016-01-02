package org.learningconcurrency.mysolutions.ch1

/**
  * Created by michal on 12/30/15.
  */



object Main extends App {

  def compose[A, B, C](g: B => C, f: A => B): A => C = a => g(f(a))

  def compose2[A, B, C](g: B => C, f: A => B): A => C =  g compose f
}
