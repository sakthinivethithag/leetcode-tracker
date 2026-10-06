// Last updated: 10/6/2026, 4:28:04 PM
class Solution {
    public double angleClock(int hour, int minutes) {
        double minuteAngle=minutes*6.0;
        double hourAngle=(hour%12)*30.0+minutes*0.5;
        double diff=Math.abs(hourAngle-minuteAngle);
        return Math.min(diff,360.0-diff);
        
    }
}