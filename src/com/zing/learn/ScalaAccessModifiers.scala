package com.zing.learn

/**
  * Created by zhang on 2017/1/1.
  */
class Outer{
  class Inner{
    //  私有(Private)成员
    //    用private关键字修饰，带有此标记的成员仅在包含了成员定义的类或对象内部可见，同样的规则还适用内部类。
    private def f(){println("f")}
    protected def p(){println("por")}
    class InnerMost{
      f() // 正确
      p()
    }
    class Pro extends Inner{
      p()
    }

  }
  class Other{
//    new Inner().p() //错误
  }
//  (new Inner).f() //错误
}
object ScalaAccessModifiers {
  private val name = "zhangrxiang"
  private val age = 21

  override def toString: String = {
    "name : "+name+"  age : "+age
  }

  def main(args: Array[String]): Unit = {
    println("start...")
    var a = ScalaAccessModifiers
    println(a.toString)
    println(a.age)

    var student = ObjStudent
    val username = student.getUsername
    println(username)

  }
}

object ObjStudent{
  private var username:String = "zing"
  private var userAge:Int = 21

  def getUsername:String={
     this.username
  }

}
