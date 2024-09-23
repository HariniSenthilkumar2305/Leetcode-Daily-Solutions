# Write your MySQL query statement below
Select e1.firstName,e1.lastName,e2.city,e2.state 
from Person e1 left outer join Address e2 ON e1.personId=e2.personId;