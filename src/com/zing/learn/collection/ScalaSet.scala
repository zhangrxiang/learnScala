package com.zing.learn.collection

/**
  * Created by zhangrxiang on 2017/1/10.
  */
object ScalaSet {
  def main(args: Array[String]): Unit = {

//    Scala Set(集合)是没有重复的对象集合，所有的元素都是唯一的。
//    Scala 集合分为可变的和不可变的集合。

    val ints = Set(1,2,3,4,5,6,7)
    println(ints)
    println(ints.head)
    println(ints.tail)

  }
}
