/**
  * Created by dell on 1/15/2017.
  */
object SumOfProduct {

  def sumOfProduct(prod : Int) : Int = {
    if(prod.toString.length==1) prod      //if product is single digit, sum will be same as the product
    else
      {
        val lastDigit = prod%10
        val tempProd = prod/10
        lastDigit + sumOfProduct(tempProd)
      }
  }

  def main(args: Array[String]): Unit ={
    val limit = args(0).toInt                  // last number of series to be used
    var prod = 1                               // Product of numbers of the series
    for(num <- 1 to limit) {
         prod = num * prod
      }

    println(s"Product of numbers is $prod")

    val sum = sumOfProduct(prod)
    println(s"Sum of product of the numbers is $sum")


  }
}
