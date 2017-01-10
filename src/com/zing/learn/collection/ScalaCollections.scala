package com.zing.learn.collection

/**
  * Created by zhangrxiang on 2017/1/9 20:36.
  * Package com.zing.learn.collection
  * Project learnScala
  * Location Wuxi
  */
object ScalaCollections {

  def listTest(): Unit = {

    //    Scala 列表类似于数组，它们所有元素的类型都相同，
    //    但是它们也有所不同：列表是不可变的，值一旦被定义了就不能改变，
    //    其次列表 具有递归的结构（也就是链接表结构）而数组不是。。
    //    列表的元素类型 T 可以写成 List[T]。例如，以下列出了多种类型的列表：
    // 字符串列表
    var site: List[String] = List("Runoob", "Google", "Baidu")

    // 整型列表
    var nums: List[Int] = List(1, 2, 3, 4)

    // 空列表
    var empty: List[Nothing] = List()

    // 二维列表
    var dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )

    println(site)
    println(nums)
    println(empty)
    println(dim)

    for (l <- site){
      print(l+"\t")
    }


    println("\n"+"*"*50)

//    构造列表的两个基本单位是 Nil 和 ::
//      Nil 也可以表示为一个空列表。

    // 字符串列表
     site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    // 整型列表
     nums = 1 :: (2 :: (3 :: (4 :: Nil)))

    // 空列表
     empty = Nil

    // 二维列表
    dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil


    println(site)
    println(nums)
    println(empty)
    println(dim)

    println("zing"::("wocao"::Nil))


//    列表基本操作
//    Scala列表有三个基本操作：
//    head 返回列表第一个元素
//    tail 返回一个列表，包含除了第一元素之外的其他元素
//    isEmpty 在列表为空时返回true
//    对于Scala列表的任何操作都可以使用这三个基本操作来表达。实例如下:
    val head: String = site.head
    println(head)
    val empty1: Boolean = site.isEmpty
    println(empty1)
    val tail: List[String] = site.tail
    println(tail)

    // 使用 ::: 运算符
    val list: List[Any] = site:::nums
    println(list)
    println("zing"::("like"::Nil):::"hly"::Nil)

    // 使用 Set.:::() 方法
    val ::: : List[Any] = list.:::(site)
    println(:::)

    // 使用 concat 方法
    val concat: List[Any] = List.concat(:::, site)
    println( "List.concat(:::, site) : " + concat  )



  }



  def main(args: Array[String]): Unit = {


//    Scala 集合分为可变的和不可变的集合。

//      1 Scala List(列表)
//    List的特征是其元素以线性方式存储，集合中可以存放重复对象。
    listTest()
//    参考 API文档
//      2	Scala Set(集合)
//    Set是最简单的一种集合。集合中的对象不按特定的方式排序，并且没有重复对象。
//    参考 API文档
//      3	Scala Map(映射)
//    Map 是一种把键对象和值对象映射的集合，它的每一个元素都包含一对键对象和值对象。
//    参考 API文档
//      4	Scala 元组
//    元组是不同类型的值的集合
//      5	Scala Option
//    Option[T] 表示有可能包含值的容器，也可能不包含值。
//      6	Scala Iterator（迭代器）
  }
}
