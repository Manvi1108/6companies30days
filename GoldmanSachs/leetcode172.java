package GoldmanSachs;

public class leetcode172 {
    public int trailingZeroes(int n) {
        int c = 0;
        while(n>0)
        {
            n /= 5;
            c += n;
            
        }
        return c;     
    }
}
