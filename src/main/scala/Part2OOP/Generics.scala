package Part2OOP

import com.sun.tools.internal.xjc.generator.bean.DualObjectFactoryGenerator

object Generics extends  App {

  //generic class
  class MyList[A]{
    // use type A here
  }

  class MyMap[Key , Value]{}

  val myIntList = new MyList[Int]
  val myStringList = new MyList[String]


  // GENERIC METHODS
  object MyList{
    def empty[A] : MyList[A] = ???
  }

  val myListOfGenericClass = new MyList[Int]


  // variance problem

  class Animal
  class Dog extends Animal
  class Cat extends Animal

  // 1. COVARIANCE --> LIST[CAT] extends LIST[Animal]
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // animalList.add(Dog)

  //2. INVARIANCE
  class Invariance[A]
  val invariantAnimalList : Invariance[Animal] = new Invariance[Animal]

  //3. CONTRAVARIANCE
  class Trainer[-A]
  val trainer : Trainer[Dog] = new Trainer[Animal]


}
