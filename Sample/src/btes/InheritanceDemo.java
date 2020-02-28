package btes;

class A  //super/parent/base
{
int x;

A(int x)
{
    this.x=x;
System.out.println("in parent class overloaded constructor");
}
void sum(int x, int y)
{

System.out.println(x+y);
}
void sum(int x, int y,int z)
{

System.out.println(x+y);
}
 void show()
{
System.out.println("hello");
}
}


class B extends A//sub/child/derived
{
    int y;

B(String y)

{
	super(10);
    //hidden super() call to parent's default constructor
System.out.println("in Child class overloaded constructor");

}
void show()//overriding
{    super.show();
System.out.println("hi"+x);
}
void mul(int x, int y)
{
System.out.println(x*y);
}
}



public class InheritanceDemo
{
public static void main(String s[])
{
B a1=new B("hello");
a1.show();
a1.sum(10,20);//parent's methods
a1.mul(10,3);

}
}