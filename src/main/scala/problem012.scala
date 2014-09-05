package euler

object euler12{

  def primePower(n: Int, p: Int, pow: Int): (Int, Int) =
    if(n % p != 0) (n, pow)
    else primePower(n/p, p, pow + 1)

  def factors(n: Int, p: Int, list: List[(Int, Int)]): List[(Int, Int)] = {
    if (n <= 1) list
    else if (n % p != 0) factors(n, p+1, list)
    else {
      val (a, b) = primePower(n, p, 0)
      factors(a, p+1, (p, b) :: list)
    }
  }

  def divisors(n: Int): Int = factors(n, 2, Nil).map(_._2 + 1).product

  def euler(n: Int): (Int, Int) = {
    val x =  n*(n+1)/2
    if (divisors(x) > 500) (n, x)
    else euler(n+1)
  }


}
