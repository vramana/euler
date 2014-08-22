package euler

object euler1 {
  
  def number(n: Int, sum: Int) : Int = {
    if (n <= 0) sum
    else if (n % 3 == 0 || n % 5 == 0) number(n-1, sum+n)
    else number(n-1, sum)
  }
}
