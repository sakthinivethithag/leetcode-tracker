// Last updated: 7/12/2026, 8:42:03 AM
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] start=startTime.split(":");
4        String[] end=endTime.split(":");
5        int startSeconds=Integer.parseInt(start[0])*3600 +Integer.parseInt(start[1])*60 +Integer.parseInt(start[2]);
6        int endSeconds=Integer.parseInt(end[0])*3600 +Integer.parseInt(end[1])*60 +Integer.parseInt(end[2]);
7        return endSeconds-startSeconds;
8        
9        
10    }
11}