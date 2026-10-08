package object Derivacion {
  private type funReal = Double => Double
  val h = 0.1

  def derivada(f: funReal): funReal = {
    def derivadaX(x: Double): Double = (f(x - 2 * h) - 8 * f(x - h) + 8 * f(x + h) - f(x + 2 * h)) / 12 * h
    derivadaX
  }

  def derivadaSuma(f: funReal, g: funReal): funReal = {
    def derivadaSumaX(x: Double): Double = {
      derivada(f)(x) + derivada(g)(x)
    }
    derivadaSumaX
  }

  def derivadaResta(f: funReal, g: funReal): funReal = {
    def derivadaRestaX(x: Double): Double = {
      derivada(f)(x) - derivada(g)(x)
    }
    derivadaRestaX
  }
  def derivadaMult(f: funReal, g: funReal): funReal = {
    def derivadaMultX(x: Double): Double = derivada(f)(x) * g(x) + derivada(g)(x)*derivada(f)(x)
    derivadaMultX
  }
  def derivadaDiv(f: funReal, g: funReal): funReal = {
    def derivadaDivX(x: Double): Double = {
      (derivada(f)(x) * g(x) - derivada(g)(x) * derivada(f)(x)) / (g(x) * g(x))
    }
    derivadaDivX
  }
}
