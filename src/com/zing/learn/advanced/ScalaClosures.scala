package com.zing.learn.advanced

/**
  * Created by zhangrxiang on 2017/1/5.
  */
object ScalaClosures {
  var factor:Int= 3
  def main(args: Array[String]) {
    println( "muliplier(1) value = " +  multiplier(1) )
    println( "muliplier(2) value = " +  multiplier(2) )
    var z = zing(10)
    z("zing")
    zing2()()
    zing3()()()
    zing4()()()()()
    println("----over----")
  }


  //more是一个自由变量，其值及类型是在运行的时候得以确定的
  //x是类型确定的，其值是在函数调用的时候被赋值的
  //这样的函数称之为闭包：从开放到封闭的过程
//      函数名(参数) = (参数) => 返回值
  def add(more:Int) = (x:Int) => x+ more
  //给more赋值
  val add1 = add(1)
  //调用add函数
  println(add1(100))


  //  闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
  val multiplier = (i:Int) => i * factor

  def zing(i:Int)=(str:String)=>println(str+i)
  def zing2()=()=>println("wocao")
  def zing3()=()=>()=>println("wowocao")
  def zing4()=()=>()=>()=>()=>println("wowocao")
}
