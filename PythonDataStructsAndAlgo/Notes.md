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
    > * *os module* -> provides robust tools for interacting with the operating system during execution of a program.
>> os.path.getsize(path) - return imemediate disk usage (measure in bytes) for the file or directory that is identified by the string *path* (eg. /user/rt/courses). 

>> os.path.isdir(path) - return True if entry designated by string path is a directory; False otherwise.

>> os.listdir(path) -Return a list of strings that are names of all entries within a directory designated by string *path*

>> os.path.join(path, filename) - Compose a path string name and filename string using an appropriate operating system separator between the two ("/" or "\\\"). Returning the string that represents the full path to the file.

> Linear recursion - if a recursive function is designed so that each invocation of the body makes at most one new recursive call, this is known as linear recursion.

> Multiple Recursion - process in which a function may take more than 2 recursive calls.

### Defining Recursive Algorithms 

>Test for base cases - there should be at least 1 base case. These base cases should be defined so that every possible chain of recursive calls will eventually reach a base case, and the handling of each base case.

>Recur - If not a base case, we perform one or more recursive calls. This recursive step may involve a test that decides which of several possible  recursive calls to make. We should define each possible recursive call so that it makes progress torwards a base case.

#### Parameterizing a recursion
> To design a good algorithm, it is useful to think of the different ways we might define the subproblems that have the same general structure as the original problem.

>Tail recursion - if any recursive call that is made from one context is the very last operation in that context, with the return value of the recursive call immediately returned by enclosing recursion.

# Array-Base Sequences
> list, tuple and str classes have in common the support of indexing to access individual elements of a sequence, and each uses a low-level concept known as an array to represent that sequence.

> * *Shallow copy* - an array copy of another array that references the same elements as in the first list.
> * With Immutable elements, shallow copies are moot.

> * *deep copy* - a copy of the original list but all elements have a different reference.

> This can be done from the copy module using the deepcopy() function.

> To produce an array of 8 elements with a value 0 we can do: counters= [0] *8, meaning all the cells in the list reference to the same object "0"

