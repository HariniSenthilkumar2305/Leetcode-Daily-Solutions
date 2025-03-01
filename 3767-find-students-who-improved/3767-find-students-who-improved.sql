# Write your MySQL query statement below
-- Write your PostgreSQL query statement below

WITH condition_1 AS(
    -- Have taken exams in the same subject on at least two different dates
    SELECT student_id, subject
    FROM Scores
    GROUP BY student_id, subject
    HAVING COUNT(student_id) > 1
), condition_2 AS(
    -- find first exam_date and last exam_date
    SELECT student_id, subject, MAX(exam_date) max_date , MIN(exam_date) min_date
    FROM Scores
    GROUP BY student_id, subject  
), get_min AS(
    -- find first score
    SELECT *
    FROM Scores c
    WHERE EXISTS (SELECT 1 FROM condition_2 c1 WHERE c.student_id = c1.student_id AND c.subject = c1.subject AND c.exam_date = c1.min_date)
), get_max AS(
    -- find first score
    SELECT *
    FROM Scores c
    WHERE EXISTS (SELECT 1 FROM condition_2 c1 WHERE c.student_id = c1.student_id AND c.subject = c1.subject AND c.exam_date = c1.max_date)
)
SELECT *
FROM(
    SELECT
        m.student_id, m.subject, m.score first_score , m1.score latest_score
    FROM
        get_min m
    -- m = min , m1 = max
    INNER JOIN get_max m1 ON m.student_id = m1.student_id AND m.subject = m1.subject AND m.score < m1.score
)sub 
WHERE EXISTS (SELECT 1 FROM condition_1 c WHERE sub.student_id = c.student_id AND sub.subject = c.subject)
ORDER BY student_id, subject;