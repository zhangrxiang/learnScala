package com.zing.learn.collection

/**
  * Created by zhangrxiang on 2017/1/13 23:33.
  * Package com.zing.learn.collection
  * Project learnScala
  * Location Wuxi
  */
object ScalaOptions {


  def main(args: Array[String]): Unit = {


//    Scala Option(选项)类型用来表示一个值是可选的（有值或无值)。
//    Option[T] 是一个类型为 T 的可选值的容器：
    // 如果值存在， Option[T] 就是一个 Some[T] ，如果不存在， Option[T] 就是对象 None 。

    val myMap: Map[String, String] = Map("key1" -> "value")

//    Scala 使用 Option[String] 来告诉你：「我会想办法回传一个 String，但也可能没有 String 给你」。
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")

    println(value1) // Some("value1")
    println(value2) // None

    val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")

    println("sites.get( \"runoob\" ) : " +  sites.get( "runoob" )) // Some(www.runoob.com)
    println("sites.get( \"baidu\" ) : " +  sites.get( "baidu" ))  //  None

    println("show(sites.get( \"runoob\")) : " +
      show(sites.get( "runoob")) )
    println("show(sites.get( \"baidu\")) : " +
      show(sites.get( "baidu")) )

    def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
    }




//    getOrElse() 方法
    val a:Option[Int] = Some(5)
    val b:Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0) )
    println("b.getOrElse(10): " + b.getOrElse(10) )



  }
}
