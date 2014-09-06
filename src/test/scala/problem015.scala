import euler.euler15._

import org.scalatest.FunSuite

class Euler15 extends FunSuite {

  test("The RECURSIVE SOLUTION") {
    val list = paths(1, 1, a)
    assert(list.dropWhile(y => y._1 != (3, 3)).head._2 === 20)
    assert(list.dropWhile(y => y._1 != (2, 4)).head._2 === 15)
    assert(list.dropWhile(y => y._1 != (10, 10)).head._2 === 184756)
    assert(list.dropWhile(y => y._1 != (20, 20)).head._2 === BigInt("137846528820"))
  }

}
