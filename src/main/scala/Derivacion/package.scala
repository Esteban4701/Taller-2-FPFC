package object Derivacion {
  private type funReal = Double => Double
  val h = 0.1

  def derivada(f: funReal): funReal = {
    def derivadaX(x: Double): Double = (f(x - 2 * h) - 8 * f(x - h) + 8 * f(x + h) - f(x + 2 * h)) / 12 * h
    derivadaX
  }

  def derivadaSuma(f: funReal, g: funReal): (Double, Double) => Double = {
    def derivadaSumaX(x1: Double, x2: Double): Double = {
      derivada(f)(x1) + derivada(g)(x1)
    }
    derivadaSumaX
  }

  def derivadaResta(f: funReal, g: funReal): (Double, Double) => Double = {
    def derivadaRestaX(x1: Double, x2: Double): Double = derivada(f)(x1) - derivada(g)(x1)
    derivadaRestaX
  }
  def derivadaMult(f: funReal, g: funReal): (Double, Double) => Double = {
    def derivadaMultX(x1: Double, x2: Double): Double = derivada(f)(x1) * g(x2) + derivada(g)(x2)*derivada(f)(x1)
    derivadaMultX
  }
  def derivadaDiv(f: funReal, g: funReal): (Double, Double) => Double = {
    def derivadaDivX(x1: Double, x2: Double): Double = {
      (derivada(f)(x1) * g(x2) - derivada(g)(x2) * derivada(f)(x1)) / (g(x2) * g(x2))
    }
    derivadaDivX
  }
}
