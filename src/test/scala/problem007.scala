import euler.euler7._

import org.scalatest.FunSuite

class Euler7 extends FunSuite {

  test ("prime") {
    assert(nthPrime(10001, List(2)) === 104743)
    //assert(nthPrime(10001) === 11)
  }

  test ("other tests") {
    assert(nextPrime(8, List(2,3,5,7)).last === 11)
  }
}
