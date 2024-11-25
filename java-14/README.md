# Java 14 Features
1.Records (Preview)

    Records provide a compact syntax for declaring classes that are transparent holders for shallowly immutable data.
    A record automatically provides implementations for equals(), hashCode(), and toString().
   
    Differnce Between class and Record:

    Class: Requires explicit definitions of constructors, equals(), hashCode(), and toString() methods 
            if you need them.
            Can be mutable or immutable depending on how you define it.
            Supports inheritance and can extend other classes or be extended by other classes.
            You can define any methods, additional constructors, and business logic.

    Record: Automatically generates constructors, equals(), hashCode(), and toString() methods.
            Designed to be immutable. Fields are implicitly final, and you cannot provide setter methods
            Cannot extend other classes. However, records can implement interfaces.
            You can still define custom methods and constructors, but the primary constructor is fixed. You can add custom constructors, 
            but the record must remain immutable.

2. Text Blocks (Second Preview)
    
        Text blocks simplify the process of writing multi-line strings by avoiding most of the escape sequences.

          Key Features of Text Blocks
           Multi-line Strings: Easily write strings that span multiple lines.
           Minimal Escape Sequences: Avoid using escape sequences for most characters.
           Automatic Formatting: Maintain the visual structure of the text as written in the source code.
           Flexible Indentation: Allow indentation to be handled consistently with the surrounding code.
3. Pattern Matching for instanceof (Preview)