package beginer

object Recursion extends  App {

  def factorial(n : Int): Int = {
    if(n <= 1 ) 1
    else
      {
        println("Computing factorial of n :" + n +" , i first need factorial of n - 1 : " + (n-1))
        var res = n * factorial(n - 1 )
        println(" completed factorial of " + n)
        res
      }
  }

 // println(factorial(5000))

  def anotherFacto( n : BigInt):BigInt = {

    def factHelper(x : BigInt , acc : BigInt): BigInt=
    {
      if(x <= 1) acc
      else factHelper(x - 1, x * acc)
    }
    factHelper(n, 1)
  }

  println(anotherFacto(5000))


  def concatTRC (aString : String, n : Int, acc: String) : String = {
    if(n <= 0 ) acc
    else concatTRC(aString,n - 1 , acc)
  }

  concatTRC("Hello World !!! ", 3, "")


  def isPrime ( n: Int) : Boolean = {

    def isPrimeTrc ( t : Int, isStillPrime : Boolean) : Boolean =
      if (! isStillPrime) false
      else
          if (t <= 1 ) true
          else isPrimeTrc(t-1, n % t != 0 && isStillPrime)

    isPrimeTrc(n/2 , true)
  }

  println(isPrime(2003))
  println(isPrime(2004))

  def fibbo(n : Int) : Int = {

    def fibboTRC (i : Int, last : Int, next : Int): Int = {

      if (i >= n) last
      else fibboTRC(i + 1, last + next, last)
    }
      if(n <= 2 ) 1
      else fibboTRC(2,1,1)
    }
println(fibbo(9))


}
