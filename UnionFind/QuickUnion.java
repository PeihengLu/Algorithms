/**
 * the Lazy approach
 * data structure:
 * Integer Array id[] of size N
 * Interpretation: id[i] is parent of i
 * Root of i is id[id[id[...id[i]...]]] (util id[i] doesn't change anymore)
 *
 * Find: Check if p and q has the same root
 * Union: to merge components containing p and q, set the id of p's root to the id of
 * q's root. We made the union by changing only one value of the array.
 */

package UnionFind;

public class QuickUnion {
    private int[] id;
    private int arraySize;

    /**
     * constructor to initialize an array of size N
     * @param N the size of the array
     */
    public QuickUnion(int N){
        id = new int[N];
        arraySize = N;
        for (int i = 0; i < N; i ++) {
            id[i] = i;
        }
    }

    /**
     * find the root of a node with id p
     * @param p the node whose root is to search for
     * @return the root of node p
     */
    public int root(int p){
        int root = id[p];
        for (int i = p; i != id[p]; p = id[p]) {
            root = id[p];
        }
        return root;
    }

    /**
     * check if two nodes have the same root
     * @param p id of Node 1
     * @param q id of Node 2
     * @return
     */
    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    /**
     * connect two union groups
     * @param p id of Node 1
     * @param q id of Node 2
     */
    public void union(int p, int q) {
        id[root(q)] = root(p);
    }
}
