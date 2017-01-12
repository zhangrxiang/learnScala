package com.zing.learn.collection

/**
  * Created by zhang on 2017/1/12.
  */
object ScalaTuples {
  def main(args: Array[String]): Unit = {


    //    元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素。
    var t = (1, 3.14, "Fred")
    println(t)

    t = new Tuple3[Int,Double,String](1, 3.14, "Fred")
    println(t)

    t = Tuple3(1, 3.14, "Fred")
    println(t)

    var tuple = (4,3,2,1)
    val sum = tuple._1 + tuple._2 + tuple._3 + tuple._4
    println(sum)

//    迭代元组
    tuple.productIterator.foreach{ i => println(i)}


//    元组转为字符串
    val string = t.toString()
    println(string)

    println(t.productPrefix)

    println(t._1)



  }


}
