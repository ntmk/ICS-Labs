/*
Question 1

CREATE USER New_User
IDENTIFIED BY New_Password;

User NEW_USER created.

Question 2

Enter user-name: New_User
Enter password:

ERROR:
ORA-01045: user NEW_USER lacks CREATE SESSION privilege; logon denied 

Question 3

GRANT connect TO New_User;

Grant succeeded.

1) 

DESCRIBE dual;
 
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 DUMMY                                              VARCHAR2(1) 


2)

SELECT * FROM dual;

D
-
X


3)

CREATE TABLE test AS SELECT * FROM dual;

ERROR at line 1:
ORA-01031: insufficient privileges

The connect role only allows limited activities within the users own schema


Question 4

GRANT resource TO New_User;
Grant succeeded.

CREATE table test as select * from dual;

Table created.

The table test is created because resource role gives the ability to create objects.
CREATE CLUSTER, PROCEDURE, SEQUENCE, TABLE, TRIGGER


Question 5

CREATE PROFILE TEMP_USER LIMIT
FAILED_LOGIN_ATTEMPTS 1
PASSWORD_REUSE_MAX 5;

Profile TEMP_USER created.

Question 6 

SELECT * FROM DBA_PROFILES
WHERE PROFILE = 'TEMP_USER';

Question 7

Screenshot of TEMP_USER profile

Question 8

ALTER USER New_User
PROFILE TEMP_USER;

User NEW_USER altered.

Question 9

Enter user-name: New_User
Enter password:
ERROR:
ORA-01017: invalid username/password; logon denied


Enter user-name: New_User
Enter password:
ERROR:
ORA-28000: the account is locked

The account is locked after one unsuccessful attempt as specified in the profile.

Question 10

Screenshot unlocking New_user

Question 11
a)

CREATE USER User_2
IDENTIFIED BY Password_2;

GRANT connect TO User_2;

User USER_2 created.

Grant succeeded.

b)

SELECT * FROM New_User.Test;

ERROR at line 1:
ORA-00942: table or view does not exist

c)

GRANT SELECT ON NEW_USER.TEST TO User_2

Grant succeeded.

SELECT * FROM New_User.Test;

D
-
X

We did not need to assign the resource role to user_2. This ensure the data can be viewed 
but remain unchanged by other users.

Question 12

Advantages of usng same password for SYS and SYSTEM:

- easily connect/swap to either schema when needed
- better flow when preforming administrative tasks

Disadvantages of usng same password for SYS and SYSTEM:

- less secure
- could potentially log into wrong account
- make changes to the wrong account which could be devastating

Advantages of usng different password for SYS and SYSTEM:

- more secure 
- less likely to alter wrong schema
- easy to distinguish which account you are using for changes

Disadvantages of usng different password for SYS and SYSTEM:

- longer time to login
- potentially forget either password and haveto reset

Question 13

roles:
administrative	
Full access to system create / update / maintain all programs / users
department chair	
Few limitations to system maintain / update permissions for faculty for specified department
instructors	
More restricted access views specific to courses / program taught update / maintain student records
student	
Restricted access / view only for course content and related pages
