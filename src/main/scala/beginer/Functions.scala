package beginer

object Functions extends  App {

  def aFunction (a: Int, b: Int): String = {
    a + " and " + b
  }

  println(aFunction(1,2))

  def aParmLessFunction() : Int = 42

  println(aParmLessFunction())

  println(aParmLessFunction)

  def aRepeatedFunction(aStr : String, n : Int ):String = {

    if(n == 1 ) aStr
    else
      aStr + aRepeatedFunction(aStr , n - 1)
  }

  println(aRepeatedFunction("Hello : ", 3 ))

  def greetFun(name : String , age : Int) : Unit = {
    println(s"Hi my name is $name , and my age is $age")
  }

  greetFun("Nilesh", 3 )

  def factorial(n : Int): Long = {

    if(n == 1 ) 1
    else n * factorial(n - 1 )
  }

  println(factorial(5))


  def fibbo(n : Int ): Long = {

    if(n <= 2 ) 1
    else fibbo(n -1 ) + fibbo(n - 2 )
  }

  println(fibbo(8))

  def isPrime ( n : Int ): Boolean =
  {
    def isPrimeUntil (t: Int ) : Boolean =
    if(t <= 1 ) true
    else n % t != 0 && isPrimeUntil(t - 1 )

    isPrimeUntil(n/2)
  }

  println(isPrime(9))
  println(isPrime(11))
}
