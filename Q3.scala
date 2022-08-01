import scala.compiletime.ops.string
@main def hello: Unit =

  def toUpper(input: String): String = input.toUpperCase()

  def toLower(input: String): String = input.toLowerCase()

  def firstTwoUpper(input: String): String =
    toUpper(input.substring(0, 2)) + toLower(input.substring(2, input.length()))

  def firstAndLastUpper(input: String): String =
    toUpper(input.substring(0, 1)) + toLower(
      input.substring(1, input.length() - 1)
    ) + toUpper(input.substring(input.length() - 1, input.length()))

  def formatNumber(input: String, format: String => String): String = format(
    input
  )

  println(formatNumber("Benny", toUpper))
  println(formatNumber("Niroshan", firstTwoUpper))
  println(formatNumber("Saman", toLower))
  println(formatNumber("Kumara", firstAndLastUpper))