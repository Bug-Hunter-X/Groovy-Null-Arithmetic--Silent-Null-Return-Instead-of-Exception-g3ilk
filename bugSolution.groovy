```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Inputs cannot be null")
  }
  return a + b
}

try {
  println myMethod(null, 5) 
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.getMessage()
}

try {
  println myMethod(5, null)
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.getMessage()
}
println myMethod(5, 5) // Output: 10
```