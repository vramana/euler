package euler

object euler21 {

  def sumDivisors(n: Int, m: Int = 1, sum: Int = 0): Int = {
    if (m*m > n) sum - n
    else if (n % m != 0) sumDivisors(n, m +1, sum)
    else sumDivisors(n, m+1, sum + m + n/m)
  }

  def cond(n: Int): Boolean = {
    val m = sumDivisors(n)
    (m < 10000) & (n != m) & (sumDivisors(m) == n)
  }

  val result = (2 to 10000).filter(y => cond(y))
}
