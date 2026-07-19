-- Last updated: 7/19/2026, 4:41:24 PM
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;