/**
 * The Eager Approach of UnionFind
 * Data Structure:
 * Integer array id[] of size N
 * Interpretation: p and q are connected if they have the same id
 *
 * the Union Find is extremely expensive, take N^2 accesses for an array of size N
 * QUADRATIC ALGORITHMS DOESN'T SCALE
 */
package UnionFind;

public class QuickFind{
    private int[] id;
    private int arraysize;

    /**
     * constructor to initialize the id Array
     * @param N the maximum id
     */
    public QuickFind(int N){
        id = new int[N];
        arraysize = N;
        for (int i=0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * checking if two nodes are connected
     * @param p id of Node 1
     * @param q id of Node 2
     * @return true if the two nodes have equal id, false otherwise
     */
    public boolean connected(int p, int q){
        if (id[p] == id[q]) {
            return true;
        }
        else return false;
    }

    /**
     * connect two node group
     * @param p id of Node 1
     * @param q id of Node 2
     */
    public void union(int p, int q){
        id[q] = id[p];
        for (int i = 0; i < arraysize; i ++) {
            if (connected(q, i)) {
                id[i] = id[q];
            }
        }
    }
}
