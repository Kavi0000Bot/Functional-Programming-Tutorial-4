@main def hello: Unit =

  def Interest(deposit: Double): Double = if (deposit <= 20000) {
    deposit * 2 / 100
  } else if (deposit <= 200000) {
    deposit * 4 / 100
  } else if (deposit <= 2000000) {
    deposit * 3.5 / 100
  } else {
    deposit * 6.5 / 100
  }
