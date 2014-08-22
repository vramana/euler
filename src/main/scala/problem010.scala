package euler 

import scala.collection.mutable.ListBuffer

object euler10 {

  def sumUpto(a: Int): BigInt = 
    (BigInt(0) /: primesUnder(a)) (_ + _)  

  def primesUnder(n: Int): List[Int] = {
    require(n >= 2)

    val primes = ListBuffer(2) 
    for(
      i ← 3 to n) { 
      if (prime(i, primes.iterator)) {
        primes += i 
      }
    }
    primes.toList
  }

  // factors must be in sorted order
  def prime(num: Int, factors: Iterator[Int]): Boolean = 
    factors.takeWhile(_ <= math.sqrt(num).toInt) forall(num % _ != 0)

}
