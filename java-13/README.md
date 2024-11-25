# Java 13 Features

1 Text Blocks (Preview)

    Text blocks were introduced as a preview feature, allowing developers to write multi-line string literals 
    more easily. They provide a more readable and convenient way to work with strings that span multiple lines, 
    which is especially useful for JSON, HTML, XML, and SQL.

2 Switch Expressions (Second Preview)

    Arrow Syntax (->) and yield Keyword:

    You can use the -> syntax for both traditional switch statements and the new switch expressions.
    The yield keyword was introduced to return a value from a switch expression, making it clearer and 
    more intuitive than using break with a value.

    Multiple Labels:
    
    Multiple case labels can be combined using commas, reducing redundancy.
    Enhanced Control Flow:

    case labels can now be used with -> for expressions and with : for traditional block statements.
3  Reimplement the Legacy Socket API

    Java 13 included an update to the legacy socket API, replacing the underlying implementation with a more
    modern, maintainable, and performant approach without changing the API itself. 
    This change is internal and mostly transparent to developers but can result in performance 
    improvements and better maintainability.

4  Dynamic CDS Archives

    Java 13 introduced the ability to create dynamic class-data sharing (CDS) archives at the end of application 
    execution. This feature improves startup time and reduces footprint by allowing the JVM to archive classes 
    during execution and use them in subsequent launches.

5 ZGC: Uncommit Unused Memory

    The Z Garbage Collector (ZGC) was enhanced to return unused memory to the operating system more promptly, 
    improving memory usage efficiency. This change is beneficial for applications that have varying memory
    requirements over time

6  Application Class-Data Sharing (AppCDS)

    Application class-data sharing was improved, making it easier to use and more efficient. 
    It allows application classes to be placed in shared archives to reduce startup time and memory footprint.

7  FileSystems.newFileSystem() Method

    The FileSystems.newFileSystem() method was added to the java.nio.file package, making it easier 
    to create new file system instances. This enhancement provides a more flexible way to work with 
    different file systems.