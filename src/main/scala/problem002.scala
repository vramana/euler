package euler

object euler2 {
  
  def function(n: Int, j: Int, sum: Int): Int = {
    
    def fib(i: Int, a: Int, b: Int): Int = 
      if (i <= 0) b
      else fib(i-1, b, a+b)
    
    val a = fib(j, 0, 1)

    if (a > n) sum
    else {
      if (a % 2 == 0) function(n, j+1, sum+a)
      else function(n, j+1, sum)
    }
  }

  lazy val fib: Stream[Int] = 0 #:: 2 #:: fib.zip(fib.tail).map{case (a,b) => a + 4*b}
  val result = fib takeWhile ( _ < 4000000) reduce (_ + _)
}
