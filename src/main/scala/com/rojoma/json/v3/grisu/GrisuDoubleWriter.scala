package com.rojoma.json.v3.grisu

import java.io.Writer

import com.rojoma.json.v3.extensions.DoubleWriter
import com.rojoma.grisu.Grisu

class GrisuDoubleWriter extends DoubleWriter {
  def toString(d: Double): String = Grisu.toString(d)
  def toWriter(w: Writer, d: Double): Unit = Grisu.toWriter(w, d)
}
