# Write your MySQL query statement below
SELECT e2.name as Department,e1.name as Employee,e1.salary
FROM Employee as e1 JOIN Department as e2
ON e1.departmentId=e2.id
WHERE e1.salary=(SELECT max(salary) from Employee 
where departmentId=e2.id);