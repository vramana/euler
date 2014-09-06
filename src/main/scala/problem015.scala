package euler

import scala.annotation.tailrec

object euler15{

  val a: List[((Int, Int), BigInt)] = (0 to 20).flatMap(x => List(((x, 1), BigInt(x+1)), ((1, x), BigInt(x+1)))).toList

  @tailrec def paths(m: Int, n: Int, sol: List[((Int, Int), BigInt)]): List[((Int, Int), BigInt)] = {
      if (m > 20) sol
      else if (n > 20) paths(m+1, 1, sol)
      else if (sol.exists(x => (x._1 == (m, n)) | (x._1 == (n, m)) )) paths(m, n+1, sol)
      else {
        val p = (0 to m-1).map(i => (m-i, n-1)).map(x => sol.dropWhile(y => y._1 != x).head._2).sum +1
        if (m != n) paths(m, n+1, ((m, n), p) :: ((n, m), p) :: sol)
        else paths(m, n+1, ((m, n), p) :: sol)
      }
  }

}

