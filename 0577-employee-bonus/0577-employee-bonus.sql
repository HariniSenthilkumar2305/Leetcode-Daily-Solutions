# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus from Employee LEFT OUTER JOIN Bonus 
ON Employee.empId=Bonus.empId
where Bonus.bonus is NULL or Bonus.bonus<1000;