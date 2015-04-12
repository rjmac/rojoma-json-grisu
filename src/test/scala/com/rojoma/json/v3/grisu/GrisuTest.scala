package com.rojoma.json.v3.grisu

import org.scalatest.{FunSuite, MustMatchers}
import com.rojoma.json.v3.extensions.DoubleWriter

class GrisuTest extends FunSuite with MustMatchers {
  test("grisu double serializer is installed") {
    DoubleWriter.doubleWriter mustBe a [GrisuDoubleWriter]
  }
}
