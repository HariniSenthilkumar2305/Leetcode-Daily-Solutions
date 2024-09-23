# Write your MySQL query statement below
select e1.name AS 'Employee' from employee e1 INNER JOIN Employee e2 ON e1.managerID=e2.id Where e1.salary>e2.salary;
