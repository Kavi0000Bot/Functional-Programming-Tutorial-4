import scala.compiletime.ops.string
@main def hello: Unit =

  def CheckInteger(input: => Int): String = input match {
    case input if input < 0      => "Negative"
    case input if input == 0     => "Zero"
    case input if input % 2 == 0 => "Even Number"
    case input if input % 2 != 0 => "Odd Number"
  }

  def InputNo() = {
    println("Enter your number: ")
    scala.io.StdIn.readInt()
  }

  println(CheckInteger(InputNo()))