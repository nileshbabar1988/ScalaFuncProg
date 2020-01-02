package beginer

object CallBVCallBN extends App{
  def callByValue (x : Long) : Unit = {
    println(" CALL BY VALUE :: " + x)
    println(" CALL BY VALUE :: " + x)

  }

  def callByName (x : => Long) : Unit = {
    println(" CALL BY NAME :: " + x)
    println(" CALL BY NAME :: " + x)

  }

  callByName(System.nanoTime())

  callByValue(System.nanoTime())

}
