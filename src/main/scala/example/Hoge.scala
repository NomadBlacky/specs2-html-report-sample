package example

case class Hoge(word: String, count: Int) {
  require(count >= 0)
  def repeat: String = word * count
}
