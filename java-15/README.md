# Java 15 Features

1. Sealed Classes (Preview)
        
        Sealed classes allow you to restrict which classes can extend or implement them. 
        This provides more control over the inheritance hierarchy.

         Declaration: A class or interface is declared as sealed using the sealed keyword. Along with this, the permits clause specifies which classes are allowed to extend or implement the sealed class/interface.
         Permitted Subclasses: The classes listed in the permits clause must be in the same module or package as the sealed class/interface.
         Subclasses: The permitted subclasses must be one of the following:
         final: No further subclassing is allowed.
         sealed: The subclass can itself define a sealed hierarchy.
         non-sealed: The subclass is open for extension by any other class.
2. Records (Second Preview)
3. Text Blocks (Standard)
4. Hidden Classes

        Hidden classes are intended for use by frameworks that generate classes 
       at runtime and are not intended to be used directly by the bytecode of other classes.
5. Pattern Matching for instanceof (Second Preview)
6. Edwards-Curve Digital Signature Algorithm (EdDSA)
7. Foreign-Memory Access API (Second Incubator)