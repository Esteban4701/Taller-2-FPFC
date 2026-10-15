import Derivacion.{derivada, derivadaDiv, derivadaMult, derivadaResta, derivadaSuma}
// ==========================================
// 1. DERIVADA NUMÉRICA (FÓRMULA DE CINCO PUNTOS)
// ==========================================
println("=== derivada ===")
println(derivada((x: Double) => 7.0)(3.0))               
println(derivada((x: Double) => 3 * x + 2)(-2.0))      
println(derivada((x: Double) => x * x + 4 * x)(2.0))      
println(derivada((x: Double) => x * x * x - 2 * x)(3.0))   
println(derivada((x: Double) => x * x * x * x)(2.0))      


// ==========================================
// 2. DERIVADA DE UNA SUMA
// ==========================================
println("\n=== derivadaSuma ===")
println(derivadaSuma((x: Double) => x * x + 3 * x + 1, (x: Double) => 2 * x + 5)(2.0)) 
println(derivadaSuma((x: Double) => x * x * x - 2 * x, (x: Double) => x + 4)(2.0))    
println(derivadaSuma((x: Double) => 4 * x * x, (x: Double) => x * x - 3 * x)(-1.0))   
println(derivadaSuma((x: Double) => 5 * x + 8, (x: Double) => 7 * x - 2)(4.0))        
println(derivadaSuma((x: Double) => 6.0, (x: Double) => x * x + 1)(-3.0))    


// ==========================================
// 3. DERIVADA DE UNA RESTA
// ==========================================
println("\n=== derivadaResta ===")
println(derivadaResta((x: Double) => x * x + 3 * x + 1, (x: Double) => 2 * x + 5)(2.0)) 
println(derivadaResta((x: Double) => x * x * x - 2 * x, (x: Double) => x + 4)(2.0))    
println(derivadaResta((x: Double) => 4 * x * x, (x: Double) => x * x - 3 * x)(-1.0))  
println(derivadaResta((x: Double) => 5 * x + 8, (x: Double) => 7 * x - 2)(4.0))        
println(derivadaResta((x: Double) => 6.0, (x: Double) => x * x + 1)(-3.0))              


// ==========================================
// 4. DERIVADA DE UN PRODUCTO
// ==========================================

println("\n=== derivadaMult ===")
println(derivadaMult((x: Double) => x * x + 1, (x: Double) => x + 2)(1.0))             
println(derivadaMult((x: Double) => x * x + 3 * x + 1, (x: Double) => 2 * x + 5)(1.0)) 
println(derivadaMult((x: Double) => x * x * x - 2 * x, (x: Double) => x + 4)(2.0))     
println(derivadaMult((x: Double) => 3 * x + 1, (x: Double) => x * x + 2)(-1.0))        
println(derivadaMult((x: Double) => 5.0, (x: Double) => x * x + 1)(3.0))              


// ==========================================
// 5. DERIVADA DE UN COCIENTE
// ==========================================

println("\n=== derivadaDiv ===")
println(derivadaDiv((x: Double) => x * x + 1, (x: Double) => x + 2)(1.0))              
println(derivadaDiv((x: Double) => x * x + 3 * x + 1, (x: Double) => 2 * x + 5)(1.0))
println(derivadaDiv((x: Double) => x * x * x - 2 * x, (x: Double) => x + 4)(2.0))     
println(derivadaDiv((x: Double) => 3 * x + 1, (x: Double) => x * x + 2)(-1.0))         
println(derivadaDiv((x: Double) => 5.0, (x: Double) => x * x + 1)(2.0))               
