set echo on

REM ****************** Create Table & Sequence *****************************

DROP TABLE SA_CUSTOMER_DEMOGRAPHICS;

CREATE TABLE SA_CUSTOMER_DEMOGRAPHICS
( customer_demographic_pk NUMBER, 
  credit_rating VARCHAR2(20), 
  marital_status VARCHAR2(8), 
  age_range VARCHAR2(12), 
  gender VARCHAR2(7)
);

DROP SEQUENCE customer_demographic_seq;

CREATE SEQUENCE customer_demographic_seq;

REM *********** MALE **********
REM < 18 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','Less than 18','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','Less than 18','Male');

REM 18 to 25 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','18 to 25','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','18 to 25','Male');

REM 26 to 35 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','26 to 35','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','26 to 35','Male');

REM 36 to 45 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','36 to 45','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','36 to 45','Male');

REM 46 to 55 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','46 to 55','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','46 to 55','Male');

REM 56 to 65 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','56 to 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','56 to 65','Male');

REM > 65 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','More than 65','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','More than 65','Male');

REM Unknown **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','Unknown','Male');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','Unknown','Male');

REM *********** FEMALE **********
REM < 18 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','Less than 18','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','Less than 18','Female');

REM 18 to 25 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','18 to 25','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','18 to 25','Female');

REM 26 to 35 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','26 to 35','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','26 to 35','Female');

REM 36 to 45 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','36 to 45','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','36 to 45','Female');

REM 46 to 55 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','46 to 55','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','46 to 55','Female');

REM 56 to 65 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','56 to 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','56 to 65','Female');

REM > 65 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','More than 65','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','More than 65','Female');

REM Unknown **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','Unknown','Female');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','Unknown','Female');

REM *********** UNKNOWN **********
REM < 18 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','Less than 18','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','Less than 18','Unknown');

REM 18 to 25 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','18 to 25','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','18 to 25','Unknown');

REM 26 to 35 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','26 to 35','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','26 to 35','Unknown');

REM 36 to 45 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','36 to 45','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','36 to 45','Unknown');

REM 46 to 55 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','46 to 55','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','46 to 55','Unknown');

REM 56 to 65 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','56 to 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','56 to 65','Unknown');

REM > 65 **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','More than 65','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','More than 65','Unknown');

REM Unknown **********************

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Single','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Single','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Single','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Married','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Married','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Married','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Divorced','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Divorced','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Divorced','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Widowed','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Widowed','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Widowed','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Good','Unknown','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Poor','Unknown','Unknown','Unknown');

INSERT INTO sa_customer_demographics
(customer_demographic_pk, credit_rating, marital_status, age_range, gender)
VALUES
(customer_demographic_seq.NEXTVAL, 'Unknown','Unknown','Unknown','Unknown');

COMMIT;

set echo off

