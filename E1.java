/*
when working with programs, we come up with different types of errors...
--syntactical errors (compilation errors)
--logical errors
--runtime errors, etc

when a runtime error occur, the system gathers the data related to the problem and stores 
in an object. such an object is known as an 'exception'. generally the runtime errors 
occur when there are some limitations in the resources to program.

when an exception is raised (when a runtime problem occur), the system terminates the 
program (current thread) abnormally to handle the exception. while terminating it prints 
the problem information(stack trace).

Java (and other OOP languages) provides a mechanism to solve (handle) the problems (exceptions),
with the keywords try, catch, throw, throws and finally. this mechanism is known as 
"exception handling"



*/
