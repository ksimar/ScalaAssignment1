/**
  * Created by dell on 1/15/2017.
  */
object Fibonacci extends App{
 val n = args(0).toInt                     //input value

  def calcNthNum(n : Int) : Int = {        //function to calculate Nth number of Fibonacci Series

    if (n == 0 || n == 1) n
    else calcNthNum(n-1) + calcNthNum(n-2)
  }

  val value = calcNthNum(n)
  println(s"Nth value of the fibonacci series is $value")
}
