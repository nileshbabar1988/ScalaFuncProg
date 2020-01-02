package beginer

object DefaultArgs  extends App {

def trFact (n : Int , acc : Int = 1) : Int =
  if (n <= 1 ) acc
  else trFact(n-1, n*acc)

//  val facto = trFact(10,1)

  println(trFact(10,1))

  println(trFact(10))


}
