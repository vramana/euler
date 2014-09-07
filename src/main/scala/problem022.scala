package euler

object euler22 {

  val source = scala.io.Source.fromFile("src/main/scala/problem022.txt")

  val words = source.getLines().mkString("").split(",").map(_.trim).toList.sortWith(_.compareTo(_) < 0)

  source.close()

  val alpha = "\"ABCDEFGHIJKLMNOPQRSTUVWXYZ".zip(0 to 26).toMap

  def wordValue(s: String) : Int = s.toList.map(x => alpha.get(x).get).sum

  def listValue(l: List[String], p: Int =1, sum: Int = 0): Int = l match {
    case Nil => sum
    case x :: xs => listValue(xs, p+1, sum + wordValue(x)*p)
  }

  val result = listValue(words)

}
