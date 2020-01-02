package beginer

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION

  println(x)

  println( 2 + 3 * 4)

  println( 1 == x)

println(!(1 == x))

  val aCondition = true

  val a = if (aCondition == true) 5 else 3

  println(a)

  println(if (aCondition == true) 5 else 3 )

  var i = 0
  while (i <= 10 ){
    println(i)
    i += 1
  }

  println( 1 + 3 )

  val aWieredVal = ( i = 3)

  println(aWieredVal)

  val aCodeBlock = {

    val x = 3
    val y = 5

    if (x > 2) "Welcome " else "Good Bye"
  }

  println(aCodeBlock)


  "hello World"
  println("Hello World ")

  val someVal = {
    2 > 3
  }

  println(someVal)

  val someOtherVal = {
    if(someVal) 986 else 889
    42
  }

  println(someOtherVal)
}
