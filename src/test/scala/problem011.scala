import euler.euler11._

import org.scalatest.FunSuite

class Euler11 extends FunSuite {

  test("top") {
    assert(numXY(0, 0)===8)
    assert(productXY(0, 0)===1651104)
    assert(sol === 70600674)
  }

}
