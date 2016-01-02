package org.learningconcurrency.mysolutions.ch1

import scala.util.{Success, Try}

/**
  * Created by michal on 12/30/15.
  */

object MainEx3 extends App{


  def check[T](xs: Seq[T])(pred: T => Boolean): Boolean = {

    def predTry(x: T) = {
      Try(pred(x)) match {
        case Success(true) => true
        case _ => false
      }
    }

    xs forall predTry
  }

  var r = check(0 until 10)(40 / _ > 0)
  println(s"result: $r")
}
