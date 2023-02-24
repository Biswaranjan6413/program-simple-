public class Parameter // value pass inside the method(int add (inta,intb))
{
int add(int a, int b)// add is the method name and a,b are parameters 
{
int c = a+b;
System.out.println(c);
return c;
}

public static void main(String[] args)
{
Parameter obj =  new Parameter(); // Object creation, new is a keyword to create object & obj is the name of the object 
obj.add(5,8);// method call -> object_name.method_name(arguments)
}
}
