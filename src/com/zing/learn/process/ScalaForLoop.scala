package com.zing.learn.process

/**
  * Created by zhang on 2017/1/6.
  */
object ScalaForLoop {
  def main(args: Array[String]): Unit = {

//    Scala 语言中 for 循环的语法：
//    for( var x <- Range ){
//      statement(s);
//    }

    // for 循环
    for( a <- 1 to 10){
      println( "Value of a: " + a )
    }
    for( a <- 1 until 5; b <- 1 to 3) {
      println( "Value of a: " + a + " b :" + b )
    }

//    for 循环集合
//    for( var x <- List ){
//      statement(s);
//    }
    val numList = List(1,2,3,4,5,6)
    // for 循环
    for( a <- numList ){
      println( "Value of a: " + a )
    }

//    for 循环过滤
    for( a <- numList if a != 3 if a < 8 ){
      println( "Value of a: " + a )
    }


//    for 使用 yield
//    你可以将 for 循环的返回值作为一个变量存储。语法格式如下：
//    var retVal = for{ var x <- List
//                          if condition1; if condition2...
//    }yield x
    var retVal = for {a <- numList if a != 3; if a < 8} yield a
    // 输出返回值
    for( a <- retVal){
      println( "----Value of a: " + a )
    }


  }

}
