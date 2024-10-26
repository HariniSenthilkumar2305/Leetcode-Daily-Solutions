# Write your MySQL query statement below
SELECT DISTINCT a.num as ConsecutiveNums 
from Logs a
JOIN Logs b ON a.id=b.id-1
JOIN Logs c ON a.id=c.id-2
where a.num=b.num and b.num=c.num;