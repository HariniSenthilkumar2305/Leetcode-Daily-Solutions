# Write your MySQL query statement below
SELECT a1.id from Weather a1,Weather a2 where a1.temperature>a2.temperature and datediff(a1.recordDate,a2.recordDate)=1;