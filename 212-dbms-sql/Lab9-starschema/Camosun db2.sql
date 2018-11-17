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
