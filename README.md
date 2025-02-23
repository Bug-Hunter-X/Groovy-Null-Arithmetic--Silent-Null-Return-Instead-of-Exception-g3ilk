# Groovy Null Arithmetic: Silent Null Return

This example demonstrates a common pitfall in Groovy: the silent return of null when performing arithmetic operations with null values.  Unlike some languages that might throw a `NullPointerException`, Groovy simply returns null.

This can be problematic if you're not expecting this behavior, leading to unexpected null results and potential bugs.  The solution shows how to explicitly handle these cases to prevent errors.

**Bug:** The `myMethod` function returns `null` when either `a` or `b` is `null`, rather than throwing an exception or providing alternative behavior.

**Solution:** The solution incorporates null checks and handles the case where one or both inputs are null using more appropriate error handling. 
