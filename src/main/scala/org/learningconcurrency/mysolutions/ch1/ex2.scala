package org.learningconcurrency.mysolutions.ch1

/**
  * Created by michal on 12/30/15.
  */


object MainEx2 extends App {

  def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] =
    for {
      aa <- a
      bb <- b
    } yield (aa, bb)


  def fuse2[A, B](a: Option[A], b: Option[B]): Option[(A, B)] =
    a flatMap( aa => b map (bb => (aa, bb)))

}
