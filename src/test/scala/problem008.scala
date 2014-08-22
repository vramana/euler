import euler.euler8._

import org.scalatest.FunSuite

class Euler8 extends FunSuite {


  test("maxProduct") {
   //assert(maxProduct(s.take(20).toList) === 0) 
   assert(maxProduct(s.toList.map(_.toString.toInt))=== 1)
  }

}
