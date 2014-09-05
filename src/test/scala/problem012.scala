import euler.euler12._

import org.scalatest.FunSuite

class Euler12 extends FunSuite {

  test("top") {
    assert(primePower(8, 2, 0) === (1, 3))
    assert(factors(123456, 2, Nil) === List((643,1), (3,1), (2,6)))
    assert(divisors(28) === 6)
    assert(euler(2) === (12375,76576500))
  }

}
