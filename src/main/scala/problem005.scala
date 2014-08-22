package euler

import scala.math.pow

object euler5 {

  def lcm(n: Int): BigInt = {
    val i = BigInt(1)
    val num = listOfPrimes(n)

    def highPow(i: Int, j: Int=1, k: Int=0): Int =
      if(j > n) k-1
      else highPow(i, j*i, k+1) 

    val pw = num map {x ⇒ highPow(x)}

    num.zip(pw).map(x ⇒ scala.math.pow(x._1, x._2).toInt).foldLeft(i)(_*_) 
  }  
  
  def checkSmall(n: Int, i: Int = 2): Boolean = {
    if (i*i > n) true
    else if (n % i == 0) false
    else checkSmall(n, i+1)
  }

  def isPrime(n: Int): Boolean = {
    checkSmall(n)
  }

  def listOfPrimes(n: Int):List[Int] = {
    (2 to n).toList filter (isPrime(_))
  }
}

