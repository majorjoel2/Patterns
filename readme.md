Pokeball
==============

Task:
---------

Write a program that outputs the following:

       @@@@@@@
      @@@@@@@@@@
     @@@@@@@@@@@
    @@@@@@@@@@@@
    |||||||||[“”””]|||||||||
    |||||||||[…….]|||||||||
    OOOOOOOOOOOOOOOOO
     OOOOOOOOOOOOOOO
      OOOOOOOOOOOOO
       OOOOOOOOOO

Rules/Notes:
--------------
Each line can be output with a call to println

Pikachu
===========

Task:
---------

Write a static method within Pikachu class that outputs the following:

     (\__/) 
     (o^.^) 
    z(_(“)(“)
    
Rules/Notes:
---------------

The static method should return one string. Use \n in the string to jump to the next line.





Countdown
===============

Task:
-----------

You have to write a function **pattern** which returns the following Pattern(See Pattern & Examples) 
up to **n** number of rows.

* Note: **Returning** this pattern is not the same as **Printing** the pattern.

Rules/Note:
--------------

* if **n < 1** then it should return "" i.e. empty string.
* There are **no whitespaces** in the pattern

Pattern:
-----------

````
    (n)(n-1)(n-2)(n-3) ... 4321
    (n-1)(n-2)(n-3) ... 321
    (n-2)(n-3) ... 21
    (n-3) ... 1
````
 
Examples:
---------------
* pattern(4)
````
    4321
    321
    21
    1
````

* pattern(10)
````
    10987654321
    987654321
    87654321
    7654321
    654321
    54321
    4321
    321
    21
    1
````

**Hint: Use \n in the string to jump to the next line**
