# Write your MySQL query statement below
SELECT NAME,sum(amount) as BALANCE from Users JOIN Transactions
ON users.account=Transactions.account
GROUP BY name
HAVING sum(Transactions.amount)>10000;
