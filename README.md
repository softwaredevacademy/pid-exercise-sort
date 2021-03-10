# Sorting
Your task here is to implement two different sorting algorithms and to compare them based on their performance.

#### Recommended reading
- [Selection Sort](https://www.youtube.com/watch?v=g-PGLbMth_g)
- [Bubble Sort Visualization](https://www.youtube.com/watch?v=yIQuKSwPlro)

## Let's get sorting
We may not have our lives sorted out, but we can sort other things out like lists and arrays. By now you should have
heard of bubble sort and selection sort which are two well-known algorithms for sorting. Let's start with selection
sort.

### Selection sort
This one is pretty straightforward and probably the one we use naturally. Imagine you have 15 pet elephants, and
you're about to take your yearly family photo with them (to you these elephants are like family of course). Before
you take the photo however you want to arrange them in order of their length – the shortest elephant to the left
of the photo and the longest one to the right. What do you do? Well, you look through them all, find the shortest
one and place it to the far left. Next you look through them all again and find the second shortest elephant and place it
on the second place from the left. You continue like this until they are all in order which leads to two things:
- You have a stunning photo of your elephant family.
- You have just performed a real life selection sort.

To further help you understand how it works, here's a visualization of it (borrowed without asking from Wikipedia):

![Selection sort](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)

Another convenient way to describe an algorithm is by using a so called **pseudocode**:
> In computer science, **pseudocode** is a plain language **description of the steps in an algorithm** or another system. 
> Pseudocode often uses structural conventions of a normal programming language, but is intended for human reading 
> rather than machine reading. It typically omits details that are essential for machine understanding of the algorithm,
> such as variable declarations and language-specific code.

Here is an example of pseudocode of selection sort different to the one you received earlier. As you can see there
isn't really a strict specification as to how pseudocode should look:

```python
Selection Sort (A)
------------------
1   for i = 0 to A.length - 1
2       min = i
3       for j = i + 1 to A.length - 1
4           if A[j] < A[min]
6               min = j
7       temp = A[i]
8       A[i] = A[min]
9       A[min] = temp
```
#### Exercise 1
If you take a look at the given files in `src`, you will find a class called `SelectionSort`. It contains an
unimplemented method `sort` which is supposed to sort an integer array. Finish the method implementation using
the selection sort algorithm. When you are done you can make sure it works by running `SelectionSortTest`. You can
run an individual test via Gradle by using the command: `gradle test --tests pid.exercise.sort.SelectionSortTest`

### Bubble sort
Bubble sort is an even cooler sorting technique that is fairly easy to implement although not as naturally 
occurring as selection sort. Selection sort works by comparing elements in pair and
swapping them when the left hand side element is larger than the right hand side element and repeating the process
until there are no more swaps to make. It's way harder to properly explain this via text so let's just skip to the
good stuff, here's the visualization (once again 'borrowed' from Wikipedia):

![Bubble sort](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

If needed, revisit the video linked above in [recommended reading](#recommended-reading).

If you prefer a weirder and slightly unsettling animation, here you go: 

[Sorting Algorithms - Chapter 1 - Bubble Sort 3D Animation](https://www.youtube.com/watch?v=NiyEqLZmngY)

#### Exercise 2
By now, it should be clear what you are to do. Yes, just like the previous exercise you are to implement the `sort`
method but this time for the `BubbleSort` class. Run the tests when you are done and make sure they show green!

### What about Java's sort?
At some point in time you might have noticed that Java actually comes with a built-in sorting methods like 
`Collections.sort` or `Arrays.sort` that just work. We don't quite know how they work, but we do suspect that 
whatever magic is going on inside, it's probably more efficient than our implementations.

#### Exercise 3
For either `Collections.sort` (or `Arrays.sort`) you are to find out which sorting algorithm is being used.
Head on out to your most trusted source of documentation to find the answer, it could be a good idea to look 
for [source code](https://github.com/openjdk).
> **Assistant's Note:**
> The Java specification is not always strict with how certain methods should be implemented and you may therefore
> find different implementations in different types/versions of a JDK. For this reason it would be a good idea to
> state which JDK version and type it is that you have found the answer for. (ex. openjdk 15)

#### Bonus Exercise 4 (Optional)
Now that you know what algorithm is behind Java's sort, it is time to put it to the test. You have been given
an `IntArrayGenerator` class which generates arrays of random integers. Use this class to create a really large
array (ca 100000 elements) and take the time using Java's `System.nanoTime` or `System.currentTimeMillis` 
([see usage here](https://www.logicbig.com/how-to/code-snippets/jcode-java-system-nanotime.html)). Time
should be taken for your implementation of selection sort, your implementation of bubble sort and with
`Arrays.sort`. Let them use equal size arrays, write down the size of your array and the time taken for each sort.

#### Discussion
Between bubble sort and selection sort, how do they compare in efficiency...
1. ...on a random array?
1. ...on an already sorted array?
1. ...on a nearly sorted array?
