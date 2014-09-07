package euler

object euler17 {

  val ones = Map(0-> "", 1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four", 5 -> "Five", 6 -> "Six", 7 -> "Seven", 8 -> "Eight", 9 -> "Nine")

  val tens = Map(2 -> "Twenty", 3-> "Thirty", 4-> "Forty", 5-> "Fifty" ,6-> "Sixty", 7-> "Seventy", 8-> "Eighty" , 9 -> "Ninety")

  val elevens = Map(0 -> "Ten", 1 -> "Eleven", 2 -> "Twelve", 3 -> "Thirteen", 4 -> "Fourteen", 5-> "Fifteen", 6-> "Sixteen", 7 -> "Seventeen", 8 -> "Eighteen", 9 -> "Nineteen")

  def wordSum(n: Int, sum: Int): Int = {
    if (n < 1) sum
    else {
      val th = if (n / 1000 == 0) "" else ones.get(n / 1000).get + "thousand"
      val a = (n % 1000)
      val hun = {
        if ( a/100 == 0) ""
        else if (a % 100 == 0) ones.get(a/100).get + "hundred"
        else ones.get(a/100).get + "Hundred" + "And"
      }
      val b = (n % 100)
      val tns = {
        if (b/10 == 0) ones.get(b%10).get
        else if (b/10 == 1) elevens.get(b % 10).get
        else tens.get(b/10).get + ones.get(b%10).get
      }
      wordSum(n - 1, sum + (th + hun + tns).length)
    }
  }

}
