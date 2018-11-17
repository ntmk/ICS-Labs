CREATE USER Lab07
IDENTIFIED BY Lab07;

GRANT DBA TO Lab07;

--DROP TABLE lotto649 CASCADE CONSTRAINTS;

CREATE TABLE lotto649
 (drawnbr NUMBER(4) NOT NULL PRIMARY KEY,
  drawdate DATE NOT NULL,
  nbr01 NUMBER(2) NOT NULL,
  nbr02 NUMBER(2) NOT NULL,
  nbr03 NUMBER(2) NOT NULL,
  nbr04 NUMBER(2) NOT NULL,
  nbr05 NUMBER(2) NOT NULL,
  nbr06 NUMBER(2) NOT NULL,
  nbrbonus NUMBER(2) NOT NULL
  );
  
CREATE USER User1
IDENTIFIED BY User1;

GRANT DBA TO User1;

CREATE USER User2
IDENTIFIED BY User2;

GRANT DBA TO User2;

select * from dba_objects
where owner='HR'
order by OBJECT_TYPE;

select * from dba_tables, user_TAB_COMMENTS
where owner='HR';

select * from user_sys_privs
where username='HR';

select * from user_role_privs
where user='HR';