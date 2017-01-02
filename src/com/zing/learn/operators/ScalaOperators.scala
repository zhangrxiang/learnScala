package com.zing.learn.operators

/**
  * Created by zhangrongxiang on 2017/1/2.
  */
class ScalaOperators {
  def basic(): Unit = {
    var a = 10
    var b = 20
    var c = 25
    var d = 25
    //    +	加号	A + B 运算结果为 30
    println("a+b = " + (a + b))
    //    -	减号	A - B 运算结果为 -10
    println("a - b = " + (a - b))
    //    *	乘号	A * B 运算结果为 200
    println("a * b = " + (a * b) )
    //    /	除号	B / A 运算结果为 2
    println("b / a = " + (b / a) )
    //    %	取余	B % A 运算结果为 0
    println("b % a = " + (b % a) )
    println("c % a = " + (c % a) )
  }
  def relation(): Unit ={
//    ==	等于	(A == B) 运算结果为 false
//    !=	不等于	(A != B) 运算结果为 true
//    >	大于	(A > B) 运算结果为 false
//    <	小于	(A < B) 运算结果为 true
//    >=	大于等于	(A >= B) 运算结果为 false
//    <=	小于等于	(A <= B) 运算结果为 true
    var a = 10
    var b = 20
    println("a == b = " + (a == b) )
    println("a != b = " + (a != b) )
    println("a > b = " + (a > b) )
    println("a < b = " + (a < b) )
    println("b >= a = " + (b >= a) )
    println("b <= a = " + (b <= a) )
  }
  def logic(): Unit ={
//    &&	逻辑与	(A && B) 运算结果为 false
//    ||	逻辑或	(A || B) 运算结果为 true
//    !	逻辑非	!(A && B) 运算结果为 true
    var a = true
    var b = false
    println("a && b = " + (a && b))
    println("a || b = " + (a || b))
    println("!(a && b) = " + !(a && b))
  }

  /**
    * fuck so difficult
    */
  def position(): Unit ={
//    位运算符用来对二进制位进行操作，~,&,|,^分别为取反，按位与与，按位与或，按位与异或运算，如下表实例：
//    p	q	(p & q)	(p | q)	(p ^ q)
//    0	0	   0	     0	     0
//    0	1	   0	     1	     1
//    1	1	   1	     1	     0
//    1	0	   0	     1	     1


//    如果指定 A = 60 及 B = 13 两个变量对应的二进制为：
//    A = 0011 1100
//
//    B = 0000 1101
//
//    -------位运算----------
//
//    A&B = 0000 1100
//
//    A|B = 0011 1101
//
//    A^B = 0011 0001
//
//    ~A  = 1100 0011
//    运算符	描述	实例
//    &	按位与运算符	(a & b) 输出结果 12 ，二进制解释： 0000 1100
//    |	按位或运算符	(a | b) 输出结果 61 ，二进制解释： 0011 1101
//    ^	按位异或运算符	(a ^ b) 输出结果 49 ，二进制解释： 0011 0001
//    ~	按位取反运算符	(~a ) 输出结果 -61 ，二进制解释： 1100 0011， 在一个有符号二进制数的补码形式。
//    <<	左移动运算符	a << 2 输出结果 240 ，二进制解释： 1111 0000
//    >>	右移动运算符	a >> 2 输出结果 15 ，二进制解释： 0000 1111
//    >>>	无符号右移	A >>>2 输出结果 15, 二进制解释: 0000 1111
    var a = 60           /* 60 = 0011 1100 */
    var b = 13           /* 13 = 0000 1101 */
    var c = 0

    c = a & b            /* 12 = 0000 1100 */
    println("a & b = " + c )

    c = a | b            /* 61 = 0011 1101 */
    println("a | b = " + c )

    c = a ^ b            /* 49 = 0011 0001 */
    println("a ^ b = " + c )

    c = ~a               /* -61 = 1100 0011 */
    println("~a = " + c )

    c = a << 2           /* 240 = 1111 0000 */
    println("a << 2 = " + c )

    c = a >> 2           /* 215 = 1111 */
    println("a >> 2  = " + c )

    c = a >>> 2          /* 215 = 0000 1111 */
    println("a >>> 2 = " + c )
  }

  def assign(): Unit ={
//    =	简单的赋值运算，指定右边操作数赋值给左边的操作数。	C = A + B 将 A + B 的运算结果赋值给 C
//    +=	相加后再赋值，将左右两边的操作数相加后再赋值给左边的操作数。	C += A 相当于 C = C + A
//    -=	相减后再赋值，将左右两边的操作数相减后再赋值给左边的操作数。	C -= A 相当于 C = C - A
//    *=	相乘后再赋值，将左右两边的操作数相乘后再赋值给左边的操作数。	C *= A 相当于 C = C * A
//    /=	相除后再赋值，将左右两边的操作数相除后再赋值给左边的操作数。	C /= A 相当于 C = C / A
//    %=	求余后再赋值，将左右两边的操作数求余后再赋值给左边的操作数。	C %= A is equivalent to C = C % A
//    <<=	按位左移后再赋值	C <<= 2 相当于 C = C << 2
//    >>=	按位右移后再赋值	C >>= 2 相当于 C = C >> 2
//    &=	按位与运算后赋值	C &= 2 相当于 C = C & 2
//    ^=	按位异或运算符后再赋值	C ^= 2 相当于 C = C ^ 2
//    |=	按位或运算后再赋值	C |= 2 相当于 C = C | 2
var a = 10
    var b = 20
    var c = 0

    c = a + b
    println("c = a + b  = " + c )

    c += a 
    println("c += a  = " + c )

    c -= a 
    println("c -= a = " + c )

    c *= a 
    println("c *= a = " + c )

    a = 10
    c = 15
    c /= a 
    println("c /= a  = " + c )

    a = 10
    c = 15
    c %= a 
    println("c %= a  = " + c )

    c <<= 2 
    println("c <<= 2  = " + c )

    c >>= 2 
    println("c >>= 2  = " + c )

    c >>= 2 
    println("c >>= a  = " + c )

    c &= a 
    println("c &= 2  = " + c )

    c ^= a 
    println("c ^= a  = " + c )

    c |= a 
    println("c |= a  = " + c )
  
  }
  def main(args: Array[String]): Unit = {
    println("This is Class main function,but do not run")
  }
}

object Run {
  def main(args: Array[String]): Unit = {
    val operators = new ScalaOperators
    operators.main(args)
    operators.basic()
    operators.relation()
    operators.logic()
    operators.position()
    operators.assign()
    println("this is Object ")
  }
}
