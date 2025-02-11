```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): Option[T] = {
    if (x == value) {
      Some(x)
    } else {
      None
    }
  }
}

object Main extends App {
  val myInstance = new MyClass[Int](5)
  println(myInstance.myMethod(5)) // Some(5)
  println(myInstance.myMethod(6)) // None
}
```