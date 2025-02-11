# Scala: Exception for Flow Control
This repository demonstrates a common error in Scala programming: using exceptions for normal flow control, rather than exceptional circumstances.  The original code throws an exception if the input to `myMethod` doesn't match the object's internal value.  This is inefficient and makes the code harder to read and maintain. The solution demonstrates a better approach using an `Option` to handle the case where the input is not equal to the internal value.

## Problem
The `MyClass.myMethod` function throws an exception if the input value doesn't match the internal value. This is inefficient and makes error handling cumbersome.