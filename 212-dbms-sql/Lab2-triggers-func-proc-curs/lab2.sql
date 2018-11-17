DROP TABLE LAB02_RELATIONAL;

/*(1)WHAT DOES THIS SAY ABOUT ORACLE’S STRICT ADHERENCE TO RELATIONAL THEORY? (1 MARK)
*/

CREATE TABLE LAB02_RELATIONAL
(COL1 VARCHAR2(20));
INSERT INTO LAB02_RELATIONAL VALUES ('ORACLE RULES');
INSERT INTO LAB02_RELATIONAL VALUES ('ORACLE RULES');
INSERT INTO LAB02_RELATIONAL VALUES ('ORACLE RULES');
SELECT * FROM LAB02_RELATIONAL;
COMMIT;

SELECT * FROM LAB02_RELATIONAL;
 
/*(2)CAN YOU FIND A WAY TO CHANGE THE MIDDLE ROW TO 'ORACLE DOES NOT RULE'? (HINT: USE THE ROWID). MAKE THE
CHANGE AND DO A SELECT * AGAIN TO SHOW THE RESULTS. (2 MARKS)*/

SELECT ROWID FROM LAB02_RELATIONAL;

/*- UPDATE BASED ON ROWID (WILL CHANGE DURING DEMO)*/
UPDATE LAB02_RELATIONAL SET COL1 = 'ORACLE DOES NOT RULE' WHERE ROWID = 'AACCDXAAEAAAQJOAAB';

SELECT * FROM LAB02_RELATIONAL;

/*(3)WRITE A SCRIPT TO ELIMINATE ALL DUPLICATE ROWS, SO THAT YOU ONLY HAVE THE TWO UNIQUE ROWS LEFT IN THE TABLE.
(HINT: YOU WILL WANT TO USE A SELF-JOIN ON THE TABLE USING THE ROWID AND THE EXISTS CLAUSE). (3 MARKS)
*/
INSERT INTO LAB02_RELATIONAL VALUES ('ORACLE RULES');
INSERT INTO LAB02_RELATIONAL VALUES ('ORACLE RULES');
INSERT INTO LAB02_RELATIONAL VALUES ('ORACLE DOES NOT RULE');
COMMIT;

SELECT * FROM LAB02_RELATIONAL;

/*- ELIMINATE DUPLICATE ROWS*/
DELETE FROM LAB02_RELATIONAL A WHERE A.ROWID > ANY (SELECT B.ROWID FROM LAB02_RELATIONAL B WHERE A.COL1 = B.COL1);

/*- CREATE TRIGGER FOR STUDENT TABLE WHEN NEW STUDENT ENTERED
**NOT CORRECT**/
CREATE TRIGGER NEW_STUDENT_ENTERED
BEFORE INSERT ON STUDENT
FOR EACH ROW
BEGIN
INSERT INTO NEW_STUDENTS (STUDENT_ID, FIRST_NAME, LAST_NAME)
VALUES (:NEW.STUDENT_ID, :NEW.FIRST_NAME, :NEW.LAST_NAME);
END;

INSERT INTO NEW_STUDENTS (STUDENT_ID, FIRST_NAME, LAST_NAME)
VALUES (4, 'SALT', 'PEPPER');

CREATE VIEW NEW_STUDENT_ENTERED AS
SELECT STUDENT_ID, FIRST_NAME, LAST_NAME
FROM NEW_STUDENTS

/*- LOOK AT THE VIEW*/
SELECT * FROM NEW_STUDENT_ENTERED;

/*create function to calculate gpa call in the procedure*/
create or replace function GRADE_POINT (grade varchar2)
return number is
score number (3,2);
begin 
case grade
    when 'A+' then score:= 9;
	when 'A' then score:= 8;
	when 'A-' then score:= 7;
	when 'B+' then score:= 6;
	when 'B' then score:= 5;
	when 'B-' then score:= 4;
	when 'C+' then score:= 3;
	when 'C' then score:= 2;
	when 'C-' then score:= 1;
	else score:= 1;
end case;
return score;
end GRADE_POINT;

/*procedure working need to add average*/
create or replace PROCEDURE STUDENT_MARKS
IS
cursor c1 is
select s.student_id, s.first_name, s.last_name, c.course_id, c.course_name, g.grade, grade_point(g.grade) as Score
from student s, course c, grades g
where s.student_id = g.student_id and
c.course_id = g.course_id
order by s.student_id;

student_id student.student_id%type;
fname student.first_name%type;
lname student.last_name%type;
course_id course.course_id%type;
course_name course.course_name%type;
grade grades.grade%type;
Score number;

total number(3,1) := 0;
average number(3,1) := 0;
current_student_id number := -1;
BEGIN
DBMS_OUTPUT.put_line('Student ID');
DBMS_OUTPUT.put_line('----------');
open c1;
loop
    fetch c1 into student_id, fname, lname, course_id, course_name, grade, Score;
	exit when c1%notfound;
    if student_id != current_student_id then 
        current_student_id := student_id;
        total := 0;
        average := 0;
        end if;
        DBMS_OUTPUT.put_line(student_id || ' ' || fname || ' ' || lname || '    ' || course_id || ' ' || course_name ||
        ' ' || grade || ' ' || Score);
        total := total + 1;
        average := average + Score;
        DBMS_OUTPUT.put_line('Average' || round(average / total, 2));
end loop;
close c1;
END;

/*run procedure in worksheet*/
set serveroutput on;
begin
    STUDENT_MARKS;
end;

select s.student_id, s.first_name, s.last_name, avg(grade_point(g.grade)) as Score
from student s, course c, grades g
where s.student_id = g.student_id and
c.course_id = g.course_id
group by s.student_id, s.first_name, s.last_name order by s.student_id;