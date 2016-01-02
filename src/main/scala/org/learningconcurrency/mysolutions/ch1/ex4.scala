package org.learningconcurrency.mysolutions.ch1

/**
  * Created by michal on 12/31/15.
  */

object MainEx4 extends App {
  class Pair[P, Q](val first: P, val second: Q)

  object Pair {
    def apply[P,Q] (first: P, second: Q) = new Pair(first, second)
    def unapply[P,Q] (par: Pair[P,Q]) = Some((par.first, par.second))
  }

  val pair1 = Pair("a", "b")

  val r= pair1 match {
    case Pair("a", "b") => "matched a i b"
    case Pair("a", _) => "matched a"
    case Pair(_, "b") => "matched b"
    case _ => "not matched"

  }
  System.out.println(r)


}
