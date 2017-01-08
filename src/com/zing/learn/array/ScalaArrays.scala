package com.zing.learn.array

import Array._
/**
  * Created by zhangrxiang on 2017/1/8 15:34.
  * Package com.zing.learn.array
  * Project learnScala
  * Location Wuxi
  */
object ScalaArrays {


  def main(args: Array[String]): Unit = {

//    声明数组
    var arr:Array[String] = new Array[String](5)
    var arr2 = new Array[String](5)

    arr(0) = "Runoob"
    arr(1) = "Baidu"
    arr(4/2) = "Google"
    arr(3) = "Zing"
    arr(4) = "Hly"

    arr2(0) = "zhangrxiang"

    try {
      for (a <- arr) {
        println(a)
      }
      for (a <- arr.indices){
        println(a)
      }
      //    java.lang.ArrayIndexOutOfBoundsException
      println(arr(10))
    } catch {
      case ex: Exception => {
        println("ArrayIndexOutOfBoundsException Exception")
      }
    } finally {
      println("finally.....")
    }



    var arr3 = concat(arr,arr2)
    for (a <- arr3.indices){
      print(arr3(a)+"\t")
      if((a+1)%5==0)
        println()
    }



//    创建区间数组
    var myList1 = range(10, 20, 2)
    var myList2 = range(10, 20)

    // 输出所有数组元素
    for (x <- myList1) {
      print(" " + x)
    }
    println()
    for (x <- myList2) {
      print(" " + x)
    }

    //    多维数组
    var myMatrix = ofDim[Int](3, 3)

    // 创建矩阵
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = java.time.LocalTime.now().getSecond
        println(myMatrix(i)(j))
        Thread.sleep(1000)
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j))
      }
      println()
    }

    println("over...")
  }
}
