package com.zing.learn.string

import com.zing.learn.HelloScala

/**
  * Created by zhang on 2017/1/7.
  */
object ScalaStringFunction {

  var s1:String = "zing"
  var s2 = "zing2"
  var s3 = "中国"

  def main(args: Array[String]): Unit = {
    var sb = new StringBuilder(s1)
    println(sb)
    println(s1)
    println(s2)

    //    7
    //    static String copyValueOf(char[] data)
    //    返回指定数组中表示该字符序列的 String
    val ch: Array[Char] = new Array[Char](26)
    for (c <- ch.indices ){
      ch(c) = (c+97).toChar
    }
    val of: String = String.copyValueOf(ch)
    println(of)

    //      8
    //    static String copyValueOf(char[] data, int offset, int count)
    //    返回指定数组中表示该字符序列的 String
    val of1: String = String.copyValueOf(ch,0,ch.length/2)
    println(of1)
    //      9
    //    boolean endsWith(String suffix)
    //    测试此字符串是否以指定的后缀结束
    val str = "HelloScala"
    var endsWith: Boolean = str.endsWith("Scala")
    println("endsWith : "+endsWith)
    endsWith = str.endsWith("scala")
    println("endsWith : "+endsWith)
    //    10
    //    boolean equals(Object anObject)
    //    将此字符串与指定的对象比较
    var equals1: Boolean = str.equals("HelloScala")
    println("equals : "+equals1)
    equals1 = str.equals(new String(str))
    println("equals : "+equals1)
    equals1 = str.equals(new StringBuilder(str).toString())
    println("equals : "+equals1)

    //    11
    //    boolean equalsIgnoreCase(String anotherString)
    //    将此 String 与另一个 String 比较，不考虑大小写
    val ignoreCase: Boolean = str.equalsIgnoreCase(str.toLowerCase)
    println("equalsIgnoreCase : "+ignoreCase)
    //    12
    //    byte getBytes()
    //    使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
    val bytes: Array[Byte] = str.getBytes
    for (b <- bytes.indices){
      println(bytes(b) + " ： "+bytes(b).toChar)
    }
    //    13
    //    byte[] getBytes(String charsetName
    //      使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
    //    14
    //    void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
    //    将字符从此字符串复制到目标字符数组
    var dst:Array[Char] = new Array[Char](str.length)
    str.getChars(0,str.length,dst,0)
    for(d <- dst.indices){
      print(dst(d))
    }
    println()
    //    15
    //    int hashCode()
    //    返回此字符串的哈希码
    //    16
    //    int indexOf(int ch)
    //    返回指定字符在此字符串中第一次出现处的索引
    //    17
    //    int indexOf(int ch, int fromIndex)
    //    返返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索
    //    18
    //    int indexOf(String str)
    //    返回指定子字符串在此字符串中第一次出现处的索引
    //    19
    //    int indexOf(String str, int fromIndex)
    //    返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
    //    20
    //    String intern()
    //    返回字符串对象的规范化表示形式
    val intern: String = str.intern()
    println(intern)
    //    21
    //    int lastIndexOf(int ch)
    //    返回指定字符在此字符串中最后一次出现处的索引
    //    22
    //    int lastIndexOf(int ch, int fromIndex)
    //    返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索
    //    23
    //    int lastIndexOf(String str)
    //    返回指定子字符串在此字符串中最右边出现处的索引
    //    24
    //    int lastIndexOf(String str, int fromIndex)
    //    返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
    //    25
    //    int length()
    //    返回此字符串的长度
    //    26
    //    boolean matches(String regex)
    //    告知此字符串是否匹配给定的正则表达式
    val matches: Boolean = str.matches("[A-Za-z]{1,}")
    println(matches)
    //    27
    //    boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
    //    测试两个字符串区域是否相等
    //    28
    //    boolean regionMatches(int toffset, String other, int ooffset, int len)
    //    测试两个字符串区域是否相等
    //    29
    //    String replace(char oldChar, char newChar)
    //    返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的
    //    30
    //    String replaceAll(String regex, String replacement
    //      使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
    //    31
    //    String replaceFirst(String regex, String replacement)
    //    使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串
    //    32
    //    String[] split(String regex)
    //    根据给定正则表达式的匹配拆分此字符串
    //    33
    //    String[] split(String regex, int limit)
    //    根据匹配给定的正则表达式来拆分此字符串
    //    34
    //    boolean startsWith(String prefix)
    //    测试此字符串是否以指定的前缀开始
    //    35
    //    boolean startsWith(String prefix, int toffset)
    //    测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
    //    36
    //    CharSequence subSequence(int beginIndex, int endIndex)
    //    返回一个新的字符序列，它是此序列的一个子序列
    //    37
    //    String substring(int beginIndex)
    //    返回一个新的字符串，它是此字符串的一个子字符串
    //    38
    //    String substring(int beginIndex, int endIndex)
    //    返回一个新字符串，它是此字符串的一个子字符串
    //    39
    //    char[] toCharArray()
    //    将此字符串转换为一个新的字符数组
    //    40
    //    String toLowerCase()
    //    使用默认语言环境的规则将此 String 中的所有字符都转换为小写
    //    41
    //    String toLowerCase(Locale locale)
    //    使用给定 Locale 的规则将此 String 中的所有字符都转换为小写
    //    42
    //    String toString()
    //    返回此对象本身（它已经是一个字符串！）
    //    43
    //    String toUpperCase()
    //    使用默认语言环境的规则将此 String 中的所有字符都转换为大写
    //    44
    //    String toUpperCase(Locale locale)
    //    使用给定 Locale 的规则将此 String 中的所有字符都转换为大写
    //    45
    //    String trim()
    //    删除指定字符串的首尾空白符
    //    46
    //    static String valueOf(primitive data type x)
    //    返回指定类型参数的字符串表示形式
  }
}
