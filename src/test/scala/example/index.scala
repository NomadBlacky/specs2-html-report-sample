package example

import org.specs2._
import specification.core._
import runner.SpecificationsFinder._

class index extends Specification { def is =

  examplesLinks("Example specifications")

  // see the SpecificationsFinder trait for the parameters of the 'specifications' method
  def examplesLinks(t: String) =
    t.title ^
    Fragments.foreach(specifications())(s => link(s) ^ br)
}