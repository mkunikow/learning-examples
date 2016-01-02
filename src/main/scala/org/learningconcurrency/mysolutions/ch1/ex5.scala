package org.learningconcurrency.mysolutions.ch1

/**
  * Created by michal on 1/1/16.
  */
object Ex5Main extends App {

  def permutations(input: String): Seq[String] = input.permutations.toList
  val input = "ABC"


  def permutations2(s: String): List[String] = {
    def merge(ins: String, c: Char): Seq[String] =
      for (i <- 0 to ins.length) yield
        ins.substring(0, i) + c + ins.substring(i, ins.length)

    if (s.length() == 1) {

//      println("result: " + s)
      List(s)
    }else {
      val result =
      permutations2(s.substring(0, s.length - 1)).flatMap { p =>
        merge(p, s.charAt(s.length - 1))
      }
//      println("result: " + result)
      result
    }
  }
  def permutations3(s: String): Seq[String] = {
    if (s.length == 0) Seq("")
    else for {
      i <- 0 until s.length
      q <- permutations3(s.take(i) + s.takeRight(s.length - i - 1))
    } yield s(i) + q
  }


  println("permutations: " + permutations(input))
  println("permutation2: " + permutations2(input))
  println("permutation3: " + permutations2(input))

//  def permutation(input: String, level: Int)

}
