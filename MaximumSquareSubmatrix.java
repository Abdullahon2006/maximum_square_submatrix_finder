public class MaximumSquareSubmatrix {

    public static int size(int[][] a)
    {
        int maxsq = 0;
        int length = a[0].length;
        boolean istrue = true;
        for (int i = 0; i < length; i++)
        {
            for (int j = 0; j < length; j++)
            {
                if (a[i][j] == 1)
                {
                    int lengthk = Math.min(length - j, length - i);
                    for (int k = 1; k < lengthk; k++)
                    {
                        for (int l = 0; l <= k; l++)
                        {
                            if (!((a[i + l][j + k] == 1) && (a[i + k][j + l] == 1)))
                            {
                                istrue = false;
                                break;
                            }
                        }

                        if (!istrue)
                        {
                            if (maxsq < k)
                            {
                                maxsq = k;
                            }
                            break;
                        }
                        else if (k + 1 == lengthk)
                        {
                            if (maxsq < k + 1)
                            {
                                maxsq = k + 1;
                            }
                        }
                    }
                    istrue = true;
                    if (maxsq < 1)
                    {
                        maxsq = 1;
                    }
                }
            }
        }
        return maxsq;
    }

    public static void main(String[] args)
    {
        int n = StdIn.readInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j < n; j++)
            {
                a[i][j] = StdIn.readInt();
            }
        }
        System.out.println(size(a));
    }
}
