SELECT CUST.CUSTOMER_ID, PPL.CURRENT_FIRST_NAME,
PPL.CURRENT_LAST_NAME, PPL.BIRTH_DATE, 
PPL.GENDER, PPL.MARITAL_STATUS,
CUST.CREDIT_LIMIT, CM.ADDRESS1,
CM.ADDRESS2, CM.POSTAL_CODE,
GB.CITY_NAME, GB.PROV_NAME,
GB.COUNTRY_NAME

FROM COMP259DB.PEOPLE PPL, COMP259DB.PARTIES PTY, COMP259DB.PARTY_ROLES PRL, 
COMP259DB.CUSTOMERS CUST, COMP259DB.PARTY_CONTACT_MECHANISMS PCM, 
COMP259DB.GEOGRAPHIC_BOUNDARIES GB, COMP259DB.CONTACT_MECHANISMS CM

WHERE CUST.CUSTOMER_ID = PRL.CUSTOMER_ID 
AND PTY.PARTY_ID = PRL.PARTY_ID 
AND PCM.PARTY_ID = PTY.PARTY_ID 
AND PTY.PERSON_ID = PPL.PERSON_ID 
AND 
CM.CONTACT_MECHANISM_ID = PCM.CONTACT_MECHANISM_ID 
AND CM.GEO_ID = GB.GEO_ID;

--=================================================================================
--CURSOR FOR PART 4
--=================================================================================
CREATE OR REPLACE PROCEDURE e_data
AS

CURSOR c_customers
IS
	SELECT cust.CUSTOMER_ID, ppl.CURRENT_FIRST_NAME || ' ' || ppl.CURRENT_LAST_NAME as name, 
	ROUND(MONTHS_BETWEEN(SYSDATE, ppl.BIRTH_DATE)/12) AS age, ppl.GENDER, ppl.MARITAL_STATUS, cust.CREDIT_LIMIT, cm.Contact_mechanism_id, cm.ADDRESS1,
	cm.ADDRESS2, cm.POSTAL_CODE, gb.CITY_NAME, gb.PROV_NAME, gb.COUNTRY_NAME

	FROM COMP259DB.PEOPLE ppl, COMP259DB.PARTIES pty, COMP259DB.PARTY_ROLES prl, 
	COMP259DB.CUSTOMERS cust, COMP259DB.PARTY_CONTACT_MECHANISMS pcm, 
	COMP259DB.GEOGRAPHIC_BOUNDARIES gb, COMP259DB.CONTACT_MECHANISMS cm

	WHERE cust.CUSTOMER_ID = prl.CUSTOMER_ID and pty.PARTY_ID = prl.party_id 
	and pcm.PARTY_ID = pty.PARTY_ID and pty.PERSON_ID = ppl.PERSON_ID and 
	cm.CONTACT_MECHANISM_ID = pcm.CONTACT_MECHANISM_ID and cm.GEO_ID = gb.GEO_ID;
    
          
v_cr_status 		varchar(10);
v_marital_status 	varchar(10);
v_gender			varchar(10);
v_age_range 		varchar(15);
v_demographic       number;
BEGIN

	FOR rec_customers in c_customers
		
		LOOP
		
			CASE
			
				WHEN rec_customers.CREDIT_LIMIT >= 1500 THEN v_cr_status := 'Good';
				WHEN rec_customers.CREDIT_LIMIT < 1500 THEN v_cr_status := 'Poor';
				else v_cr_status := 'Unknown';
				
            END CASE;
            CASE
			
            	WHEN rec_customers.MARITAL_STATUS = 'S' THEN v_marital_status := 'Single';
				WHEN rec_customers.MARITAL_STATUS = 'D' THEN v_marital_status := 'Divorced';
				WHEN rec_customers.MARITAL_STATUS = 'W' THEN v_marital_status := 'Widowed';
				WHEN rec_customers.MARITAL_STATUS = 'M' THEN v_marital_status := 'Married';
				else v_marital_status := 'Unknown';

            END CASE;
            CASE
			
				WHEN rec_customers.GENDER = 'M' THEN v_gender := 'Male';
				WHEN rec_customers.GENDER = 'F' THEN v_gender := 'Female';
				else v_gender := 'Unknown';
				
            END CASE;
            CASE
			
				WHEN rec_customers.age < 18 THEN v_age_range := 'Less than 18';
				WHEN rec_customers.age <= 25 THEN v_age_range := '18 to 25';
				WHEN rec_customers.age <= 35 THEN v_age_range := '26 to 35';
				WHEN rec_customers.age <= 45 THEN v_age_range := '36 to 45';
				WHEN rec_customers.age <= 55 THEN v_age_range := '46 to 55';
				WHEN rec_customers.age <= 65 THEN v_age_range := '56 to 65';
				WHEN rec_customers.age <= 65 THEN v_age_range := 'More than 65';
				ELSE v_age_range := 'Unknown';
				
			END CASE;
	dbms_output.put_line(v_cr_status|| ' '|| v_marital_status || ' ' || v_age_range || ' ' || v_gender);
    
	Select CUSTOMER_DEMOGRAPHIC_PK 
    into v_demographic
    from sa_customer_demographics
    where trim(CREDIT_RATING) = trim(v_cr_status) and trim(marital_status) = trim(v_marital_status) and trim(age_range) = trim(v_age_range) and trim(Gender) = trim(v_gender);
    
	insert into sa_customers (customer_pk, customer_id, customer_name)
    values (sa_customer_seq.nextval, rec_customers.customer_id, rec_customers.name);
    
    insert into sa_addresses (address_pk, address_id, address_1, address_2, city_name, postal_code, PROVINCESTATE_NAME, country_name)
    values (sa_address_seq.nextval, rec_customers.Contact_mechanism_id, rec_customers.address1, rec_customers.address2, rec_customers.city_name, rec_customers.postal_code, 
    rec_customers.prov_name, rec_customers.country_name); 
    
    insert into sa_customer_sales_facts (customer_pk, address_pk, customer_demographic_pk)
    values (sa_customer_seq.currval, sa_address_seq.currval, v_demographic);
--    dbms_output.put_line(rec_customers.customer_id);
    COMMIT;
    
    END LOOP;
	
END;

--==================================================================
--SYSTEM VIEW COMP259TABLE create view named Customer_oltp_vw
--==================================================================
column name format a20;
column address format a50;
column age format a20;
create view Customer_oltp_vw as
SELECT ppl.CURRENT_FIRST_NAME || ' ' || ppl.CURRENT_LAST_NAME AS Name, 
	cm.ADDRESS1 || ' ' || cm.ADDRESS2 || ', ' || gb.CITY_NAME || ' ' || gb.PROV_NAME || ' ' || gb.COUNTRY_NAME AS Address,
    cust.CREDIT_LIMIT AS Credit_Limit,
    ppl.MARITAL_STATUS AS Marital_status,
    ROUND(MONTHS_BETWEEN(SYSDATE, ppl.BIRTH_DATE)/12) AS age, 
    ppl.GENDER AS Gender

	FROM COMP259DB.PEOPLE ppl, COMP259DB.PARTIES pty, COMP259DB.PARTY_ROLES prl, 
	COMP259DB.CUSTOMERS cust, COMP259DB.PARTY_CONTACT_MECHANISMS pcm, 
	COMP259DB.GEOGRAPHIC_BOUNDARIES gb, COMP259DB.CONTACT_MECHANISMS cm

	WHERE cust.CUSTOMER_ID = prl.CUSTOMER_ID and pty.PARTY_ID = prl.party_id 
	and pcm.PARTY_ID = pty.PARTY_ID and pty.PERSON_ID = ppl.PERSON_ID and 
	cm.CONTACT_MECHANISM_ID = pcm.CONTACT_MECHANISM_ID and cm.GEO_ID = gb.GEO_ID;
	
	
--=========================================================================
--on populated dimesion tables customer_dm_vw
--=========================================================================
column name format a20;
column address format a50;
column age format a20;
create view Customer_DM_VW as
SELECT cname.customer_name as name, 
	caddr.ADDRESS_1 || ' ' || caddr.ADDRESS_2 || ', ' || caddr.CITY_NAME || ' ' || caddr.PROVincestate_NAME || ' ' || caddr.COUNTRY_NAME AS Address,
    cdemo.CREDIT_rating AS Credit_Rating,
	cdemo.MARITAL_STATUS AS Marital_status,
--	ROUND(MONTHS_BETWEEN(SYSDATE, cdemo.BIRTH_DATE)/12) AS age, 
    cdemo.age_range,
    cdemo.GENDER AS Gender
	
	from sa_customers cname, sa_addresses caddr, sa_customer_demographics cdemo,
    sa_customer_sales_facts csf
    
    where cname.customer_pk = csf.customer_pk 
    and csf.address_pk = caddr.address_pk
    and csf.customer_demographic_pk = cdemo.CUSTOMER_DEMOGRAPHIC_PK;
		