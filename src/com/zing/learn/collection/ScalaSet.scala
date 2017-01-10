package com.zing.learn.collection

/**
  * Created by zhangrxiang on 2017/1/10.
  */
object ScalaSet {

  def commonSet(): Unit = {



//    def +(elem: A): Set[A]
//    为集合添加新元素，x并创建一个新的集合，除非元素已存在
    var ints: Set[Int] = Set(1)
    ints = ints + 2
    println(ints)

//    def -(elem: A): Set[A]
//    移除集合中的元素，并创建一个新的集合
    ints = ints - 1
    println(ints)

//    def contains(elem: A): Boolean
//    如果元素在集合中存在，返回 true，否则返回 false。
    val contains: Boolean = ints.contains(2)
    println(contains)


//    def &(that: Set[A]): Set[A]
//    返回两个集合的交集
    ints = ints & Set(2,3)
    println(ints)

//    def &~(that: Set[A]): Set[A]
//    返回两个集合的差集
    ints = Set(1,2,3,4) &~ Set(3,4,5,6)
//    在集合A里面不在集合B里面
//    Set(1, 2)
    println(ints)

//    def +(elem1: A, elem2: A, elems: A*): Set[A]
//    通过添加传入指定集合的元素创建一个新的不可变集合
    ints = ints + (1,2,3,4)
//    Set(1, 2, 3, 4)
    println(ints)

//    def ++(elems: A): Set[A]
//    合并两个集合
    ints = ints ++ Set(3,4,5,6)
//    Set(5, 1, 6, 2, 3, 4)
    println(ints)

//    def -(elem1: A, elem2: A, elems: A*): Set[A]
//    通过移除传入指定集合的元素创建一个新的不可变集合
    ints = ints - (1,2)
//    Set(5, 6, 3, 4)
    println(ints)


//    def addString(b: StringBuilder): StringBuilder
//    将不可变集合的所有元素添加到字符串缓冲区
    var builder: StringBuilder = new StringBuilder
    Set("zing","like","hly").addString(builder)
    println(builder)

//    def addString(b: StringBuilder, sep: String): StringBuilder
//    将不可变集合的所有元素添加到字符串缓冲区，并使用指定的分隔符
    Set("zing","like","hly").addString(builder," ")
    println(builder)


//    def apply(elem: A)
//    检测集合中是否包含指定元素
    val apply: Boolean = ints.apply(5)
    //true
    println(apply)


//    def count(p: (A) => Boolean): Int
//    计算满足指定条件的集合元素个数
    val count: Int = ints.count(_ > 5)
    //1
    println(count)

//    def copyToArray(xs: Array[A], start: Int, len: Int): Unit
//    复制不可变集合元素到数组
    var arr: Array[Int] = new Array[Int](10)
    println(ints)
    ints.copyToArray(arr)
//    5	6	3	4	0	0	0	0	0	0
    for (a <- arr){
      print(a + "\t")
    }

//    def diff(that: Set[A]): Set[A]
//    比较两个集合的差集
    val diff: Set[Int] = Set(1,2,3).diff(Set(2,3,4))
    //1
    println(diff)




  }

  def main(args: Array[String]): Unit = {

//    Scala Set(集合)是没有重复的对象集合，所有的元素都是唯一的。
//    Scala 集合分为可变的和不可变的集合。
//    Scala 使用的是不可变集合

    val ints = Set(1,2,3,4,5,6,7)

//    scala.collection.immutable.Set$
    println(Set.getClass.getName)
//    scala.collection.mutable.Set$
    println(scala.collection.mutable.Set.getClass.getName)
    println(ints)
    println(ints.head)
    println(ints.tail)


//    连接集合
//    ++ 运算符或 Set.++() 方法来连接两个集合,移除重复的元素
    val site1 = Set("Runoob", "Google", "Baidu")
    val site2 = Set("Faceboook", "Taobao","Baidu")

    // ++ 作为运算符使用
    var site = site1 ++ site2
    println( "site1 ++ site2 : " + site )

    //  ++ 作为方法使用
    site = site1.++(site2)
    println( "site1.++(site2) : " + site )


    val num = Set(5,6,9,20,30,45)
    // 查找集合中最大与最小元素
    println( "Set(5,6,9,20,30,45) 集合中的最小元素是 : " + num.min )
    println( "Set(5,6,9,20,30,45) 集合中的最大元素是 : " + num.max )


//    交集
//    你可以使用 Set.& 方法或 Set.intersect 方法来查看两个集合的交集元素。实例如下：
    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)

    // 交集
    println( "num1.&(num2) : " + num1.&(num2) )
    println( "num1.intersect(num2) : " + num1.intersect(num2) )

    commonSet()
  }
}
