package com.zing.learn.string


/**
  * Created by zhang on 2017/1/5.
  */
object ScalaStrings {

  var s1:String = "zing"
  var s2 = "zing2"
  var s3 = "中国"


  def main(args: Array[String]): Unit = {
    var sb = new StringBuilder(s1)

    println(sb)
    println(s1)
    println(s2)

    println(s1+s2)
    println(s1++s2)

    println(s1.getClass)
    println(sb)
    println(sb.getClass)


    println("length : "+ s1.length)
    println("charAt(2) : "+ s1.charAt(2))
    println("s1(2) : "+ s1(2))

    println("codePointAt : "+s3.codePointAt(0)) // 20013

    println("codePointAt(2) : "+ s1.codePointAt(2))
    println("codePointBefore(2) : "+ s1.codePointBefore(2))

    println("concat() : "+ s1.concat(s3))
    println("concat() : "+ s1.reverse)

    //    1
    //    char charAt(int index)
    //    返回指定位置的字符
    var charAt = "charAt"
    print(charAt.charAt(0))
    print(charAt.charAt(1))
    print(charAt.charAt(2))
    print(charAt.charAt(3))
    print(charAt.charAt(4))
    print(charAt.charAt(5))
    //    print(charAt.charAt(6)) //java.lang.StringIndexOutOfBoundsException
    for(s <- charAt){
      println(s)
    }

    //    2
    //    int compareTo(Object o)
    //    比较字符串与对象
    var str = "string"

    //    3
    //    int compareTo(String anotherString)
    //    按字典顺序比较两个字符串
    var compareTo1 = "compareTo1"
    val to1: Int = compareTo1.compareTo("compareTo")
    println(to1)

    var compareTo = "compareTo"
    val to: Int = compareTo.compareTo("compareTo")
    println(to)

    var compare = "compare"
    val t: Int = compare.compareTo("comparea")
    println(t)

    //    4
    //    int compareToIgnoreCase(String str)
    //    按字典顺序比较两个字符串，不考虑大小写
    //    5
    //    String concat(String str)
    //    将指定字符串连接到此字符串的结尾
    //    6
    //    boolean contentEquals(StringBuffer sb)
    //    将此字符串与指定的 StringBuffer 比较。
    str = "contentEquals"
    var equals: Boolean = str.contentEquals(new StringBuffer(str))
    println(equals)
    equals = str.contentEquals(new StringBuffer("contentEquals"))
    println(equals)
    equals = str.contentEquals("contentEquals")
    println(equals)
    //    7
    //    static String copyValueOf(char[] data)
    //    返回指定数组中表示该字符序列的 String
    var ch: Array[Char] = new Array[Char](10)
    for (c <- ch.indices ){
      //      ch(c) = c.toChar()
      println("-->" + c)
    }
    val of: String = String.copyValueOf(ch)
    println(of)


  }

}
