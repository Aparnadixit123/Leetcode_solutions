class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
   if (a == e && !(c == a && isBetween(b, d, f))) {
            return 1;
        }

        if (b == f && !(d == b && isBetween(a, c, e))) {
            return 1;
        }

        if (Math.abs(c - e) == Math.abs(d - f)) {
            boolean rookOnDiagonal =
                Math.abs(a - c) == Math.abs(b - d) &&
                Math.abs(a - e) == Math.abs(b - f);

            boolean rookBetween =
                rookOnDiagonal && isBetween(c, a, e);

            if (!rookBetween) {
                return 1;
            }
                    }

        return 2;
    }

    private boolean isBetween(int x, int middle, int y) {
        return (x < middle && middle < y) || (y < middle && middle < x);
    }

    
}