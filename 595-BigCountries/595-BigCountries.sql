-- Last updated: 7/19/2026, 4:41:25 PM
# Write your MySQL query statement below
SELECT
    name,
    population,
    area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;