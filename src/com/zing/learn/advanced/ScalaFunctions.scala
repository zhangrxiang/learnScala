package com.zing.learn.advanced

import java.util.Date

import scala.collection.mutable.ArrayBuffer

/**
  * Created by zhang on 2017/1/3.
  */
object ScalaFunctions {


  def fib(num: Int = 3): Int = {
    if (num < 3)
      num
    else
      fib(num - 1) + fib(num - 2)

  }

  def factorial(num: Int): Int = {
    if (num == 1)
      num
    else
      num * factorial(num - 1)
  }

  def forLoop(array: Array[Int]): Unit = {
    println("Length : " + array.length)
    for (a <- array) {
      println(a)
    }
  }

  //  可变参数
  def printStrings(args: String*) = {
    var i: Int = 0
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg)
      i = i + 1
    }
  }

  //  指定函数参数名
  def addInt(a: Int, b: Int): Int = {
    a + b
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  //  实例中 delay 方法打印了一条信息表示进入了该方法，接着 delay 方法打印接收到的值，最后再返回 t。
  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 10
    val int: Int = addInt(a, b)
    print(int)

    //    Scala的解释器在解析函数参数(function arguments)时有两种方式：
    //    传值调用（call-by-value）：先计算参数表达式的值，再应用到函数内部；
    //    传名调用（call-by-name）：将未计算的参数表达式直接应用到函数内部

    val time1: Long = time()
    println(time1)
    println(delayed(1L))
    printStrings("abc", "def", "xyz")

    ////1
    val array = new Array[Int](5)
    array(0) = 0
    array(1) = 1
    array(2) = 2
    array(3) = 3
    array(4) = 4
    forLoop(array)

    ///2
    val array2 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    forLoop(array2)

    ///3
    val array3 = Array.fill(5)(5)
    forLoop(array3)

    ///4
    val array4 = new ArrayBuffer[Int]()
    //    在数组尾部增加一个类型为T的元素e1：
    array4 += 1
    //    在数组尾部增加一个类型为T的元素e1、e2：
    array4 += (11, 22, 33, 44, 55)
    //    在数组尾部增加一个类型为T的数组：
    array4 ++= Array(111, 222)
    //    在第index元素后插入e1：
    array4.insert(1, 12112)
    //    在第index元素后插入e1、e2：
    array4.insert(4, 21212, 222122)
    //    移除第index元素后的n个元素：
    array4.remove(8, 2)
    for (a <- array4) {
      println(a)
    }

    val factorial1: Int = factorial(4) //4 3 2 1
    println(factorial1)
    val fib1: Int = fib(10)
    println(fib1)

    println(apply(layout, 10))

    println(myApply(myFun,"s"))

    println(fic(factorial,4))

    println(fic(factorial2,4))

    println(factorial2(4))

    println( "multiplier(1) value = " +  multiplier(1,2) )
    println( "multiplier(2) value = " +  multiplier(2,4 ))


    //偏应用函数
    val date = new Date
    val logWithDateBound = log(date, _: String)

    logWithDateBound("message1" )
    Thread.sleep(1000)
    logWithDateBound("message2" )
    Thread.sleep(1000)
    logWithDateBound("message3" )

    //函数柯里化(Currying)
    println( "str1 + str2 = " +  strcat("Hello")("World"))


  }

  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply(f: Int => String, v: Int) = f(v)

  def layout(x: Int) = "[" + x.toString() + "]"


//  def myApply(函数名:参数=>返回值,其他参数) = 函数名(参数)
  def myApply(fun: String => String, str: String) = fun(str)
  def myFun(str: String) = str
  def fic(f:Int => Int,num: Int) = f(num)

  //内嵌函数
  def factorial2(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 2)
  }

  //匿名函数
  val multiplier = (i:Int,y:Int) => i * y


  def log(date: Date, message: String)  = {
    println(date + "----" + message)
  }


  //函数柯里化(Currying)
  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }
}
