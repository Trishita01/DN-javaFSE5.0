DECLARE
    CURSOR cust_cursor IS
        SELECT c.CustomerID,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) AS Age
        FROM Customers c;

BEGIN
    FOR cust_rec IN cust_cursor LOOP
        IF cust_rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Interest rate updated for Customer ID: '
                                 || cust_rec.CustomerID);
        END IF;
    END LOOP;

    COMMIT;
END;
/