package euler

object euler25 {

  def fib(n: Int, a: BigInt = BigInt(1), b: BigInt = BigInt(1)): BigInt = {
    assert(n >=1)

    if(n== 1) a
    else if (n == 2) b
    else fib(n-1, b, a+b)
  }

  def result(d: Int, n: Int = 2, a: BigInt = BigInt(1), b: BigInt = BigInt(1)): Int = {
    if (b.toString.length >= d) n
    else {
      result(d, n+1, b, a+b)
    }
  }

}
