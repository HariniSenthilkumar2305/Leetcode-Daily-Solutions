# Write your MySQL query statement below
SELECT project_id,ROUND(avg(experience_years),2) as average_years
FROM Project LEFT OUTER JOIN Employee 
ON Project.employee_id=Employee.employee_id
GROUP BY project_id;
