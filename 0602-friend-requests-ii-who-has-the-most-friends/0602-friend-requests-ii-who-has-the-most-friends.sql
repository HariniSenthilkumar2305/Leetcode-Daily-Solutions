with temp as 
(select requester_id as id from RequestAccepted
union all
select accepter_id as id from RequestAccepted),
ids as
(select id,id as friends from temp)
select id,count(friends) as num
from ids
group by id
ORDER BY num desc limit 1;