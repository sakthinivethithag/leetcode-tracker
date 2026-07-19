// Last updated: 7/19/2026, 4:07:40 PM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        return((start[0]+start[1])%2)==((target[0]+target[1])%2);
    }
}