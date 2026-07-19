-- Last updated: 7/19/2026, 4:41:22 PM
# Write your MySQL query statement below
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;