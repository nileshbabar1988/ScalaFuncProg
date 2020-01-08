package Objects

object Objects extends  App {
//
  object Person {
  // type + its only instance
  // "static" / "class" - level functionality
    val N_EYE = 2

    def canFly = true

  def apply(mother : Person, father : Person): Person = new Person("Bobbie")
  }

  class Person(val name : String) {
    // Instance level functionality
  }
  // COMPANION

  println(Person.N_EYE)
  println(Person.canFly)

  val mary = new Person("mary")
  val john = new Person("john")

  println(mary == john)

  val person1 = Person
  val person2 = Person

  println(person1 == person2)

  val bobie = Person(mary, john)


}
