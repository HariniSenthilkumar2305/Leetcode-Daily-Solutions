# Write your MySQL query statement below

SELECT id,CASE
WHEN id %2 =0 THEN LAG(student) OVER(order by id)
ELSE COALESCE (LEAD(student) OVER(order by id),student)
END AS student
from Seat; 