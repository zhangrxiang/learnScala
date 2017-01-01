package com.zing.learn

/**
  * Created by zhang on 2017/1/1.
  */
object ScalaDataTypes {
  def main(args: Array[String]): Unit = {
//    使用关键词 "var" 声明变量，使用关键词 "val" 声明常量。
//  Byte	8位有符号补码整数。数值区间为 -128 到 127
    var byteData:Byte = 127
//  Short	16位有符号补码整数。数值区间为 -32768 到 32767
    var shortData:Short = 32767
//  Int	32位有符号补码整数。数值区间为 -2147483648 到 2147483647
    var intData:Int = 22222222
//  Long	64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
    var longData:Long = 2222222223333333L
//  Float	32位IEEE754单精度浮点数
    var floatData:Float = 22222222222.2F
//  Double	64位IEEE754单精度浮点数
    var doubleData:Double = 22222222222222222D
//  Char	16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
    var charData :Char = 'z'
//  String	字符序列
    var stringData :String = "zhangrxiang"
//  Boolean	true或false
    var booleanData:Boolean=true
//  Unit	表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
//    var unitData:Unit
//  Null	null 或空引用
    var nullData:Null= null
//  Nothing	Nothing类型在Scala的类层级的最低端；它是任何其他类型的子类型。
//    var nothingData:Nothing = nothingData
//  Any	Any是所有其他类的超类
    var anyData :Any = new Object
//  AnyRef	AnyRef类是Scala里所有引用类(reference class)的基类
    var anyRefData :AnyRef = new Object


    println(byteData)
    println(shortData)
    println(intData)
    println(longData)
    println(floatData)
    println(doubleData)
    println(charData)
    println(stringData)
    println(booleanData)
    println(nullData)
//    println(nothingData)
    println(anyData)
    println(anyRefData)
//    println(unitData)

    val (myVar1: Int, myVar2: String) = Pair(40, "Foo")
    println(myVar1)
    println(myVar2)
  }
}
