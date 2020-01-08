package Part2OOP

object ScalaInheritanceAndTrait extends  App {

  class Animal {
    val creature : String = "Wild Animal"
    def eat = println("From Supper Class")
  }


  class Cat extends Animal {

    def crunch = {
      //eat
      println("From sub class")
    }
  }

  val cat = new Cat

  cat.crunch


  //CONSTRUCTOR

  class Person(name : String , age : Int)
  {
    def this( name : String) = this(name, 0)
  }

  class Adult( name: String, age : Int, idCard : String) extends Person(name)


  class Dog extends Animal{
    override val creature: String = "Domastic Animal"
    override def eat = {
      super.eat
      println("From Override method eat")
    }

  }

   val dog = new Dog
  dog.eat
  println(dog.creature)

//overriding in scala
  class DogNew(override val creature: String) extends  Animal{
    override def eat: Unit = println("from override method eaat")
  }

  val dogNew = new DogNew("New Dog Domastic")
  println(dogNew.creature)

  class Dog2(dogType : String) extends Animal{
    override val creature: String = dogType
    override def eat = println("From Override method eat")
  }

  val dog2 = new Dog2("dog Type ")

  println(dog2.creature)

  // TYPE SUBSTITUTION

  val unknownAnimal : Animal = new DogNew("Type Substution")

  unknownAnimal.eat
  println(unknownAnimal.creature)


}
