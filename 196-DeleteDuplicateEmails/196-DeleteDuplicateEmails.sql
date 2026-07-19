-- Last updated: 7/19/2026, 4:41:39 PM
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.Email = p2.Email
AND p1.Id > p2.Id;