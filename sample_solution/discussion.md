Between bubble sort and selection sort, how do they compare in efficiency...

1. ...on a random array?
   1. **Answer:** On a random array selection sort is generally faster. They both have a general case
   of quadratic time complexity O(n^2) but bubble sort does a swap at every comparison so the swaps end up
   taking most of the time. Remember that a _swap(a,b)_ means we have to 1. assign value _a_ temporary variable 2.
   assign value of _b_ to _a_ 3. assign value of temporary variable to _b_ which is three operations.
   Selection sort on the other hand only does a swap when it has iterated all elements.
1. ...on an already sorted array?
   1. **Answer:** Bubble sort will be faster as there will be no swaps and therefore it will
   stop after iterating the array once. In the algorithm we can see that iteration length
   is only dependent on array size so selection sort in its basic form always has the same
   amount of operations for arrays of same size. We could however modify it to make another
   version of selection sort that checks if array is sorted first and then terminates.
1. ...on a nearly sorted array?
   1. **Answer:** Bubble sort will once again be faster since it swaps adjacent elements,
   the chance of them ending up in the correct place is quite high when the array is nearly sorted.
   So the overhead of swapping at each comparison becomes less significant. Selection sort
   runs the same amount of operations as if the array was completely random as array setup
   does not matter, only its size.

> **Assistant's Note:**
> You could also ask the students which one is generally preferable. It should be
> selection sort as we more often encounter random arrays in the general case when
> there is a need to sort.