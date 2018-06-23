package example

import org.specs2.mutable.Specification

class HelloSpec extends Specification {

  "The Hello object" >> {
    "say hello" >> {
      Hello.greeting shouldEqual "hello"
    }
  }
}
