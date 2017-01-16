
object Q1{
  def main(args: Array[String]) {
    val list: List[Int] = List(10,20,30,40)

    for(index <- 0 to list.length-1)
      println(s"$index = ${list(index)}")
  }
}
