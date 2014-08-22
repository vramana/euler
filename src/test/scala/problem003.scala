import euler.euler3._

import org.scalatest.FunSuite

class Number extends FunSuite {

  test("Problem 3") {
    assert(primefactor(BigInt("600851475143")) === 6857)
  }

}
