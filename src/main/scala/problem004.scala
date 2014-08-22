package euler

object euler4 {
  
  def is_palindrome(n: Int): Boolean = {
    
    def rec(i: Int, j: Int): Boolean = 
      if (i == 0) n == j         
      else rec(i/10, j*10 + i%10)

    rec(n, 0)
  }

  val list = for {
    i <- 100 to 999
    j <- 100 to i
    if (i % 11 == 0) || (j % 11 ==0)
    a = i*j
    if is_palindrome(a)
  } yield a

  val b = list reduce (_ max _)
}
