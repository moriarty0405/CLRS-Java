### Problems 1 : Insertion sort on small arrays in merge sort
***
Although merge sort runs in $\Theta(n\lg n)$ worst-case time and insertion sort runs in $\Theta(n^2)$ worst- case time, the constant factors in insertion sort make it faster for small n. Thus, it makes sense to use insertion sort within merge sort when subproblems become sufficiently small. Consider a modification to merge sort in which n/k sublists of length k are sorted using insertion sort and then merged using the standard merging mechanism, where k is a value to be determined.

a. Show that the n/k sublists, each of length k, can be sorted by insertion sort in $\Theta(nk)$ worst-case time.

b. Show that the sublists can be merged in $\Theta(n\lg (n/k))$ worst-case time.

c. Given that the modified algorithm runs in $\Theta(nk+n\lg (n/k))$ worst-case time, what is
the largest asymptotic ($\Theta$-notation) value of k as a function of n for which the modified
algorithm has the same asymptotic running time as standard merge sort?

d. How should k be chosen in practice?

### `Answer`
a. For the subliest wiht lenth of k, the insertion sort could run with $\Theta(k^2)$, for all n/k sublists, the total running turns to be
\[
  T=n/k * \Theta(k^2)=\Theta(nk)
\]

b. It takes $\lg (n/k)$ times to merge, thus merge sort costs $n\lg (n/k)$ to sort the elements.

c. When $nk=n\lg n$, i.e., $k=\lg n$.

d. Comparing $n^2$ and $n\lg n$ given the size of n.

### Problems 2 : Correctness of bubblesort
***
Bubblesort is a popular sorting algorithm. It works by repeatedly swapping adjacent elements that are out of order.

### `Answer a`
We need to confirm that all the elements are kept in the original array.

### `Answer d`
The complexity is $\Theta(n^2)$.

### Problems 3 : Correctness of Horner's rule
***
### `Answer a`
The complexity is $\Theta(n)$.

### `Answer b`
	y = 0
	for i = 0 to n
    	m = 1
    	for k = 1 to i
        	m = m·x
    	y = y + aᵢ·m
The complexity is $\Theta(n^2)$.

### Problems 4 : Inversions
### `Answer a`
<2,1>, <3,1>, <8,1>, <6,1>, <8,6>

### `Answer b`
Array <n, n-1,...,2,1> has the most inversions, the number is $\frac{n(n-1)}{2}$.

### `Answer c`
The number for exchange positions in insertion sort equals to the number of the inversions.

### `Answer d`
[code](./Inversion.java)
