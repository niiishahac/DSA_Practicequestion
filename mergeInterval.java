import java.util.List;
public class mergeInterval {
    public int[][] IntervalIntersection(int[][] intervals1,int[][] intervals2){
        List<int[]> result=new ArrayList<>();
        int i=0,j=0;
        while(i<intervals1.length && j<intervals2.length){
            int start=Math.max(intervals1[i][0],intervals2[j][0]);
            int end=Math.min(intervals1[i][1],intervals2[j][1]);
            if(start<=end){
                result.add(new int[]{start,end});
            }
            if(intervals1[i][1]>intervals2[j][1]){
                j++;
            }
            else{
                i++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args){
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] intervals2 = {{1,2},{5,10}};
        mergeInterval mi=new mergeInterval();
        int[][] intersection = mi.IntervalIntersection(intervals1, intervals2);
        for (int[] interval : intersection) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
    
}
