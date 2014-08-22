import euler.euler5._

import org.scalatest.FunSuite

class Euler5 extends FunSuite {

  test("is_prime") {
    assert(isPrime(12) === false)
    assert(isPrime(101) === true)
  }

  test("list") {
    assert(listOfPrimes(10) === List(2,3,5,7))
  }
  
  test("LCM") {
//    assert(lcm(10)  === 2520)
    assert(lcm(20)  === BigInt("232792560"))
  }
}
