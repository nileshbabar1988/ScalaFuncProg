package Part2OOP

object AbstractDataType extends  App {


  // abstract classes

  abstract class Animal {

    //abstract variable
    val cretureType : String

    //abstract method
    def eat : Unit

  }


  class Dog extends Animal{

    override val cretureType: String = "Canine "

    override def eat: Unit = println("Crunch ..... Crunch .... ")
  }

  val dog1 = new Dog

  println(dog1.cretureType)
  println(dog1.eat)

  trait Carnivore {

    def eat (animal: Animal) : Unit
  }

  class Crocodile extends Animal with Carnivore{

    val cretureType = "croc.. "

    override def eat: Unit = println("nom nom nommmmmmm .... ")

    override def eat(animal: Animal): Unit = println(s"I am a croc and i am eating ${animal.cretureType}")

  }

  val dog = new Dog

  val crod = new Crocodile

  crod.eat(dog)


}
