class Prime
{
var i=0;
  def findPrime(n: Int):Boolean =
 {
    var flag=true
     if(n==0 || n==1)
      flag=false
     
     for(i<-2 to (n/2))
     { 
	if((n%i)==0)
	{
		flag=false
	}
     }
      flag
  }
 }



object prime extends App
{
   val list=List(7,1,2,3,4,5)
   var flag=false
   val obj=new Prime
   for(l<- list)
   {
	//println("Hi")
      flag=obj.findPrime(l)
	//println(flag)
      if(flag)
      println(l)
   }
 }
