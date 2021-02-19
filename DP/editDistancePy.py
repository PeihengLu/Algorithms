# Array-based Implementation
# The first implementation we will attempt is the straightforward dynamic programming algorithm
# we developed in class, where we fill all entries within two (m + 1) × (n + 1) arrays/tables d
# and a in order of increasing row index i (and within that row, in order of increasing column
# index j). You should define this function as

def edit_dyn(s, t):
    