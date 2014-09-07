import euler.euler21._

import org.scalatest.FunSuite

class Euler21 extends FunSuite {

  test("Amicable Numbers") {
    assert(sumDivisors(220) === 284)
    assert(sumDivisors(284) === 220)
    assert(result.sum === 31626)
  }

}
