# Last updated: 10/6/2026, 4:26:17 PM
class Solution(object):
    def nearestDrone(self, drones, target):
        tx,ty=target
        min_dist=float('inf')
        ans=-1
        for i in range(len(drones)):
            x,y,r=drones[i]
            dist=abs(x-tx)+abs(y-ty)
            if dist<=r:
                if dist<min_dist:
                    min_dist=dist
                    ans=i
        return ans
        