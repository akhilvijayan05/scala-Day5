class Stack
{
var list=List[Int]()
def push(l:List[Int],value:Int)=
{
        
	list=l:+value
	println("")
	println("After push:")
	for(v<-list)
	print(s"$v ")
	list
}
def pop(l:List[Int])=
{
    var mylist=l.drop(0)
   mylist
}
}
object Find extends App
{
var list=List(1,2,3,4)
val obj=new Stack
list=obj.push(list,5)
list=obj.push(list,6)
list=obj.push(list,7)
list=obj.push(list,8)
list=obj.pop(list)
for(v<-list)
print(s"$v ")
}
