package euler

object euler7 {

  def nthPrime(n: Int, ls: List[Int]): Int = (ls.length >= n) match {
    case true ⇒ ls.last 
    case _    ⇒ nthPrime(n, nextPrime(ls.last + 1, ls))
      
  }

  def nextPrime(n: Int, ls: List[Int]): List[Int] = isPrime(n, ls) match {
    case true ⇒ ls ++ List(n)
    case _ ⇒ nextPrime(n+1, ls)
  }
  
  def isPrime(i: Int, ls: List[Int]): Boolean = ls match {
    case Nil ⇒ true
    case x :: xs ⇒ {
      if (x*x > i) true
      else if (i % x == 0) false
      else isPrime(i, xs)
    }
  }
}
