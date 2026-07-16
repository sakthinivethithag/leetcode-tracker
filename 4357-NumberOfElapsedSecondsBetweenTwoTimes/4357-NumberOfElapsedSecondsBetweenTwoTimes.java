// Last updated: 7/16/2026, 8:50:53 AM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start=startTime.split(":");
        String[] end=endTime.split(":");
        int startSeconds=Integer.parseInt(start[0])*3600 +Integer.parseInt(start[1])*60 +Integer.parseInt(start[2]);
        int endSeconds=Integer.parseInt(end[0])*3600 +Integer.parseInt(end[1])*60 +Integer.parseInt(end[2]);
        return endSeconds-startSeconds;
        
        
    }
}