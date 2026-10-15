import Derivacion ._
val f = (x:Double) => (x*x*x*x)
val g = (x: Double) => (x)
val cte= (x: Double) => 2.0
derivada(g)(2)

val h1 = derivadaDiv(f,g)
val h2 = derivadaSuma(f,g)
val h3 = derivadaMult(f,g)
val h4 = derivadaResta(f,g)


h1(-2)
h2(-2)
h3(-2)
h4(-2)
derivada(f)(5)
