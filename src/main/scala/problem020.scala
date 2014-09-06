package euler

object euler20 {

  def fact(n: Int, v: BigInt): BigInt =
    if (n<=1) v
    else fact(n-1, n*v)

}
