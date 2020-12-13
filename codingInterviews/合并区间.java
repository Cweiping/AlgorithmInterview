/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
/*
题目描述
给出一组区间，请合并所有重叠的区间。
示例1
输入
[[10,30],[20,60],[80,100],[150,180]]
返回值
[[10,60],[80,100],[150,180]]
 */
import java.util.*;
import java.lang.*;
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result= new ArrayList<Interval>();
        Collections.sort(intervals, (o1, o2) -> o1.start != o2.start ? o1.start - o2.start : o1.end - o2.end);
        result.add(intervals.get(0));
        for (int i=1;i<intervals.size();i++){
            Interval l = result.get(result.size()-1);
            Interval r = intervals.get(i);
            if (l.end>=r.start){
                result.set(result.size()-1,new Interval(l.start,r.end));
            }else{
                result.add(r);
            }
        }
        return result;
    }
}