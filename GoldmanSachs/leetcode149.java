package GoldmanSachs;
import java.util.*;
public class leetcode149 {
    public int maxPoints(int[][] points) {
        int ans = 0;
        for (int i = 0; i<points.length; ++i){
            Map<Double, Integer> mp = new HashMap<>();
            for (int  j = i+1; j<points.length; ++j){
                double s;
                if (points[i][0] == points[j][0])
                    s = Double.MAX_VALUE;
                else{
                    s = (points[i][1] - points[j][1]) / ((double) (points[i][0] - points[j][0]));
                    if (s == -0.0)
                        s = 0.0;
                }
                mp.put(s, mp.getOrDefault(s, 0) + 1);
                ans = Math.max(ans, mp.get(s));
            }
        }
        return ans+1;
    }
}
