import euler.euler20._

import org.scalatest.FunSuite

class Euler20 extends FunSuite {

  test("Sum of digits of 100!") {
    println(fact(100, BigInt(1)).toString.toList.map(_.toString.toInt).sum)
  }

}
