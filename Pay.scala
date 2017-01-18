class Payment
{
  def wayOfPayment(typeofpayment: String,num: Int) =
  typeofpayment match {
  case "Paytm"       => num*1.02
  case "Freecharge"  => num*1.02
  case "NetBanking"  => num+5
  case "Card Payment" =>num+1.5
  case "Cash"        => num
  case _ => println("Choose valid choice")

}
 
}
object Pay extends App
{
   val paymentobj= new Payment
   println(paymentobj.wayOfPayment("Paytm",12))
   println(paymentobj.wayOfPayment("Freecharge",12))
   println(paymentobj.wayOfPayment("NetBanking",12))
   println(paymentobj.wayOfPayment("Card Payment",12))
   println(paymentobj.wayOfPayment("Cash",12))

   
}
