# Maximum Square Submatrix Finder

## What This Program Does

This Java program finds the largest square block of 1s in any given n×n matrix of 0s and 1s. It's useful for analyzing binary data patterns in fields like image processing and database systems.

## Key Features

- Finds largest contiguous square submatrix of 1s
- Efficient O(n²) dynamic programming solution
- Handles matrices of any reasonable size
- Simple command-line interface

## How to Use

1. Prepare your input file (example: `matrix.txt`):
   ```
   4
   1 0 1 1
   1 1 1 1
   1 1 1 0
   0 1 0 1
   ```

2. Compile the program:
   ```bash
   javac MaximumSquareSubmatrix.java
   ```

3. Run with your input file:
   ```bash
   java MaximumSquareSubmatrix < matrix.txt
   ```

## Example Outputs

```bash
$ java MaximumSquareSubmatrix < square6.txt
3

$ java MaximumSquareSubmatrix < square7.txt
4
```

## How It Works

1. **Dynamic Programming Approach**:
   - Creates a duplicate size matrix
   - For each cell (starting from (1,1)):
     - If original cell is 1, takes minimum of top, left, and top-left neighbors + 1
     - Tracks maximum size found

2. **Efficiency**:
   - Single pass through matrix: O(n²) time
   - Uses O(n²) additional space
   - Much faster than brute-force O(n⁴) approach

## Performance

- Handles 1000×1000 matrices in seconds
- Optimal solution for the problem
- Scales well with increasing matrix size

## Real-World Applications

- Image processing (finding objects in binary images)
- Database analysis (pattern recognition)
- Computer vision
- Job interview coding challenges

## Limitations

- Requires square matrix input
- Only works with binary (0/1) values
- Returns size only (not coordinates of submatrix)

This implementation provides an optimal solution to a classic computer science problem using dynamic programming techniques.
