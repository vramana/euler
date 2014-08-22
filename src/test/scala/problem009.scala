import euler.euler9._

import org.scalatest.FunSuite 

class Euler9 extends FunSuite {

  test("prod") {
    assert(a === BigInt("31875000"))
  }

  test("algo") {
    assert(tripletProd(1000).head === BigInt("31875000"))
    assert(tripletProd(12).head === 60)
  }

}
