package Part2OOP

object MethodNotation extends  App {

  class Person( val name  : String, val favMovie : String, val age : Int = 0){
    def likes (movie : String) : Boolean = movie == favMovie

    def hangout ( person: Person) : String = s"${this.name} is hanging out with ${person.name}"

    def + ( person: Person) : String = s"${this.name} is hanging out with ${person.name}"

    def + (nickname : String) : Person = new Person(s"$name ($nickname) ", favMovie  )

    def unary_! : String = s"$name .. What the Heck ??? "
    def unary_+ : Person = new Person(name , favMovie , age + 1 )


    def isAlive : Boolean = true

    def apply() : String = s"Hi my name is $name  , and i like $favMovie movie .. !!"
    def apply(n : Int ) : String = s" $name watched favorite movie : $favMovie $n times ...!!!"

    def learns(thing : String) : String = s"$name is learning $thing"
    def learningScala = this learns "scala"
  }

  val marry = new Person("marry", "IronMan2")

  println(marry.likes("IronMan2"))
  // equivalent
  println(marry likes "IronMan2" )
 // infix notation ==  operator notation

  val tom = new Person("Tom ", "Spiderman")

  println(marry hangout tom )

  println(1.+(2))


  println(!marry)

  println(marry.unary_!)

  import scala.language.postfixOps

  println(marry.isAlive)
  println( marry isAlive)

  println(marry.apply())
  println(marry())

  println((marry + "The Rockstar ")())

  println((+marry).age)

  println(marry learningScala)

  println(marry(10))
}
