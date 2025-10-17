Problem:

The N-Queens puzzle is to place n queens on an n x n chessboard so that no two queens attack each other.
Return all distinct solutions to the n-queens puzzle.
Each solution contains a distinct board configuration of the queens’ placement.


---

✅ Example:

Input: n = 4
Output:

[
 [".Q..",
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",
  "Q...",
  "...Q",
  ".Q.."]
]


---

💡 Approach:

We’ll use Backtracking:

1. Place queens row by row.


2. For each row, try all columns.


3. Check if placing a queen is safe:

No other queen in same column.

No other queen on diagonals.



4. If all queens placed successfully → store the solution.

# LeetCode-Hard---N-Queens-Problem-in-java
