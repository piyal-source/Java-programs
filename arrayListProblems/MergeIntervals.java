//Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
//You may assume that the intervals were initially sorted according to their start times.
//
//Example 1:
//Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
//
//Example 2:
//Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
//This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
//
//Make sure the returned intervals are also sorted.

package arrayListProblems;

import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(8, 10));
        Interval newInterval = new Interval(1, 12);

        print(intervals);
        intervals = merge(intervals, newInterval);
        print(intervals);
    }

    static void print(ArrayList<Interval> intervals) {
        for(Interval i: intervals) {
            System.out.print(" [ " + i.start + " , " + i.end + " ] ");
        }
        System.out.println();
    }

    static ArrayList<Interval> merge(ArrayList<Interval> intervals, Interval newInterval) {
        if(newInterval.end < newInterval.start) {
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;
        }
        if(intervals == null) {
            intervals = new ArrayList<>();
            intervals.add(newInterval);
            return intervals;
        }
        if(intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }
        int i = 0;
        while (i < intervals.size()) {
            Interval current = intervals.get(i);
            if (newInterval.end < current.start) {
                intervals.add(i, newInterval);
                return intervals;
            }
            if(i == intervals.size()-1 && newInterval.start > current.end) {
                intervals.add(newInterval);
                return intervals;
            }
            if(newInterval.start <= current.end && newInterval.end >= current.start) {
                newInterval.start = Math.min(newInterval.start, current.start);
                newInterval.end = Math.max(newInterval.end, current.end);
                intervals.remove(current);
            }
            else {
                i++;
            }
        }
        intervals.add(newInterval);
        return intervals;
    }
}

class Interval {
    int start;
    int end;
    public Interval() {
        start = 0;
        end = 0;
    }
    public Interval(int s, int e) {
        start = s;
        end = e;
    }
}
