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

>Encapsulation > privating the internal details of the class from outside user's who do not need to know how the class is implemented.

> * *Shallow copy* - an array copy of another array that references the same elements as in the first list.
> * With Immutable elements, shallow copies are moot.

> * *deep copy* - a copy of the original list but all elements have a different reference.

> This can be done from the copy module using the deepcopy() function.

> To produce an array of 8 elements with a value 0 we can do: counters= [0] *8, meaning all the cells in the list reference to the same object "0"

>Strings are represented as an array of characters and not an array of references. -> This is called a *Compact Array*, because the array is storing the bits that represent each character in the case of strings.
>> Advantages:
- overall memory usage will be much lower for a compact structure because there is no overhead (extra memory assigned just in case) devoted to the explicit storage of the sequence of memory references. 
- A referential strucutre will tipically use 64-bits for the memory address stored in the array, on top of whatever number of bits are used to represent the object that is considered the element.
- Also, each UNICODE character stored in a compact array within a string tipically requires 2 bytes. If each character were stored independentely as one-character string, there would be significantly more memory (bytes) used.

>How to declare an array in Python using Array module 
- primes= array('i',[2,3,4,5,6,7,8]) --- *i* > is a type code that designates the array as an array of signed integers, typically represented using at least 16-bits each integer.
- The *typecode* allows the interpreter to determine precisely how many bits are needed per element of the array.
- *Array module does not provide support for making compact arrays of user-defined data types*  
-- Example: stacks, queues, trees, linked lists, graphs, Hashmaps etc... This are not built in python data types.
> DATA TYPE Table in the book on page 191 

>The array module does not provide support for making compact arrays of user-defined data types. Compact arrays of such structures can be created with the lower-level support of a module named ctypes.

### Dynamic Arrays and Amortization 
>  When creating a low-level array in a computer system, the precise size of that array must be explicitly declared in order for the System to properly allocate a consecutive piece of memory for its storage.
