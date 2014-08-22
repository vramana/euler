package euler

object euler3 {
  
  def primefactor(n: BigInt): BigInt = {
  
    def rec(i: BigInt, j: BigInt, result: BigInt): BigInt = {
      val a = i % j
      if (j*j > n) result
      else if (a == 0 & j > 2) rec(i/j, j+1, j)
      else if (a != 0 & j > 2) rec(i, j+1, result)
      else if (a == 0 & j == 2) rec(i/j, j+1, j)
      else rec(i, j+1, result)
    }
    rec(n, BigInt(2), BigInt("2"))
  }
}   
