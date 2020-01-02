package Part2OOP

object Basics extends  App {

  val person = new Person("Aarav", 2)
  println(person.x)

  person.greet("Daniel")

  person.greet()

}

//constructor

class Person ( name : String , age : Int)
{
  //body
  val x = 2
  println(1 + 3 )

  // method
  def greet( name : String ) : Unit = {
  println(s"Hi ${this.name} , i am $name")
  }

  def greet() : Unit = {
    println(s" Hi , ... I am $name, welcome to OOPs tutorial... happy learning")
  }

}