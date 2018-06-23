package example

import org.specs2.mutable.Specification

class HogeSpec extends Specification {

  "Hoge#repeat" >> {
    "Success" >> {
      Hoge("foo", 3).repeat shouldEqual "foofoofoo"
    }

    "Failed" >> {
      Hoge("foo", -1).repeat shouldEqual ""
    }
  }
}
