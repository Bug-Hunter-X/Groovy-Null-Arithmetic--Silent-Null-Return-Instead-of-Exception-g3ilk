```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null
  }
  return a + b
}

println myMethod(null, 5) //Output: null
println myMethod(5, null) // Output: null
println myMethod(5,5) // Output: 10
```