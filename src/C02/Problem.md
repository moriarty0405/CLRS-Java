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
