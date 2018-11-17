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
	