package com.zing.learn.array

import Array._
/**
  * Created by zhangrxiang on 2017/1/8 15:59.
  * Package com.zing.learn.array
  * Project learnScala
  * Location Wuxi
  */
object ScalaArrayFunction {

  def applyTest(): Unit = {

    //    def apply( x: T, xs: T* ): Array[T]
    //    创建指定对象 T 的数组, T 的值可以是 Unit, Double, Float, Long, Int, Char, Short, Byte, Boolean。
    val arrString: Array[Int] = new Array[Int](10)
    arrString(0) = 0
    arrString(1) = 1
    arrString(2) = 2
    arrString(3) = 3
    println(arrString.length)

    val apply1: Array[Int] = Array.apply(10)
    val clone1: Array[Int] = apply1.clone()
    for {i <- apply1}{
      println(i)
    }
    println(clone1(0))
  }

  def copyTest(): Unit = {
    val arrString: Array[String] = new Array[String](10)
    val arrString2: Array[String] = new Array[String](10)
    println(arrString.length)
    for (i <- arrString.indices){
      arrString(i) = (i+97).toChar.toString
      print(arrString(i))
    }
    println()
    Array.copy(arrString.reverse,0,arrString2,0,arrString.length)
    for(s <- arrString2){
      print(s)
    }
  }

  def emptyTest(): Unit = {
//    返回长度为 0 的数组
    val e: Array[String] = empty
    println(e.length)
  }

  def iterateTest(): Unit = {
//    def iterate[T]( start: T, len: Int )( f: (T) => T ): Array[T]
//    返回指定长度数组，每个数组元素为指定函数的返回值。
//    以上实例数组初始值为 0，长度为 3，计算函数为a=>a+1：
    var iterate1: Array[Int] = iterate(1,10)(a=>a*2)
    for(i <- iterate1){
      print(i+"\t")
    }
    println()
    iterate1 = Array.iterate(1,10)(a => a+1)
    for(i <- iterate1){
      print(i+"\t")
    }
    println()
  }

  def fillTest(): Unit = {
//    def fill[T]( n: Int )(elem: => T): Array[T]
//    返回数组，长度为第一个参数指定，同时每个元素使用第二个参数进行填充。
    val fill1: Array[Int] = Array.fill(10)(5)
    for(i <- fill1){
      print(i+"\t")
    }

    println()

    val fill2: Array[Array[String]] = fill(3,3)("zing")
    for(arr <- fill2){
      for(i <- arr){
        print(i+"\t")
      }
      println()
    }
  }


  def rangeTest(): Unit = {
//    def range( start: Int, end: Int, step: Int ): Array[Int]
//    创建指定区间内的数组，step 为每个元素间的步长
    val range1: Array[Int] = range(1,20,2)
    for(i <- range1){
      print(i+"\t")
    }

  }


  def tabulateTest(): Unit = {
//    def tabulate[T]( n: Int )(f: (Int)=> T): Array[T]
//    返回指定长度数组，每个数组元素为指定函数的返回值，默认从 0 开始。

//    todo????
//    val tabulate: Array[Int] = tabulate(10)(a=>a+1)


  }

  def main(args: Array[String]): Unit = {
    applyTest()
    copyTest()
    emptyTest()
    iterateTest()
    fillTest()
    rangeTest()
    tabulateTest()
  }
}
