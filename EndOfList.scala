class end{
var index=0
var value=0
def endOfList(l:List[Int])=
{
	for(a<-l)
	{	
		value=a
		index=index+1
	}
	println(s"Index is $index and Value is $value")
}
}
object EndOfList extends App{
val list=List(1,2,3,4,9,10,11,13)
val obj=new end
obj.endOfList(list)
}
