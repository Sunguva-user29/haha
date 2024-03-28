 
package unit3;
 
abstract  class AnonymousInner {
public abstract void mymethod();
}
class Outer{
public static void main(String args[])

{
AnonymousInner obj=new AnonymousInner(){
public void mymethod()
{
System.out.println("This is lol");
}
};
obj.mymethod();
}

}
