package GoldmanSachs;

public class leetcode593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] arr= new int[6];
        arr[0]= (int)Math.pow(p1[1]-p2[1],2) + (int)Math.pow(p1[0]-p2[0],2);
        arr[1]= (int)Math.pow(p2[1]-p3[1],2) + (int)Math.pow(p2[0]-p3[0],2);
        arr[2]= (int)Math.pow(p3[1]-p4[1],2) + (int)Math.pow(p3[0]-p4[0],2);
        arr[3]= (int)Math.pow(p4[1]-p1[1],2) + (int)Math.pow(p4[0]-p1[0],2);
        arr[4]= (int)Math.pow(p1[1]-p3[1],2) + (int)Math.pow(p1[0]-p3[0],2);
        arr[5]= (int)Math.pow(p2[1]-p4[1],2) + (int)Math.pow(p2[0]-p4[0],2);

        int countS=0, countD=0, min=arr[0];
        for(int i=1;i<6;i++)
            min= Math.min(arr[i],min);
        for(int i=0;i<6;i++){
            if(arr[i]==min)
                countS++;
            else if(arr[i]== 2*min)
                countD++;
        }
        return countS==4 && countD==2;
    }
}
