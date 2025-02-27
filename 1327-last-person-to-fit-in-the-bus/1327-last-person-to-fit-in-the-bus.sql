# Write your MySQL query statement below
select person_name from (select person_name, sum(weight) over(order by turn) as cw from Queue) temp where cw <=1000 order by cw desc limit 1; 