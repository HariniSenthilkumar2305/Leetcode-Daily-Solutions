WITH RECURSIVE sub(id, text, length) AS (
  SELECT content_id, content_text, LENGTH(content_text)
  FROM user_content
), 
char_table AS (
  -- Base case: Extract first character
  SELECT id, 1 AS text_index, SUBSTRING(text, 1, 1) AS c, text, length
  FROM sub
  UNION ALL
  -- Recursive case: Extract next character
  SELECT id, text_index + 1, SUBSTRING(text, text_index + 1, 1), text, length
  FROM char_table
  WHERE text_index + 1 <= length  -- Stop when we reach full string length
), 
sub2 AS (
  SELECT id, text_index, text, length, c,
         LAG(c, 1, ' ') OVER (PARTITION BY id ORDER BY text_index) AS prev_char
  FROM char_table
), 
sub3 AS (
  SELECT id, text_index, text, length, c, prev_char,
    CASE
      -- Convert to uppercase if previous character is a space or hyphen and current is lowercase
      WHEN prev_char = ' ' OR (prev_char = '-' AND c BETWEEN 'a' AND 'z') THEN UPPER(c)
      
      -- Convert to lowercase if previous character is uppercase and current is uppercase
      WHEN prev_char BETWEEN 'A' AND 'Z' AND c BETWEEN 'A' AND 'Z' THEN LOWER(c)
      
      -- Keep character as is if no conversion is needed
      ELSE c
    END AS next_char
  FROM sub2
)

SELECT id AS content_id,
       text AS original_text,
       GROUP_CONCAT(next_char ORDER BY text_index SEPARATOR '') AS converted_text
FROM sub3
GROUP BY id;

