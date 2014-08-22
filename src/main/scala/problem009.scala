package euler

object euler9 {
  
  // m = 20 , n = 5
  val a = (BigInt(2*20*5))*(20*20 + 5*5)*(20*20 - 5*5)

  // 2m(m+n) = sum
 

  def tripletProd(sum: Int): List[BigInt] = {

    def prod(m: Int, n: Int) = 
      BigInt(2)*m*n*(BigInt(m).pow(4) - BigInt(n).pow(4))

    def check(m: Int, ls: List[BigInt]): List[BigInt] = {
      val n = sum/(2*m) - m
      if (n > m) ls 
      else if (sum % m == 0) check(m-1, prod(m,n) :: ls)
      else check(m-1, ls)
    }
    
    check(sum, Nil)
  }

}
