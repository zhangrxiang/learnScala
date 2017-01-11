package com.zing.learn.collection

import scala.collection.GenTraversableOnce

/**
  * Created by zhangrxiang on 2017/1/11 21:38.
  * Package com.zing.learn.collection
  * Project learnScala
  * Location Wuxi
  */
object ScalaMap {

  def commonSet(): Unit = {


//    def ++(xs: Map[(A, B)]): Map[A, B]
//    返回一个新的 Map，新的 Map xs 组成

//    def -(elem1: A, elem2: A, elems: A*): Map[A, B]
//    返回一个新的 Map, 移除 key 为 elem1, elem2 或其他 elems。
    var zing = Map("one" -> "zing", "two" -> "like", "three" -> "hly", "four" -> "very", "five" -> "much", "six" -> "!!")
    println(zing)

    val z : Map[String, String] = zing.-("six")
    println(z)

//    ef --(xs: GTO[A]): Map[A, B]
//    返回一个新的 Map, 移除 xs 对象中对应的 key
    //todo??
//    var gto:GenTraversableOnce[String] = null
//    val stringToString : Map[String, String] = zing.--(gto)


//    def get(key: A): Option[B]
//    返回指定 key 的值

    val maybeString: Option[String] = zing.get("one")
    println(maybeString)

//    def iterator: Iterator[(A, B)]
//    创建新的迭代器，并输出 key/value 对
    val tuples: Iterator[(String, String)] = zing.iterator
    val keySet: Set[String] = zing.keySet
    val strings: Iterator[String] = keySet.iterator
    while (strings.hasNext){
      val next: String = strings.next()
      val maybeString1: Option[String] = zing.get(next)
      println(next + " : " +maybeString1.get)
    }

//    def addString(b: StringBuilder): StringBuilder
//    将 Map 中的所有元素附加到StringBuilder，可加入分隔符
    val builder: StringBuilder = new StringBuilder
    zing.addString(builder,"|")
    println(builder)

//    def apply(key: A): B
//    返回指定键的值，如果不存在返回 Map 的默认方法
    val apply: String = zing.apply("one")
    println(apply)

//    def clone(): Map[A, B]
//    从一个 Map 复制到另一个 Map
    //todo ?????
//    val clone1: AnyRef = zing.clone
//    println(clone1)
  }

  def main(args: Array[String]): Unit = {


    //    Map 有两种类型，可变与不可变，区别在于可变对象可以修改它，而不可变对象不可以。
    //     空哈希表，键为字符串，值为整型
    var A: Map[Char, Int] = Map()

    // Map 键值对演示
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")

    println(A)
    println(colors)

    A += ('I' -> 1)
    A += ('J' -> 5)
    A += ('K' -> 10)
    A += ('L' -> 100)
//    Map(I -> 1, J -> 5, K -> 10, L -> 100)
    println(A)


//    keys	返回 Map 所有的键(key)
//    values	返回 Map 所有的值(value)
//    isEmpty	在 Map 为空时返回true
    val keys: Iterable[Char] = A.keys
    println(keys)

    //函数是编程
    keys.foreach{i => print(i);println(A(i))}

    val values: Iterable[Int] = A.values
    println(values)

    val empty: Boolean = A.isEmpty
    println(empty)

    for (a <- A){
//      (I,1)
//      (J,5)
//      (K,10)
//      (L,100)
      println(a)
    }

//    Map 合并
//      你可以使用 ++ 运算符或 Map.++() 方法来连接两个 Map，Map 合并时会移除重复的 key。

    val colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

//    colors1 ++ colors2 : Map(blue -> #0033FF, azure -> #F0FFFF, peru -> #CD853F, yellow -> #FFFF00, red -> #FF0000)
    println( "colors1 ++ colors2 : " +  (colors1 ++ colors2))
    //  ++ 作为方法
//    colors1.++(colors2)) : Map(blue -> #0033FF, azure -> #F0FFFF, peru -> #CD853F, yellow -> #FFFF00, red -> #FF0000)
    println( "colors1.++(colors2)) : " + colors1.++(colors2))


    val sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")

    sites.keys.foreach{ i => print( "Key = " + i )
      println(" Value = " + sites(i) )}

    if( sites.contains( "runoob" )){
      println("runoob 键存在，对应的值为 :"  + sites("runoob"))
    }else{
      println("runoob 键不存在")
    }
    if( sites.contains( "baidu" )){
      println("baidu 键存在，对应的值为 :"  + sites("baidu"))
    }else{
      println("baidu 键不存在")
    }
    if( sites.contains( "google" )){
      println("google 键存在，对应的值为 :"  + sites("google"))
    }else{
      println("google 键不存在")
    }


    commonSet()


  }


}
