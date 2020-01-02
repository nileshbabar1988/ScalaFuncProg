package Part2OOP

object PracticeExample1 extends App {

  val writer = new Writer("Chetan", "Bhagat", 1960)
  println(writer.fullName())

  val novel = new Novel("2 States", 2009, writer)

  println(novel.autherAge())

  println(novel.isWrittenBy(writer))
  println(novel.relYear())
  println(novel.copy(2012).autherAge())
  println(novel.relYear())

}

class Writer ( val firstName : String , val surname : String , val age : Int ) {

  def fullName () : String ={
    this.firstName + " , " + this.surname
  }
}


class Novel ( name : String, yrOfRel : Int, auther : Writer) {

  def autherAge () : Int = {
    yrOfRel - auther.age
  }

  def isWrittenBy (auther : Writer)  = {
    //this.name + " is written by " + this.auther.fullName()
    auther == this.auther
  }
  def relYear () = {
    yrOfRel
  }

  def copy ( newYrOfRel : Int ): Novel ={
  new Novel(name, newYrOfRel, auther)
    //this.yrOfRel = newYrOfRel
  }
}