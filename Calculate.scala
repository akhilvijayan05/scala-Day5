class Find
{
var mul=1
var sum=0
def solve(l:List[Int])=
{
	for(value<-l)
	{
		mul=mul*value
		sum=sum+value
	}
println(s"Multiplication of list =$mul")
println(s"Sum of list =$sum")
}
}
object Calculate extends App
{
val list=List(1,2,3,4)
val obj=new Find
obj.solve(list)
}
