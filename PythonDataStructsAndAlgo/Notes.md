# RECURSION 

## Recursion
    >  - technique by which a function makes one or more calls to itself during execution
    > - or by which a data structure relies upon smaller instances of the very same type of structure in its representation. 

## Recursion Trace 
> In Python, each time a function (recursive or not) is called, a structure known as *activation record or frame* is created to store information about the progress of that invocation of the function.
    > - This activation record includes a name space for storing the function's call parameters and local variables, and information about which command in the body of the function is currently executing.
    >> When the exection of a function leads to a nested function call (recursion) the execution of the former call is suspended and its activation record stores the place in the source code at which the flow control should continue upon return of the nested call.

## File system for a computer:
> has a recursive structure in which directories can be nested arbitrarly deeply within other directories.
> Recursive algorithms are widely used to explore and manage this file systems.
    
>  Modern OS define file-system directories in a recursive way. A file systems consists of a top-level directory (example: "root directory") and the contents of this directory consist of files and other directories, which in turn can contain files and other directories.

> Many common behaviors of an OS such as copying a directory or deleting a directory, are implemented using recursive algorithms.

> ### Python OS module
    > * *os module* 