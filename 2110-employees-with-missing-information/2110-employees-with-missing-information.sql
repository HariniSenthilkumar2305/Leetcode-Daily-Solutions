# Write your MySQL query statement below
SELECT Employees.employee_id from Employees 
LEFT JOIN Salaries ON Employees.employee_id=Salaries.employee_id
WHERE Salaries.salary is null
UNION
SELECT Salaries.employee_id from Employees 
RIGHT JOIN Salaries ON Employees.employee_id=Salaries.employee_id
WHERE Employees.name is null
ORDER BY employee_id;