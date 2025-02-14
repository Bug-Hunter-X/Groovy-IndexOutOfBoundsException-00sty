def list = [1, 2, 3, 4, 5]

// Safe navigation operator
println list?.getAt(5) ?: "Index out of bounds"

// Check index bounds
if (5 < list.size()) {
    println list[5]
} else {
    println "Index out of bounds"
}