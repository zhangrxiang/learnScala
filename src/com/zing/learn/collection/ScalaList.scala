package com.zing.learn.collection

/**
  * Created by zhang on 2017/1/10.
  */
object ScalaList {

  def fillTest(): Unit = {

    val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println( "site : " + site  )

    val num = List.fill(10)(2)         // 重复元素 2, 10 次
    println( "num : " + num  )

    val fill: List[List[String]] = List.fill(2,2)("zing")
    println(fill)

    val fill1: List[List[List[List[List[Int]]]]] = List.fill(2,2,2,2,2)(2)
    println(fill1)

  }

  def tabulateTest(): Unit = {


    //    List.tabulate() 方法是通过给定的函数来创建列表。
    //    通过给定的函数创建 5 个元素
    //    起始值为 0
    val squares = List.tabulate(6)(n => n * n)
    println( "一维 : " + squares  )

    // 创建二维列表
    var mul = List.tabulate( 4,5 )( _ * _ )
    println( "多维 : " + mul)

    mul = List.tabulate(3,4)(_+1+_)
    println("多维 "+ mul)


  }

  def reverseTest(): Unit = {
    val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    println( "site 反转前 : " + site )

    println( "site 反转前 : " + site.reverse )

    println( "site 继续反转 : " + site.reverse.reverse )
  }

  def funMap = {

  }

  def commonTest(): Unit = {


    //    def +:(elem: A): List[A]
    //    为列表预添加元素
    val x = List(1)
    var y = 2 +: x
    y = y.+:(3)
    //    List(3, 2, 1)
    println(y)
    println("$"*40)

    //    def ::(x: A): List[A]
    //    在列表开头添加元素
    y = 11 :: y
    //    List(11, 3, 2, 1)
    println(y)
    y = 12 :: y
    //    List(12, 11, 3, 2, 1)
    println(y.::(13))

    //    def :+(elem: A): List[A]
    //    复制添加元素后列表。
    y = y :+ 21
    //    List(12, 11, 3, 2, 1, 21)
    println(y)

    //    def addString(b: StringBuilder): StringBuilder
    //    将列表的所有元素添加到 StringBuilder
    val str:StringBuilder = new StringBuilder
    y.addString(str)
    //    121132121
    println(str)

    //    def apply(n: Int): A
    //    通过列表索引获取元素
    val apply: Int = y.apply(2)
    //    List(12, 11, 3, 2, 1, 21)
    println(y)
    //3
    println(apply)

    //    def contains(elem: Any): Boolean
    //    检测列表中是否包含指定的元素
    val contains: Boolean = y.contains(1)
    println(contains)

    //    def copyToArray(xs: Array[A], start: Int, len: Int): Unit
    //    将列表的元素复制到数组中。
    val ints: Array[Int] = new Array[Int](y.size)
    y.copyToArray(ints)
    //    121132121
    for (a <- ints){
      print(a)
    }
    println("\n"+"*"*50)


    //    def distinct: List[A]
    //    去除列表的重复元素，并返回新列表
    val distinct: List[Int] = y.distinct
    y = 12 +: y
    //    List(12, 12, 11, 3, 2, 1, 21)
    println(y)
    //    List(12, 11, 3, 2, 1, 21)
    println(distinct)

    //    def drop(n: Int): List[A]
    //    丢弃前n个元素，并返回新列表
    val drop: List[Int] = distinct.drop(2)
    //    List(3, 2, 1, 21)
    println(drop)

    //    def dropRight(n: Int): List[A]
    //    丢弃最后n个元素，并返回新列表
    val right: List[Int] = drop.dropRight(2)
    //    List(3, 2)
    println(right)


//    def dropWhile(p: (A) => Boolean): List[A]
//    从左向右丢弃元素，直到条件p不成立
    val concat = List.concat(right,11::(22::(33::(44::Nil))))
//    List(3, 2, 11, 22, 33, 44)
    println(concat)
    val dropWhile = concat.dropWhile(_<10)
//    List(11, 22, 33, 44)
    println(dropWhile)

//    def endsWith[B](that: Seq[B]): Boolean
//    检测列表是否以指定序列结尾
    val endsWith = dropWhile.endsWith(1.toString)
//    false
    println(endsWith)

//    def equals(that: Any): Boolean
//    判断是否相等
    val equals1 = dropWhile.equals(11::(22::(33::(44::Nil))))
//    true
    println(equals1)

//    def exists(p: (A) => Boolean): Boolean
//    判断列表中指定条件的元素是否存在。
//    判断l是否存在某个元素:
    val exists = dropWhile.exists(_ > 22)
//    true
    println(exists)


//    def filter(p: (A) => Boolean): List[A]
//    输出符号指定条件的所有元素。
//    过滤出长度为3的元素:
    var strings = "zing"::("like"::("hly"::Nil))
    println(strings)
    val filter = strings.filter(a => a.length ==3 )
    println(filter)
    println("z"::"l"::"y"::Nil)

//    def forall(p: (A) => Boolean): Boolean
//    检测所有元素。
//    例如：判断所有元素是否以"H"开头：
//    scala> l.forall(s => s.startsWith("H")) res10: Boolean = false/
    val forall = strings.forall(s => s.startsWith("z"))
    println(forall)

//    def foreach(f: (A) => Unit): Unit
//    将函数应用到列表的所有元素
    strings.foreach(fun)
    println(strings)

//    def indexOf(elem: A, from: Int): Int
//    从指定位置 from 开始查找元素第一次出现的位置
    val of = strings.indexOf("hly",1)
    println(of)

//    def init: List[A]
//    返回所有元素，除了最后一个
    println(strings.init)

//    def intersect(that: Seq[A]): List[A]
//    计算多个集合的交集
    val intersect = strings.intersect("zing"::("b"::("c"::Nil)))
//    List(zing)
    println(intersect)

//    def isEmpty: Boolean
//    检测列表是否为空
    val empty = strings.isEmpty
    println(empty)

//    def iterator: Iterator[A]
//    创建一个新的迭代器来迭代元素
    val iter = strings.iterator
    println(iter)
    while (iter.hasNext){
      val next = iter.next()
      println(next)
    }

//    def last: A
//    返回最后一个元素
    println(strings.last)

//    def lastIndexOf(elem: A, end: Int): Int
//    在指定的位置 end 开始查找元素最后出现的位置
    val of1 = strings.lastIndexOf("hly",2)
    println(strings)
    println(of1)

//    def length: Int
//    返回列表长度
    println(strings.length)

//    def map[B](f: (A) => B): List[B]
//    通过给定的方法将所有元素重新计算
    //todo???????
//    strings.map(funMap())
//    def funMap(string: String)={
//
//    }

//    def max: A
//    查找最大元素
    println(strings.max)

//    def min: A
//    查找最小元素
    println(strings.min)

//    def mkString: String
//    列表所有元素作为字符串显示
    val string = strings.mkString
    println(string)

//    def mkString(sep: String): String
//    使用分隔符将列表所有元素作为字符串显示
    println(strings.mkString("-"))

  }
  def  fun(str:String): Unit ={
  }

  def main(args: Array[String]): Unit = {

    //      1 Scala List(列表)
    //    List的特征是其元素以线性方式存储，集合中可以存放重复对象。
    fillTest()
    tabulateTest()
    reverseTest()
    commonTest()

  }
}
