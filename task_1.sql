1. SELECT t.name AS teacher_name,c.name AS courses FROM courses c INNER JOIN teachers t ON c.teacher_id = t.id;
2. SELECT t.name AS teacher_name, COUNT(c.teacher_id) AS courses_taken FROM courses c INNER JOIN teachers t ON c.teacher_id = t.id GROUP BY c.teacher_id ORDER BY courses_taken DESC LIMIT 1;
3. SELECT t.name FROM teachers t LEFT JOIN courses c ON t.id = c.teacher_id WHERE c.teacher_id IS NULL;